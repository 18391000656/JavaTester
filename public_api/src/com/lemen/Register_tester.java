package com.lemen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class Register_tester {

	public static <NameValuePair> void main(String[] args) throws ClientProtocolException, IOException {
		
		/*
		 * get����
		 */
		//�ӿ��Զ���---���������⡢���ߣ�httpclient��
		/*
		 * ����Ҫ׼��ʲô������
		 *      1.�������ӡ��ӿڵ�ַ��http://120.78.128.25:8080/futureloan/mvc/api/member/register
		 *      2.�������:mobilephone=18888888888,pwd=123456,regname=tom
		 *      3.����ʽ��post��get
		 *      4.���ù��߽��з���--�������ݰ�������һ������  
		 *      5.��Ӧ--���ѷ��ص�������ȡ����
		 *      6.����--���ж�--�������Ľ���Ƿ����Ԥ�ڵĽ��--��������ϣ�����ͨ�������򣬲��Բ�ͨ��
		 */

		
//		1.�������ӡ��ӿڵ�ַ��http://120.78.128.25:8080/futureloan/mvc/api/member/register
		
		String url = "http://120.78.128.25:8080/futureloan/mvc/api/member/register";
		
//		2.�������:mobilephone=18888888888,pwd=123456,regname=tom

		url += "mobilephone=18888888888&pwd=123456&regname=tom";
		
//	    3.����ʽ��post��get---����װ��һ��get����
//		1)�����get���󣿣���
		HttpGet get = new HttpGet(url);
//	    4.���ù��߽��з���--�������ݰ�������һ������  
        //��Ҫһ���ͻ��˷���
		HttpClient httpClient = HttpClients.createDefault();
		//ִ������
		httpClient.execute(get);
		HttpResponse response = httpClient.execute(get);
		
//	    5.��Ӧ--���ѷ��ص�������ȡ����
		//��Ӧ����������м����Я��������
		String result = EntityUtils.toString(response.getEntity());
		
//      6.����--���ж�--�������Ľ���Ƿ����Ԥ�ڵĽ��--��������ϣ�����ͨ�������򣬲��Բ�ͨ��
		System.out.println(result);
		
		
		
		
		/*
		 * post����
		 */
		//�ӿ��Զ���---���������⡢���ߣ�httpclient��
		/*
		 * ����Ҫ׼��ʲô������
		 *      1.�������ӡ��ӿڵ�ַ��http://120.78.128.25:8080/futureloan/mvc/api/member/register
		 *      2.�������:mobilephone=18888888888,pwd=123456,regname=tom
		 *      3.����ʽ��post��get
		 *      4.���ù��߽��з���--�������ݰ�������һ������  
		 *      5.��Ӧ--���ѷ��ص�������ȡ����
		 *      6.����--���ж�--�������Ľ���Ƿ����Ԥ�ڵĽ��--��������ϣ�����ͨ�������򣬲��Բ�ͨ��
		 */

		
//		1.�������ӡ��ӿڵ�ַ��http://120.78.128.25:8080/futureloan/mvc/api/member/register
		
		String URL = "http://120.78.128.25:8080/futureloan/mvc/api/member/register";
		
//	    3.����ʽ��post��get---����װ��һ��get����
		HttpPost post = new HttpPost(URL);
		
//		2.�������:mobilephone=18888888888,pwd=123456,regname=tom
        //post�������д���������м�
		List<NameValuePair> parameters = new ArrayList<>();
		//���Ӷ������(�������õ���������)
		parameters.add((NameValuePair) new BasicNameValuePair("mobilephone", "18888888888"));
		parameters.add((NameValuePair) new BasicNameValuePair("pwd", "123456"));
		parameters.add((NameValuePair) new BasicNameValuePair("regname", "tom"));
		
		post.setEntity(new UrlEncodedFormEntity((List<? extends org.apache.http.NameValuePair>) parameters));
//	    4.���ù��߽��з���--�������ݰ�������һ������  
        //��Ҫһ���ͻ��˷���
		HttpClient httpclient = HttpClients.createDefault();
		//ִ������
		httpClient.execute(post);
		HttpResponse Response = httpClient.execute(post);
		
//	    5.��Ӧ--���ѷ��ص�������ȡ����
		//��Ӧ����������м����Я��������
		String Result = EntityUtils.toString(Response.getEntity());
		
//      6.����--���ж�--�������Ľ���Ƿ����Ԥ�ڵĽ��--��������ϣ�����ͨ�������򣬲��Բ�ͨ��
		System.out.println(Result);
	}

}