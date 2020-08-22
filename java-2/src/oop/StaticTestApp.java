package oop;

public class StaticTestApp {
	//인스턴스 필드 : 인스턴스 생성시 메모리에 생성되는 필드 - 생성자에서 초기값 부여
	// => 생성된 인스턴스 갯수만큼 메모리에 존재
	// => 인스턴스를 이용하여 접근
	private int num1; 
	//정적 필드 : 클래스 읽어 메모리에 저장된 후 생성되는 필드 - 필드에 직접 초기값 부여
	// => 인스턴스 갯수에 상관없이 하나만 메모리에 존재
	// => 클래스를 이용하여 접근
	private static int num2;//초기값 생략시 기본값 저장
	
	public StaticTestApp() {
		// TODO Auto-generated constructor stub
	}
	
	public StaticTestApp(int num1) {
		super();
		this.num1 = num1;
	}

	//인스턴스 메소드 : this 참조변수가 존재하는 메소드
	// => this 참조변수를 이용하여 인스턴스 필드 또는 인스턴스 메소드 사용 가능
	// => 클래스를 이용하여 정적 필드 또는 정적 메소드 사용 가능
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void display1() {
		System.out.println("num1 = "+this.num1);//this 생략 가능
		System.out.println("num2 = "+StaticTestApp.num2);//클래스명 생략 가능
	}

	//정적 메소드 : this 참조변수가 없는 메소드
	// => this 참조변수가 없으므로 인스턴스 필드 또는 인스턴스 메소드 사용 불가능
	// => 클래스를 이용하여 정적 필드 또는 정적 메소드 사용 가능
	public static int getNum2() {
		return num2;
	}

	public static void setNum2(int num2) {
		StaticTestApp.num2 = num2;
	}

	public static void display2() {
		//System.out.println("num1 = "+this.num1);
		System.out.println("num2 = "+StaticTestApp.num2);
	}
	
	public static void main(String[] args) {
		//인스턴스 메소드는 인스턴스 생성 후 호출 가능
		StaticTestApp st=new StaticTestApp();
		st.display1();
		System.out.println("============================================");
		//정적 메소드는 인스턴스 생성과 상관없이 호출 가능
		StaticTestApp.display2();
		System.out.println("============================================");
	}
}








