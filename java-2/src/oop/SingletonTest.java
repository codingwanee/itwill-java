package oop;

//싱글톤 디자인 패턴이 적용된 클래스 작성 : 싱글톤(Singleton) 클래스
// => 프로그램에 인스턴스를 하나만 생성하여 제공하는 클래스
// => 정보를 처리할 목적의 클래스를 작성할 경우 사용 - Manager 클래스
public class SingletonTest {
	//1.클래스로 생성된 인스턴스 정보를 저장할 목적의 필드 선언 - 정적필드
	// => 클래스 내부에서만 사용하는 필드 : 시스템 필드 - Getter와 Setter 메소드 미선언
	// => 시스템 필드는 _로 시작되는 식별자로 선언
	private static SingletonTest _instance;
	
	/*
	public SingletonTest() {
		System.out.println("### SingletonTest 클래스의 기본 생성자 호출 ###");
	}
	*/
	
	//2.생성자를 private 키워드로 은닉화 선언
	// => 프로그램에서 생성자로 불필요한 인스턴스 생성을 방지하기 위해 선언
	private SingletonTest() {
		System.out.println("### SingletonTest 클래스의 기본 생성자 호출 ###");
	}
	
	//3.정적영역(Static Block)에서 인스턴스를 생성하여 시스템 필드에 저장
	// => 정적영역 : 클래스를 읽어 메모리에 저장된 후 실행될 명령을 작성하는 영역 
	// => 프로그램에서 정적영역의 명령은 한 번만 실행
	// => 정적 필드 또는 정적 메소드 사용 가능
	// => 인스턴스 필드 또는 인스턴스 메소드 사용 불가능
	static {
		_instance=new SingletonTest();
	}
	
	//4.시스템 필드에 저장된 인스턴스 정보를 반환하는 정적 메소드 선언
	public static SingletonTest getInstance() {
		return _instance;
	}
	
	public void insert() {
		System.out.println("### 정보를 저장하는 메소드 호출 ###");
	}
	
	public void update() {
		System.out.println("### 정보를 변경하는 메소드 호출 ###");
	}
	
	public void delete() {
		System.out.println("### 정보를 삭제하는 메소드 호출 ###");
	}
	
	public void select() {
		System.out.println("### 정보를 검색하는 메소드 호출 ###");
	}
}
