package association;

//엔진정보(연료타입,배기량)를 저장할 목적의 클래스
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
		System.out.println("연료타입 = "+fuelType);
		System.out.println("배기량 = "+displacement);
	}
}
