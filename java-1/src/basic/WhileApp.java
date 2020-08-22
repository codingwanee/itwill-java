package basic;

public class WhileApp {
	public static void main(String[] args) {
		//"Java Programming"를 화면에 5번 출력하세요.
		int i=1;
		/*
		while(i<=5) {
			System.out.println("Java Programming");
			i++;
		}
		*/
		
		do {
			System.out.println("Java Programming");
			i++;
		} while(i<=5);
		System.out.println("============================================");
		//1~100 범위의 정수들의 합계를 계산하여 출력하세요.
		int num=1,tot=0;
		/*
		while(num<=100) {
			tot+=num;
			num++;
		}
		*/
	
		do {
			tot+=num;
			num++;
		} while(num<=100);
		System.out.println("1~100 범위의 정수들의 합계 = "+tot);
		System.out.println("============================================");
		
		//A4 용지를 반으로 계속 접어 펼쳤을 경우 사각형 모양이 500개 이상이
		//되려면 몇 번 접었다 펼치면 되는지 계산하여 출력하세요.
		//cnt : 접는 횟수를 저장할 변수, gae : 사각형 모양의 갯수를 저장할 변수
		int cnt=0,gae=1;
		
		while(gae<500) {//접는 동작 - 반복
			cnt++;
			gae*=2;
		}
		
		System.out.println(cnt+"번 접었다 펼치면 사각형 모양은 "+gae+"개 생김니다.");		
		System.out.println("============================================");

		//1부터 X 범위의 정수들의 합계가 300이상 되려면 X가 얼마인지를 계산하여 출력하세요. 
		//ex) 1~24 범위의 정수들의 합계 = 300
		int su=0, sum=0;//su : 더하는 정수, sum : 합계
		while(sum<300) {
			su++;
			sum+=su;
		}
		System.out.println("1~"+su+" 범위의 정수들의 합계 = "+sum);
		System.out.println("============================================");
		
	}
}








