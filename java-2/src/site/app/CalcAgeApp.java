package site.app;

import java.util.Date;
import java.util.Scanner;

//Ű����� �̸��� �¾ �⵵�� �Է¹޾� �̸��� ���̸� ����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
//ex) �̸� �Է� >> ȫ�浿
//    �¾ �⵵ �Է� >> 2000
//    [���]ȫ�浿���� ���̴� 20���Դϴ�.
public class CalcAgeApp {
	public static void main(String[] args) {
		//Ű����� ���� �Է¹޾� �����ޱ� ���� Scanner �ν��Ͻ� ����
		Scanner scanner=new Scanner(System.in);
		
		//�̸��� �¾ �⵵�� �Է¹޾� ����
		System.out.print("�̸� �Է� >> ");
		String name=scanner.nextLine();
		
		System.out.print("�¾ �⵵ �Է� >> ");
		int birthYear=scanner.nextInt();
		
		//java.util.Date Ŭ������ �ν��Ͻ� ����
		// => java.util.Date : ��¥�� �ð������� ������ ������ Ŭ����
		// => Date() : ���� �ý��� ��¥�� �ð������� �����ϰ� �ִ� �ν��Ͻ��� �����ϱ� ���� ������
		Date now=new Date();
		
		//���� �⵵�� ��ȯ�޾� ����
		//Date.getYear() : 1900����� 1�� �����Ǵ� �⵵���� ��ȯ�ϴ� �޼ҵ�
		// => @Deprecated ������̼��� ����� �޼ҵ�
		//@Deprecated : �޼ҵ� ȣ���� ����� �ϵ��� �����ϴ� ������̼�
		//@SuppressWarnings(String warning) : �ش� ��� �޼����� �����ϴ� ������̼�
		@SuppressWarnings("deprecation")
		int currentYear=now.getYear()+1900;
		
		//���̸� ���(���� �⵵ - �¾ �⵵ + 1)�Ͽ� ����
		//int age=2019-birthYear+1;
		int age=currentYear-birthYear+1;
		
		//��� ���
		System.out.println("[���]"+name+"���� ���̴� "+age+"���Դϴ�.");
		
		//Scanner �ν��Ͻ� ���� - �Է���ġ ���� 
		scanner.close();
	}
}