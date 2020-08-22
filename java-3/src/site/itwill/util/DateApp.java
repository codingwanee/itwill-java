package site.itwill.util;

import java.util.Date;

public class DateApp {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Date() : 시스템의 현재 날짜와 시간정보를 저장하는 인스턴스는 생성하기 위한 생성자
		Date now=new Date();
		
		//Date.toString() : Date 인스턴스에 저장된 날짜와 시간정보를 문자열로 변환하여 반환하는 메소드
		// => Date 인스턴스의 날짜와 시간정보를 출력할 경우 toString() 메소드 호출 생략
		//System.out.println("now.toString() = "+now.toString());
		System.out.println("now = "+now);

		//요일을 표현하기 위한 배열 선언
		String[] day={"일","월","화","수","목","금","토"};
		
		//Date 인스턴스에서 날짜를 제공받아 출력
		String printDate=(now.getYear()+1900)+"년 "+(now.getMonth()+1)+"월 "
				+now.getDate()+"일 "+day[now.getDay()]+"요일";
		
		System.out.println("현재 날짜 = "+printDate);
	}
}











