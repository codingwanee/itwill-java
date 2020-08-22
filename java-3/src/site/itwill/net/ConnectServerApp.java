package site.itwill.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//���� ���α׷� - ServerSocket Ŭ������ Socket Ŭ���� �̿�
// => Ŭ���̾�Ʈ�� ���ӵ� ��� Ŭ���̾�Ʈ�� ��Ʈ��ũ ���� ���
public class ConnectServerApp {
	public static void main(String[] args) throws IOException {
		//ServerSocket �ν��Ͻ� ���� - ���� ����
		// => ��Ʈ��ȣ�� �����Ͽ� �ش� ��Ʈ��ũ�� ���� Ŭ���̾�Ʈ�� ���� ���
		ServerSocket server=new ServerSocket(2000);
		System.out.println("[�޼���]���� ���� ��...");
		
		try {
			//���� ���α׷��� Ŭ���̾�Ʈ�� �������� ������ ����ϱ� ���� ���ѷ��� ó��
			while(true) {
				//ServerSocket.accept() : Ŭ���̾�Ʈ�� ������ �����ϴ� �޼ҵ�
				// => Ŭ���̾�Ʈ ���� ������ ������ �Ͻ� ����
				// => Ŭ���̾�Ʈ�� ���ӵ� ��� Ŭ���̾�Ʈ�� ��ũ��ũ ������
				//    ����� ��Ʈ�� ������ �����ϰ� �ִ� Socket �ν��Ͻ� ��ȯ 
				Socket socket=server.accept();
				
				System.out.println("[�޼���]Ŭ���̾�Ʈ("+socket
					.getInetAddress().getHostAddress()+")���� ���� �Ͽ����ϴ�.");
				
				//���� ���� - Ŭ���̾�Ʈ�� ���� ����
				socket.close();
			}
		} finally {
			server.close();
		}
	}
}