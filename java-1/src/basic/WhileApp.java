package basic;

public class WhileApp {
	public static void main(String[] args) {
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		int i=1;
		/*
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		*/
		
		do {
			System.out.println("Java Programming");
			i++;
		} while(i<=5);
		System.out.println("============================================");
		//1~100 ������ �������� �հ踦 ����Ͽ� ����ϼ���.
		int num=1,tot=0;
		/*
		while(num<=100) {
			tot+=num;
			num++;
		}
		*/
	
		do {
			tot+=num;
			num++;
		} while(num<=100);
		System.out.println("1~100 ������ �������� �հ� = "+tot);
		System.out.println("============================================");
		
		//A4 ������ ������ ��� ���� ������ ��� �簢�� ����� 500�� �̻���
		//�Ƿ��� �� �� ������ ��ġ�� �Ǵ��� ����Ͽ� ����ϼ���.
		//cnt : ���� Ƚ���� ������ ����, gae : �簢�� ����� ������ ������ ����
		int cnt=0,gae=1;
		
		while(gae<500) {//���� ���� - �ݺ�
			cnt++;
			gae*=2;
		}
		
		System.out.println(cnt+"�� ������ ��ġ�� �簢�� ����� "+gae+"�� ����ϴ�.");		
		System.out.println("============================================");

		//1���� X ������ �������� �հ谡 300�̻� �Ƿ��� X�� �������� ����Ͽ� ����ϼ���. 
		//ex) 1~24 ������ �������� �հ� = 300
		int su=0, sum=0;//su : ���ϴ� ����, sum : �հ�
		while(sum<300) {
			su++;
			sum+=su;
		}
		System.out.println("1~"+su+" ������ �������� �հ� = "+sum);
		System.out.println("============================================");
		
	}
}








