package application;

import java.net.Socket;

public class Client {
	
	Socket socket;
	
	public Client(Socket socket) {
		this.socket = socket;
		receive();
	}
	
	// Ŭ���̾�Ʈ�κ��� �޼����� �޴� �޼ҵ�
	public void receive() {
		Runnable thread = new Runnable() {

			@Override //�ϳ��� �����尡 ��� ���μ� ������ ���ΰ�
			public void run() {
				try {
					InputStream in 
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
		};
		Main.threadPool.submit(thread); //������� �����带 ������Ǯ�� ���
	}
	
	//Ŭ���̾�Ʈ���� �޼����� �����ϴ� �޼ҵ�
	public void send(String message){
		
	}
}
