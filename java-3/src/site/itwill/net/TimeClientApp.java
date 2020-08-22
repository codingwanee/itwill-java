package site.itwill.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

//NTP ������ �����Ͽ� �������� ��¥�� �ð������� ����ϴ� Ŭ���̾�Ʈ ���α׷�
public class TimeClientApp {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//���� �����ؼ� ������ Socket �ν��Ͻ��� ������ ������ �ְ� ���� �� 
			//�ִ� �Է½�Ʈ��(InputStream)�� ��½�Ʈ��(OutputStream) ����
			Socket socket=new Socket("192.168.14.31", 3000);
			
			//Socket.getInputStream() : Socket �ν��Ͻ��� �Է½�Ʈ���� ��ȯ�ϴ� �޼ҵ�
			InputStream in=socket.getInputStream();
			
			//�������� �Է½�Ʈ���� ��ü ���� �Է� ��Ʈ������ Ȯ��
			ObjectInputStream stream=new ObjectInputStream(in);
			
			//�������� ������ Date �ν��Ͻ��� ��ȯ�޾� ����
			Date serverDate=(Date)stream.readObject();
			
			System.out.println("[���]�������� ������ ��¥�� �ð� = "
				+new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss��").format(serverDate));
		
			socket.close();
		} catch (IOException e) {
			System.out.println("[����]������ ������ �� �����ϴ�.");
		}
	}
}




