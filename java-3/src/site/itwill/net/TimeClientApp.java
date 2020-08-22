package site.itwill.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//NTP 서버에 접속하여 제공받은 날짜와 시간정보를 출력하는 클라이언트 프로그램
public class TimeClientApp {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//서버 접속해서 생성된 Socket 인스턴스는 서버와 정보를 주고 받을 수 
			//있는 입력스트림(InputStream)과 출력스트림(OutputStream) 제공
			Socket socket=new Socket("192.168.14.31", 3000);
			
			//Socket.getInputStream() : Socket 인스턴스의 입력스트림을 반환하는 메소드
			InputStream in=socket.getInputStream();
			
			//제공받은 입력스트림을 객체 단위 입력 스트림으로 확장
			ObjectInputStream stream=new ObjectInputStream(in);
			
			//서버에서 제공된 Date 인스턴스를 반환받아 저장
			Date serverDate=(Date)stream.readObject();
			
			System.out.println("[결과]서버에서 제공된 날짜와 시간 = "
				+new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초").format(serverDate));
		
			socket.close();
		} catch (IOException e) {
			System.out.println("[에러]서버에 접속할 수 없습니다.");
		}
	}
}




