package basic;

public class TypeCastApp {
	public static void main(String[] args) {
		System.out.println("연산 결과 = "+(3+1.5));
		
		System.out.println("몫 = "+(95/10));//몫 = 9
		System.out.println("몫 = "+(95/10.0));//몫 = 9.5
		
		double result=95/10.;//소숫점 뒤에 0 생략 가능
		System.out.println("result = "+result);
		
		byte su1=10,su2=20;
		//byte 변수를 연산할 경우 자동으로 int 자료형으로 형변환
		// => 연산 결과(int)를 byte 변수에 저장할 경우 에러 발생 >> 변수를 int 자료형으로 선언
		//byte su3=su1+su2;
		int su3=su1+su2;
		System.out.println("su3 = "+su3);
		
		double su=12.0;
		System.out.println("정수상수 = "+su);
		System.out.println("정수상수 = "+(int)su);
		
		int num1=95,num2=10;
		double num3=(double)num1/num2;
		System.out.println("num3 = "+num3);
		
		double num=12.3456789;
		System.out.println("num = "+num);
		//소숫자 2번째 자릿수의 실수상수 형태로 변환하여 출력
		System.out.println("num = "+(int)(num*100)/100.);//내림
		System.out.println("num = "+(int)(num*100+0.5)/100.);//반올림
		System.out.println("num = "+(int)(num*100+0.9)/100.);//올림
	}
}







