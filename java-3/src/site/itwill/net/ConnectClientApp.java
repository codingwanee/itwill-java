package site.itwill.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//Ŭ���̾�Ʈ ���α׷� - Socket Ŭ���� �̿�
// => ������ �����Ͽ� ������ ��Ʈ��ũ ������ ���
public class ConnectClientApp {
	public static void main(String[] args) {
		try {
			//Socket �ν��Ͻ� ���� - ���� ����
			// => ������(IP �ּ�)�� ��Ʈ��ȣ�� �����Ͽ� Socket �ν��Ͻ� ���� 
			Socket socket=new Socket("192.168.14.31", 2000);
			
			System.out.println("[�޼���]����("+socket
				.getInetAddress().getHostAddress()+")�� ���� �Ͽ����ϴ�.");
			
			socket.close();
		} catch (UnknownHostException e) {
			System.out.println("[����]������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("[����]������ ���ӵ��� �ʽ��ϴ�.");
		}
	}
}
