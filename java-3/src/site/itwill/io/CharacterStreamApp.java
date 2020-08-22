package site.itwill.io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

//키보드로 변형데이타(2Byte)를 입력받아 모니터에 출력하는 프로그램
// => EOF(End Of File - 입력종료 : Ctrl+Z)를 입력하면 프로그램 종료
public class CharacterStreamApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]키보드로 값을 입력해 주세요.[종료 : Ctrl+Z]");

		//InputStreamReader 클래스 : InputStream 인스턴스를 전달받아 변형데이타로 읽기 위한 클래스 
		// => InputStreamReader(InputStream in[, String charset]) 생성자
		//System.in 인스턴스를 전달받아 키보드로부터 변형데이타를 입력받을 수 있는 입력스트림 생성 - 확장(포함관계)
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//OutputStreamWriter 클래스 : OutputStream 인스턴스를 전달받아 변형데이타를 출력(전달) 위한 클래스
		// => OutputStreamWriter(OutputStream out) 생성자
		//System.out 인스턴스를 전달받아 모니터에 변경데이타를 전달할 수 있는 출력스트림 생성 - 확장(포함관계)
		//OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		//PrintWriter 클래스는 OutputStreamWriter 클래스를 상속받은 자식클래스
		PrintWriter pw=new PrintWriter(System.out);
		
		//키보드로 입력된 변형데이타를 저장하기 위한 변수
		int readChar;
		
		while(true) {
			//입력스트림에서 변형데이타를 반환받아 저장
			readChar=isr.read();
			
			if(readChar==-1) break;
			
			//출력스트림으로 변형데이타를 전달하여 출력
			// => CharacterStream 관련 출력클래스는 변형데이타 모아서 한번에 출력스트림에게 전달
			//osw.write(readChar);
			pw.write(readChar);
			
			//OutputStreamWriter.flush() : 버퍼(임시메모리)에 저장된 변형데이타를 출력스트림으로 전달하는 메소드
			//osw.flush();
			pw.flush();
		}
		
		System.out.println("[메세지]프로그램을 종료합니다.");
	}
}



