package association;

//�ڵ��� ����(�𵨸�,����⵵,��������)�� ������ ������ Ŭ����
public class Car {
	private String modelName;
	private int productionYear;
	private Engine carEngine;//���԰��� >> 1�� �ν��Ͻ� ������ �ݵ�� ����
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String modelName, int productionYear, Engine carEngine) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
		this.carEngine = carEngine;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	
	public void carDisplay() {
		System.out.println("�𵨸� = "+modelName);
		System.out.println("����⵵ = "+productionYear);
		//System.out.println("�������� = "+carEngine);
		/*
		System.out.println("����Ÿ�� = "+carEngine.getFuelType());
		System.out.println("��ⷮ = "+carEngine.getDisplacement());
		*/
		//�ڵ��� �ߺ����� �ּ�ȭ �ϱ� ���� ���� ����� �޼ҵ� ȣ�� - ���������� ȿ���� ����
		//���԰����� �����ʵ忡 �ν��Ͻ� ������ ����Ǿ� ���� ���� ��� 
		//�޼ҵ� ȣ��� NullPointerException ���� �߻�
		// => NullPointerException : null�� ����� ���������� �޼ҵ带 ȣ���� ��� �߻��Ǵ� ���� 
		carEngine.engineDisplay();
	}
}





