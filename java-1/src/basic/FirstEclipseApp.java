package basic;

/*
작성목적 : 이클립스를 연습하기 위한 어플리케이션
작성일자 : 2019년 04월 10일
작성자 : 홍길동 
*/

/**
FirstEclipseApp 클래스는 이클립스를 이용하여 만든 최초의 클래스입니다.
@author H.G.D
@version 1.0
@since JDK1.8
*/
//어노테이션(Annotation) : API 문서에서 특별한 의미를 가진 설명을 제공하기 위해 사용
public class FirstEclipseApp {
	//어플리케이션 작성을 위한 반드시 선언해야만 되는 메소드
	/** JVM에 의해 가장 먼저 호출되는 특별한 메소드 */
	public static void main(String[] args) {
		//화면에 원하는 내용이 출력되도록 메소드 호출
		System.out.println("안녕하세요.");//내용 출력 후 엔터 
		System.out.print("이클립스로 만든 ");
		System.out.println("첫번째 프로그램입니다.");
	}
}