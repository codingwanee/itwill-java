package association;

public class CarApp {
	public static void main(String[] args) {
		Engine ticoEngine=new Engine();
		ticoEngine.setFuelType("�ֹ���");
		ticoEngine.setDisplacement(1200);
		
		Car tico=new Car();
		//tico.carDisplay();
		
		tico.setModelName("Ƽ��");
		tico.setProductionYear(2018);
		tico.setCarEngine(ticoEngine);
		
		tico.carDisplay();
		System.out.println("============================================");
		/*
		Engine sonataEngine=new Engine("����ֹ���", 2000);
		Car soanta=new Car("�Ÿ", 2019, sonataEngine);
		*/
		Car sonata=new Car("�Ÿ", 2019, new Engine("����ֹ���", 2000));
		sonata.carDisplay();
		System.out.println("============================================");
		System.out.println(tico.getModelName()+"�� �������� >> ");
		ticoEngine.engineDisplay();
		System.out.println("============================================");
		System.out.println(sonata.getModelName()+"�� �������� >> ");
		sonata.getCarEngine().engineDisplay();
		System.out.println("============================================");
	}
}








