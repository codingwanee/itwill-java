package site.itwill.util;

import java.util.Random;
import java.util.Scanner;

//���ھ߱����� : ��������(0~9)�� 3�� �߻��ϰ� Ű����� �Է��Ͽ� ���ߴ� ����
//������ ��Ģ
// => ������ �Է°��� 3���� ������ ���� �޶�� �ϰ� 0���� ���۵Ǿ�� �ȵȴ�.
// => ���ڿ� �ڸ����� ������ ��Ʈ����ũ, ���ڴ� ������ �ڸ����� Ʋ���� ���� ���
// => ��Ʈ����Ʈ�� 3�̸� ���� �޼��� ��� �� ���α׷� ����
// => �Է� ��ȸ�� 15���� �����ϸ� ������ ������ ��� ����(����) ���
// => Ű����� �Է±�Ģ�� ���� �ʰ� ���� �Է��� ��� ���Է�(�Է�Ƚ�� ������)
public class BaseballApp {
	public static void main(String[] args) {
		//���������� �����ϱ� ���� �迭 ����
		int[] dap=new int[3];
		
		Random random=new Random();
		while(true) {
			//�������� 3���� �߻��Ͽ� �迭 ��ҿ� ����
			for(int i=0;i<dap.length;i++) {
				dap[i]=random.nextInt(10);
			}

			//�Է±�Ģ�� �°� ���� 3���� �߻��Ǿ� ����� ��� �ݺ��� ����
			if(dap[0]!=0 && dap[0]!=dap[1] && dap[1]!=dap[2] && dap[2]!=dap[0]) break;
		}

		//���� ������ ���� ���������� �����ϱ� ���� ����
		boolean result=false;
		
		Scanner scanner=new Scanner(System.in);
		
		//������ ���� �Է� ��ȸ ���� >> �Է¿� ���� ��� ��� 
		for(int cnt=1;cnt<=15;cnt++) {
			//��Ʈ����ũ�� ���� ������ �����ϱ� ���� ���� ����
			int strike=0, ball=0;
			
			//�Է� ���� 3���� �����ϱ� ���� �迭 ����
			int[] num=new int[3];
			
			//Ű����� ���� 3���� �Է¹޾� �迭 ��ҿ� ����
			// => �Է±�Ģ�� ������ ��� ���Է��� ���� �ݺ� ó��
			loop:
			while(true) {
				System.out.print(cnt+"��° ���� �Է� >> ");
				String input=scanner.nextLine();
				
				if(input.length()!=3) {
					System.out.println("[����]3�ڸ��� ���ڸ� �Է� �����մϴ�.");
					continue;
				}
				
				for(int i=0;i<num.length;i++) {
					//���ڿ����� ÷����ġ�� ���ڸ� ��ȯ�޾� ������ ��ȯ�Ͽ� �迭 ��ҿ� ����
					//Java Character : Unicode - '0' : 48 ~ '9' : 57
					// => '4' - '0' = 52 - 48 = 4
					num[i]=input.charAt(i)-'0';
					if(num[i]<0 || num[i]>9) {
						System.out.println("[����]���ڸ� �Է� �����մϴ�.");
						continue loop;
					}
				}
				
				if(num[0]!=0 && num[0]!=num[1] && num[1]!=num[2] && num[2]!=num[0]) break;
				System.out.println("[����]0���� ���۵ǰų� �ߺ��� ���ڰ� �����մϴ�.");
			}
			
			//�������� �Է°��� ���Ͽ� ��Ʈ����ũ�� �� ���
			for(int i=0;i<dap.length;i++) {//�������� ����� �迭����� ÷��
				for(int j=0;j<num.length;j++) {//�Է°��� ����� �迭����� ÷��
					if(dap[i]==num[j]) {//�迭 ����� �������� �Է°��� ���ٸ�
						//����� ÷�ڰ� ���ٸ� >> �ڸ����� ���� ���
						if(i==j) strike++;
						else ball++;
					}
				}
			} 
			
			//�Է� ����� ���� ó��
			if(strike==3) {
				System.out.println("[�޼���]�����մϴ�. "+cnt+"���� ������ϴ�.");
				result=true;
				break;
			}
			
			System.out.println("[���]"+strike+"��Ʈ����ũ "+ball+"��");
		}
		
		scanner.close();
		
		if(!result) {//������ ������ ���� ���
			System.out.print("������ �� ���豺��. �ٺ�!!! ������ [");
			for(int temp:dap) {
				System.out.print(temp);
			}
			System.out.println("]�Դϴ�.");
		}
		
	}
}        
