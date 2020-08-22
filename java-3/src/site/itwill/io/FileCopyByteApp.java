package site.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//��������(c:\data\setup.exe)�� ������ ���õ���Ÿ�� �о� Ÿ������(c:\data\setup_byte.exe)�� �����Ͽ� �����ϴ� ���α׷�
// => ��� ������ ������ ���� ������ ���α׷�
public class FileCopyByteApp {
	public static void main(String[] args) throws IOException {
		//���������� ������ �б� ���� �Է½�Ʈ�� ����
		//BufferedInputStream Ŭ���� : InputStream �ν��Ͻ��� ���޹޾� 
		//�뷮�� ����Ÿ�� �Է¹��� �� �ִ� ��Ʈ������ Ȯ���ϱ� ���� Ŭ����
		BufferedInputStream bis=null;
		try {
			bis=new BufferedInputStream(new FileInputStream("c:/data/setup.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		//Ÿ�����Ͽ� ������ �����Ͽ� �����ϱ� ���� ��½�Ʈ�� ����
		//BufferedOutputStream Ŭ���� : OutputStream �ν��Ͻ��� ���޹޾� 
		//�뷮�� ����Ÿ�� �����ϱ� ���� ��Ʈ������ Ȯ���ϱ� ���� Ŭ����		
		BufferedOutputStream bos=new BufferedOutputStream
				(new FileOutputStream("c:/data/setup_byte.exe"));
		
		int readByte;
		while(true) {
			readByte=bis.read();
			if(readByte==-1) break;
			bos.write(readByte);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("[���]������ ���������� ���� �Ͽ����ϴ�.");
	}
}






