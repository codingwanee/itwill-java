package oop;

public class StudentConstructorApp {
	public static void main(String[] args) {
		//new 연산자로 기본 생성자를 호출하여 인스턴스 생성 
		// >> 인스턴스 필드에는 기본값이 자동 저장
		StudentConstructor student1=new StudentConstructor();
		
		//Getter 메소드를 호출하여 인스턴스 필드값 사용
		//System.out.println("학번 = "+student1.getNumber()+", 이름 = "+student1.getName()+", 주소 = "+student1.getAddress());
		student1.display();
		System.out.println("============================================");
		//Setter 메소드를 호출하여 인스턴스 필드값 변경
		student1.setNumber("1000");
		student1.setName("홍길동");
		student1.setAddress("서울시 강남구");
		
		student1.display();
		System.out.println("============================================");
		//생성자 파라메터에 값을 전달하여 인스턴스 생성시 필드에 초기값 저장
		StudentConstructor student2=new StudentConstructor("2000");
		student2.display();
		System.out.println("============================================");
		StudentConstructor student3=new StudentConstructor("3000", "임꺽정");
		student3.display();
		System.out.println("============================================");
		StudentConstructor student4=new StudentConstructor("4000", "전우치","인천시 월미구");
		student4.display();
		System.out.println("============================================");
	}
}
