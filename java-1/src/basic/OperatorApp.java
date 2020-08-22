package basic;

public class OperatorApp {
	public static void main(String[] args) {
		System.out.println("<< 최우선 연산자 >>");
		System.out.println("20 + 10 * 4 = "+(20+10*4));
		System.out.println("(20 + 10) * 4 = "+((20+10)*4));
		System.out.println("============================================");
		
		System.out.println("<< 단항 연산자 >>");
		int a1=-10;
		System.out.println("a1 = "+a1);
		System.out.println("-a1 = "+(-a1));//연산 처리
		a1=-a1;//연산 처리 후 저장
		System.out.println("a1 = "+a1);
		
		int a2=50;//50 >> 00000000 00000000 00000000 00110010
		System.out.println("a2 = "+a2);
		//~50 >> 11111111 11111111 11111111 11001101 >> -51
		System.out.println("~a2 = "+(~a2));
		
		boolean a3=false;
		System.out.println("a3 = "+a3);
		System.out.println("!a3 = "+(!a3));
		a3=!a3;
		System.out.println("a3 = "+a3);
		
		double a4=12.3;
		System.out.println("a4 = "+a4);
		System.out.println("(int)a4 = "+((int)a4));
		
		int a5=10,a6=10;
		System.out.println("a5 = "+a5+", a6 = "+a6);
		
		/*
		++a5;//a5=a5+1;
		--a6;//a6=a6-1;
		System.out.println("a5 = "+a5+", a6 = "+a6);
		*/
		
		/*
		//연산식으로만 구현된 단일명령인 경우 연산자의 위치에 상관없이 동일한 결과 제공
		a5++;
		a6--;
		System.out.println("a5 = "+a5+", a6 = "+a6);
		*/
		
		/*
		//연산식으로만 구현된 단일명령이 아닌 경우 연산자의 위치는 다른 실행 결과 제공
		int a7=++a5;//선처리 : ++a5 명령 처리 후 int a7=a5 명령 실행
		int a8=a6++;//후처리 : int a8=a6 명령 처리 후 a6++ 명령 실행
		System.out.println("a7 = "+a7+", a8 = "+a8);
		System.out.println("a5 = "+a5+", a6 = "+a6);
		*/
		
		System.out.println("--a5 = "+(--a5)+", a6-- = "+(a6--));
		System.out.println("a5 = "+a5+", a6 = "+a6);
		System.out.println("============================================");
		System.out.println("<< 산술 연산자 >>");
		int c1=20,c2=10;
		System.out.println(c1+" * "+c2+" = "+(c1*c2));
		System.out.println(c1+" / "+c2+" = "+(c1/c2));
		System.out.println(c1+" % "+c2+" = "+(c1%c2));
		
		System.out.println(c1+" + "+c2+" = "+(c1+c2));
		System.out.println(c1+" - "+c2+" = "+(c1-c2));
		
		//X % Y = 결과 : 0 >> 배수 표현식 
		//X % Y = 결과 : 0 ~ Y-1 >> 범위 표현식 
		System.out.println("20 % 4 = "+(20%4));
		System.out.println("21 % 4 = "+(21%4));
		System.out.println("22 % 4 = "+(22%4));
		System.out.println("23 % 4 = "+(23%4));
		System.out.println("24 % 4 = "+(24%4));
		System.out.println("============================================");

		System.out.println("<< 쉬프트 연산자 >>");
		System.out.println("50 << 3 = "+(50 << 3));
		System.out.println("50 >> 3 = "+(50 >> 3));
		System.out.println("-50 >>> 3 = "+(-50 >>> 3));
		System.out.println("============================================");

		System.out.println("<< 관계 연산자 >>");
		System.out.println("20 > 10 = "+(20>10));
		System.out.println("20 < 10 = "+(20<10));
		System.out.println("20 == 10 = "+(20==10));
		System.out.println("20 != 10 = "+(20!=10));
		
		//배수 표현식의 결과를 0과 비교하여 처리
		//System.out.println("20 % 4 == 0 = "+(20%4==0));
		//System.out.println("21 % 4 == 0 = "+(21%4==0));
		System.out.println("============================================");
	
		System.out.println("<< 논리 연산자 >>");
		int d1=20, d2=10;
		int d3=15;
		
		//X>Y1 && X<Y2 : X가 Y1(작은값)~Y2(큰값) 범위의 값인지를 판단
		System.out.println("d1 > d3 && d2 < d3 = "+(d1>d3 && d2<d3));
		//X==Y1 || X==Y2 : X가 Y1 또는 Y2 중 하나의 값인지를 판단
		System.out.println("d1 < d3 || d2 > d3 = "+(d1<d3 || d2>d3));
		
		int d4=30;
		//첫번째 관계식의 결과가 false인 경우 && 연산자는 두번째 관계식 미실행
		System.out.println("d1 > d4 && d2 < d4 = "+(d1>d4 && d2<d4));
		//첫번째 관계식의 결과가 true인 경우 || 연산자는 두번째 관계식 미실행
		System.out.println("d1 < d4 || d2 > d4 = "+(d1<d4 || d2>d4));
		
		//무조건 모든 관계식을 실행하여 비교 후 false 또는 true 반환 
		System.out.println("d1 > d4 & d2 < d4 = "+(d1>d4 & d2<d4));
		System.out.println("d1 < d4 | d2 > d4 = "+(d1<d4 | d2>d4));
		System.out.println("============================================");
		
		System.out.println("<< 삼항 연산자 >>");
		//int e1=10, e2=20;
		int e1=20, e2=10;
		
		System.out.println("큰값 = "+(e1>e2?e1:e2));
		
		int e3=95, e4=10;//e3 : 게시글 갯수, e4 : 페이지당 출력 게시글 갯수
		int e5=e3/e4+(e3%e4==0?0:1);//e5 : 전체 페이지 갯수
		System.out.println("전체 페이지 갯수 = "+e5);
		
		int e6=85;//e6 : 점수
		//e7 : 점수에 따른 학점 
		// => 90이상 : A, 89~80 : B, 79~70 : C, 69~60 : D, 59이하 : F
		char e7=e6>=90?'A':e6>=80?'B':e6>=70?'C':e6>=60?'D':'F';
		System.out.println("점수 = "+e6+", 학점 = "+e7);
		System.out.println("============================================");
		
		System.out.println("<< 대입 연산자 >>");
		int f1=100;
		System.out.println("f1 = "+f1);
		
		f1+=200;//f1=f1+200;
		System.out.println("f1 = "+f1);
		
		int f2,f3;
		f2=f3=300;
		System.out.println("f2 = "+f2+", f3 = "+f3);
		System.out.println("============================================");
	}
}