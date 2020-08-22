package site.itwill.util;

//필드의 타입이 Object로 선언된 클래스로 인스턴스를 생성하여 사용할 경우
// => 필드에 모든 인스턴스를 전달하여 저장 가능
// => 필드에 저장된 인스턴스를 반환받아 사용하고자 할 경우 반드시 명시적 형변환 필요
public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric ng1=new NonGeneric();
		
		//필드에 Integer 인스턴스 전달되어 저장
		//ng1.setField(new Integer(100));
		//ng1.setField(Integer.valueOf(100));
		ng1.setField(100);//오토박싱에 의해 상수가 자동으로 인스턴스로 변환
		
		//ng1.getField() : Object 타입의 인스턴스 반환 >> 명시적 객체 형변환 후 사용
		int ng1Value=((Integer)ng1.getField()).intValue();
		//명시적 객체 형변환을 잘못할 경우 ClassCastException 발생
		//double ng1Value=((Double)ng1.getField()).doubleValue();
		System.out.println("정수값 = "+ng1Value);
		System.out.println("============================================");
		
		NonGeneric ng2=new NonGeneric();
		ng2.setField(12.34);
		
		double ng2Value=((Double)ng2.getField()).doubleValue();
		System.out.println("실수값 = "+ng2Value);
		System.out.println("============================================");
		
		NonGeneric ng3=new NonGeneric();
		ng3.setField("홍길동");
		
		String ng3Value=((String)ng3.getField()).replace("홍", "고");
		System.out.println("문자열 = "+ng3Value);
		System.out.println("============================================");
	}
}






