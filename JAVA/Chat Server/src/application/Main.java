package application;
	
import java.net.ServerSocket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	public static ExecutorService threadPool; //여러개의 스레드를 효율적으로 관리하기 위해 사용하는 대표적인 라이브러리. 갑작스럽게 클라이언트가 폭주해도 스레드 숫자를 제한함으로서 서버의 안정성을 확보.
	public static Vector<Client> clients = new Vector<Client>(); //배열같은 것
	
	ServerSocket serverSocket;
	
	// 서버를 구동시켜서 클라이언트의 연결을 기다리는 메소드
	public void startServer(String IP, int port) {
		
	}
	
	// 서버의 작동을 중지시키는 메소드
	public void stopServer() {
		
	}
	
	//UI를 생성하고, 실질적으로 프로그램을 동작시키는 메소드
	@Override
	public void start(Stage primaryStage) {

	}
	
	//main
	public static void main(String[] args) {
		launch(args);
	}
}
