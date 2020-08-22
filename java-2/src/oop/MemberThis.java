package oop;

//회원정보(아이디,비밀번호,이름)를 저장할 목적의 클래스
public class MemberThis {
	//필드에 저장될 기본값 >> 정수형 : 0, 실수형 : 0.0, 논리형 : false, 참조형 : null
	//필드에 저장될 기본값 변경 가능 >> 자료형 필드명=값;
	private String id="guest";
	private String password="1234";
	private String name="미입력";
	
	public MemberThis() {
		//생성자에서는 필드 또는 메소드 접근 가능
		/*
		id="guest";//setId("guest"); 명령과 동일
		password="1234";
		name="미입력";
		*/
		
		//MemberThis(String id, String password, String name) 생성자 호출
		//this("guest","1234","미입력");
	}

	public MemberThis(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//회원정보를 출력하기 위한 메소드
	public void display() {
		//메소드에서 인스턴스 필드 또는 메소드에 접근하기 위해 this 사용
		//System.out.println("아이디 = "+this.id);
		//this 키워드를 생략해도 필드 또는 메소드에 접근 가능
		System.out.println("아이디 = "+id);
		System.out.println("비밀번호 = "+password);
		System.out.println("이름 = "+name);
	}
}
