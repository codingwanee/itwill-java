package oop;

public class SingletonTestApp {
	public static void main(String[] args) {
		//은닉화 선언된 생성자를 이용하여 인스턴스 생성 불가
		/*
		SingletonTest st1=new SingletonTest();
		SingletonTest st2=new SingletonTest();
		*/
		
		//인스턴스 정보를 반환하는 정적 메소드 호출하여 인스턴스 제공받아 사용
		SingletonTest st1=SingletonTest.getInstance();
		SingletonTest st2=SingletonTest.getInstance();
		System.out.println("============================================");
		System.out.println("st1 = "+st1);
		System.out.println("st2 = "+st2);
		System.out.println("============================================");
		st1.insert();
		st1.update();
		st1.delete();
		st1.select();
		System.out.println("============================================");
		st2.insert();
		st2.update();
		st2.delete();
		st2.select();
		System.out.println("============================================");
		//싱글톤 클래스는 참조변수에 인스턴스 정보를 저장하지 않고 사용하는 것을 권장
		SingletonTest.getInstance().insert();
		SingletonTest.getInstance().update();
		SingletonTest.getInstance().delete();
		SingletonTest.getInstance().select();
		System.out.println("============================================");
	}
}





