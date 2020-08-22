package site.itwill.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� ���� �� ������ �޼����� ���޹޾� ����ϴ� ���� ���α׷�
public class EchoServerApp {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ServerSocket echoServer=new ServerSocket(4000);
		System.out.println("[�޼���]Echo Server Running...");
		
		while(true) {
			Socket socket=echoServer.accept();
			
			//���Ͽ��� �Է½�Ʈ���� �����޾� Ȯ���Ͽ� ����
			BufferedReader in=new BufferedReader
					(new InputStreamReader(socket.getInputStream()));
			
			//Ŭ���̾�Ʈ���� ������ ���ڿ��� ��ȯ�޾� ���
			System.out.println("["+socket.getInetAddress().getHostAddress()
				+"]���� ������ �޼��� >> "+in.readLine());
			
			socket.close();
		}
	}
}






