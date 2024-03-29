package com.lemon;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IETester {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * ie浏览器要设置保护模式、缩放设置100%，是在客户端设置----》不具备通用性
		 */
		
//		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
//		InternetExplorerDriver driver = new InternetExplorerDriver();
//		
//		Thread.sleep(5);
//		driver.quit();
		
		
		
		/*
		 * 通用方式
		 */
		
		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		
		//创建期望的能力
		DesiredCapabilities capabilities = new DesiredCapabilities();
		//忽略保护模式
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//忽略缩放模式
		capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		
		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities);
		
		Thread.sleep(5);
		driver.quit(); 
	}

}
