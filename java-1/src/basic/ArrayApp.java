package basic;

public class ArrayApp {
	public static void main(String[] args) {
		//new int[3] : ��������� 3�� ������ �� �ִ� �迭 ���� 
		// - �迭��ҿ��� �⺻�� �ڵ� ����
		//int[] num : �迭������ ������ �� �ִ� �������� ���� 
		// - �迭������ ���������� �����Ͽ� ���������� �迭��� ����
		int[] num=new int[3];
		
		System.out.println("num = "+num);
		System.out.println("============================================");
		//���������� ÷�ڸ� ����Ͽ� �迭 ��� ǥ��
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		//�迭 ����� ÷�ڸ� �߸� ����� ��� ���α׷� ����� ����(Exception) �߻�
		// => ArrayIndexOutOfBoundsException �߻�
		//System.out.println("num[3] = "+num[3]);
		System.out.println("============================================");
		//��������.length : �迭������ �����ϴ� ������������ ����ϸ� �迭 ����� ���� ����
		System.out.println("�迭 ����� ���� = "+num.length);
		System.out.println("============================================");
		int index=1;
		//÷�ڿ� ������� ��� ���� �Ǵ� ����� ��� ����
		num[index-1]=10;
		num[index]=20;
		num[index+1]=30;
		
		//for ����� �̿��� �迭�� �ϰ�ó�� - ÷�� �̿�(�Է�,����,���)
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		System.out.println("============================================");
		//{} �ȿ� ����� �����Ͽ� �迭 ���� ����
		int[] su={10,20,30,40,50};

		//for ����� �̿��� �迭�� �ϰ�ó�� - �ݺ�������(Iterator) �̿�(����,���)
		for(int temp:su) {
			System.out.print(temp+"\t");
		}
		System.out.println();
		System.out.println("============================================");
		int[] array={54,70,64,87,96,21,65,76,11,34,56,41,77,91};
		
		//�迭 ��Ұ����� �հ踦 ����Ͽ� ����ϼ���.
		int tot=0;
		
		/*
		for(int i=0;i<array.length;i++) {
			tot+=array[i];
		}
		*/
		
		for(int temp:array) {
			tot+=temp;
		}
		
		System.out.println("�հ� = "+tot);
		System.out.println("============================================");
		//�迭 ��ҿ� ����� �� �� 30~60 ������ ��� ������ ����Ͽ� ����ϼ���.
		int cnt=0;
		
		/*
		for(int i=0;i<array.length;i++) {
			if(array[i]>=30 && array[i]<=60) cnt++;
		}
		*/
		
		for(int temp:array) {
			if(temp>=30 && temp<=60) cnt++;
		}
		
		System.out.println("30~60 ������ ��� ���� = "+cnt);
		System.out.println("============================================");
	}
}










