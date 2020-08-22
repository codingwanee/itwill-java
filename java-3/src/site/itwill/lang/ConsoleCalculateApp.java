package site.itwill.lang;

import java.util.Scanner;

//Ű����� ��Ģ ������� �Է¹޾� �������� ����ϴ� ���α׷�
//ex) ����� �Է� >> 20 + 10
//    [���]30
// => �Է� ����Ŀ� ���� �����ڴ� ��Ģ ������(*, /, +, -)�� ����
// => �Է� ������� �߸� �Է��� ��� �����޼��� ��� �� ���α׷� ����
// => �Է� ����Ŀ� ������ �ԷµǾ ���� ó��
public class ConsoleCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("����� �Է� >> ");
		//������� �Է� �޾� ���� >> �Է� ����Ŀ� �����ϴ� ��� ���� ����
		String operation=scanner.nextLine().replace(" ", "");
		
		scanner.close();
		
		//����Ŀ��� �����ڸ� �˻��Ͽ� �������� ��ġ(index) ����
		//����Ŀ��� �˻��� �����ڵ��� ������ �迭 ����
		String[] operatorArray={"*","/","+","-"};
		int index=-1;//�������� ��ġ���� �����ϱ� ���� ����
		for(String temp:operatorArray) {
			//����Ŀ��� �����ڸ� �˻��Ͽ� ��ġ���� ��ȯ�޾� ����
			// => �����ڰ� ����Ŀ� �������� ���� ��� -1�� ��ȯ�޾� ����
			index=operation.lastIndexOf(temp);
			//�����ڰ� �˻��Ǿ� ����� ��� �ݺ��� ����
			if(index!=-1) break;
		}
		//����Ŀ� �����ڰ� ���ų� �ǿ����ڰ� �� ���� �ƴ� ��� >> ������� �߸� �Էµ� ��� 
		if(index<=0 || index>=operation.length()-1) {
			System.out.println("[����]������� �߸� �Է� �Ͽ����ϴ�.");
			System.exit(0);//���α׷� ����
		}
		
		try {
			//����Ŀ��� �ǿ����ڿ� �����ڸ� �и��Ͽ� ����
			int num1=Integer.parseInt(operation.substring(0, index));
			String operator=operation.substring(index, index+1);
			int num2=Integer.parseInt(operation.substring(index+1));
			
			//�����ڿ� ���� �ǿ����ڵ��� �������� ����Ͽ� ����
			int result=0;
			switch (operator) {
			case "*": result=num1*num2; break;
			case "/": result=num1/num2; break;
			case "+": result=num1+num2; break;
			case "-": result=num1-num2; break;
			}
			
			System.out.println("[���]"+result);
		} catch (NumberFormatException e) {
			System.out.println("[����]�ǿ����ڿ� ���ڸ� �Է� �����մϴ�.");
		} catch (ArithmeticException e) {
			System.out.println("[����]0���� ���� �� �����ϴ�.");
		} catch (Exception e) {
			System.out.println("[����]���α׷��� ����ġ ���� ������ �߻� �Ͽ����ϴ�.");
		}
	}
}
