package site.itwill.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

//Ű����� �޼����� �Է¹޾� ���� ���� �� �����ϴ� Ŭ���̾�Ʈ ���α׷�
public class EchoClientApp {
	public static void main(String[] args) throws IOException {
		//�⺻������ �����Ǵ� Ű���� �Է½�Ʈ���� �޼����� �Է¹��� �� �ֵ��� Ȯ��
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//������ �����ϰ��� �ϴ� �޼����� Ű����� �Է¹޾� ����
		System.out.print("���� �޼��� �Է� >> ");
		String message=br.readLine();
		
		//���� ����
		Socket socket=new Socket("192.168.14.31", 4000);
		
		//���Ͽ��� ��½�Ʈ���� �����޾� Ȯ���Ͽ� ����
		BufferedWriter out=new BufferedWriter
				(new OutputStreamWriter(socket.getOutputStream()));
		
		//Ű���� �Է� ���ڿ��� ������ ����
		out.write(message);
		out.flush();
		
		System.out.println("[���]������ �޼����� ���� �Ͽ����ϴ�.");
		socket.close();
	}
}







