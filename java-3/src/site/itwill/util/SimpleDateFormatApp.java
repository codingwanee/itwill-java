package site.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat 클래스 : Date 인스턴스를 제어하기 위한 기능을 제공하는 클래스
public class SimpleDateFormatApp {
	public static void main(String[] args) throws ParseException {
		//SimpleDateFormat(String pattern) : 파라메터에 날짜와 시간에 대한
		//패턴정보를 전달받아 SimpleDateFormat 인스턴스를 생성하는 생성자
		// => 날짜와 시간정보를 패턴기호와 문자열로 표현
		// => 날짜와 시간 관련 패턴기호 : y  M  d  H  m  s  E등
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
	
		Date now=new Date();
		//SimpleDateFormat.format(Date date) : 파라메터에 Date 인스턴스를
		//전달하여 SimpleDateFormat 인스턴스에 저장된 패턴의 문자열로 변환하여 반환하는 메소드
		// => Date 인스턴스 >> String 인스턴스
		String printDate=sdf.format(now);
		System.out.println("현재 날짜 = "+printDate);
		
		//SimpleDateFormat.applyPattern(String pattern) : SimpleDateFormat 
		//인스턴스에 저장된 패턴정보를 변경하는 메소드
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("현재 = "+sdf.format(now));
		
		String want="2000-01-01 00:00:00";
		
		//SimpleDateFormat.parse(String str) : 파라메터에 전달된 패턴형태의
		//문자열을 전달받아 Date 인스턴스로 변환하여 반환하는 메소드
		// => String 인스턴스 >> Date 인스턴스
		// => ParseException : 패턴형태에 맞지 않은 문자열을 전달할 경우 예외 
		Date wantDate=sdf.parse(want);
		System.out.println("wantDate = "+wantDate);
		
		//Date.getTime() : Date 인스턴스의 저장된 날짜와 시간정보를 타임스탬프값으로 변환하여 반환하는 메소드
		// => Timestamp : 1970년 1월 1일을 기준으로 밀리초당 1씩 증가된 long 형식의 정수값
		System.out.println("now 인스턴스의 타임스템프값 = "+now.getTime());
		System.out.println("wantDate 인스턴스의현재의 타임스템프값 = "+wantDate.getTime());
		
		//System.currentTimeMillis() : 시스템의 현재 타임스템프값을 반환하는 메소드
		System.out.println("시스템의 현재 타임스템프값 = "+System.currentTimeMillis());
		
		//타임스템프값을 사용하는 이유 : 날짜와 시간정보에 대한 연산(+,-) 목적
		System.out.println("2000년 1월 1일부터 현재까지의 시간 = "
				+(now.getTime()-wantDate.getTime())+"ms");
	}
}