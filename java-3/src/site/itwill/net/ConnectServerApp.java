package site.itwill.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//서버 프로그램 - ServerSocket 클래스와 Socket 클래스 이용
// => 클라이언트가 접속될 경우 클라이언트의 네트워크 정보 출력
public class ConnectServerApp {
	public static void main(String[] args) throws IOException {
		//ServerSocket 인스턴스 생성 - 서버 실행
		// => 포트번호를 전달하여 해당 네트워크를 열어 클라이언트의 접속 허용
		ServerSocket server=new ServerSocket(2000);
		System.out.println("[메세지]서버 동작 중...");
		
		try {
			//서버 프로그램은 클라이언트의 지속적인 접속을 허용하기 위해 무한루프 처리
			while(true) {
				//ServerSocket.accept() : 클라이언트의 접속을 감지하는 메소드
				// => 클라이언트 접속 전까지 스레드 일시 중지
				// => 클라이언트가 접속될 경우 클라이언트의 네크워크 정보와
				//    입출력 스트림 정보를 저장하고 있는 Socket 인스턴스 반환 
				Socket socket=server.accept();
				
				System.out.println("[메세지]클라이언트("+socket
					.getInetAddress().getHostAddress()+")에서 접속 하였습니다.");
				
				//소켓 제거 - 클라이언트의 접속 해제
				socket.close();
			}
		} finally {
			server.close();
		}
	}
}