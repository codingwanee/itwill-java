package site.itwill.lang;

public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=10;
		int num2=20;
		int tot=num1+num2;
		System.out.println("�հ� = "+tot);
		*/
		
		/*
		//Integer Ŭ���� : ��������� ������ ������ Ŭ����
		Integer num1=new Integer(10);
		Integer num2=new Integer("20");//NumberFormatException ���� �߻�
		//Integer.intValue() : Integer �ν��Ͻ��� ����� ������ ��ȯ�ϴ� �޼ҵ�
		//Integer.valueOf(int value) : ���޹��� ������ ����� Integer �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		Integer tot=Integer.valueOf(num1.intValue()+num2.intValue());
		System.out.println("�հ� = "+tot.intValue());
		*/
		
		//����ڽ�(AutoBoxing) : ����� �ڵ����� �ν��Ͻ��� ��ȯ
		Integer num1=10;//Integer num1=new Integer(10); ��ɰ� ����
		Integer num2=20;
		//�����ڽ�(AutoUnBoxing) : �ν��Ͻ��� �ڵ����� ����� ��ȯ
		Integer tot=num1+num2;//Integer tot=Integer.valueOf(num1.intValue()+num2.intValue()); ��ɰ� ����
		System.out.println("�հ� = "+tot);
		System.out.println("============================================");
		System.out.println("10���� : 50 = 8���� : "+Integer.toOctalString(50));
		System.out.println("10���� : 50 = 16���� : "+Integer.toHexString(50));
		System.out.println("10���� : 50 = 2���� : "+Integer.toBinaryString(50));
		System.out.println("10���� : -50 = 2���� : "+Integer.toBinaryString(-50));
		System.out.println("============================================");
		String su1="100";	
		String su2="200";
		//System.out.println("�հ� = "+(su1+su2));
		//Integer.parseInt(String s) : ���޹��� ���ڿ��� ������ ��ȯ�Ͽ� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => NumberFormatException ���� �߻�
		System.out.println("�հ� = "+(Integer.parseInt(su1)+Integer.parseInt(su2)));
		System.out.println("============================================");
	}
}









