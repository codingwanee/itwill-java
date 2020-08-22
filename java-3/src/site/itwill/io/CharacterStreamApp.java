package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//Ű����� ��������Ÿ(2Byte)�� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
// => EOF(End Of File - �Է����� : Ctrl+Z)�� �Է��ϸ� ���α׷� ����
public class CharacterStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]Ű����� ���� �Է��� �ּ���.[���� : Ctrl+Z]");

		//InputStreamReader Ŭ���� : InputStream �ν��Ͻ��� ���޹޾� ��������Ÿ�� �б� ���� Ŭ���� 
		// => InputStreamReader(InputStream in[, String charset]) ������
		//System.in �ν��Ͻ��� ���޹޾� Ű����κ��� ��������Ÿ�� �Է¹��� �� �ִ� �Է½�Ʈ�� ���� - Ȯ��(���԰���)
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//OutputStreamWriter Ŭ���� : OutputStream �ν��Ͻ��� ���޹޾� ��������Ÿ�� ���(����) ���� Ŭ����
		// => OutputStreamWriter(OutputStream out) ������
		//System.out �ν��Ͻ��� ���޹޾� ����Ϳ� ���浥��Ÿ�� ������ �� �ִ� ��½�Ʈ�� ���� - Ȯ��(���԰���)
		//OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		//PrintWriter Ŭ������ OutputStreamWriter Ŭ������ ��ӹ��� �ڽ�Ŭ����
		PrintWriter pw=new PrintWriter(System.out);
		
		//Ű����� �Էµ� ��������Ÿ�� �����ϱ� ���� ����
		int readChar;
		
		while(true) {
			//�Է½�Ʈ������ ��������Ÿ�� ��ȯ�޾� ����
			readChar=isr.read();
			
			if(readChar==-1) break;
			
			//��½�Ʈ������ ��������Ÿ�� �����Ͽ� ���
			// => CharacterStream ���� ���Ŭ������ ��������Ÿ ��Ƽ� �ѹ��� ��½�Ʈ������ ����
			//osw.write(readChar);
			pw.write(readChar);
			
			//OutputStreamWriter.flush() : ����(�ӽø޸�)�� ����� ��������Ÿ�� ��½�Ʈ������ �����ϴ� �޼ҵ�
			//osw.flush();
			pw.flush();
		}
		
		System.out.println("[�޼���]���α׷��� �����մϴ�.");
	}
}



