package realization;

//인터페이스가 인터페이스를 상속받을 경우 extends 키워드 사용
// => 인터페이스는 다중상속 가능
public interface BoatCar extends Car,Boat {
	void floating();
}
