package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;

//키보드로 원시데이타를 입력받아 파일에 저장하는 프로그램
public class FileByteSaveApp {
	public static void main(String[] args) throws IOException {
		System.out.println("[메세지]파일에 저장할 내용을 입력해 주세요.[종료 : Ctrl+Z]");
		
		//FileOutputStream 클래스 : 파일 출력스트림을 생성하기 위한 클래스 - 원시데이타
		//FileOutputStream(String filePath) : 전달된 파일경로에 파일 출력스트림을 생성하는 생성자
		// => 파일경로의 파일이 존재하지 않을 경우 FileNotFoundException 발생
		// => FileNotFoundException 클래스는 IOException 클래스의 자식클래스
		// => 파일경로의 파일이 존재하지 않을 경우 파일 생성되며 파일이 존재할 경우 기존 파일 덮어씌우기 실행
		//FileOutputStream fos=new FileOutputStream("c:/data/byte.txt");

		//FileOutputStream(String filePath, boolean append) : 전달된 파일경로에 파일 출력스트림을 생성하는 생성자
		// => append 파라메터에 true가 전달될 경우 기존 내용 뒤에 새로운 내용 추가
		FileOutputStream fos=new FileOutputStream("c:/data/byte.txt",true);
		
		int readByte;
		
		while(true) {
			readByte=System.in.read();
			if(readByte==-1) break;
			//파일 출력스트림에 원시데이타를 전달 >> 저장
			fos.write(readByte);
		}
		
		//FileOutputStream.close() : 파일 출력스트림을 제거하는 메소드
		// => 파일에는 입력스트림과 출력스트림이 하나씩만 존재 가능
		fos.close();
		
		System.out.println("[결과]c:\\data\\byte.txt 파일에 입력 내용이 저장 되었습니다.");
	}
}







