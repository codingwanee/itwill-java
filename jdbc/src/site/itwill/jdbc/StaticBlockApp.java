package site.itwill.jdbc;

public class StaticBlockApp {
	public static void main(String[] args) {
		/*
		//1.Ŭ�����δ�(ClassLoader)�� ���� Ŭ����(Class ����)�� �о� �޸� ���� - �ڵ�
		// => ���α׷����� �ѹ��� ����
		
		//2.new �����ڷ� �޸𸮿� ����� Ŭ����(Clazz)�� �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		// => ������ �ν��Ͻ��� ���������� �����Ͽ� ������ ��� �����ϵ��� ����
		StaticBlock sb1=new StaticBlock();
		StaticBlock sb2=new StaticBlock();
		
		//3.���������� ����� �ν��Ͻ��� �޼ҵ� ȣ�� - ��� ����
		sb1.display();
		sb1.display();
		sb2.display();
		*/
		
		//Class Ŭ���� : �޸𸮿� ����� Ŭ��������(Clazz)�� �����ϱ� ���� Ŭ����
		//Class.forName(String className) : ���ڿ��� ���޵� Ŭ������ Class �ν��Ͻ�(Clazz)�� ��ȯ�ϴ� �޼ҵ�
		// => Ŭ�����δ��� �̿��Ͽ� Ŭ����(Class ����)�� �޸𸮿� ���� - ����
		// => Ŭ������ ����� �ʵ�, ������, �޼ҵ� ������ ��ȯ�޾� ���(���÷��� : Reflection)
		try {
			Class.forName("site.itwill.jdbc.StaticBlock");
			//�ν��Ͻ� ���� �� �޼ҵ� ȣ���� ������������ ����
			/*
			StaticBlock sb=new StaticBlock();
			sb.display();
			*/
		} catch (ClassNotFoundException e) {
			System.out.println("[����]Ŭ������ �������� �ʽ��ϴ�.");
		}
	}
}












