package oop;

public class CarApp {
	public static void main(String[] args) {
		//new �����ڷ� �����ڸ� ȣ���Ͽ� �ν��Ͻ� ����
		// => �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ����� ����
		Car tico=new Car();
		Car sonata=new Car();
		
		System.out.println("tico = "+tico);
		System.out.println("sonata = "+sonata);
		System.out.println("============================================");
		//�ν��Ͻ� �ʵ忡 ����� �⺻�� ���� => . �����ڷ� �ʵ� ����
		//�ν��Ͻ� �ʵ忡 �������� ������ ����� ��� ���������� ���� ���� ����
		// => �޼ҵ� ȣ�⿡ ���� ����� �������� ���� �߻�
		//����ȭ ����� �ʵ忡 �ν��Ͻ��� �̿��Ͽ� ������ ��� ���� �߻�
		//tico.carNumber="12��3456";
		//����ȭ ����� �ʵ尪�� �����ϱ� ���� Setter �޼ҵ� ȣ��
		tico.setCarNumber("12��3456");
		
		//System.out.println("����ȣ = "+tico.carNumber);
		//����ȭ ����� �ʵ尪�� ����ϱ� ���� Getter �޼ҵ� ȣ��
		System.out.println("����ȣ = "+tico.getCarNumber());
		//System.out.println("�õ����� = "+tico.startUp);
		System.out.println("�õ����� = "+tico.isStartUp());
		//System.out.println("����ӵ� = "+tico.currentSpeed);
		System.out.println("����ӵ� = "+tico.getCurrentSpeed());
		System.out.println("============================================");
		tico.startEngine();
		//sonata.startEngine();
		
		tico.speedUp(50);
		
		tico.speedUp(30);
		//tico.speedUp(300);
		
		tico.speedDown(40);
		//tico.speedDown(400);
		
		//tico.stop();
		tico.stopEngine();
		//System.out.println("����ӵ� = "+tico.currentSpeed);
		System.out.println("============================================");
	}
}
