package site.itwill.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//키보드로 메세지를 입력받아 서버 접속 후 전달하는 클라이언트 프로그램
public class EchoClientApp {
	public static void main(String[] args) throws IOException {
		//기본적으로 제공되는 키보드 입력스트림을 메세지를 입력받을 수 있도록 확장
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//서버에 전달하고자 하는 메세지를 키보드로 입력받아 저장
		System.out.print("전달 메세지 입력 >> ");
		String message=br.readLine();
		
		//서버 접속
		Socket socket=new Socket("192.168.14.31", 4000);
		
		//소켓에서 출력스트림을 제공받아 확장하여 저장
		BufferedWriter out=new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		
		//키보드 입력 문자열을 서버에 전달
		out.write(message);
		out.flush();
		
		System.out.println("[결과]서버에 메세지에 전달 하였습니다.");
		socket.close();
	}
}







