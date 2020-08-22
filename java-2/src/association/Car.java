package association;

//자동차 정보(모델명,생산년도,엔진정보)를 저장할 목적의 클래스
public class Car {
	private String modelName;
	private int productionYear;
	private Engine carEngine;//포함관계 >> 1개 인스턴스 정보를 반드시 저장
	
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
		System.out.println("모델명 = "+modelName);
		System.out.println("생산년도 = "+productionYear);
		//System.out.println("엔진정보 = "+carEngine);
		/*
		System.out.println("연료타입 = "+carEngine.getFuelType());
		System.out.println("배기량 = "+carEngine.getDisplacement());
		*/
		//코드의 중복성을 최소화 하기 위해 동일 명령의 메소드 호출 - 유지보수의 효율성 증가
		//포함관계의 참조필드에 인스턴스 정보가 저장되어 있지 않은 경우 
		//메소드 호출시 NullPointerException 예외 발생
		// => NullPointerException : null이 저장된 참조변수로 메소드를 호출한 경우 발생되는 예외 
		carEngine.engineDisplay();
	}
}





