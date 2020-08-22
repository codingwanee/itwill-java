package site.itwill.thread;

//Thread 클래스를 상속받는 자식클래스 작성 - 스레드 클래스 
public class MultiThreadOne extends Thread {
	//개발자가 생성한 스레드로 실행하기 위한 명령을 작성하는 메소드 
	@Override
	public void run() {
		/*
		System.out.println("MultiThreadOne 클래스의 run() 메소드 >> ["
				+Thread.currentThread().getName()+"]에 의해 명령 실행");
		*/
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
