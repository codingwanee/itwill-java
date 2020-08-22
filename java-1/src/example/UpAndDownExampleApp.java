package example;

import java.util.Scanner;

//��ǻ�ͷκ��� ������ ���������� Ű����� �Է��Ͽ� ���ߴ� ���α׷��� �ۼ��ϼ���.
// => 1~100 ������ ���������� ���� �޵��� �ۼ�
// => ������ ���� �� �ִ� ��ȸ�� 10���� �����ǵ��� �ۼ�
// => Ű���� �Է°��� 1~100 ������ �ƴ� ��� ���Է�
// => ������ �Է°��� ������ ��� �Է�Ƚ�� ��� �� ���α׷� ����
// => ������ �Է°��� �ٸ� ��� "ū�� �Է�" �Ǵ� "������ �Է�" ������ �޼��� ���
// => ������ 10�� �ȿ� ������ ���� ��� ���� ���
public class UpAndDownExampleApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		//1~100 ������ ������ �����޾� ������ ����
		int dap=(int)(Math.random()*100)+1;
		
		//���� ���� ���������� �����ϱ� ���� ����
		// => false : ����(X), true : ����(O)
		boolean result=false;
		
		for(int cnt=1;cnt<=10;cnt++) {
			int input;
			while(true) {
				System.out.print(cnt+"��° �Է�[1~100] >> ");
				input=scanner.nextInt();
				if(input>=1 && input<=100) break;
				System.out.println("[����]�Է°��� 1~100 ������ ���� ��ȿ�մϴ�.");
			}
			
			if(dap==input) {
				System.out.println("[�޼���]"+cnt+"���� ������ ������ϴ�.");
				result=true;
				break;
			} else if(dap>input) {
				System.out.println("[���]"+input+"���� ū ���� �Է��� ������.");
			} else {
				System.out.println("[���]"+input+"���� ���� ���� �Է��� ������.");
			}
			
			/*
			if(cnt==10) {
				System.out.println("[�޼���]������ ������ ���߱���. ������ <"+dap+">�Դϴ�.");
			}
			*/
		}
		
		if(!result) {
			System.out.println("[�޼���]������ ������ ���߱���. ������ <"+dap+">�Դϴ�.");
		}
		
		scanner.close();
	}
}