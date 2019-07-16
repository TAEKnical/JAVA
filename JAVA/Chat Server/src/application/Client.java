package application;

import java.net.Socket;

public class Client {
	
	Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	// 클라이언트로부터 메세지를 받는 메소드
	public void receive() {
		Runnable thread = new Runnable() {

			@Override //하나의 스레드가 어떠한 모듈로서 동작할 것인가
			public void run() {
				try {
					InputStream in 
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		Main.threadPool.submit(thread); //만들어진 스레드를 스레드풀에 등록
	}
	
	//클라이언트에게 메세지를 전송하는 메소드
	public void send(String message){
		
	}
}
