package basic;

//��������(Local Variable) : �޼ҵ� ����(��) �ȿ� ����Ǿ� ���Ǵ� ����
// => �޼ҵ� �ȿ��� �پ��� �� ��� ���� : ��� ��
// => ���������� ����� �� ���ο����� ��� ���� >> �� �ܺο��� ��� �Ұ���
// => ���� ����� ��� �� ���ο��� ����� �������� �ڵ� �Ҹ�
public class LocalVariableApp {
	public static void main(String[] args) {
		int num1=100;
		//���Ǻ�
		{
			//�ߺ� ���� ���� �߻� - �̹� ����� ������ �ٽ� ������ ��� ���� �߻�
			//int num1=300;
			int num2=200;
			System.out.println("========== ���Ǻ� ���� ���� ==========");
			//���Ǻ� �ܺο��� ����� �������� ��� ����
			System.out.println("num1 = "+num1);			
			System.out.println("num2 = "+num2);			
			System.out.println("========== ���Ǻ� ���� ���� ==========");
		}
		//�ߺ� ���� ���� �̹߻� - num2 ������ ���Ǻ� ����� �Ҹ�
		//int num2=300;
		
		System.out.println("num1 = "+num1);
		//���Ǻ� ���ο��� ����� ������ ���Ǻ��� ����� ��� �ڵ� �Ҹ�
		//System.out.println("num2 = "+num2);
	}
}




