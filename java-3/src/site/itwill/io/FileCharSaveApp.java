package site.itwill.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 변형데이타를 입력받아 파일에 저장하는 프로그램
public class FileCharSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]파일에 저장할 내용을 입력해 주세요.[종료 : Ctrl+Z]");
		
		//키보드 입력스트림으로 변형데이타를 읽기 위한 스트림으로 확장
		InputStreamReader isr=new InputStreamReader(System.in);
		
		//FileWriter 클래스 : 파일 출력스트림을 생성하기 위한 클래스 - 변형데이타
		FileWriter fw=new FileWriter("c:/data/char.txt");
	
		int readChar;
		
		while(true) {
			readChar=isr.read();
			if(readChar==-1) break;
			fw.write(readChar);
			fw.flush();
		}
		
		fw.close();
		System.out.println("[결과]c:\\data\\char.txt 파일에 입력 내용이 저장 되었습니다.");
	}
}







