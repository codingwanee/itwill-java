package site.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//��������(c:\data\setup.exe)�� ������ ��������Ÿ�� �о� Ÿ������(c:\data\setup_char.exe)�� �����Ͽ� �����ϴ� ���α׷�
// => �ؽ�Ʈ ���ϸ� ���� ������ ���α׷�
public class FileCopyCharApp {
	public static void main(String[] args) throws IOException {
		//BufferedReader Ŭ���� : Reader �ν��Ͻ��� ���޹޾� �뷮�� ����Ÿ��
		//�Է¹��� �� �ִ� ��Ʈ������ Ȯ���ϱ� ���� Ŭ����
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("c:/data/setup.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}

		//BufferedWriter Ŭ���� : Writer �ν��Ͻ��� ���޹޾� �뷮�� ����Ÿ�� �����ϱ� ���� ��Ʈ������ Ȯ���ϱ� ���� Ŭ����		
		BufferedWriter bw=new BufferedWriter(new FileWriter("c:/data/setup_char.exe"));
		
		int readChar;
		while(true) {
			readChar=br.read();
			if(readChar==-1) break;
			bw.write(readChar);
		}
		
		br.close();
		bw.close();
		
		System.out.println("[���]������ ���������� ���� �Ͽ����ϴ�.");
	}	
}






