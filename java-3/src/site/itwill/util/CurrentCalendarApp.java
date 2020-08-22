package site.itwill.util;

import java.util.Calendar;

//���� ����� ���� �޷��� ����ϴ� ���α׷�
public class CurrentCalendarApp {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		//�ش� ����� ���� 1�Ϸ� ��¥ ���� 
		// => ����� ���� 1���� ������ ��ȯ�ޱ� ���� ��¥ ����
		//Calendar.set(int constantField,int value) : ����ʵ忡 �ش��ϴ�
		//��¥ �Ǵ� �ð������� �Ķ���Ϳ� ���޵� ������ �����ϴ� �޼ҵ�
		calendar.set(Calendar.DATE, 1);
		
		//����� ��¥�� ���� ���ϰ��� ��ȯ�޾� ����
		int week=calendar.get(Calendar.DAY_OF_WEEK);//1(��)~7(��)
		
		System.out.println("         "+calendar.get(Calendar.YEAR)+"�� "
				+(calendar.get(Calendar.MONTH)+1)+"��");
		System.out.println("============================");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");
		//1�Ͽ� ���� ���� ������ ���� ���
		for(int i=1;i<week;i++) {
			System.out.print("    ");
		}
		
		//1�Ϻ��� ���� ���� ������ �ϱ��� ���
		//Calendar.getActualMaximum(int constantField) : Calendar �ν��Ͻ���
		//����� ��¥�� �ð��������� �Ķ���ͷ� ���޵� ����ʵ��� �ִ밪�� ��ȯ�ϴ� �޼ҵ�
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%4d",i);
			week++;//���� ����
			//���������� �Ͽ����� ��� �Ʒ��� �̵�
			if(week%7==1) System.out.println();
		}
		if(week%7!=1) System.out.println();
		System.out.println("============================");
	}
}





