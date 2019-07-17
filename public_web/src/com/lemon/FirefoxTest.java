package com.lemon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

	public static void main(String[] args) {
		
		// ����firefox������İ�װ·��
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //��ʼ��һ����������ʵ����ʵ�����ƽ�driver
        WebDriver driver =new FirefoxDriver();
        //��󻯴���
        driver.manage().window().maximize();
        //�������Եȴ�ʱ��
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        //get()��һ��վ��
        driver.get("http://www.baidu.com");
        //getTitle()��ȡ��ǰҳ��title��ֵ
        System.out.println("��ǰ��ҳ��ı����ǣ�" + driver.getTitle());
        //�˳������
        driver.quit();
  

		//selenium2.x�Ĳ���Ҫ����    ------��������汾�ϸߣ��ܲ�����!!!!!!!  
		//selenium3.x����Ҫ����

	}

}