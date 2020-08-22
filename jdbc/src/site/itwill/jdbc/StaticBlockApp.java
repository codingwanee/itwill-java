package site.itwill.jdbc;

public class StaticBlockApp {
	public static void main(String[] args) {
		/*
		//1.클래스로더(ClassLoader)에 의해 클래스(Class 파일)를 읽어 메모리 저장 - 자동
		// => 프로그램에서 한번만 동작
		
		//2.new 연산자로 메모리에 저장된 클래스(Clazz)의 생성자를 호출하여 인스턴스 생성
		// => 생성된 인스턴스를 참조변수에 저장하여 지속적 사용 가능하도록 설정
		StaticBlock sb1=new StaticBlock();
		StaticBlock sb2=new StaticBlock();
		
		//3.참조변수에 저장된 인스턴스로 메소드 호출 - 기능 구현
		sb1.display();
		sb1.display();
		sb2.display();
		*/
		
		//Class 클래스 : 메모리에 저장된 클래스정보(Clazz)를 저장하기 위한 클래스
		//Class.forName(String className) : 문자열로 전달된 클래스를 Class 인스턴스(Clazz)로 반환하는 메소드
		// => 클래스로더를 이용하여 클래스(Class 파일)를 메모리에 저장 - 수동
		// => 클래스에 선언된 필드, 생성자, 메소드 정보를 반환받아 사용(리플렉션 : Reflection)
		try {
			Class.forName("site.itwill.jdbc.StaticBlock");
			//인스턴스 생성 및 메소드 호출을 정적영역에서 실행
			/*
			StaticBlock sb=new StaticBlock();
			sb.display();
			*/
		} catch (ClassNotFoundException e) {
			System.out.println("[에러]클래스가 존재하지 않습니다.");
		}
	}
}












