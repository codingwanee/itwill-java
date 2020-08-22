package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("<< ������ >>");
		//print() �Ǵ� println() �޼ҵ忡���� 10������ �����θ� ��� 
		System.out.println("������(10����) = "+(100+0100+0x100));
		System.out.println("������ ���(int : 4Byte) = "+2147483647);
		//int �ڷ����� -2147483648~2147483647 ������ ������ ǥ�� ����
		//System.out.println("������ ���(int : 4Byte) = "+2147483648);
		System.out.println("������ ���(long : 8Byte) = "+2147483648L);
		
		byte a1=127;//1Byte >> -128 ~ 127
		short a2=32767;//2Byte >> -32768 ~ 32767
		int a3=2147483647;//4Byte
		long a4=2147483648L;//8Byte
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);

		//int a5=100L;//���� �߻� - Type mismatch
		long a5=100;//���� - ����� �ڵ� ����ȯ�Ǿ� ������ ����
		System.out.println("a5 = "+a5);
		System.out.println("============================================");
		System.out.println("<< �Ǽ��� >>");
		System.out.println("�Ǽ��� ���(flaot - 4byte) = "+1.23F);
		System.out.println("�Ǽ��� ���(double - 8byte) = "+1.23);
		
		//���������� �Ǽ���� : ���� ���� �Ǽ���� �Ǵ� ���� ū �Ǽ������ ǥ���ϴ� ���
		System.out.println("���������� �Ǽ��� ��� = "+1.23E-9);
		//print() �Ǵ� println() �޼ҵ忡���� ���� ���� �Ǽ���� �Ǵ� ���� ū �Ǽ������ �������·� �ڵ� ��ȯ�Ͽ� ���
		System.out.println("���������� �Ǽ��� ��� = "+0.00000000123);
		System.out.println("���������� �Ǽ��� ��� = "+1230000000.);
		
		//float b1=1.23456789;//���� �߻� - Type mismatch
		float b1=1.23456789F;//�������� ��ȿ�ڸ��� : 7�ڸ� - ��ȿ �ڸ����� ��� �Ǽ��� ����
		double b2=1.23456789;//�������� ��ȿ�ڸ��� : 15�ڸ�
		
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("============================================");
		System.out.println("���ڻ�� = "+'A');//�Ϲݹ���
		System.out.println("���ڻ�� = "+'\'');//Escape ����
		
		char c1='A';
		char c2=65;//65 ��������� ���� �����ڵ� = 'A' 
		char c3='a'-32;//'a'(Code:97) - 32 = 65('A')
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("============================================");
		System.out.println("<< ���� >>");
		System.out.println("���� ��� = "+false);
		//�����(�񱳽�)�� ����� ���� ����� ǥ��
		System.out.println("�� ��� = "+(20>10));
		
		boolean d1=true;
		boolean d2=20<10;
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("============================================");
		System.out.println("<< ���ڿ� >>");
		System.out.println("���ڿ� ��� = "+"ABC");
		System.out.println("����� �̸��� \"ȫ�浿\"�Դϱ�?");
		
		String e1="JAVA";
		String e2="JSP";
		//���ڿ� ����� + �����ڸ� �̿��� ��� �ٸ� ���� ���յ� ���ڿ� ����� ǥ�� 
		String e3=e1+" & "+e2;
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		System.out.println("e3 = "+e3);
		System.out.println("============================================");
	}
}
