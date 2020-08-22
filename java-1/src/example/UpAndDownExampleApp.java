package example;

import java.util.Scanner;

//컴퓨터로부터 제공된 정수난수를 키보드로 입력하여 맞추는 프로그램을 작성하세요.
// => 1~100 범위의 정수난수를 제공 받도록 작성
// => 난수를 맞출 수 있는 기회는 10번만 제공되도록 작성
// => 키보드 입력값이 1~100 범위가 아닌 경우 재입력
// => 난수와 입력값이 동일한 경우 입력횟수 출력 후 프로그램 종료
// => 난수와 입력값이 다른 경우 "큰값 입력" 또는 "작은값 입력" 형식의 메세지 출력
// => 난수를 10번 안에 맞추지 못한 경우 난수 출력
public class UpAndDownExampleApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);

		//1~100 범위의 난수를 제공받아 변수에 저장
		int dap=(int)(Math.random()*100)+1;
		
		//정답 관련 상태정보를 저장하기 위한 변수
		// => false : 정답(X), true : 정답(O)
		boolean result=false;
		
		for(int cnt=1;cnt<=10;cnt++) {
			int input;
			while(true) {
				System.out.print(cnt+"번째 입력[1~100] >> ");
				input=scanner.nextInt();
				if(input>=1 && input<=100) break;
				System.out.println("[에러]입력값은 1~100 범위의 값만 유효합니다.");
			}
			
			if(dap==input) {
				System.out.println("[메세지]"+cnt+"번에 정답을 맞췄습니다.");
				result=true;
				break;
			} else if(dap>input) {
				System.out.println("[결과]"+input+"보다 큰 값을 입력해 보세요.");
			} else {
				System.out.println("[결과]"+input+"보다 작은 값을 입력해 보세요.");
			}
			
			/*
			if(cnt==10) {
				System.out.println("[메세지]정답을 맞추지 못했군요. 정답은 <"+dap+">입니다.");
			}
			*/
		}
		
		if(!result) {
			System.out.println("[메세지]정답을 맞추지 못했군요. 정답은 <"+dap+">입니다.");
		}
		
		scanner.close();
	}
}