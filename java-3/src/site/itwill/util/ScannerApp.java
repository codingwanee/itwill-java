package site.itwill.util;

import java.util.InputMismatchException;
import java.util.Scanner;

//Scanner Ŭ���� : �Է���ġ(Ű����,����)�κ��� ���� �Է¹޾� ��ȯ�ϴ� ����� �����ϴ� Ŭ����
// => �Է� �޼ҵ忡 ���� �Է� ���� �߻�
public class ScannerApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�̸� �Է� >> ");
		String name=scanner.nextLine();
		
		int age;
		while(true) {
			try {
				System.out.print("���� �Է� >> ");
				//nextInt() �޼ҵ�� �Է°��� ������ �ƴ� ��� InputMismatchException ���� �߻�
				// => ����ó���� �� ��� ���������� �Է°��� Ű���� ���ۿ� ��� ���� ���� ���� �߻�
				//nextInt() �޼ҵ�� ���͸� ������ ���ڸ� �о� ��ȯ >> Ű���� ���ۿ� Enter ���� 
				age=scanner.nextInt();
				if(age>=1 && age<=100) break;
				System.out.println("[����]���̴� 0���� 100������ �Է� �����մϴ�.");
			} catch (InputMismatchException e) {
				//Ű���� ���ۿ� ���� �ִ� ���������� �Է°� ����
				// => nextLine() �޼ҵ带 �̿��Ͽ� ���������� ���� ��ȯ�޾� ����
				scanner.nextLine();
				System.out.println("[����]���̿� ���ڰ� �ƴ� ���ڰ� �Է� �Ǿ����ϴ�.");
			}
		}
		
		System.out.print("�̸��� �Է� >> ");
		//nextLine() �޼ҵ�� Ű���� ���ۿ� ���� �ִ� Enter �о� ��ȯ >> �Է� �̽���
		// => nextLine() �޼ҵ带 �̸� �� �� ȣ���Ͽ� Enter �о� ����
		scanner.nextLine();
		String email=scanner.nextLine();
		
		System.out.println("============================================");
		System.out.println("�̸� = "+name);
		System.out.println("���� = "+age);
		System.out.println("�̸��� = "+email);
		System.out.println("============================================");
		scanner.close();
	}
}





