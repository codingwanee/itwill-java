package site.itwill.net;

import java.io.IOException;
import java.net.ServerSocket;

//���� ��ǻ���� ��� ������ ��Ʈ�� Ȯ���ϱ� ���� ���α׷�
public class ServerSocketApp {
	public static void main(String[] args) {
		for(int i=1000;i<=9000;i+=1000) {
			try {
				//ServerSocket Ŭ���� : ���� ���α׷��� �����ϱ� ���� Ŭ����
				// => Ŭ���̾�Ʈ�� ���� ��û�� ���� ���� ��� ����
				// => Ư�� ��Ʈ�� �����Ͽ� ���� ���α׷� ���� 
				ServerSocket server=new ServerSocket(i);
				System.out.println(i+"�� ��Ʈ�� ��� �����մϴ�.");
				//ServerSocket.close() : ���� ��� ���� �޼ҵ�
				server.close();
			} catch (IOException e) {
				//��Ʈ�� �̹� ������� ��� IOException �߻�
				System.out.println(i+"�� ��Ʈ�� �̹� ��� ���Դϴ�.");
			}
		}
	}
}



