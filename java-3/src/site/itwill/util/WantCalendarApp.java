package site.itwill.util;

import java.util.Calendar;
import java.util.Scanner;

//키보드로 년도와 월을 입력받아 해당 년월에 대한 달력을 출력하는 프로그램
public class WantCalendarApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("년도 입력 >> ");
		int year=scanner.nextInt();
		
		System.out.print("월 입력 >> ");
		int month=scanner.nextInt();
		
		scanner.close();
		
		Calendar calendar=Calendar.getInstance();
		
		//Calendar 인스턴스를 원하는 년도와 월의 1일로 날짜 정보 변경
		// => 입력월을 처리하기 위해 반드시 1 감소하여 전달(Calendar.MONTH : 0 ~ 11) 
		calendar.set(year, month-1, 1);
		
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.println();
		System.out.println("============================");
		System.out.println("        "+year+"년 "+month+"월");
		System.out.println("============================");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");		
		for(int i=1;i<week;i++) {
			System.out.print("    ");
		}
		
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			//자릿수를 맞추어 출력
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
