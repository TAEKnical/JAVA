package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class UrlConnectionExam {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://auction.co.kr"); //URL 클래스는 string 정보에서 url을 파싱해내는 기능
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();//url에 접속
			
			if(conn!=null) {
				conn.setConnectTimeout(3000); //타임아웃 설정. 밀리세컨드 단위. 접속시도가 3초이상 걸리면 접속을 끊도록.
				StringBuilder sb = new StringBuilder();
				if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {//정상 접속시
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"ms949"));
					while(true) {
						String line = br.readLine();//한 라인을 읽음
						if(line==null)
							break;//더이상 내용이 없으면 반복 종료
						sb.append(line+"\r\n");//스트링 빌더에 추가
					}
					br.close();
				}
				conn.disconnect();//url 접속 종료
				System.out.println(sb.toString());//결과 출력
			}
		}catch (Exception e) {
		e.printStackTrace();
	}
}
}
