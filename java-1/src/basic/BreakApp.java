package basic;

public class BreakApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) break;
			System.out.println("i = "+i);
		}
		System.out.println("============================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break;//for(int j=1;j<=5;j++) 반복문 종료
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		loop: //라벨명(식별자) : 반복문에 부여하는 위치정보  
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) break loop;//for(int i=1;i<=5;i++) 반복문 종료
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		//1부터 X 범위의 정수들의 합계가 300이상 되려면 X가 얼마인지를 계산하여 출력하세요. 
		//ex) 1~24 범위의 정수들의 합계 = 300
		int su=1,sum=0;
		
		while(true) {//무한루프
			sum+=su;
			if(sum>=300) break;
			su++;
		}
		
		System.out.println("1~"+su+" 범위의 정수들의 합계 = "+sum);
		System.out.println("============================================");
	}
}
