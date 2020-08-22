package site.itwill.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//클라이언트 프로그램 - Socket 클래스 이용
// => 서버에 접속하여 서버의 네트워크 정보를 출력
public class ConnectClientApp {
	public static void main(String[] args) {
		try {
			//Socket 인스턴스 생성 - 서버 접속
			// => 서버명(IP 주소)와 포트번호를 전달하여 Socket 인스턴스 생성 
			Socket socket=new Socket("192.168.14.31", 2000);
			
			System.out.println("[메세지]서버("+socket
				.getInetAddress().getHostAddress()+")에 접속 하였습니다.");
			
			socket.close();
		} catch (UnknownHostException e) {
			System.out.println("[에러]서버를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[에러]서버에 접속되지 않습니다.");
		}
	}
}
