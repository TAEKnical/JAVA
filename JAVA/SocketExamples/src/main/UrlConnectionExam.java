package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://auction.co.kr"); //URL Ŭ������ string �������� url�� �Ľ��س��� ���
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();//url�� ����
			
			if(conn!=null) {
				conn.setConnectTimeout(3000); //Ÿ�Ӿƿ� ����. �и������� ����. ���ӽõ��� 3���̻� �ɸ��� ������ ������.
				StringBuilder sb = new StringBuilder();
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {//���� ���ӽ�
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"ms949"));
					while(true) {
						String line = br.readLine();//�� ������ ����
						if(line==null)
							break;//���̻� ������ ������ �ݺ� ����
						sb.append(line+"\r\n");//��Ʈ�� ������ �߰�
					}
					br.close();
				}
				conn.disconnect();//url ���� ����
				System.out.println(sb.toString());//��� ���
			}
		}catch (Exception e) {
		e.printStackTrace();
	}
}
}
