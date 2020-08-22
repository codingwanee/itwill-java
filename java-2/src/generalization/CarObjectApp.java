package generalization;

public class CarObjectApp {
	public static void main(String[] args) {
		CarObject tico=new CarObject("티코", 2019);
		
		//참조변수에 저장된 인스턴스를 이용하여 클래스의 메소드 호출
		System.out.println("모델명 = "+tico.getModelName());
		System.out.println("생산년도 = "+tico.getProductionYear());
		System.out.println("============================================");
		//모든 Java 클래스는 Object 클래스를 상속받으므로 인스턴스는 Object 클래스의 메소드 호출 가능 
		//Object.toString() : 참조변수에 저장된 인스턴스 정보를 문자열로 변환하여 반환하는 메소드
		//Object 클래스의 toString() 메소드를 오버라이드 선언하면 묵시적 객체 형변환에 의해 자식클래스의 메소드 호출 
		System.out.println(tico.toString());
		//참조변수를 출력할 경우 자동으로 toString() 메소드 호출
		System.out.println(tico);
		System.out.println("============================================");
		String str="홍길동";
		//Object 클래스의 toString() 메소드 대신 String 클래스의 오버라이드
		//선언된 toString() 메소드 호출
		//System.out.println("이름 = "+str.toString());
		System.out.println("이름 = "+str);
		System.out.println("============================================");
	}
}
