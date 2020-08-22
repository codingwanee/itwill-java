package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh=new WolfHuman();
		
		wh.speak();
		wh.walk();
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		System.out.println("============================================");
		//부모클래스로 참조변수를 생성하여 인스턴스를 저장한 경우 부모클래스의 메소드 참조 
		Human human=new WolfHuman();
		
		human.speak();
		human.walk();
		
		System.out.println("============================================");
		//명시적 객체 형변환을 이용하여 자식클래스의 메소드 참조
		((WolfHuman)human).change();
		System.out.println("============================================");
		//자식클래스가 동일한 경우 부모클래스의 참조변수 자료형을 부모
		//인터페이스 자료형으로 명시적 객체 형변환하여 저장 가능
		Wolf wolf=(Wolf)human;
		
		//묵시적 객체 형변환에 의해 자식클래스의 메소드가 자동 참조
		wolf.cryLoudly();
		wolf.fastWalk();
		System.out.println("============================================");
	}
}