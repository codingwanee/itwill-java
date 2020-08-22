package site.itwill.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//원본파일(c:\data\setup.exe)의 내용을 변형데이타로 읽어 타겟파일(c:\data\setup_char.exe)에 전달하여 저장하는 프로그램
// => 텍스트 파일만 복사 가능한 프로그램
public class FileCopyCharApp {
	public static void main(String[] args) throws IOException {
		//BufferedReader 클래스 : Reader 인스턴스를 전달받아 대량의 데이타를
		//입력받을 수 있는 스트림으로 확장하기 위한 클래스
		BufferedReader br=null;
		try {
			br=new BufferedReader(new FileReader("c:/data/setup.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
			System.exit(0);
		}

		//BufferedWriter 클래스 : Writer 인스턴스를 전달받아 대량의 데이타를 전달하기 위한 스트림으로 확장하기 위한 클래스		
		BufferedWriter bw=new BufferedWriter(new FileWriter("c:/data/setup_char.exe"));
		
		int readChar;
		while(true) {
			readChar=br.read();
			if(readChar==-1) break;
			bw.write(readChar);
		}
		
		br.close();
		bw.close();
		
		System.out.println("[결과]파일을 성공적으로 복사 하였습니다.");
	}	
}






