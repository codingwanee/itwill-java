package basic;

public class DoubleArrayApp {
	public static void main(String[] args) {
		int[][] num=new int[2][3];
		
		System.out.println("num = "+num);
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("============================================");
		System.out.println("num[0][0] = "+num[0][0]);
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[0][2] = "+num[0][2]);
		System.out.println("num[1][0] = "+num[1][0]);
		System.out.println("num[1][1] = "+num[1][1]);
		System.out.println("num[1][2] = "+num[1][2]);
		System.out.println("============================================");
		System.out.println("num.length = "+num.length);
		System.out.println("num[0].length = "+num[0].length);
		System.out.println("num[1].length = "+num[1].length);
		System.out.println("============================================");
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}
		System.out.println("============================================");
		int[][] su={{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array:su) {
			for(int temp:array) {
				System.out.print(temp+"  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		/*
		int[][] number=new int[3][];
		
		//1���� �迭�� �������� �����Ƿ� 2���� �迭�� ������ҿ��� null ����
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		System.out.println("============================================");
		//1���� �迭�� �����Ͽ� 2���� �迭�� ������ҿ� �迭���� ����
		//�����迭 - ������ �迭���� ��������� �迭 ��� ������ �ٸ��� �����Ϥ�
		number[0]=new int[3];
		number[1]=new int[2];
		number[2]=new int[4];
		
		System.out.println("number[0] = "+number[0]);
		System.out.println("number[1] = "+number[1]);
		System.out.println("number[2] = "+number[2]);
		System.out.println("============================================");
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number[i].length;j++) {
				System.out.print(number[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		*/
		int[][] number={{10,20,30},{40,50},{60,70,80,90}};

		for(int[] array:number) {
			for(int temp:array) {
				System.out.print(temp+"  ");
			}
			System.out.println();
		}		
		System.out.println("============================================");
		//�л��̸��� ����,����,���� ������ �Է¹޾� �л� �����հ�� ����
		//�����հ�, ��ü �����հ踦 ����Ͽ� ����ϼ���.
		//ex) ȫ�浿  80   90   100  240
		//    ...
		//    ����  88   92   90   270
		//    ���հ�  392  380  370  1142
		String[] name={"ȫ�浿","�Ӳ���","����ġ","������","����","���հ�"};
		int[][] score= {{80,90,100,0},{76,89,77,0},{78,99,87,0}
			,{98,99,100,0},{88,92,90,0},{0,0,0,0}};
		
		
		//�л� �����հ�� ���� �����հ�, ��ü �����հ� ���
		for(int i=0;i<score.length-1;i++) {
			for(int j=0;j<score[i].length-1;j++) {
				//score[i][j] : �л��� ���� ���� ����
				
				//�л� �����հ� ��� : ���� ��, ������ �� ��ҿ� ���� ����
				score[i][score[i].length-1]+=score[i][j];

				//���� �����հ� ��� : ������ ��, ���� �� ��ҿ� ���� ����
				score[score.length-1][j]+=score[i][j];

				//��ü �����հ� ��� : ������ ��, ������ �� ��ҿ� ���� ����
				score[score.length-1][score[i].length-1]+=score[i][j];
			}
		}
		
		//�л��̸�, ����, ����, ���� ������ �л����� �հ�, ���� ���� �հ�, ��ü ���� �հ� ���
		for(int i=0;i<score.length;i++) {
			System.out.print(name[i]+"\t");
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("============================================");
	}
}












