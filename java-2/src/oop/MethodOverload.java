package oop;

public class MethodOverload {
	public void displayInt(int param) {
		System.out.println("������ ��� = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("���� ��� = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("���ڿ� ��� = "+param);
	}
	
	//������ ����� �����ϴ� �Ķ���Ͱ� �ٸ� �޼ҵ�� �޼ҵ���� ������ ����
	// => �޼ҵ� �����ε�
	public void display(int param) {
		System.out.println("������ ��� = "+param);
	}
	
	public void display(boolean param) {
		System.out.println("���� ��� = "+param);
	}
	
	public void display(String param) {
		System.out.println("���ڿ� ��� = "+param);
	}
}





