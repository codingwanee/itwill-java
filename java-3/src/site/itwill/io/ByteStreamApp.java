package site.itwill.io;

import java.io.IOException;

//키보드로 원시데이타(1Byte)를 입력받아 모니터에 출력하는 프로그램
// => EOF(End Of File - 입력종료 : Ctrl+Z)를 입력하면 프로그램 종료
public class ByteStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]키보드로 값을 입력해 주세요.[종료 : Ctrl+Z]");
		
		//키보드로 입력된 원시데이타를 저장하기 위한 변수
		int readByte;
		
		while(true) {
			//System.in : Java 프로그램 개발시 기본적으로 제공받는 입력스트림
			// => 키보드로부터 원시데이타(1Byte)를 입력받을 수 있는 스트림 - InputStream 인스턴스
			//InputStream.read() : 입력스트림에서 원시데이타를 읽어 반환하는 메소드
			// => 키보드 입력스트림에 입력값이 존재하지 않을 경우 스레드 일시 중지
			// => 키보드를 눌러 입력스트림에 입력값을 전달후 엔터를 입력하면 스레드 재실행
			// => IOException 발생 : 입출력 메소드에서 발생에서 발생하는 예외(예외처리) - 스트림에 문제가 있을 경우 발생
			readByte=System.in.read();
			
			//입력종료 단축키(Ctrl+Z)를 누르면 EOF(-1)를 반환 - 반복문 종료 
			if(readByte==-1) break;
			
			//System.out : Java 프로그램 개발시 기본적으로 제공받는 출력스트림
			// => 모니터(콘솔:Console)로 원시데이타(1Byte)를 전달(출력) 할 수 있는 스트림 - PrintStream 인스턴스
			// => PrintStream 클래스는 OutputStream 클래스를 상속받은 자식클래스
			//OutputStream.write(int b) : 원시데이타를 출력스트림으로 전달하는 메소드 
			System.out.write(readByte);
		}
		
		System.out.println("[메세지]프로그램을 종료합니다.");
	}
}





