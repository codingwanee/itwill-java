package realization;

public interface Printable {
	void print();
	
	//�������̽��� ����� �ۼ��� �� �ִ� �⺻�޼ҵ� ���� - JDK 1.8 �̻󿡼��� ���� ����
	// => �������̽��� ��ӹ��� �ڽ�Ŭ�������� �������̵� �������� �ʾƵ� ���� �̹߻� 
	default void scan() {
		System.out.println("[����]��ĵ ����� �������� �ʽ��ϴ�.");
	}
}
