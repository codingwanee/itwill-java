package generalization;

public class MemberCastApp {
	public static void main(String[] args) {
		//부모클래스 참조변수=new 부모클래스(); 
		// => 가능 : 부모인스턴스를 생성하여 부모참조변수에 저장
		Member member1=new Member();
		//부모참조변수에 저장된 인스턴스를 이용하여 부모클래스의 요소에 접근 가능
		member1.setEmail("aaa@itwill.site");
		member1.setName("홍길동");
		
		member1.display();
		System.out.println("============================================");
		//자식클래스 참조변수=new 자식클래스();
		// => 가능 : 부모인스턴스와 자식인스턴스를 생성하여 자식인스턴스 정보를 자식참조변수에 저장
		EventMember member2=new EventMember();
		
		//자식참조변수에 저장된 인스턴스를 이용하여 자식클래스의 요소와 부모클래스의 요소에 접근 가능
		member2.setEmail("bbb@itwill.site");
		member2.setName("임꺽정");
		member2.setAddress("서울시 강남구");
		
		member2.display();
		System.out.println("============================================");
		//자식클래스 참조변수=new 부모클래스();
		// => 불가능 : 자식인스턴스가 생성되지 않아 저장할 경우 에러 발생
		//EventMember member3=new Member(); 
		System.out.println("============================================");
		//부모클래스 참조변수=new 자식클래스();
		// => 가능 : 부모인스턴스와 자식인스턴스를 생성하여 부모인스턴스 정보를 부모참조변수에 저장
		Member member4=new EventMember();
		
		//부모참조변수에 저장된 인스턴스를 이용하여 부모클래스의 요소에 접근 가능
		member4.setEmail("ccc@itwill.site");
		member4.setName("전우치");
		
		//객체 형변환를 이용하여 자식클래스의 요소에 접근 가능
		
		//명시적 객체 형변환를 이용하여 참조변수에 저장된 부모인스턴스 정보를
		//개발자가 강제로 자식인스턴스 정보로 일시적으로 변환하여 자식클래스 요소에 접근
		/*
		EventMember member=(EventMember)member4;
		member.setAddress("수원시 팔달구");
		*/
		((EventMember)member4).setAddress("수원시 팔달구");
		
		//묵시적 객체 형변환를 이용하여 참조변수에 저장된 부모인스턴스 정보를
		//JVM이 자동으로 자식인스턴스 정보로 일시적으로 변환하여 자식클래스 요소에 접근
		// => 오버라이드 선언된 메소드인 경우 부모클래스의 메소드가 숨겨져 있어  
		//    자식클래스의 메소드에 접근할 수 있도록 자동으로 객체 형변환
		member4.display();
		System.out.println("============================================");
	}
}
