package site.itwill.util;

public class ExtendsGenericApp {
	public static void main(String[] args) {
		//Integer Ŭ������ Number Ŭ������ ��ӹ޴� �ڽ�Ŭ�����̹Ƿ� ���׸� Ÿ�� ��� ��� ����
		ExtendsGeneric<Integer> eg1=new ExtendsGeneric<Integer>(100);
		System.out.println("������ = "+eg1.getField().intValue());
		System.out.println("============================================");
		
		ExtendsGeneric<Double> eg2=new ExtendsGeneric<Double>(12.34);
		System.out.println("�Ǽ��� = "+eg2.getField().doubleValue());
		System.out.println("============================================");
		
		//String Ŭ������ Number Ŭ������ ��ӹ޴� Ŭ������ �ƴϹǷ� ���׸� Ÿ�� ��� ��� �Ұ�
		//ExtendsGeneric<String> eg3=new ExtendsGeneric<String>();

	}
}





