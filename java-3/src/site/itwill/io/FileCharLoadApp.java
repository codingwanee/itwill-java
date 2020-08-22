package site.itwill.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

//파일데이타를 변형데이타로 읽어 모니터에 출력하는 프로그램
public class FileCharLoadApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]c:\\data\\char.txt 파일에 저장된 내용입니다.");

		FileReader fr=null;
		try {
			fr=new FileReader("c:/data/char.txt");
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		
		int readChar;
		
		while(true) {
			readChar=fr.read();
			if(readChar==-1) break;
			osw.write(readChar);
			osw.flush();
		}
		
		fr.close();
	}
}





