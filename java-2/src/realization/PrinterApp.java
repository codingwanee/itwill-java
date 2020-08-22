package realization;

public class PrinterApp {
	public static void main(String[] args) {
		//기본메소드를 호출하기 위해 참조변수는 인터페이스를 이용하여 선언
		//Printable printer=new PrinterSingle();
		Printable printer=new PrinterMulti();
		
		printer.print();
		//기본메소드 호출 
		// => 오버라이드 선언되지 않으면 인터페이스의 메소드 호출
		// => 오버라이드 선언된 경우 자식클래스의 메소드 호출
		printer.scan();
	}
}
