package site.itwill.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//���ϵ���Ÿ�� ���õ���Ÿ�� �о� ����Ϳ� ����ϴ� ���α׷�
public class FileByteLoadApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]c:\\data\\byte.txt ���Ͽ� ����� �����Դϴ�.");

		//FileInputStream : ���� �Է½�Ʈ���� �����ϱ� ���� Ŭ����
		FileInputStream fis=null;
		//FileInputStream(String filePath) : ���޵� ���ϰ�ο� ���� �Է½�Ʈ���� �����ϴ� ������
		// => ���ϰ���� ������ �������� ���� ��� FileNotFoundException �߻�
		// => FileNotFoundException �߻��� ��� ����ó���� ���� ó�� �̽���
		try {
			fis=new FileInputStream("c:/data/byte.txt");
		} catch (FileNotFoundException e) {
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		int readByte;
		
		while(true) {
			//���� �Է½�Ʈ������ ���õ���Ÿ�� ��ȯ�޾� ���� - �ҷ�����
			readByte=fis.read();
			if(readByte==-1) break;
			System.out.write(readByte);
		}
		
		fis.close();
	}
}









