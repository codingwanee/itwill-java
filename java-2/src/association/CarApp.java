package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine=new Engine();
		ticoEngine.setFuelType("휘발유");
		ticoEngine.setDisplacement(1200);
		
		Car tico=new Car();
		//tico.carDisplay();
		
		tico.setModelName("티코");
		tico.setProductionYear(2018);
		tico.setCarEngine(ticoEngine);
		
		tico.carDisplay();
		System.out.println("============================================");
		/*
		Engine sonataEngine=new Engine("고급휘발유", 2000);
		Car soanta=new Car("쏘나타", 2019, sonataEngine);
		*/
		Car sonata=new Car("쏘나타", 2019, new Engine("고급휘발유", 2000));
		sonata.carDisplay();
		System.out.println("============================================");
		System.out.println(tico.getModelName()+"의 엔진정보 >> ");
		ticoEngine.engineDisplay();
		System.out.println("============================================");
		System.out.println(sonata.getModelName()+"의 엔진정보 >> ");
		sonata.getCarEngine().engineDisplay();
		System.out.println("============================================");
	}
}








