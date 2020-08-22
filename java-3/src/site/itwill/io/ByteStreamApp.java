package site.itwill.io;

import java.io.IOException;

//Ű����� ���õ���Ÿ(1Byte)�� �Է¹޾� ����Ϳ� ����ϴ� ���α׷�
// => EOF(End Of File - �Է����� : Ctrl+Z)�� �Է��ϸ� ���α׷� ����
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[�޼���]Ű����� ���� �Է��� �ּ���.[���� : Ctrl+Z]");
		
		//Ű����� �Էµ� ���õ���Ÿ�� �����ϱ� ���� ����
		int readByte;
		
		while(true) {
			//System.in : Java ���α׷� ���߽� �⺻������ �����޴� �Է½�Ʈ��
			// => Ű����κ��� ���õ���Ÿ(1Byte)�� �Է¹��� �� �ִ� ��Ʈ�� - InputStream �ν��Ͻ�
			//InputStream.read() : �Է½�Ʈ������ ���õ���Ÿ�� �о� ��ȯ�ϴ� �޼ҵ�
			// => Ű���� �Է½�Ʈ���� �Է°��� �������� ���� ��� ������ �Ͻ� ����
			// => Ű���带 ���� �Է½�Ʈ���� �Է°��� ������ ���͸� �Է��ϸ� ������ �����
			// => IOException �߻� : ����� �޼ҵ忡�� �߻����� �߻��ϴ� ����(����ó��) - ��Ʈ���� ������ ���� ��� �߻�
			readByte=System.in.read();
			
			//�Է����� ����Ű(Ctrl+Z)�� ������ EOF(-1)�� ��ȯ - �ݺ��� ���� 
			if(readByte==-1) break;
			
			//System.out : Java ���α׷� ���߽� �⺻������ �����޴� ��½�Ʈ��
			// => �����(�ܼ�:Console)�� ���õ���Ÿ(1Byte)�� ����(���) �� �� �ִ� ��Ʈ�� - PrintStream �ν��Ͻ�
			// => PrintStream Ŭ������ OutputStream Ŭ������ ��ӹ��� �ڽ�Ŭ����
			//OutputStream.write(int b) : ���õ���Ÿ�� ��½�Ʈ������ �����ϴ� �޼ҵ� 
			System.out.write(readByte);
		}
		
		System.out.println("[�޼���]���α׷��� �����մϴ�.");
	}
}





