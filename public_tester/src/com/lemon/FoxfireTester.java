package com.lemon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxfireTester {

	public static void main(String[] args) {
		
		// 定义firefox驱动程序gecko.driver的安装路径
        System.setProperty("webdriver.gecko.driver","src/geckodriver.exe");
        
        //初始化一个火狐浏览器实例，实例名称叫driver
        FirefoxDriver driver =new FirefoxDriver();
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

	}

}
