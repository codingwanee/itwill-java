package generalization;

//�ڵ�������(�𵨸�,����⵵)�� ������ ������ Ŭ����
// => Ŭ������ ������ ��� �⺻������ java.lang.Object Ŭ������ ���
//Object Ŭ���� : Java Ŭ�������� ��ӹ޴� �ֻ��� �θ�Ŭ����
// => Object Ŭ������ ���������� ������ ��� ��� �ν��Ͻ� ������ ���� ����
public class CarObject /* extends Object */ {
	private String modelName;
	private int productionYear;
	
	public CarObject() {
		// TODO Auto-generated constructor stub
	}

	public CarObject(String modelName, int productionYear) {
		super();
		this.modelName = modelName;
		this.productionYear = productionYear;
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
	
	//�ʵ尪�� ���ڿ��� ��ȯ�Ͽ� ��ȯ => �ʵ尪 Ȯ���� �������� �ϴ� �޼ҵ�
	@Override
	public String toString() {
		return "modelName = "+modelName+", productionYear = "+productionYear;
	}
}
