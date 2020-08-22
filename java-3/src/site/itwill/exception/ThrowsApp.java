package site.itwill.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsApp {
	//메소드에서 발생될 수 있는 모든 예외들을 throws 키워드로 전달 
	public ThrowsApp() throws IOException, NumberFormatException, ArithmeticException {
		//키보드로 문자열을 입력받기 위한 입력스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//키보드로 숫자를 입력받아 변수에 저장
		System.out.print("첫번째 정수 입력 >> ");
		//BufferedReader.readLine() : 입력스트림으로부터 문자열을 제공받아 반환하는 메소드
		// => IOException 예외가 발생되어 메소드 호출시 전달 - 예외처리 
		// => IOException 예외는 작성 관련 예외로 예외처리를 하지 않으면 에러 처리
		//Integer.parseInt(String s) : 파라메터로 전달된 문자열을 정수로 변환하여 반환하는 메소드
		// => 파라메터에 전달된 문자열이 숫자 형태가 아닌 경우 NumberFormatException 예외 발생
		// => NumberFormatException 예외는 실행 관련 예외로 예외처리를 하지 않으면 JVM에 의해 자동 처리
		int num1=Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력 >> ");
		int num2=Integer.parseInt(br.readLine());
		
		//나누기 연산자를 사용할 경우 0으로 나누면 ArithmeticException 예외 발생
		// => ArithmeticException 예외는 실행 관련 예외로 예외처리를 하지 않으면 JVM에 의해 자동 처리
		System.out.println("[결과]나누기(몫) = "+(num1/num2));
	}
	
	//main 메소드에 전달되는 예외는 JVM에 의해 자동 예외처리
	public static void main(String[] args) /* throws IOException */ {
		//예외가 발생되는 메소드를 호출할 경우 try 명령으로 예외처리
		/*
		try {
			new ThrowsApp();//생성자를 이용하여 인스턴스 생성
		} catch (NumberFormatException e) {
			System.out.println("[에러]정수만 입력 가능합니다.");
		} catch (ArithmeticException e) {
			System.out.println("[에러]두번째 정수에는 0을 입력할 수 없습니다.");
		} catch (IOException e) {
			System.out.println("[에러]입출력 스트림에 문제가 발생 되었습니다.");
		} catch (Exception e) { //모든 예외를 전달받아 처리
			System.out.println("[에러]프로그램 실행에 문제가 발생 되었습니다.");
		}
		*/
		
		try {
			new ThrowsApp();//생성자를 이용하여 인스턴스 생성
		} catch (NumberFormatException | ArithmeticException e) {
			//여러 개의 예외를 | 연산자로 연결하여 전달받아 처리 - JDK1.7이상에서만 사용
			System.out.println("[에러]잘못된 정수값을 입력 하였습니다.");
		} catch (IOException e) {
			System.out.println("[에러]입출력 스트림에 문제가 발생 되었습니다.");
		} catch (Exception e) { //모든 예외를 전달받아 처리
			System.out.println("[에러]프로그램 실행에 문제가 발생 되었습니다.");
		}
	}
}