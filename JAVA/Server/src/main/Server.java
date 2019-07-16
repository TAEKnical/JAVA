package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private BufferedReader reader;
	private ServerSocket server = null;
	private Socket socket;
	
	public void start() {
		try {
			server = new ServerSocket(12345); //포트번호
			System.out.println("서버가 활성화 되었습니다.");
			while(true) {
				socket = server.accept(); //클라이언트의 접속을 대기
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));//클라이언트의 접속자가 보내는 메세지를 읽음
				getMessage();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(reader != null)
					reader.close();
				if(socket != null)
					reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void getMessage() {
		try {
			while(true) {
				System.out.println("클라이언트 : "+reader.readLine());
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
