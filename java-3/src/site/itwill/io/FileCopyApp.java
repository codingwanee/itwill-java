package site.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 원본파일명과 타겟파일명을 입력받아 복사하는 프로그램 작성
//ex) 원본파일명 >> c:\data\setup.exe
//    타겟파일명 >> c:\data\setup_copy.exe
//    [결과]파일을 성공적으로 복사 하였습니다.
// => 원본파일이 존재하지 않을 경우 에러메세지 출력 후 프로그램 종료
// => 타겟파일이 존재할 경우 덮어씌우기 유무를 입력받아 처리
public class FileCopyApp {
	public static void main(String[] args) throws IOException {
		//키보드 입력스트림을 전달하여 문자열 입력스트림으로 확장하여 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원본파일명 >> ");
		//키보드로 문자열을 입력받아 File 인스턴스 생성
		File source=new File(br.readLine());
		
		if(!source.exists()) {//파일경로의 파일이 존재하지 않을 경우
			System.out.println("[에러]원본파일이 존재하지 않습니다.");
			System.exit(0);
		}
		
		System.out.print("타겟파일명 >> ");
		File targer=new File(br.readLine());
		
		if(targer.exists()) {//파일경로의 파일이 존재할 경우
			while(true) {
				System.out.print("기존 파일이 존재합니다.덮어씌우겠습니까?[Y/N] >> ");
				String answer=br.readLine();
				if(answer.equalsIgnoreCase("N")) {
					System.out.println("[메세지]파일 복사를 취소 하였습니다.");
					System.exit(0);
				}
				if(answer.equalsIgnoreCase("Y")) break;
				System.out.println("[에러]Y 문자 또는 N 문자만 입력 가능합니다.");
			}
		}
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(targer));
		
		while(true) {
			int readByte=bis.read();
			if(readByte==-1) break;
			bos.write(readByte);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("[결과]파일을 성공적으로 복사 하였습니다.");
	}
}