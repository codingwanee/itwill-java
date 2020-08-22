package site.itwill.thread;

public class SingleThreadApp {
	public static void main(String[] args) throws InterruptedException {
		/*
		System.out.println("SingleThreadApp 클래스의 main() 메소드 시작");
		System.out.println("SingleThreadApp 클래스의 main() 메소드의 명령 실행-1");
		SingleThread st=new SingleThread();
		st.display();
		System.out.println("SingleThreadApp 클래스의 main() 메소드의 명령 실행-2");
		System.out.println("SingleThreadApp 클래스의 main() 메소드 종료");
		*/
		
		//Thread.currentThread() : 현재 명령을 실행하기 위한 Thread 인스턴스를 반환하는 메소드
		//Thread.getName() : Thread 인스턴스에 저장된 스레드이름을 반환하는 메소드
		/*
		System.out.println("SingleThreadApp 클래스의 main() 메소드 >> ["
				+Thread.currentThread().getName()+"]에 의해 명령 실행");
		
		new SingleThread().display();
		*/
		
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			//Thread.sleep(long ms) : 스레드를 원하는 시간(ms)만큼 중지되도록 처리하는 메소드
			// => InterruptedException 예외 발생 - 예외처리
			Thread.sleep(100);
		}
		
		new SingleThread().display();
	}
}




