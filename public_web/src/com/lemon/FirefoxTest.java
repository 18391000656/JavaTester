package com.lemon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		
		// 定义firefox浏览器的安装路径
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //初始化一个火狐浏览器实例，实例名称叫driver
        WebDriver driver =new FirefoxDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //get()打开一个站点
        driver.get("http://www.baidu.com");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是：" + driver.getTitle());
        //退出浏览器
        driver.quit();
  

		//selenium2.x的不需要驱动    ------本机火狐版本较高，跑步起来!!!!!!!  
		//selenium3.x的需要驱动

	}

}
