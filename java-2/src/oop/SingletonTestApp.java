package oop;

public class SingletonTestApp {
	public static void main(String[] args) {
		//����ȭ ����� �����ڸ� �̿��Ͽ� �ν��Ͻ� ���� �Ұ�
		/*
		SingletonTest st1=new SingletonTest();
		SingletonTest st2=new SingletonTest();
		*/
		
		//�ν��Ͻ� ������ ��ȯ�ϴ� ���� �޼ҵ� ȣ���Ͽ� �ν��Ͻ� �����޾� ���
		SingletonTest st1=SingletonTest.getInstance();
		SingletonTest st2=SingletonTest.getInstance();
		System.out.println("============================================");
		System.out.println("st1 = "+st1);
		System.out.println("st2 = "+st2);
		System.out.println("============================================");
		st1.insert();
		st1.update();
		st1.delete();
		st1.select();
		System.out.println("============================================");
		st2.insert();
		st2.update();
		st2.delete();
		st2.select();
		System.out.println("============================================");
		//�̱��� Ŭ������ ���������� �ν��Ͻ� ������ �������� �ʰ� ����ϴ� ���� ����
		SingletonTest.getInstance().insert();
		SingletonTest.getInstance().update();
		SingletonTest.getInstance().delete();
		SingletonTest.getInstance().select();
		System.out.println("============================================");
	}
}





