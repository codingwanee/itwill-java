package basic;

public class DataTypeApp {
	public static void main(String[] args) {
		System.out.println("<< 정수형 >>");
		//print() 또는 println() 메소드에서는 10진수의 정수로만 출력 
		System.out.println("연산결과(10진수) = "+(100+0100+0x100));
		System.out.println("정수형 상수(int : 4Byte) = "+2147483647);
		//int 자료형은 -2147483648~2147483647 범위의 정수만 표현 가능
		//System.out.println("정수형 상수(int : 4Byte) = "+2147483648);
		System.out.println("정수형 상수(long : 8Byte) = "+2147483648L);
		
		byte a1=127;//1Byte >> -128 ~ 127
		short a2=32767;//2Byte >> -32768 ~ 32767
		int a3=2147483647;//4Byte
		long a4=2147483648L;//8Byte
		
		System.out.println("a1 = "+a1);
		System.out.println("a2 = "+a2);
		System.out.println("a3 = "+a3);
		System.out.println("a4 = "+a4);

		//int a5=100L;//에러 발생 - Type mismatch
		long a5=100;//가능 - 상수가 자동 형변환되어 변수에 저장
		System.out.println("a5 = "+a5);
		System.out.println("============================================");
		System.out.println("<< 실수형 >>");
		System.out.println("실수형 상수(flaot - 4byte) = "+1.23F);
		System.out.println("실수형 상수(double - 8byte) = "+1.23);
		
		//지수형태의 실수상수 : 아주 작은 실수상수 또는 아주 큰 실수상수를 표현하는 방법
		System.out.println("지수형태의 실수형 상수 = "+1.23E-9);
		//print() 또는 println() 메소드에서는 아주 작은 실수상수 또는 아주 큰 실수상수를 지수형태로 자동 변환하여 출력
		System.out.println("지수형태의 실수형 상수 = "+0.00000000123);
		System.out.println("지수형태의 실수형 상수 = "+1230000000.);
		
		//float b1=1.23456789;//에러 발생 - Type mismatch
		float b1=1.23456789F;//가수부의 유효자릿수 : 7자리 - 유효 자릿수를 벗어난 실수값 절삭
		double b2=1.23456789;//가수부의 유효자릿수 : 15자리
		
		System.out.println("b1 = "+b1);
		System.out.println("b2 = "+b2);
		System.out.println("============================================");
		System.out.println("문자상수 = "+'A');//일반문자
		System.out.println("문자상수 = "+'\'');//Escape 문자
		
		char c1='A';
		char c2=65;//65 정수상수에 대한 문자코드 = 'A' 
		char c3='a'-32;//'a'(Code:97) - 32 = 65('A')
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2);
		System.out.println("c3 = "+c3);
		System.out.println("============================================");
		System.out.println("<< 논리형 >>");
		System.out.println("논리형 상수 = "+false);
		//관계식(비교식)의 결과는 논리형 상수로 표현
		System.out.println("비교 결과 = "+(20>10));
		
		boolean d1=true;
		boolean d2=20<10;
		
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("============================================");
		System.out.println("<< 문자열 >>");
		System.out.println("문자열 상수 = "+"ABC");
		System.out.println("당신의 이름은 \"홍길동\"입니까?");
		
		String e1="JAVA";
		String e2="JSP";
		//문자열 상수에 + 연산자를 이용할 경우 다른 대상과 결합된 문자열 상수로 표현 
		String e3=e1+" & "+e2;
		
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		System.out.println("e3 = "+e3);
		System.out.println("============================================");
	}
}
