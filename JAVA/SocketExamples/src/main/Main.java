package main;

import java.net.InetAddress;

public class Main {
	public static void main(String [] args) {
		
		InetAddress ip = null;
		InetAddress me = null;
		try {
			ip = InetAddress.getByName("www.google.com");
			me = InetAddress.getLocalHost();
			System.out.println("ȣ��Ʈ �̸�: " + ip.getHostName()); //google
			System.out.println("ȣ��Ʈ �ּ�: " + ip.getHostAddress()); //google�� ip�ּ�
			System.out.println("�� �ּ�: " + me.getHostAddress()); //���� ip
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
