package site.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//원본파일(c:\data\setup.exe)의 내용을 원시데이타로 읽어 타겟파일(c:\data\setup_byte.exe)에 전달하여 저장하는 프로그램
// => 모든 형태의 파일을 복사 가능한 프로그램
public class FileCopyByteApp {
	public static void main(String[] args) throws IOException {
		//원본파일의 내용을 읽기 위한 입력스트림 생성
		//BufferedInputStream 클래스 : InputStream 인스턴스를 전달받아 
		//대량의 데이타를 입력받을 수 있는 스트림으로 확장하기 위한 클래스
		BufferedInputStream bis=null;
		try {
			bis=new BufferedInputStream(new FileInputStream("c:/data/setup.exe"));
		} catch (FileNotFoundException e) {
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		//타겟파일에 내용을 전달하여 저장하기 위한 출력스트림 생성
		//BufferedOutputStream 클래스 : OutputStream 인스턴스를 전달받아 
		//대량의 데이타를 전달하기 위한 스트림으로 확장하기 위한 클래스		
		BufferedOutputStream bos=new BufferedOutputStream
				(new FileOutputStream("c:/data/setup_byte.exe"));
		
		int readByte;
		while(true) {
			readByte=bis.read();
			if(readByte==-1) break;
			bos.write(readByte);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("[결과]파일을 성공적으로 복사 하였습니다.");
	}
}






