package main;

import java.net.InetAddress;

public class InetAddressExam {
	public static void main(String[] args) {
		try {	//네트워크 작업은 try/catch가 필수
			InetAddress address = InetAddress.getByName("google.com");
			InetAddress[] address2 = InetAddress.getAllByName("naver.com");
			System.out.println("address : " + address);
			System.out.println("HostName : " + address.getHostName());
			System.out.println("HostAddress : " + address.getHostAddress());
			
			for(int i=0; i<address2.length;i++) {
				System.out.println(" ");
				System.out.println("address2 :" + address2[i]);
				System.out.println("HostName2 :" + address2[i].getHostName());
				System.out.println("HostAddress2 :" + address2[i].getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
