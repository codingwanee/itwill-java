package oop;

public class StaticTestApp {
	//�ν��Ͻ� �ʵ� : �ν��Ͻ� ������ �޸𸮿� �����Ǵ� �ʵ� - �����ڿ��� �ʱⰪ �ο�
	// => ������ �ν��Ͻ� ������ŭ �޸𸮿� ����
	// => �ν��Ͻ��� �̿��Ͽ� ����
	private int num1; 
	//���� �ʵ� : Ŭ���� �о� �޸𸮿� ����� �� �����Ǵ� �ʵ� - �ʵ忡 ���� �ʱⰪ �ο�
	// => �ν��Ͻ� ������ ������� �ϳ��� �޸𸮿� ����
	// => Ŭ������ �̿��Ͽ� ����
	private static int num2;//�ʱⰪ ������ �⺻�� ����
	
	public StaticTestApp() {
		// TODO Auto-generated constructor stub
	}
	
	public StaticTestApp(int num1) {
		super();
		this.num1 = num1;
	}

	//�ν��Ͻ� �޼ҵ� : this ���������� �����ϴ� �޼ҵ�
	// => this ���������� �̿��Ͽ� �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ��� ����
	// => Ŭ������ �̿��Ͽ� ���� �ʵ� �Ǵ� ���� �޼ҵ� ��� ����
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void display1() {
		System.out.println("num1 = "+this.num1);//this ���� ����
		System.out.println("num2 = "+StaticTestApp.num2);//Ŭ������ ���� ����
	}

	//���� �޼ҵ� : this ���������� ���� �޼ҵ�
	// => this ���������� �����Ƿ� �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ��� �Ұ���
	// => Ŭ������ �̿��Ͽ� ���� �ʵ� �Ǵ� ���� �޼ҵ� ��� ����
	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		StaticTestApp.num2 = num2;
	}

	public static void display2() {
		//System.out.println("num1 = "+this.num1);
		System.out.println("num2 = "+StaticTestApp.num2);
	}
	
	public static void main(String[] args) {
		//�ν��Ͻ� �޼ҵ�� �ν��Ͻ� ���� �� ȣ�� ����
		StaticTestApp st=new StaticTestApp();
		st.display1();
		System.out.println("============================================");
		//���� �޼ҵ�� �ν��Ͻ� ������ ������� ȣ�� ����
		StaticTestApp.display2();
		System.out.println("============================================");
	}
}








