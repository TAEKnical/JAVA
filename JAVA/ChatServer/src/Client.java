import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private Socket clientSocket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;

	//1. �����͸� ���������� �۽����� ������
	//2. �����͸� ���������� �������� ������
	//�� �ΰ��� �۾��� ���������� ���� �����尡 �ʿ��� -> �� ���� �޼ҵ忡 ������ ����
	public void connect() {
		try {
			System.out.println("���� �õ�");
			clientSocket = new Socket("192.168.25.59",10004);
			System.out.println("���� �Ϸ�");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void dataSend() {
		new Thread(new Runnable() {
			Scanner in = new Scanner(System.in);
			boolean isThread = true;
			@Override
			public void run() {
				while(isThread){
					try {
						String sendData = in.nextLine();
						if(sendData.equals("/quit"))
							isThread = false;
						else
							dataOutputStream.writeUTF(sendData);//����� ��½�Ʈ���� �޼��� �Ǿ��
					} catch (Exception e) {
					}
				}
			}
		}).start();
	}

	public void dataRecv() {
		new Thread(new Runnable() {
			boolean isThread = true;
			@Override
			public void run() {
				while(isThread) {
					try {
						String recvData = dataInputStream.readUTF();//����� InputSteram ��ü�� readUTF �޼ҵ带 ȣ���Ͽ� ������ �о����
						if(recvData.equals("/quit"))
							isThread = false;
						else
							System.out.println("���� : "+recvData);
					} catch (Exception e) {

					}
				}
				closeAll();
				System.out.println("����Ǿ����ϴ�.");
			}
		}).start();
	}

	public void StreamSetting() {
		try {
			dataInputStream = new DataInputStream(clientSocket.getInputStream()); // clientSocket�� InputStream ��ü�� ����
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream()); //clientSocket�� OutputStream ��ü�� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void closeAll() {
		try {
			//���� ��� �� �ݳ�
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public Client() {
		connect();
		StreamSetting();
		dataSend();
		dataRecv();
	}


	public static void main(String[] args) {
		new Client();
	}
}
