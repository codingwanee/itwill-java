package site.itwill.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketApp {
	public static void main(String[] args) {
		try {
			//Socket Ŭ���� : Ŭ���̾�Ʈ ���α׷��� �����ϱ� ���� Ŭ����
			// => ���� ��ǻ�Ϳ� �����ϴ� ����� �����ϴ� Ŭ����
			// => ���� �̸�(IP �ּ�)�� ��Ʈ�� �����Ͽ� Ŭ���̾�Ʈ ���α׷� ����
			// => ���� ������ �������� ���� ��� UnknownHostException �߻� - ���� ó��
			// => ���� ������ ���� ���°� �ƴ� ��� IOException �߻� - ���� ó��
			Socket socket=new Socket("www.daum.net", 80);
			
			//Socket.toString() : ���������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
			System.out.println("socket = "+socket.toString());

			//Socket.getInetAddress() : ������ ��Ʈ��ũ ������ ��ȯ�ϴ� �޼ҵ�
			System.out.println("Remote IP Address = "+socket.getInetAddress().getHostAddress());
			//Socket.getPort() : ������ ��Ʈ��ȣ�� ��ȯ�ϴ� �޼ҵ�
			System.out.println("Remote Port Number = "+socket.getPort());
			//Socket.getLocalAddress() : Ŭ���̾�Ʈ �ڽ��� ��Ʈ��ũ ������ ��ȯ�ϴ� �޼ҵ�
			System.out.println("Local IP Address = "+socket.getLocalAddress().getHostAddress());
			//Socket.getPort() : Ŭ���̾�Ʈ �ڽ��� ��Ʈ��ȣ�� ��ȯ�ϴ� �޼ҵ�
			System.out.println("Local Port Number = "+socket.getLocalPort());
			
			//Socket.clse() : ���� ���� �޼ҵ� - ���� ���� ����
			socket.close();
		} catch (UnknownHostException e) {
			System.out.println("[����]���� ��ǻ�͸� ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.out.println("[����]������ ������ �� �����ϴ�.");
		}
	}
}
