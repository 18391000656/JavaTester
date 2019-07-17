package com.lemon;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTester {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.baidu.com");
		driver.quit();

	}

}
