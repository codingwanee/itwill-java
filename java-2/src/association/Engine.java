package association;

//��������(����Ÿ��,��ⷮ)�� ������ ������ Ŭ����
public class Engine {
	private String fuelType;
	private int displacement;
	
	public Engine() {
		// TODO Auto-generated constructor stub
	}

	public Engine(String fuelType, int displacement) {
		super();
		this.fuelType = fuelType;
		this.displacement = displacement;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getDisplacement() {
		return displacement;
	}

	public void setDisplacement(int displacement) {
		this.displacement = displacement;
	}
	
	public void engineDisplay() {
		System.out.println("����Ÿ�� = "+fuelType);
		System.out.println("��ⷮ = "+displacement);
	}
}
