package oop;

public class MethodOverload {
	public void displayInt(int param) {
		System.out.println("정수형 상수 = "+param);
	}
	
	public void displayBoolean(boolean param) {
		System.out.println("논리형 상수 = "+param);
	}
	
	public void displayString(String param) {
		System.out.println("문자열 상수 = "+param);
	}
	
	//동일한 기능을 제공하는 파라메터가 다른 메소드는 메소드명을 같도록 선언
	// => 메소드 오버로드
	public void display(int param) {
		System.out.println("정수형 상수 = "+param);
	}
	
	public void display(boolean param) {
		System.out.println("논리형 상수 = "+param);
	}
	
	public void display(String param) {
		System.out.println("문자열 상수 = "+param);
	}
}





