package site.itwill.util;

public class ExtendsGenericApp {
	public static void main(String[] args) {
		//Integer 클래스는 Number 클래스를 상속받는 자식클래스이므로 제네릭 타입 대신 사용 가능
		ExtendsGeneric<Integer> eg1=new ExtendsGeneric<Integer>(100);
		System.out.println("정수형 = "+eg1.getField().intValue());
		System.out.println("============================================");
		
		ExtendsGeneric<Double> eg2=new ExtendsGeneric<Double>(12.34);
		System.out.println("실수형 = "+eg2.getField().doubleValue());
		System.out.println("============================================");
		
		//String 클래스는 Number 클래스를 상속받는 클래스가 아니므로 제네릭 타입 대신 사용 불가
		//ExtendsGeneric<String> eg3=new ExtendsGeneric<String>();

	}
}





