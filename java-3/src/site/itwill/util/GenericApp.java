package site.itwill.util;

//필드의 타입이 제네릭 타입으로 선언된 클래스로 인스턴스를 생성하여 사용할 경우
// => 필드에 제네릭 타입 대신 변환된 클래스의 인스턴스만 전달하여 저장 가능
// => 필드값을 반환받아 사용할 경우 객체 형변환 불필요
public class GenericApp {
	public static void main(String[] args) {
		//제네릭 타입에 참조형을 전달해야만 제네릭 참조형 사용 가능
		Generic<Integer> g1=new Generic<Integer>();
		
		g1.setField(100);
		//제네릭 타입에 전달된 참조형의 인스턴스가 아닌 경우 에러 발생
		//g1.setField(12.34);
		
		int g1Value=g1.getField().intValue();
		System.out.println("정수값 = "+g1Value);
		System.out.println("============================================");
		
		Generic<Double> g2=new Generic<Double>();
		g2.setField(12.34);
		double g2Value=g2.getField().doubleValue();
		System.out.println("실수값 = "+g2Value);
		System.out.println("============================================");
		
		Generic<String> g3=new Generic<String>();
		g3.setField("홍길동");
		String g3Value=g3.getField().replace("홍", "고");
		System.out.println("문자열 = "+g3Value);
		System.out.println("============================================");
		
	}
}






