package site.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

//���ϵ���Ÿ�� ��������Ÿ�� �о� ����Ϳ� ����ϴ� ���α׷�
public class FileCharLoadApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]c:\\data\\char.txt ���Ͽ� ����� �����Դϴ�.");

		FileReader fr=null;
		try {
			fr=new FileReader("c:/data/char.txt");
		} catch (FileNotFoundException e) {
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		int readChar;
		
		while(true) {
			readChar=fr.read();
			if(readChar==-1) break;
			osw.write(readChar);
			osw.flush();
		}
		
		fr.close();
	}
}





