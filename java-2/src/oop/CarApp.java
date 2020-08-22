package oop;

public class CarApp {
	public static void main(String[] args) {
		//new 연산자로 생성자를 호출하여 인스턴스 생성
		// => 인스턴스 필드에는 기본값이 자동으로 저장
		Car tico=new Car();
		Car sonata=new Car();
		
		System.out.println("tico = "+tico);
		System.out.println("sonata = "+sonata);
		System.out.println("============================================");
		//인스턴스 필드에 저장된 기본값 변경 => . 연산자로 필드 접근
		//인스턴스 필드에 직접적인 접근을 허용할 경우 비정상적인 정보 저장 가능
		// => 메소드 호출에 대한 기능의 비정상적 구현 발생
		//은닉화 선언된 필드에 인스턴스를 이용하여 접근할 경우 에러 발생
		//tico.carNumber="12가3456";
		//은닉화 선언된 필드값을 변경하기 위해 Setter 메소드 호출
		tico.setCarNumber("12가3456");
		
		//System.out.println("차번호 = "+tico.carNumber);
		//은닉화 선언된 필드값을 사용하기 위해 Getter 메소드 호출
		System.out.println("차번호 = "+tico.getCarNumber());
		//System.out.println("시동유무 = "+tico.startUp);
		System.out.println("시동유무 = "+tico.isStartUp());
		//System.out.println("현재속도 = "+tico.currentSpeed);
		System.out.println("현재속도 = "+tico.getCurrentSpeed());
		System.out.println("============================================");
		tico.startEngine();
		//sonata.startEngine();
		
		tico.speedUp(50);
		
		tico.speedUp(30);
		//tico.speedUp(300);
		
		tico.speedDown(40);
		//tico.speedDown(400);
		
		//tico.stop();
		tico.stopEngine();
		//System.out.println("현재속도 = "+tico.currentSpeed);
		System.out.println("============================================");
	}
}
