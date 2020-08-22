package site.itwill.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataInputStream Ŭ���� : ������ ������ ���ϴ� �ڷ������� �б� ���� �Է½�Ʈ���� �����ϱ� ���� Ŭ����
		// => InputStream �ν��Ͻ��� ���޹޾� Ȯ��
		DataInputStream dis=new DataInputStream(new FileInputStream("c:/data/data.txt"));

		//���Ͽ� ����� ������� ���� ���� ������ ���� �߻� - ���� ����
		
		//DataInputStream.readInt() : ���� ����Ÿ�� ������ �о� ��ȯ�ϴ� �޼ҵ� 
		int value1=dis.readInt();
		//DataInputStream.readDouble() : ���� ����Ÿ�� �Ǽ��� �о� ��ȯ�ϴ� �޼ҵ� 
		double value2=dis.readDouble();
		//DataInputStream.readUTF() : ���� ����Ÿ�� ���ڿ��� �о� ��ȯ�ϴ� �޼ҵ� 
		String value3=dis.readUTF();
		
		System.out.println("������ = "+value1);
		System.out.println("�Ǽ��� = "+value2);
		System.out.println("���ڿ� = "+value3);
		
		dis.close();
	}
}







