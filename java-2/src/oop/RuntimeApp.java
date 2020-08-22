package oop;

public class RuntimeApp {
	public static void main(String[] args) {
		//Runtime 클래스 : JVM(Java Virtual Machine)의 정보를 저장할 목적의 클래스
		//생성자가 은닉화 선언되어 new 연산자로 호출 불가능 - 인스턴스 생성 불가능
		// => 인스턴스에 저장될 정보가 모두 동일하므로 인스턴스를 여러 개 생성할 경우 메모리 낭비
		// => 인스턴스를 여러 개 생성하지 못하도록 생성자를 은닉화 선언
		//Runtime rt=new Runtime();
		
		//Runtime.getRuntime() : Runtime 인스턴스를 반환하는 메소드
		// => 클래스 내부에서 생성된 하나의 인스턴스를 반환 : 동일한 인스턴스 제공
		Runtime rt1=Runtime.getRuntime();
		Runtime rt2=Runtime.getRuntime();
		
		System.out.println("rt1 = "+rt1);
		System.out.println("rt2 = "+rt2);
		System.out.println("============================================");
		Runtime rt=Runtime.getRuntime();
		//Runtime.totalMemory() : JVM에서 사용 가능한 전체 메모리 크기를 반환하는 메소드
		//Runtime.freeMemory() : JVM에서 사용 가능한 남은 메모리 크기를 반환하는 메소드
		System.out.println("메모리 정리 전 사용 메모리 >> "
				+(rt.totalMemory()-rt.freeMemory())+"Byte");
		
		//Runtime.gc() : 메모리 정리 프로그램인 가비지 콜렉터(Garbage Collector)를 실행하는 메소드
		//rt.gc();//인스턴스 메소드
		System.gc();//정적 메소드
		
		System.out.println("메모리 정리 후 사용 메모리 >> "
				+(rt.totalMemory()-rt.freeMemory())+"Byte");
		System.out.println("============================================");
	}
}





