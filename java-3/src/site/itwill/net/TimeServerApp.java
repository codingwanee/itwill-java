package site.itwill.net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//접속 클라이언트에게 서버 컴퓨터의 날짜와 시간정보를 제공하는 서버 프로그램
// => NTP(Network Time Protocol) Server : 날짜와 시간정보를 제공하는 서버
public class TimeServerApp {
	public static void main(String[] args) {
		ServerSocket ntpServer=null;
		try {
			//서버 실행
			ntpServer=new ServerSocket(3000);
			System.out.println("[메세지]NTP Server Running...");
			
			while(true) {
				//반환받은 Socket 인스턴스는 클라이언트와 정보를 주고 받을 수 
				//있는 입력스트림(InputStream)과 출력스트림(OutputStream) 제공
				Socket socket=ntpServer.accept();
				
				/*
				//Socket.getOutputStream() : Socket 인스턴스의 출력스트림을 반환하는 메소드
				OutputStream out=socket.getOutputStream();
				
				//제공받은 출력스트림을 객체 단위 출력 스트림으로 확장
				ObjectOutputStream stream=new ObjectOutputStream(out);
				
				//날짜와 시간정보를 저장하는 Date 인스턴스 생성
				Date date=new Date();
				
				//Date 인스턴스를 출력 스트림에게 전달 >> 클라이언트 전송
				stream.writeObject(date);
				*/
				
				new ObjectOutputStream(socket.getOutputStream()).writeObject(new Date());
				
				//로그 출력
				System.out.println("[로그]클라이언트("+socket.getInetAddress()
					.getHostAddress()+")에서 날짜와 시간정보를 제공 하였습니다.");
				
				//클라이언트 접속 해제
				socket.close();
			}
		} catch (IOException e) {
			System.out.println("[에러]서버 컴퓨터의 네트워크에 문제가 발생 하였습니다.");
		}
	}
}




