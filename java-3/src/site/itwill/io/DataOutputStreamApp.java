package site.itwill.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataOutputStream Ŭ���� : ���ϴ� �ڷ����� ����Ÿ�� �����ϱ� ���� ��½�Ʈ���� �����ϱ� ���� Ŭ����
		// => OutputStream �ν��Ͻ��� ���޹޾� Ȯ��
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("c:/data/data.txt"));
		
		//DataOutputStream.writeInt(int value) : �������� ��½�Ʈ������ �����ϴ� �޼ҵ�
		dos.writeInt(100);
		//DataOutputStream.writeDouble(double value) : �Ǽ����� ��½�Ʈ������ �����ϴ� �޼ҵ�
		dos.writeDouble(12.34);
		//DataOutputStream.writeUTF(String str) : ���ڿ��� ��½�Ʈ������ �����ϴ� �޼ҵ�
		dos.writeUTF("ȫ�浿");
		
		dos.close();
		System.out.println("c:\\data\\data.txt ���Ͽ� ���ް��� ���� �Ͽ����ϴ�.");
	}
}





