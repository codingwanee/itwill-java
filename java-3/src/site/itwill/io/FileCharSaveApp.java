package site.itwill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű����� ��������Ÿ�� �Է¹޾� ���Ͽ� �����ϴ� ���α׷�
public class FileCharSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]���Ͽ� ������ ������ �Է��� �ּ���.[���� : Ctrl+Z]");
		
		//Ű���� �Է½�Ʈ������ ��������Ÿ�� �б� ���� ��Ʈ������ Ȯ��
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//FileWriter Ŭ���� : ���� ��½�Ʈ���� �����ϱ� ���� Ŭ���� - ��������Ÿ
		FileWriter fw=new FileWriter("c:/data/char.txt");
	
		int readChar;
		
		while(true) {
			readChar=isr.read();
			if(readChar==-1) break;
			fw.write(readChar);
			fw.flush();
		}
		
		fw.close();
		System.out.println("[���]c:\\data\\char.txt ���Ͽ� �Է� ������ ���� �Ǿ����ϴ�.");
	}
}







