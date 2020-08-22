package site.itwill.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//Ű����� �̸��� �¾ �⵵�� �Է¹޾� �̸��� ���̸� ����ϴ� ���α׷� 
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		//System.in : Ű����� ���õ���Ÿ�� �Է¹ޱ� ���� �Է½�Ʈ��(�⺻������ �����Ǵ� �Է½�Ʈ��)
		//new InputStreamReader(System.in) : System.in ��Ʈ���� ���޹޾� 
		//Ű����� ��������Ÿ(����)�� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		//new BufferedReader(new InputStreamReader(System.in)) : InputStreamReader
		//��Ʈ���� ���޹޾� Ű����� ��������Ÿ�� �������� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//PrintStream Ŭ������ print() �޼ҵ� �Ǵ� println() �޼ҵ� �̿�
		// => � ������ ���� �����ص� ���ڿ��� �����Ͽ� ����ϴ� �޼ҵ�
		System.out.print("�̸� �Է� >> ");
		//BufferedReader.readLine() : �Է½�Ʈ���� ��������Ÿ�� ���ڿ��� ���� ��ȯ�ϴ� �޼ҵ�
		String name=br.readLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		//Integer.parseInt() �޼ҵ带 ȣ���Ͽ� �Է¹��� ���ڿ��� ������ ��ȯ
		int year=Integer.parseInt(br.readLine());
		
		int age=Calendar.getInstance().get(Calendar.YEAR)-year+1;
		
		System.out.println("[���]"+name+"���� ���̴� "+age+"���Դϴ�.");
	}
}
