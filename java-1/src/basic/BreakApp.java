package basic;

public class BreakApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) break;
			System.out.println("i = "+i);
		}
		System.out.println("============================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break;//for(int j=1;j<=5;j++) �ݺ��� ����
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		loop: //�󺧸�(�ĺ���) : �ݺ����� �ο��ϴ� ��ġ����  
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break loop;//for(int i=1;i<=5;i++) �ݺ��� ����
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		//1���� X ������ �������� �հ谡 300�̻� �Ƿ��� X�� �������� ����Ͽ� ����ϼ���. 
		//ex) 1~24 ������ �������� �հ� = 300
		int su=1,sum=0;
		
		while(true) {//���ѷ���
			sum+=su;
			if(sum>=300) break;
			su++;
		}
		
		System.out.println("1~"+su+" ������ �������� �հ� = "+sum);
		System.out.println("============================================");
	}
}
