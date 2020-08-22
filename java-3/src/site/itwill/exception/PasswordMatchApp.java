package site.itwill.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//키보드로 정수를 입력받아 비밀번호와 비교하여 결과를 출력하는 프로그램
public class PasswordMatchApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		try {
			System.out.print("비밀번호 입력 >> ");
			//Scanner.nextInt() : 입력값이 정수가 아닌 경우 InputMismatchException 발생
			int password=scanner.nextInt();
			
			/*
			if(password==1234) {
				System.out.println("[결과]입력한 비밀번호가 맞습니다.");
			} else {
				System.out.println("[결과]입력한 비밀번호가 다릅니다.");
			}
			*/
			
			if(password!=1234) {
				//예외 인스턴스를 생성하여 throw 키워드로 인위적인 예외 발생
				throw new PasswordMissMatchException("[결과]입력한 비밀번호가 다릅니다.");
			}
			
			System.out.println("[결과]입력한 비밀번호가 맞습니다.");
		} catch (InputMismatchException e) {
			System.out.println("[에러]정수만 입력 가능합니다.");
		} catch (PasswordMissMatchException e) {
			//System.out.println("[결과]입력한 비밀번호가 다릅니다.");
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}
		
	}
}



