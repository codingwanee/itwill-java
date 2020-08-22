package site.itwill.util;

import java.text.DecimalFormat;

//DecimalFormat 클래스 : 숫자형을 표현하기 위한 기능을 제공하는 클래스
public class DecimalFormatApp {
	public static void main(String[] args) {
		//DecimalFormat(String pattern) : 파라메터에 숫자형에 대한 패턴정보를
		//전달받아 DecimalFormat 인스턴스를 생성하는 생성자
		// => 숫자 관련 패턴기호 : #  0  .  ,등
		DecimalFormat df=new DecimalFormat("###,###,##0");
		
		int number=10000000;
		
		System.out.println("number = "+number);
		//DecimalFormat.format(long number) : 파라메터에 숫자형을 전달받아 
		//DecimalFormat 인스턴스에 저장된 패턴형식의 문자열로 변환하여 반환하는 메소드
		System.out.println("number = "+df.format(number));
		
		//DecimalFormat.getInstance() : 기본 패턴정보가 저장된 DecimalFormat 인스턴스를 반환하는 메소드 
		System.out.println("number = "+DecimalFormat.getInstance().format(number));

		//DecimalFormat.getCurrencyInstance() : 화폐 표현에 대한 패턴정보가 저장된 DecimalFormat 인스턴스를 반환하는 메소드 
		System.out.println("number = "+DecimalFormat.getCurrencyInstance().format(number));
	}
}




