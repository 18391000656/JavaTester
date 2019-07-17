package com.lemon;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IETester {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * ie�����Ҫ���ñ���ģʽ����������100%�����ڿͻ�������----�����߱�ͨ����
		 */
		
//		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		
//		Thread.sleep(5);
//		driver.quit();
		
		
		
		/*
		 * ͨ�÷�ʽ
		 */
		
		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		
		//��������������
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//���Ա���ģʽ
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//��������ģʽ
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
		
		Thread.sleep(5);
		driver.quit(); 
	}

}