package com.lemon;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FoxfireTester {

	public static void main(String[] args) {
		
		// ����firefox��������gecko.driver�İ�װ·��
        System.setProperty("webdriver.gecko.driver","src/geckodriver.exe");
        
        //��ʼ��һ����������ʵ����ʵ�����ƽ�driver
        FirefoxDriver driver =new FirefoxDriver();
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

	}

}