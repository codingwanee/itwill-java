package site.itwill.net;

import java.io.IOException;
import java.net.ServerSocket;

//로컬 컴퓨터의 사용 가능한 포트를 확인하기 위한 프로그램
public class ServerSocketApp {
	public static void main(String[] args) {
		for(int i=1000;i<=9000;i+=1000) {
			try {
				//ServerSocket 클래스 : 서버 프로그램을 구현하기 위한 클래스
				// => 클라이언트의 접속 요청에 대한 응답 기능 제공
				// => 특정 포트를 전달하여 서버 프로그램 구현 
				ServerSocket server=new ServerSocket(i);
				System.out.println(i+"번 포트는 사용 가능합니다.");
				//ServerSocket.close() : 서버 기능 종료 메소드
				server.close();
			} catch (IOException e) {
				//포트가 이미 사용중인 경우 IOException 발생
				System.out.println(i+"번 포트는 이미 사용 중입니다.");
			}
		}
	}
}



