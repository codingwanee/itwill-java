package oop;

//학생정보(학번,이름,주소)를 저장할 목적의 클래스 - VO(Value Object) 클래스
public class StudentConstructor {
	private String number;//학번
	private String name;//이름
	private String address;//주소

	//기본 생성자 - 파라메터가 없는 생성자 : 명령 미작성
	// => 생성자를 하나도 선언하지 않을 경우 기본 생성자가 있는 것으로 처리
	// => 생성자를 하나라도 선언할 경우 상속 문제 때문에 선언하는 것을 권장
	//Ctrl+Space >> Constructor 선택 >> Enter 
	public StudentConstructor() {
		// TODO Auto-generated constructor stub
	}

	//파라메터를 다른게 선언하여 메소드 오버로드 작성 가능
	//Alt+Shift+S >> O >> 필드 선택 >> Generate
	public StudentConstructor(String number) {
		//전달된 파라메터값으로 필드에 초기값 부여
		this.number=number;
	}
	
	public StudentConstructor(String number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	public StudentConstructor(String number, String name, String address) {
		super();
		this.number = number;
		this.name = name;
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//필드값을 확인 할 목적의 메소드
	public void display() {
		System.out.println("학번 = "+number+", 이름 = "+name+", 주소 = "+address);
	}
}