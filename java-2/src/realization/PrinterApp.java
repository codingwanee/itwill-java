package realization;

public class PrinterApp {
	public static void main(String[] args) {
		//�⺻�޼ҵ带 ȣ���ϱ� ���� ���������� �������̽��� �̿��Ͽ� ����
		//Printable printer=new PrinterSingle();
		Printable printer=new PrinterMulti();
		
		printer.print();
		//�⺻�޼ҵ� ȣ�� 
		// => �������̵� ������� ������ �������̽��� �޼ҵ� ȣ��
		// => �������̵� ����� ��� �ڽ�Ŭ������ �޼ҵ� ȣ��
		printer.scan();
	}
}
