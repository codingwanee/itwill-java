package basic;

public class VariableApp {
	public static void main(String[] args) {
		int su;//���� ����
		su=10;//������ ��� ���� : ���Կ�����(=) �̿�
		System.out.print("���� �� ������ >> ");
		System.out.println(su);//������(������ ����� ���) ���
		
		//int su;//������ �̸��� ���� ���� �Ұ�
		su=20;//�������� ����� �ϳ��� ���� ���� - ���� ����� ���ŵǰ� ���ο� ����� ����
		/*
		System.out.print("���� �� ������ >> ");
		System.out.println(su);
		*/
		
		//""+��� �Ǵ� ���+"" >> ���ڿ� ����
		System.out.println("���� �� ������ >> "+su);
		
		/*
		System.out.println("���ش� "+2+0+1+9+"���Դϴ�.");
		System.out.println(2+0+1+9+"���� �������Դϴ�.");
		System.out.println(""+2+0+1+9+"���� �������Դϴ�.");
		System.out.println("��� = "+10+20);
		System.out.println("��� = "+(10+20));
		System.out.println("��� = "+10*20);
		System.out.println("��� = "+(10*20));
		*/
		
		//���� ���� �� �ʱ�ȭ �۾� - ������ �����Ͽ� �ʱⰪ(���)�� ����
		int num=30;
		System.out.println("num = "+num);
		
		//������ �ڷ����� ������ , ��ȣ�� �̿��Ͽ� ���� ���� ����
		int kor=80,eng=90,mat=100;
		int tot=kor+eng+mat;
		System.out.println("�����հ� = "+tot+"��");
		
		/*
		int age;
		//������ ����� ����Ǿ� ���� ���� ���¿��� ���� ��� ���� �߻� - �ʱ�ȭ ����
		System.out.println("���� = "+age);
		*/
		
		/*
		//������ ����� �� ���� ����� ������ ��� ���� �߻� - ����Ÿ ���� ����
		int age=20.0;
		System.out.println("���� = "+age);
		*/
	}
}
