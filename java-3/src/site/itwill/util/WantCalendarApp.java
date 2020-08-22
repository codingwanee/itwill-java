package site.itwill.util;

import java.util.Calendar;
import java.util.Scanner;

//Ű����� �⵵�� ���� �Է¹޾� �ش� ����� ���� �޷��� ����ϴ� ���α׷�
public class WantCalendarApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("�⵵ �Է� >> ");
		int year=scanner.nextInt();
		
		System.out.print("�� �Է� >> ");
		int month=scanner.nextInt();
		
		scanner.close();
		
		Calendar calendar=Calendar.getInstance();
		
		//Calendar �ν��Ͻ��� ���ϴ� �⵵�� ���� 1�Ϸ� ��¥ ���� ����
		// => �Է¿��� ó���ϱ� ���� �ݵ�� 1 �����Ͽ� ����(Calendar.MONTH : 0 ~ 11) 
		calendar.set(year, month-1, 1);
		
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println();
		System.out.println("============================");
		System.out.println("        "+year+"�� "+month+"��");
		System.out.println("============================");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("============================");		
		for(int i=1;i<week;i++) {
			System.out.print("    ");
		}
		
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			//�ڸ����� ���߾� ���
			if(i<10) {
				System.out.print("   "+i);
			} else {
				System.out.print("  "+i);
			}
			week++;
			if(week%7==1) System.out.println();
		}
		if(week%7!=1) System.out.println();
		System.out.println("============================");
	}
}
