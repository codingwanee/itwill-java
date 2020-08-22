package site.itwill.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketApp {
	public static void main(String[] args) {
		try {
			//Socket 클래스 : 클라이언트 프로그램을 구현하기 위한 클래스
			// => 서버 컴퓨터에 접속하는 기능을 제공하는 클래스
			// => 서버 이름(IP 주소)과 포트를 전달하여 클라이언트 프로그램 구현
			// => 접속 서버가 존재하지 않을 경우 UnknownHostException 발생 - 예외 처리
			// => 접속 서버가 실행 상태가 아닌 경우 IOException 발생 - 예외 처리
			Socket socket=new Socket("www.daum.net", 80);
			
			//Socket.toString() : 소켓정보를 문자열로 변환하여 반환하는 메소드
			System.out.println("socket = "+socket.toString());

			//Socket.getInetAddress() : 서버의 네트워크 정보를 반환하는 메소드
			System.out.println("Remote IP Address = "+socket.getInetAddress().getHostAddress());
			//Socket.getPort() : 서버의 포트번호를 반환하는 메소드
			System.out.println("Remote Port Number = "+socket.getPort());
			//Socket.getLocalAddress() : 클라이언트 자신의 네트워크 정보를 반환하는 메소드
			System.out.println("Local IP Address = "+socket.getLocalAddress().getHostAddress());
			//Socket.getPort() : 클라이언트 자신의 포트번호를 반환하는 메소드
			System.out.println("Local Port Number = "+socket.getLocalPort());
			
			//Socket.clse() : 소켓 제거 메소드 - 서버 접속 종료
			socket.close();
		} catch (UnknownHostException e) {
			System.out.println("[에러]서버 컴퓨터를 찾을 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[에러]서버에 접속할 수 없습니다.");
		}
	}
}
