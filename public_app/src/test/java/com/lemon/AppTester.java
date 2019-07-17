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
		
		//写客户端，java、python--->
		//需要能力(做安卓自动化测试需要3个能力)
		//1)deviceName   操作那一台设备
		//2）appPackage   哪一个app
		//3)appActivity  哪一个界面
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("deviceName", "127.0.0.1:62001");
		//包名
		/*
		 * 获得包名和activity名(前提是打开要测试的app)
		 * adb shell dumpsys activity | find "mFocusedActivity"
		 */
		desiredCapabilities.setCapability("appPackage", "com.ibox.calculators");
		desiredCapabilities.setCapability("appActivity", "com.ibox.calculators.CalculatorActivity");
		
		URL remoteAddress = new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AndroidDriver<WebElement>(remoteAddress, desiredCapabilities);
		
		//做8+5
		driver.findElement(By.id("com.ibox.calculators:id/digit8")).click();
		driver.findElement(By.id("com.ibox.calculators:id/plus")).click();
		driver.findElement(By.id("com.ibox.calculators:id/digit5")).click();
		driver.findElement(By.id("com.ibox.calculators:id/equal")).click();

	}

}
