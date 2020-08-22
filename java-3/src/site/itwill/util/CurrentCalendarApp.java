package site.itwill.util;

import java.util.Calendar;

//현재 년월에 대한 달력을 출력하는 프로그램
public class CurrentCalendarApp {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		
		//해당 년월에 대한 1일로 날짜 변경 
		// => 년월에 대한 1일의 요일을 반환받기 위해 날짜 변경
		//Calendar.set(int constantField,int value) : 상수필드에 해당하는
		//날짜 또는 시간정보를 파라메터에 전달된 값으로 변경하는 메소드
		calendar.set(Calendar.DATE, 1);
		
		//변경된 날짜에 대한 요일값을 반환받아 저장
		int week=calendar.get(Calendar.DAY_OF_WEEK);//1(일)~7(토)
		
		System.out.println("         "+calendar.get(Calendar.YEAR)+"년 "
				+(calendar.get(Calendar.MONTH)+1)+"월");
		System.out.println("============================");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("============================");
		//1일에 대한 요일 전까지 공백 출력
		for(int i=1;i<week;i++) {
			System.out.print("    ");
		}
		
		//1일부터 월에 대한 마지막 일까지 출력
		//Calendar.getActualMaximum(int constantField) : Calendar 인스턴스에
		//저장된 날짜와 시간정보에서 파라메터로 전달된 상수필드의 최대값을 반환하는 메소드
		for(int i=1;i<=calendar.getActualMaximum(Calendar.DATE);i++) {
			System.out.printf("%4d",i);
			week++;//요일 증가
			//요일정보가 일요일인 경우 아래로 이동
			if(week%7==1) System.out.println();
		}
		if(week%7!=1) System.out.println();
		System.out.println("============================");
	}
}





