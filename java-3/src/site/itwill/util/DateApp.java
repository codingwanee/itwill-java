package site.itwill.util;

import java.util.Date;

public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Date() : �ý����� ���� ��¥�� �ð������� �����ϴ� �ν��Ͻ��� �����ϱ� ���� ������
		Date now=new Date();
		
		//Date.toString() : Date �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Date �ν��Ͻ��� ��¥�� �ð������� ����� ��� toString() �޼ҵ� ȣ�� ����
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);

		//������ ǥ���ϱ� ���� �迭 ����
		String[] day={"��","��","ȭ","��","��","��","��"};
		
		//Date �ν��Ͻ����� ��¥�� �����޾� ���
		String printDate=(now.getYear()+1900)+"�� "+(now.getMonth()+1)+"�� "
				+now.getDate()+"�� "+day[now.getDay()]+"����";
		
		System.out.println("���� ��¥ = "+printDate);
	}
}











