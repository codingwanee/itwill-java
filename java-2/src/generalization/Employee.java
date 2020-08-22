package generalization;

//기본적인 사원정보(사원번호,사원이름)를 저장할 목적의 클래스
// => 인스턴스 생성이 목적이 아닌 상속을 목적으로 작성
// => 상속을 목적으로 작성하기 위해 추상클래스로 선언
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//상수필드(Constant Field) : 상수 대신 사용할 필드 - 필드값 변경 불가능
	public static final double INCENTIVE_RATE=1.5;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//급여를 계산하여 반환하는 메소드 - 메소드 작성 규칙 제공(작업명세서) 
	// => 자식클래스에서 반드시 메소드를 오버라이드 선언하도록 추상메소드로 선언
	// => 추상메소드가 선언된 클래스는 반드시 추상클래스로 선언
	public abstract int computePay();
	
	//인센티브를 계산하여 반환하는 메소드
	// => 인센티브는 사원급여의 150%로 계산하여 지급
	//자식클래스에서 오버라이드 선언할 경우 계산되어 반환하는 인센티브 변환 가능 
	// => 자식클래스에서 오버라이드 할 수 없도록 final 메소드로 선언
	public final int computeIncentive() {
		//추상메소드를 호출하면 묵시적 객체 형변환에 의해 자식클래스의 메소드 호출
		// => 부모클래스의 메소드에서 자식클래스의 메소드 호출
		//int incetive=(int)(computePay()*1.5);
		//상수 대신 상수필드 사용 - 값을 명확하게 구분
		int incetive=(int)(computePay()*INCENTIVE_RATE);
		return incetive;
	}
}



