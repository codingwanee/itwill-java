package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("���� ��� = "+(3+1.5));
		
		System.out.println("�� = "+(95/10));//�� = 9
		System.out.println("�� = "+(95/10.0));//�� = 9.5
		
		double result=95/10.;//�Ҽ��� �ڿ� 0 ���� ����
		System.out.println("result = "+result);
		
		byte su1=10,su2=20;
		//byte ������ ������ ��� �ڵ����� int �ڷ������� ����ȯ
		// => ���� ���(int)�� byte ������ ������ ��� ���� �߻� >> ������ int �ڷ������� ����
		//byte su3=su1+su2;
		int su3=su1+su2;
		System.out.println("su3 = "+su3);
		
		double su=12.0;
		System.out.println("������� = "+su);
		System.out.println("������� = "+(int)su);
		
		int num1=95,num2=10;
		double num3=(double)num1/num2;
		System.out.println("num3 = "+num3);
		
		double num=12.3456789;
		System.out.println("num = "+num);
		//�Ҽ��� 2��° �ڸ����� �Ǽ���� ���·� ��ȯ�Ͽ� ���
		System.out.println("num = "+(int)(num*100)/100.);//����
		System.out.println("num = "+(int)(num*100+0.5)/100.);//�ݿø�
		System.out.println("num = "+(int)(num*100+0.9)/100.);//�ø�
	}
}







