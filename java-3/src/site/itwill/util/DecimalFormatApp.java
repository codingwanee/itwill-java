package site.itwill.util;

import java.text.DecimalFormat;

//DecimalFormat Ŭ���� : �������� ǥ���ϱ� ���� ����� �����ϴ� Ŭ����
public class DecimalFormatApp {
	public static void main(String[] args) {
		//DecimalFormat(String pattern) : �Ķ���Ϳ� �������� ���� ����������
		//���޹޾� DecimalFormat �ν��Ͻ��� �����ϴ� ������
		// => ���� ���� ���ϱ�ȣ : #  0  .  ,��
		DecimalFormat df=new DecimalFormat("###,###,##0");
		
		int number=10000000;
		
		System.out.println("number = "+number);
		//DecimalFormat.format(long number) : �Ķ���Ϳ� �������� ���޹޾� 
		//DecimalFormat �ν��Ͻ��� ����� ���������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("number = "+df.format(number));
		
		//DecimalFormat.getInstance() : �⺻ ���������� ����� DecimalFormat �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� 
		System.out.println("number = "+DecimalFormat.getInstance().format(number));

		//DecimalFormat.getCurrencyInstance() : ȭ�� ǥ���� ���� ���������� ����� DecimalFormat �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ� 
		System.out.println("number = "+DecimalFormat.getCurrencyInstance().format(number));
	}
}




