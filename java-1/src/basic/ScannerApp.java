package basic;

import java.util.Scanner;

//Ű����� �̸��� ���̸� �Է¹޾� �̸��� ���̸� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class ScannerApp {
	public static void main(String[] args) {
		//Scanner Ŭ���� : �ܺ���ġ(Ű����, ���ϵ�)�κ��� ����� �Է¹޾� 
		//��ȯ�ϴ� ���(�޼ҵ�)�� �����ϴ� Ŭ����
		// => Scanner Ŭ������ ��ü�� ������ �� �޼ҵ� ȣ�� ����
		
		//Ű����� �Էµ� ����� ������ �ִ� Scanner ��ü ���� 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�̸� �Է� >> ");
		//Scanner.nextLine() : Ű����� �Էµ� ���ڿ��� ��ȯ�ϴ� �޼ҵ�
		// => Ű����� ����� �Է¹ޱ� ������ ���α׷��� �帧�� �Ͻ� ����
		// => Ű����� ��� �Է� �� ���͸� ������ ���α׷� �����
		String name=scanner.nextLine();
		
		System.out.print("���� �Է� >> ");
		//Scanner.nextInt() : Ű����� �Էµ� ��������� ��ȯ�ϴ� �޼ҵ�
		// => ��������� �ƴ� ���� �Է��� ��� ���� ���� ����(Exception) �߻�
		int age=scanner.nextInt();
		
		System.out.println("[���]"+name+"���� ���̴� "+age+"���Դϴ�.");
		
		//Scanner.close() : �Է� ���� �ڿ��� �����ϴ� �޼ҵ�
		scanner.close();
	}
}









