package basic;

import java.util.Scanner;

//키보드로 이름과 나이를 입력받아 이름과 나이를 출력하는 프로그램을 작성하세요.
public class ScannerApp {
	public static void main(String[] args) {
		//Scanner 클래스 : 외부장치(키보드, 파일등)로부터 상수를 입력받아 
		//반환하는 기능(메소드)을 제공하는 클래스
		// => Scanner 클래스로 객체를 생성한 후 메소드 호출 가능
		
		//키보드로 입력된 상수를 제공할 있는 Scanner 객체 생성 
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		//Scanner.nextLine() : 키보드로 입력된 문자열을 반환하는 메소드
		// => 키보드로 상수를 입력받기 전까지 프로그램의 흐름은 일시 중지
		// => 키보드로 상수 입력 후 엔터를 누르면 프로그램 재실행
		String name=scanner.nextLine();
		
		System.out.print("나이 입력 >> ");
		//Scanner.nextInt() : 키보드로 입력된 정수상수를 반환하는 메소드
		// => 정수상수가 아닌 값을 입력할 경우 실행 관련 예외(Exception) 발생
		int age=scanner.nextInt();
		
		System.out.println("[결과]"+name+"님의 나이는 "+age+"살입니다.");
		
		//Scanner.close() : 입력 관련 자원을 제거하는 메소드
		scanner.close();
	}
}









