package main;

import java.net.InetAddress;

public class Main {
	public static void main(String [] args) {
		
		InetAddress ip = null;
		InetAddress me = null;
		try {
			ip = InetAddress.getByName("www.google.com");
			me = InetAddress.getLocalHost();
			System.out.println("호스트 이름: " + ip.getHostName()); //google
			System.out.println("호스트 주소: " + ip.getHostAddress()); //google의 ip주소
			System.out.println("내 주소: " + me.getHostAddress()); //로컬 ip
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
