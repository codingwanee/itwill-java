package oop;

public class Car {
	//�ʵ�(Field) : �ټ��� �޼ҵ忡�� ����ϰ��� �ϴ� ������ ����
	// => �ν��Ͻ� �Ҹ� ������ ���� ���� - ���α׷� ���� �� �ν��Ͻ� �ڵ� �Ҹ�
	private String carNumber;//����ȣ
	private boolean startUp;//�õ����� - false : Off, true : On 
	private int currentSpeed;//����ӵ�
	
	//������(Constructor) : �ν��Ͻ� ���� ����� ����
	// => �����ڸ� �������� ���� ��� �⺻ �����ڰ� ����Ǿ� �ִ� ������ ó��
	
	//�޼ҵ�(Method) : ��ɵ��� �̿��Ͽ� ����� ���� - �ʵ尪 ���� �Ǵ� ���
	//�õ��� �Ѵ� ����� �޼ҵ�
	public void startEngine() {
		startUp=true;
		System.out.println("["+carNumber+"]�� �õ��� �׽��ϴ�.");
	}
	
	//�õ��� ���� ����� �޼ҵ�
	public void stopEngine() {
		if(!startUp) {//�õ��� ���� �ִ� ���
			System.out.println("["+carNumber+"]�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		if(currentSpeed!=0) {
			/*
			currentSpeed=0;
			System.out.println("["+carNumber+"]�� �̵��� ���� �Ͽ����ϴ�.");
			*/
			
			//�޼ҵ忡�� ���� ��ɿ� ���� ����� �ٸ� �޼ҵ� ȣ�� ����
			stop();
		}
		
		startUp=false;
		System.out.println("["+carNumber+"]�� �õ��� �����ϴ�.");
	}
	
	//�ӵ��� �����ϴ� ����� �޼ҵ�
	public void speedUp(int speed) {
		//�ʵ尪�� ���� ��ȿ�� �˻� - �޼ҵ� ȣ�� ����
		if(!startUp) {//�õ��� ���� �ִ� ���
			System.out.println("["+carNumber+"]�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		//�Ķ���Ͱ��� ���� ��ȿ�� �˻�
		if(speed+currentSpeed>150) {
			/*
			System.out.println("["+carNumber+"]�� �ְ� �ӵ��� ���� �� �����ϴ�.");
			return;
			*/
			
			speed=150-currentSpeed;
		}
		
		currentSpeed+=speed;
		System.out.println("["+carNumber+"]�� �ӵ� ���� >> "
				+speed+"Km/h - ����ӵ� : "+currentSpeed+"Km/h");
	}
	
	//�ӵ��� �����ϴ� ����� �޼ҵ�
	public void speedDown(int speed) {
		if(!startUp) {//�õ��� ���� �ִ� ���
			System.out.println("["+carNumber+"]�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		if(speed>currentSpeed) {
			speed=currentSpeed;
		}
		
		currentSpeed-=speed;
		System.out.println("["+carNumber+"]�� �ӵ� ���� >> "
				+speed+"Km/h - ����ӵ� : "+currentSpeed+"Km/h");
	}
	
	//���ߴ� ����� �޼ҵ�
	public void stop() {
		if(!startUp) {//�õ��� ���� �ִ� ���
			System.out.println("["+carNumber+"]�� �õ��� ���� �ֽ��ϴ�.");
			return;
		}
		
		currentSpeed=0;
		System.out.println("["+carNumber+"]�� �̵��� ���� �Ͽ����ϴ�.");
	}
	
	//Getter & Setter �޼ҵ�
	public String getCarNumber() {
		return carNumber;
	}
	
	public void setCarNumber(String carNumber) {
		//�Ķ���Ͱ��� ���� ��ȿ�� �˻�
		this.carNumber=carNumber;
	}

	public boolean isStartUp() {
		return startUp;
	}

	public void setStartUp(boolean startUp) {
		this.startUp = startUp;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
}










