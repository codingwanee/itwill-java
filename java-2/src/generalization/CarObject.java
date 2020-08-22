package generalization;

//자동차정보(모델명,생산년도)를 저장할 목적의 클래스
// => 클래스를 선언할 경우 기본적으로 java.lang.Object 클래스를 상속
//Object 클래스 : Java 클래스들이 상속받는 최상위 부모클래스
// => Object 클래스로 참조변수를 생성한 경우 모든 인스턴스 정보를 저장 가능
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
	
	//필드값을 문자열로 변환하여 반환 => 필드값 확인을 목적으로 하는 메소드
	@Override
	public String toString() {
		return "modelName = "+modelName+", productionYear = "+productionYear;
	}
}
