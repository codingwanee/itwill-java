package generalization;

//�⺻���� �������(�����ȣ,����̸�)�� ������ ������ Ŭ����
// => �ν��Ͻ� ������ ������ �ƴ� ����� �������� �ۼ�
// => ����� �������� �ۼ��ϱ� ���� �߻�Ŭ������ ����
public abstract class Employee {
	private int empNo;
	private String empName;
	
	//����ʵ�(Constant Field) : ��� ��� ����� �ʵ� - �ʵ尪 ���� �Ұ���
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
	
	//�޿��� ����Ͽ� ��ȯ�ϴ� �޼ҵ� - �޼ҵ� �ۼ� ��Ģ ����(�۾�����) 
	// => �ڽ�Ŭ�������� �ݵ�� �޼ҵ带 �������̵� �����ϵ��� �߻�޼ҵ�� ����
	// => �߻�޼ҵ尡 ����� Ŭ������ �ݵ�� �߻�Ŭ������ ����
	public abstract int computePay();
	
	//�μ�Ƽ�긦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �μ�Ƽ��� ����޿��� 150%�� ����Ͽ� ����
	//�ڽ�Ŭ�������� �������̵� ������ ��� ���Ǿ� ��ȯ�ϴ� �μ�Ƽ�� ��ȯ ���� 
	// => �ڽ�Ŭ�������� �������̵� �� �� ������ final �޼ҵ�� ����
	public final int computeIncentive() {
		//�߻�޼ҵ带 ȣ���ϸ� ������ ��ü ����ȯ�� ���� �ڽ�Ŭ������ �޼ҵ� ȣ��
		// => �θ�Ŭ������ �޼ҵ忡�� �ڽ�Ŭ������ �޼ҵ� ȣ��
		//int incetive=(int)(computePay()*1.5);
		//��� ��� ����ʵ� ��� - ���� ��Ȯ�ϰ� ����
		int incetive=(int)(computePay()*INCENTIVE_RATE);
		return incetive;
	}
}



