package site.itwill.jdbc;

public class StaticBlock {
	//정적영역(Static Block) : 클래스로더에 의해 클래스가 메모리에 
	//저장된 후 실행되는 명령을 작성하는 영역 -한번만 실행
	static {
		System.out.println("StaticBlock 클래스의 정적영역 명령 실행");
		StaticBlock sb=new StaticBlock();
		sb.display();
	}
	
	public StaticBlock() {
		System.out.println("StaticBlock 클래스의 기본 생성자 호출");
	}
	
	public void display() {
		System.out.println("StaticBlock 클래스의 display() 메소드 호출");
	}
}
