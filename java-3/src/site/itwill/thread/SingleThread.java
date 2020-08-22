package site.itwill.thread;

public class SingleThread {
	public void display() {
		/*
		System.out.println("SingleThread 클래스의 display() 메소드 시작");
		System.out.println("SingleThread 클래스의 display() 메소드의 명령 실행");
		System.out.println("SingleThread 클래스의 display() 메소드 종료");
		*/
		
		/*
		System.out.println("SingleThread 클래스의 display() 메소드 >> ["
				+Thread.currentThread().getName()+"]에 의해 명령 실행");
		*/
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}