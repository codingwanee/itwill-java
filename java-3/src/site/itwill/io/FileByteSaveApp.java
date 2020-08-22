package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;

//Ű����� ���õ���Ÿ�� �Է¹޾� ���Ͽ� �����ϴ� ���α׷�
public class FileByteSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]���Ͽ� ������ ������ �Է��� �ּ���.[���� : Ctrl+Z]");
		
		//FileOutputStream Ŭ���� : ���� ��½�Ʈ���� �����ϱ� ���� Ŭ���� - ���õ���Ÿ
		//FileOutputStream(String filePath) : ���޵� ���ϰ�ο� ���� ��½�Ʈ���� �����ϴ� ������
		// => ���ϰ���� ������ �������� ���� ��� FileNotFoundException �߻�
		// => FileNotFoundException Ŭ������ IOException Ŭ������ �ڽ�Ŭ����
		// => ���ϰ���� ������ �������� ���� ��� ���� �����Ǹ� ������ ������ ��� ���� ���� ������ ����
		//FileOutputStream fos=new FileOutputStream("c:/data/byte.txt");

		//FileOutputStream(String filePath, boolean append) : ���޵� ���ϰ�ο� ���� ��½�Ʈ���� �����ϴ� ������
		// => append �Ķ���Ϳ� true�� ���޵� ��� ���� ���� �ڿ� ���ο� ���� �߰�
		FileOutputStream fos=new FileOutputStream("c:/data/byte.txt",true);
		
		int readByte;
		
		while(true) {
			readByte=System.in.read();
			if(readByte==-1) break;
			//���� ��½�Ʈ���� ���õ���Ÿ�� ���� >> ����
			fos.write(readByte);
		}
		
		//FileOutputStream.close() : ���� ��½�Ʈ���� �����ϴ� �޼ҵ�
		// => ���Ͽ��� �Է½�Ʈ���� ��½�Ʈ���� �ϳ����� ���� ����
		fos.close();
		
		System.out.println("[���]c:\\data\\byte.txt ���Ͽ� �Է� ������ ���� �Ǿ����ϴ�.");
	}
}







