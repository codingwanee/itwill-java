package oop;

public class Car {
	//필드(Field) : 다수의 메소드에서 사용하고자 하는 정보를 제공
	// => 인스턴스 소멸 전까지 정보 유지 - 프로그램 종료 후 인스턴스 자동 소멸
	private String carNumber;//차번호
	private boolean startUp;//시동유무 - false : Off, true : On 
	private int currentSpeed;//현재속도
	
	//생성자(Constructor) : 인스턴스 생성 기능을 제공
	// => 생성자를 선언하지 않을 경우 기본 생성자가 선언되어 있는 것으로 처리
	
	//메소드(Method) : 명령들을 이용하여 기능을 제공 - 필드값 변경 또는 사용
	//시동을 켜는 기능의 메소드
	public void startEngine() {
		startUp=true;
		System.out.println("["+carNumber+"]의 시동을 켰습니다.");
	}
	
	//시동을 끄는 기능의 메소드
	public void stopEngine() {
		if(!startUp) {//시동이 꺼져 있는 경우
			System.out.println("["+carNumber+"]의 시동이 꺼져 있습니다.");
			return;
		}
		
		if(currentSpeed!=0) {
			/*
			currentSpeed=0;
			System.out.println("["+carNumber+"]의 이동을 종료 하였습니다.");
			*/
			
			//메소드에서 동일 명령에 대한 기능의 다른 메소드 호출 가능
			stop();
		}
		
		startUp=false;
		System.out.println("["+carNumber+"]의 시동을 껐습니다.");
	}
	
	//속도를 증가하는 기능의 메소드
	public void speedUp(int speed) {
		//필드값에 대한 유효성 검사 - 메소드 호출 순서
		if(!startUp) {//시동이 꺼져 있는 경우
			System.out.println("["+carNumber+"]의 시동이 꺼져 있습니다.");
			return;
		}
		
		//파라메터값에 대한 유효성 검사
		if(speed+currentSpeed>150) {
			/*
			System.out.println("["+carNumber+"]의 최고 속도를 넘을 수 없습니다.");
			return;
			*/
			
			speed=150-currentSpeed;
		}
		
		currentSpeed+=speed;
		System.out.println("["+carNumber+"]의 속도 증가 >> "
				+speed+"Km/h - 현재속도 : "+currentSpeed+"Km/h");
	}
	
	//속도를 감소하는 기능의 메소드
	public void speedDown(int speed) {
		if(!startUp) {//시동이 꺼져 있는 경우
			System.out.println("["+carNumber+"]의 시동이 꺼져 있습니다.");
			return;
		}
		
		if(speed>currentSpeed) {
			speed=currentSpeed;
		}
		
		currentSpeed-=speed;
		System.out.println("["+carNumber+"]의 속도 감소 >> "
				+speed+"Km/h - 현재속도 : "+currentSpeed+"Km/h");
	}
	
	//멈추는 기능의 메소드
	public void stop() {
		if(!startUp) {//시동이 꺼져 있는 경우
			System.out.println("["+carNumber+"]의 시동이 꺼져 있습니다.");
			return;
		}
		
		currentSpeed=0;
		System.out.println("["+carNumber+"]의 이동을 종료 하였습니다.");
	}
	
	//Getter & Setter 메소드
	public String getCarNumber() {
		return carNumber;
	}
	
	public void setCarNumber(String carNumber) {
		//파라메터값에 대한 유효성 검사
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










