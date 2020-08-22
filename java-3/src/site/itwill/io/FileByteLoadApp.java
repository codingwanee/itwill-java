package site.itwill.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//파일데이타를 원시데이타로 읽어 모니터에 출력하는 프로그램
public class FileByteLoadApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]c:\\data\\byte.txt 파일에 저장된 내용입니다.");

		//FileInputStream : 파일 입력스트림을 생성하기 위한 클래스
		FileInputStream fis=null;
		//FileInputStream(String filePath) : 전달된 파일경로에 파일 입력스트림을 생성하는 생성자
		// => 파일경로의 파일이 존재하지 않을 경우 FileNotFoundException 발생
		// => FileNotFoundException 발생될 경우 예외처리로 파일 처리 미실행
		try {
			fis=new FileInputStream("c:/data/byte.txt");
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		int readByte;
		
		while(true) {
			//파일 입력스트림에서 원시데이타를 반환받아 저장 - 불러오기
			readByte=fis.read();
			if(readByte==-1) break;
			System.out.write(readByte);
		}
		
		fis.close();
	}
}









