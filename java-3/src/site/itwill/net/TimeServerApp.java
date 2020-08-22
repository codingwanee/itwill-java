package site.itwill.net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//���� Ŭ���̾�Ʈ���� ���� ��ǻ���� ��¥�� �ð������� �����ϴ� ���� ���α׷�
// => NTP(Network Time Protocol) Server : ��¥�� �ð������� �����ϴ� ����
public class TimeServerApp {
	public static void main(String[] args) {
		ServerSocket ntpServer=null;
		try {
			//���� ����
			ntpServer=new ServerSocket(3000);
			System.out.println("[�޼���]NTP Server Running...");
			
			while(true) {
				//��ȯ���� Socket �ν��Ͻ��� Ŭ���̾�Ʈ�� ������ �ְ� ���� �� 
				//�ִ� �Է½�Ʈ��(InputStream)�� ��½�Ʈ��(OutputStream) ����
				Socket socket=ntpServer.accept();
				
				/*
				//Socket.getOutputStream() : Socket �ν��Ͻ��� ��½�Ʈ���� ��ȯ�ϴ� �޼ҵ�
				OutputStream out=socket.getOutputStream();
				
				//�������� ��½�Ʈ���� ��ü ���� ��� ��Ʈ������ Ȯ��
				ObjectOutputStream stream=new ObjectOutputStream(out);
				
				//��¥�� �ð������� �����ϴ� Date �ν��Ͻ� ����
				Date date=new Date();
				
				//Date �ν��Ͻ��� ��� ��Ʈ������ ���� >> Ŭ���̾�Ʈ ����
				stream.writeObject(date);
				*/
				
				new ObjectOutputStream(socket.getOutputStream()).writeObject(new Date());
				
				//�α� ���
				System.out.println("[�α�]Ŭ���̾�Ʈ("+socket.getInetAddress()
					.getHostAddress()+")���� ��¥�� �ð������� ���� �Ͽ����ϴ�.");
				
				//Ŭ���̾�Ʈ ���� ����
				socket.close();
			}
		} catch (IOException e) {
			System.out.println("[����]���� ��ǻ���� ��Ʈ��ũ�� ������ �߻� �Ͽ����ϴ�.");
		}
	}
}




