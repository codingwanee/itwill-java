package oop;

//�̱��� ������ ������ ����� Ŭ���� �ۼ� : �̱���(Singleton) Ŭ����
// => ���α׷��� �ν��Ͻ��� �ϳ��� �����Ͽ� �����ϴ� Ŭ����
// => ������ ó���� ������ Ŭ������ �ۼ��� ��� ��� - Manager Ŭ����
public class SingletonTest {
	//1.Ŭ������ ������ �ν��Ͻ� ������ ������ ������ �ʵ� ���� - �����ʵ�
	// => Ŭ���� ���ο����� ����ϴ� �ʵ� : �ý��� �ʵ� - Getter�� Setter �޼ҵ� �̼���
	// => �ý��� �ʵ�� _�� ���۵Ǵ� �ĺ��ڷ� ����
	private static SingletonTest _instance;
	
	/*
	public SingletonTest() {
		System.out.println("### SingletonTest Ŭ������ �⺻ ������ ȣ�� ###");
	}
	*/
	
	//2.�����ڸ� private Ű����� ����ȭ ����
	// => ���α׷����� �����ڷ� ���ʿ��� �ν��Ͻ� ������ �����ϱ� ���� ����
	private SingletonTest() {
		System.out.println("### SingletonTest Ŭ������ �⺻ ������ ȣ�� ###");
	}
	
	//3.��������(Static Block)���� �ν��Ͻ��� �����Ͽ� �ý��� �ʵ忡 ����
	// => �������� : Ŭ������ �о� �޸𸮿� ����� �� ����� ����� �ۼ��ϴ� ���� 
	// => ���α׷����� ���������� ����� �� ���� ����
	// => ���� �ʵ� �Ǵ� ���� �޼ҵ� ��� ����
	// => �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ��� �Ұ���
	static {
		_instance=new SingletonTest();
	}
	
	//4.�ý��� �ʵ忡 ����� �ν��Ͻ� ������ ��ȯ�ϴ� ���� �޼ҵ� ����
	public static SingletonTest getInstance() {
		return _instance;
	}
	
	public void insert() {
		System.out.println("### ������ �����ϴ� �޼ҵ� ȣ�� ###");
	}
	
	public void update() {
		System.out.println("### ������ �����ϴ� �޼ҵ� ȣ�� ###");
	}
	
	public void delete() {
		System.out.println("### ������ �����ϴ� �޼ҵ� ȣ�� ###");
	}
	
	public void select() {
		System.out.println("### ������ �˻��ϴ� �޼ҵ� ȣ�� ###");
	}
}
