package generalization;

//정규직 사원정보(사원번호,사원이름,연봉)를 저장할 목적의 클래스
// => 기본적인 사원정보를 제공하는 클래스를 상속받아 작성
//추상메소드가 선언된 추상클래스를 상속받은 자식클래스에서는 모든 추상메소드를 반드시 오버라이드 선언
// => 추상메소드를 오버라이드 선언하지 않으면 자식클래스도 추상클래스로 처리
public class EmployeeReguler extends Employee {
	private int annualSalary;
	
	public EmployeeReguler() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeReguler(int empNo, String empName, int annualSalary) {
		super(empNo, empName);
		this.annualSalary = annualSalary;
	}

	public int getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	//급여를 계산하여 반환하는 메소드
	/*
	public int computeSalary() {
		return annualSalary/12;
	}
	*/
	
	//부모클래스의 추상메소드를 오버라이드 선언
	@Override
	public int computePay() {
		return annualSalary/12;
	}
	
	/*
	//final 메소드를 오버라이드 선언할 경우 에러 가능
	@Override
	public int computeIncentive() {
		return 1000000000;
	}
	*/
}





