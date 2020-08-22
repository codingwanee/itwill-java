package basic;

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) continue;
			System.out.println("i = "+i);
		}
		System.out.println("============================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) continue;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		loop:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				//if(j==3) break; 명령과 동일한 기능을 구현
				if(j==3) continue loop;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");

		//1~100 범위의 정수들중 짝수들의 합계를 계산하여 출력하세요.
		int tot=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) continue;
			tot+=i;
		}
		System.out.println("1~100 범위의 짝수들의 합계 = "+tot);
		System.out.println("============================================");
	}
}
