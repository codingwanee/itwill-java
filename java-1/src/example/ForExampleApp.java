package example;

public class ForExampleApp {
	public static void main(String[] args) {
		//본인 이름을 화면에 7번 출력하세요.
		//ex) 홍길동홍길동홍길동홍길동홍길동홍길동홍길동
		for(int i=1;i<=7;i++) {
			System.out.print("홍길동");
		}
		System.out.println();
		System.out.println("============================================");
		
		//1~10 범위의 정수 중 짝수를 화면에 출력하세요.
		//ex) 2    4    6    8    10
		/*
		for(int i=2;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		*/
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("============================================");
		
		//1~100 범위의 정수에서 3의 배수 합계와 5의 배수 합계를 계산하여
		//3의 배수 합계에서 5의 배수 합계를 뺀 결과를 계산하여 출력하세요.
		//ex) 결과 = 633
		int threeTot=0, fiveTot=0;
		for(int i=1;i<=100;i++) {
			if(i%3==0) threeTot+=i;
			if(i%5==0) fiveTot+=i;
		}
		System.out.println("결과 = "+(threeTot-fiveTot));
		System.out.println("============================================");
		
		//구구단 중 7단을 화면에 출력하세요.
		//ex) 7 * 1 = 7
		//    7 * 2 = 14
		//    ...
		//    7 * 8 = 56
		//    7 * 9 = 63
		int dan=7;
		for(int i=1;i<=9;i++) {
			System.out.println(dan+" * "+i+" = "+(dan*i));	
		}
		System.out.println("============================================");
		
		//5!의 결과값을 계산하여 출력하세요.(5! = 5 * 4 * 3 * 2 * 1)
		//ex) 5! = 120
		int num=5, fac=1;
		for(int i=num;i>=1;i--) {
			fac*=i;
		}
		System.out.println(num+"! = "+fac);
		System.out.println("============================================");
		
		//두 정수변수에 저장된 상수 사이의 정수들을 화면에 출력하세요.
		//단, 한 줄에 정수상수가 7개씩 출력되도록 작성하세요.
		//ex) 36    37    38    39    40    41    42
		//    43    44    45    46    47    48    49
		//    50    51    52    53    54    55    56
		//    57
		int start=36, end=57;
		//출력 갯수를 저장하기 위한 변수 - 상수를 출력할 때마다 1씩 증가
		int cnt=0; 
		for(int i=start;i<=end;i++) {
			System.out.print(i+"   ");
			cnt++;
			if(cnt%7==0) System.out.println();
		}
		if(cnt%7!=0) System.out.println();
		System.out.println("============================================");
		
		//두 정수변수에 저장된 상수 사이의 정수들의 합계를 계산하여 출력하세요.
		//단, 두 정수변수에 저장된 값이 반대인 경우에도 같은 결과가 출력되도록 작성하세요.
		//ex) 17 ~ 79 범위의 정수 합계 = 3024
		//int begin=17, last=79;
		int begin=79, last=17;
		
		if(begin>last) {
			int temp=begin;
			begin=last;
			last=temp;
		}
		
		int tot=0;
		for(int i=begin;i<=last;i++) {
			tot+=i;
		}
		
		System.out.println(begin+" ~ "+last+" 범위의 정수 합계 = "+tot);
		System.out.println("============================================");
	}
}