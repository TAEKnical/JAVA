package application;
	
import java.net.ServerSocket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static ExecutorService threadPool; //�������� �����带 ȿ�������� �����ϱ� ���� ����ϴ� ��ǥ���� ���̺귯��. ���۽����� Ŭ���̾�Ʈ�� �����ص� ������ ���ڸ� ���������μ� ������ �������� Ȯ��.
	public static Vector<Client> clients = new Vector<Client>(); //�迭���� ��
	
	ServerSocket serverSocket;
	
	// ������ �������Ѽ� Ŭ���̾�Ʈ�� ������ ��ٸ��� �޼ҵ�
	public void startServer(String IP, int port) {
		
	}
	
	// ������ �۵��� ������Ű�� �޼ҵ�
	public void stopServer() {
		
	}
	
	//UI�� �����ϰ�, ���������� ���α׷��� ���۽�Ű�� �޼ҵ�
	@Override
	public void start(Stage primaryStage) {

	}
	
	//main
	public static void main(String[] args) {
		launch(args);
	}
}
