package generalization;

//이벤트에 참여한 회원정보(이메일,이름,주소)를 저장할 목적의 클래스
// => 회원정보를 저장하는 Member 클래스(이메일,이름)를 상속받아 작성
public class EventMember extends Member {
	//private String email;
	//private String name;
	private String address;
	
	public EventMember() {
		// TODO Auto-generated constructor stub
		//super 키워드로 부모클래스의 생성자 호출 
		// => 생략된 경우 부모클래스의 기본 생성자 호출
		//super();//부모클래스의 기본 생성자 호출
	}

	/*
	public EventMember(String email, String name, String address) {
		super();
		//this.email = email;//은닉화 선언된 필드에 접근할 경우 에러 발생
		//자식클래스에 선언되지 않은 메소드는 자동으로 부모클래스의 메소드 사용 
		// => 자식클래스의 메소드에서는 부모클래스의 메소드 호출 가능 : super 키워드 사용
		setEmail(email);
		//this.name = name;
		setName(name);
		this.address = address;
	}
	*/
	
	//Alt+Shift+S >> O >> 부모클래스의 생성자 선택 >> 필드 선택 >> Generate
	public EventMember(String email, String name, String address) {
		super(email, name);
		this.address = address;
	}

	/*
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	public void displayEvent() {
		//System.out.println("이메일 = "+email);
		System.out.println("이메일 = "+getEmail());
		//System.out.println("이름 = "+name);
		System.out.println("이름 = "+getName());
		System.out.println("주소 = "+address);
	}
	*/
	
	//메소드 오버라이드 선언 - 부모클래스의 메소드명 >> Ctrl+Space >> Override 선택
	//@Override : API 문서에서 메소드의 오버라이드 메세지를 제공하기 위한 어노테이션()
	// => 오버라이드 작성 규칙대로 선언하지 않을 경우 에러 발
	@Override
	public void display() {
		//super 키워드로 오버라이드 선언되어 숨겨진 부모클래스의 메소드 호출
		super.display();
		System.out.println("주소 = "+address);
	}
}




