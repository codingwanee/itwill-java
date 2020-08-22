package oop;

public class MethodOverloadApp {
	public static void main(String[] args) {
		MethodOverload overload=new MethodOverload();
		
		overload.displayInt(100);
		overload.displayBoolean(false);
		overload.displayString("홍길동");
		//파라메터에 저장 불가능한 값을 전달할 경우 메소드 호출 불가능
		//overload.displayInt(true);
		System.out.println("============================================");
		//파라메터에 전달되는 값에 따라 메소드의 선택적 호출 가능
		// => 메소드 오버로드에 의한 다형성 제공
		// => 다형성 : 동일한 이름의 메소드가 선택적 호출에 의해 다른 기능 제공 
		overload.display(200);
		overload.display(true);
		overload.display("임꺽정");
		System.out.println("============================================");
	}
}




