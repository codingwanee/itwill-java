package basic;

public class ForApp {
	public static void main(String[] args) {
		//"Java Programming"를 화면에 5번 출력하세요.
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("============================================");
		
		//"Java Programming"를 화면에 5번 출력하세요.
		//for 명령의 변수에 1 저장(초기식) 후 X까지(조건식) 1씩 증가(증감식)하면 X번 반복 처리 
		for(int i=1;i<=5;i++) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"Java Programming"를 화면에 5번 출력하세요.
		for(int i=5;i>=1;i--) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"Java Programming"를 화면에 5번 출력하세요.
		for(int i=1;i<=10;i+=2) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"1    2    3    4    5"를 화면에 출력하세요.
		for(int i=1;i<=5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();//Enter
		System.out.println("============================================");
		
		//"5    4    3    2    1"를 화면에 출력하세요.
		/*
		for(int i=1;i<=5;i++) {
			System.out.print((6-i)+"\t");
		}
		*/
		for(int i=5;i>=1;i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("============================================");
		
		//"1    3    5    7    9"를 화면에 출력하세요.
		/*
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		*/
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("============================================");
		
		//1~100 범위의 정수들의 합계를 계산하여 출력하세요.
		// => 1+2+3+...+98+99+100 = ?
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 범위의 정수들의 합계 = "+tot);
		System.out.println("============================================");
		
		//A~Z 범위의 알파벳을 출력하세요.
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("============================================");

		//두 정수변수에 저장된 상수 사이에 존재하는 5의 배수의 갯수를 계산하여 출력하세요.
		//int begin=27,last=88;
		int begin=88,last=27;
				
		if(begin>last) {
			/*
			System.out.println("[에러]시작 입력값이 마지막 입력값보다 작아야 됩니다.");
			System.exit(0);
			*/
			
			//두 변수에 저장된 상수를 서로 바꾸어 저장 - 치환 알고리즘(Swap Algorithm)
			int temp=begin;
			begin=last;
			last=temp;
		}
		
		int cnt=0;
		for(int i=begin;i<=last;i++) {
			if(i%5==0) cnt++;
		}
		System.out.println(begin+" ~ "+last
				+" 범위의 정수 중 5의 배수의 갯수 = "+cnt);
		System.out.println("============================================");
		
		for(int i=1,j=5;i<=3;i++,j--) {
			System.out.println("i = "+i+", j = "+j);
		}
		System.out.println("============================================");

		int i=1;
		for(;i<=4;i++) {
			System.out.print(i+"  ");
		}
		//i=5;
		for(;i>=1;i--) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		/*
		for(;;) {
			System.out.println("무한 반복되는 명령");
		}
		*/
		//System.out.println("============================================");
	}
}