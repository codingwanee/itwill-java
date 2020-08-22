package site.itwill.util;

import java.util.Calendar;

public class CalendarApp {
	public static void main(String[] args) {
		//Calendar.getInstance() : �ý����� ���� ��¥�� �ð������� ����� Calendar �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		// => Calendar Ŭ������ �������� ���������ڰ� protected�� �����Ǿ� �־� ���� �Ұ�
		Calendar now=Calendar.getInstance();
		
		//Calendar.toString() : Calendar �ν��Ͻ��� ����� ��¥�� �ð������� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Calendar �ν��Ͻ��� ��¥�� �ð������� ����� ��� toString() �޼ҵ� ȣ�� ����
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);
		
		//������ ǥ���ϱ� ���� �迭 ����
		String[] day={"��","��","ȭ","��","��","��","��"};
		
		//Calendar �ν��Ͻ����� ��¥�� �����޾� ���
		//Calendar.get(int constantField) : �Ķ���Ϳ� ���޵� ����ʵ忡 �ش��ϴ� ������ ��ȯ�ϴ� �޼ҵ�
		String printDate=now.get(Calendar.YEAR)+"�� "+(now.get(Calendar.MONTH)+1)+"�� "
			+now.get(Calendar.DATE)+"�� "+day[now.get(Calendar.DAY_OF_WEEK)-1]+"����";
		
		System.out.println("���� ��¥ = "+printDate);
	}
}








