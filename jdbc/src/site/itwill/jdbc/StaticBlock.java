package site.itwill.jdbc;

public class StaticBlock {
	//��������(Static Block) : Ŭ�����δ��� ���� Ŭ������ �޸𸮿� 
	//����� �� ����Ǵ� ����� �ۼ��ϴ� ���� -�ѹ��� ����
	static {
		System.out.println("StaticBlock Ŭ������ �������� ��� ����");
		StaticBlock sb=new StaticBlock();
		sb.display();
	}
	
	public StaticBlock() {
		System.out.println("StaticBlock Ŭ������ �⺻ ������ ȣ��");
	}
	
	public void display() {
		System.out.println("StaticBlock Ŭ������ display() �޼ҵ� ȣ��");
	}
}
