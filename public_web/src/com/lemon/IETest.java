package com.lemon;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IETest {

	public static void main(String[] args) {
		
		//��IE�����
		//����
//		InternetExplorerDriver 
		System.setProperty("webdriver.ie.driver", "src/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();

	}

}
