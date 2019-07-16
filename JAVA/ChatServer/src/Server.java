import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private ServerSocket serverSocket; //���� ����(���񽺸� �����ϱ� ���� �뵵) ����
	private Socket clientSocket;//������ ������ ����Ǵ�, Ŭ���̾�Ʈ�� ����� ���� ����

	private DataInputStream dataInputStream;//������ ���� ������
	private DataOutputStream dataOutputStream;

	//1. �����͸� ���������� �۽����� ������
	//2. �����͸� ���������� �������� ������
	//�� �ΰ��� �۾��� ���������� ���� �����尡 �ʿ���

	public void serverSetting() {
		try {
			serverSocket = new ServerSocket(10004);//������ ���ε�. IP�ּҸ� ���ָ� localhost�� default ��.
			clientSocket = serverSocket.accept(); // ���Ʈ�� ����� Ŭ���̾�Ʈ�� �����ϸ� �ش� Ŭ���̾�Ʈ�� ������ ������ �����Ͽ� ����. �̰�  clientSocket�� ����.
			//���������� ���Ͽ� ���� �Ϸ�� ����
			System.out.println("Ŭ���̾�Ʈ ���� ����");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void closeAll() {
		try {
			serverSocket.close(); //���� ��� �� �ݳ�
			clientSocket.close();
			dataInputStream.close();
			dataOutputStream.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void StreamSetting() {
		try {
			dataInputStream = new DataInputStream(clientSocket.getInputStream()); // clientSocket�� InputStream ��ü�� ����
			dataOutputStream = new DataOutputStream(clientSocket.getOutputStream()); //clientSocket�� OutputStream ��ü�� ����
		}catch(Exception e) {
			e.printStackTrace();
		}
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
							System.out.println("Ŭ���̾�Ʈ : "+recvData);
					} catch (Exception e) {
					}
				}
				closeAll();
				System.out.println("����Ǿ����ϴ�.");
			}

		}).start();
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

	public Server() {
		serverSetting();
		StreamSetting();
		dataRecv();
		dataSend();
	}

	public static void main(String[] args) {
		new Server();
	}
}
