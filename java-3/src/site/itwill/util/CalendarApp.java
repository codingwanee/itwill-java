package site.itwill.util;

import java.util.Calendar;

public class CalendarApp {
	public static void main(String[] args) {
		//Calendar.getInstance() : 시스템의 현재 날짜와 시간정보가 저장된 Calendar 인스턴스를 반환하는 메소드
		// => Calendar 클래스에 생성자의 접근지정자가 protected로 설정되어 있어 접근 불가
		Calendar now=Calendar.getInstance();
		
		//Calendar.toString() : Calendar 인스턴스에 저장된 날짜와 시간정보를 문자열로 변환하여 반환하는 메소드
		// => Calendar 인스턴스의 날짜와 시간정보를 출력할 경우 toString() 메소드 호출 생략
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);
		
		//요일을 표현하기 위한 배열 선언
		String[] day={"일","월","화","수","목","금","토"};
		
		//Calendar 인스턴스에서 날짜를 제공받아 출력
		//Calendar.get(int constantField) : 파라메터에 전달된 상수필드에 해당하는 정보를 반환하는 메소드
		String printDate=now.get(Calendar.YEAR)+"년 "+(now.get(Calendar.MONTH)+1)+"월 "
			+now.get(Calendar.DATE)+"일 "+day[now.get(Calendar.DAY_OF_WEEK)-1]+"요일";
		
		System.out.println("현재 날짜 = "+printDate);
	}
}








