package site.itwill.thread;

public class MultiThreadApp {
	public static void main(String[] args) throws InterruptedException {
		//Thread 클래스를 상속받은 자식클래스를 이용하여 인스턴스 생성
		// => 자식클래스로 인스턴스를 생성할 경우 부모클래스의 인스턴스(Thread 인스턴스)가 먼저 생성
		MultiThreadOne thread1=new MultiThreadOne();
		//자식클래스로 생성된 인스턴스로 start() 메소드 호출
		// => 스레드 인스턴스를 이용하여 스레드 생성 >> run() 메소드의 명령 실행
		// => 생성된 스레드는 run() 메소드가 종료되면 자동 소멸
		thread1.start();
		
		new MultiThreadOne().start();
		
		//run() 메소드가 오버라이드 선언된 자식클래스를 이용하여 인스턴스 생성
		MultiThreadTwo mtt=new MultiThreadTwo();
		//Thread 클래스로 자식인스턴스를 전달받아 Thread 인스턴스 생성
		Thread t2=new Thread(mtt);
		t2.start();

		new Thread(new MultiThreadTwo()).start();
		
		/*
		System.out.println("MultiThreadApp 클래스의 main() 메소드 >> ["
				+Thread.currentThread().getName()+"]에 의해 명령 실행");
		*/
		
		for(int i=0;i<=9;i++) {
			System.out.print(i);
			Thread.sleep(500);
		}
	}
}
