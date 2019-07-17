package com.lemon;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AppTester {

	public static void main(String[] args) throws MalformedURLException {
		
		//д�ͻ��ˣ�java��python--->
		//��Ҫ����(����׿�Զ���������Ҫ3������)
		//1)deviceName   ������һ̨�豸
		//2��appPackage   ��һ��app
		//3)appActivity  ��һ������
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "127.0.0.1:62001");
		//����
		/*
		 * ��ð�����activity��(ǰ���Ǵ�Ҫ���Ե�app)
		 * adb shell dumpsys activity | find "mFocusedActivity"
		 */
		desiredCapabilities.setCapability("appPackage", "com.ibox.calculators");
		desiredCapabilities.setCapability("appActivity", "com.ibox.calculators.CalculatorActivity");
		
		URL remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver<WebElement>(remoteAddress, desiredCapabilities);
		
		//��8+5
		driver.findElement(By.id("com.ibox.calculators:id/digit8")).click();
		driver.findElement(By.id("com.ibox.calculators:id/plus")).click();
		driver.findElement(By.id("com.ibox.calculators:id/digit5")).click();
		driver.findElement(By.id("com.ibox.calculators:id/equal")).click();

	}

}