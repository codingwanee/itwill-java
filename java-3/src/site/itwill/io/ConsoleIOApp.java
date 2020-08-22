package site.itwill.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

//키보드로 이름과 태어난 년도를 입력받아 이름과 나이를 출력하는 프로그램 
public class ConsoleIOApp {
	public static void main(String[] args) throws IOException {
		//System.in : 키보드로 원시데이타를 입력받기 위한 입력스트림(기본적으로 제공되는 입력스트림)
		//new InputStreamReader(System.in) : System.in 스트림을 전달받아 
		//키보드로 변형데이타(문자)를 입력받기 위한 입력스트림 생성
		//new BufferedReader(new InputStreamReader(System.in)) : InputStreamReader
		//스트림을 전달받아 키보드로 변형데이타를 여러개를 입력받기 위한 입력스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//PrintStream 클래스의 print() 메소드 또는 println() 메소드 이용
		// => 어떤 형태의 값을 전달해도 문자열로 변경하여 출력하는 메소드
		System.out.print("이름 입력 >> ");
		//BufferedReader.readLine() : 입력스트림의 변형데이타를 문자열로 얻어와 반환하는 메소드
		String name=br.readLine();
		
		System.out.print("태어난 년도 입력 >> ");
		//Integer.parseInt() 메소드를 호출하여 입력받은 문자열을 정수로 변환
		int year=Integer.parseInt(br.readLine());
		
		int age=Calendar.getInstance().get(Calendar.YEAR)-year+1;
		
		System.out.println("[결과]"+name+"님의 나이는 "+age+"살입니다.");
	}
}
