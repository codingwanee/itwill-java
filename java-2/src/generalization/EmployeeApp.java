package generalization;

//사원정보를 이용한 급여 관리 프로그램
public class EmployeeApp {
	public static void main(String[] args) {
		/*
		//추상클래스로 선언한 경우 인스턴스 생성 불가능
		//Employee emp1=new Employee();
		Employee emp2=new EmployeeReguler();
		Employee emp3=new EmployeeTime();
		Employee emp4=new EmployeeContract();
		*/
		
		Employee[] employeeArray=new Employee[5];
		
		employeeArray[0]=new EmployeeReguler(1000, "홍길동", 96000000);
		employeeArray[1]=new EmployeeTime(2000, "임꺽정", 150, 50000);
		employeeArray[2]=new EmployeeContract(3000, "전우치", 7000000);
		employeeArray[3]=new EmployeeTime(4000, "일지매", 100, 10000);
		employeeArray[4]=new EmployeeReguler(5000, "장길산", 60000000);
		
		for(Employee employee:employeeArray) {
			System.out.println("사원번호 = "+employee.getEmpNo());
			System.out.println("사원이름 = "+employee.getEmpName());
			/*
			//명시적 객체 형변환을 이용하여 자식인스턴스의 메소드 호출
			// => instanceof 연산자를 이용하여 자식클래스를 구분한 후 명시적 객체 형변환
			if(employee instanceof EmployeeReguler) {
				System.out.println("사원급여 = "+((EmployeeReguler)employee).computeSalary());
			} else if(employee instanceof EmployeeTime) {
				System.out.println("사원급여 = "+((EmployeeTime)employee).calcPay());
			} else if(employee instanceof EmployeeContract) {
				System.out.println("사원급여 = "+((EmployeeContract)employee).returnPay());
			}
			*/
			
			//묵시적 객체 형변환을 이용하여 자식인스턴스의 메소드 호출
			// => 부모클래스의 추상메소드를 자식클래스에서 오버라이드 선언
			System.out.println("사원급여 = "+employee.computePay());
			
			System.out.println("인센티브 = "+employee.computeIncentive());
			System.out.println("========================================");
		}
	}
}
