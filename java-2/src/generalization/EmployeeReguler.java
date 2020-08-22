package generalization;

//������ �������(�����ȣ,����̸�,����)�� ������ ������ Ŭ����
// => �⺻���� ��������� �����ϴ� Ŭ������ ��ӹ޾� �ۼ�
//�߻�޼ҵ尡 ����� �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ���������� ��� �߻�޼ҵ带 �ݵ�� �������̵� ����
// => �߻�޼ҵ带 �������̵� �������� ������ �ڽ�Ŭ������ �߻�Ŭ������ ó��
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
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	/*
	public int computeSalary() {
		return annualSalary/12;
	}
	*/
	
	//�θ�Ŭ������ �߻�޼ҵ带 �������̵� ����
	@Override
	public int computePay() {
		return annualSalary/12;
	}
	
	/*
	//final �޼ҵ带 �������̵� ������ ��� ���� ����
	@Override
	public int computeIncentive() {
		return 1000000000;
	}
	*/
}





