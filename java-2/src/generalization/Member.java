package generalization;

//회원정보(이메일,이름)를 저장할 목적의 클래스
public class Member {
	private String email;
	private String name;
	
	public Member() {
		// TODO Auto-generated constructor stub
	}

	public Member(String email, String name) {
		super();
		this.email = email;
		this.name = name;
	}

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
	
	public void display() {
		System.out.println("이메일 = "+email);
		System.out.println("이름 = "+name);
	}
}
