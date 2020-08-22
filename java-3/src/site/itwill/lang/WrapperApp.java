package site.itwill.lang;

public class WrapperApp {
	public static void main(String[] args) {
		/*
		int num1=10;
		int num2=20;
		int tot=num1+num2;
		System.out.println("합계 = "+tot);
		*/
		
		/*
		//Integer 클래스 : 정수상수를 저장할 목적의 클래스
		Integer num1=new Integer(10);
		Integer num2=new Integer("20");//NumberFormatException 예외 발생
		//Integer.intValue() : Integer 인스턴스에 저장된 정수를 반환하는 메소드
		//Integer.valueOf(int value) : 전달받은 정수가 저장된 Integer 인스턴스를 생성하여 반환하는 메소드
		Integer tot=Integer.valueOf(num1.intValue()+num2.intValue());
		System.out.println("합계 = "+tot.intValue());
		*/
		
		//오토박싱(AutoBoxing) : 상수가 자동으로 인스턴스로 변환
		Integer num1=10;//Integer num1=new Integer(10); 명령과 동일
		Integer num2=20;
		//오토언박싱(AutoUnBoxing) : 인스턴스가 자동으로 상수로 변환
		Integer tot=num1+num2;//Integer tot=Integer.valueOf(num1.intValue()+num2.intValue()); 명령과 동일
		System.out.println("합계 = "+tot);
		System.out.println("============================================");
		System.out.println("10진수 : 50 = 8진수 : "+Integer.toOctalString(50));
		System.out.println("10진수 : 50 = 16진수 : "+Integer.toHexString(50));
		System.out.println("10진수 : 50 = 2진수 : "+Integer.toBinaryString(50));
		System.out.println("10진수 : -50 = 2진수 : "+Integer.toBinaryString(-50));
		System.out.println("============================================");
		String su1="100";	
		String su2="200";
		//System.out.println("합계 = "+(su1+su2));
		//Integer.parseInt(String s) : 전달받은 문자열을 정수로 변환하여 반환하여 반환하는 메소드
		// => NumberFormatException 예외 발생
		System.out.println("합계 = "+(Integer.parseInt(su1)+Integer.parseInt(su2)));
		System.out.println("============================================");
	}
}









