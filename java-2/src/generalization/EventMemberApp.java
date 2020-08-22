package generalization;

public class EventMemberApp {
	public static void main(String[] args) {
		//자식클래스의 생성자로 인스턴스를 생성할 경우 부모클래스의 생성자
		//실행 후 자식클래스의 생성자 실행
		// => Member() 생성자 실행(부모인스턴스) >> EventMember() 생성자 실행(자식인스턴스)
		EventMember member1=new EventMember();
		
		member1.setEmail("abc@daum.net");
		member1.setName("홍길동");
		member1.setAddress("서울시 강남구");
		
		//member1.displayEvent();
		member1.display();
		System.out.println("============================================");
		EventMember member2=new EventMember
				("xyz@naver.com", "임꺽정", "수원시 팔달구");
		member2.display();
		System.out.println("============================================");
	}
}
