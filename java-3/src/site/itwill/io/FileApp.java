package site.itwill.io;

import java.io.File;
import java.io.IOException;

//File 클래스 : 파일정보를 저장하기 위한 클래스 - 파일 제어 기능 제공
// => 디렉토리도 파일로 인식되어 처리
public class FileApp {
	public static void main(String[] args) throws IOException {
		//File(String filePath) : 파일경로를 전달받아 File 인스턴스를 생성하기 위한 생성자
		// => 파일경로 : 파일위치와 파일명을 포함하는 표현방법 - 절대경로 또는 상대경로
		//Windows 운영체제는 드라이브(C:)에 파일 존재 - 파일구분자는 \ 사용(Java에서는 \\로 사용)
		//Linux 운영체제 또는 Mac 운영체제는 마운트장치(/)에 파일 존재 - 파일구분자는 / 사용  
		File fileOne=new File("c:\\data");//파일을 절대경로로 표현
		
		//File.exists() : File 인스턴스에 저장된 파일경로의 파일이 존재할 경우 true를 반환하는 메소드
		if(fileOne.exists()) {
			System.out.println("c:\\data 디렉토리가 이미 존재합니다.");
		} else {
			//File.mkdir() : File 인스턴스에 저장된 파일경로의 디렉토리를 생성하는 메소드
			fileOne.mkdir();
			System.out.println("c:\\data 디렉토리를 생성 하였습니다.");
		}
		System.out.println("============================================");
		//File fileTwo=new File("c:\\data\\abc.txt");
		//파일구분자를 \\ 구분자로 사용하는 것보다 / 구분자를 사용하는 것을 권장
		File fileTwo=new File("c:/data/abc.txt");
		
		if(fileTwo.exists()) {
			System.out.println("c:\\data\\abc.txt 파일이 이미 존재합니다.");
		} else {
			//File.createNewFile() : File 인스턴스에 저장된 파일경로의 파일을 생성하는 메소드
			// => IOException 발생 - 예외처리
			fileTwo.createNewFile();
			System.out.println("c:\\data\\abc.txt 파일을 생성 하였습니다.");
		}
		System.out.println("============================================");
		//File fileThree=new File("c:/data/xyz.txt");
		
		//File(String parent,String child) : 파일경로를 부모(디렉토리)와 자식(파일)으로 전달하여 File 인스턴스를 생성하는 생성자
		//File fileThree=new File("c:/data","xyz.txt");

		//File(File parent,String child) : 파일경로를 부모(디렉토리)와 자식(파일)으로 전달하여 File 인스턴스를 생성하는 생성자
		File fileThree=new File(fileOne,"xyz.txt");

		if(fileThree.exists()) {
			//File.delete() : File 인스턴스에 저장된 파일경로의 파일을 삭제하는 메소드
			fileThree.delete();
			System.out.println("c:\\data\\xyz.txt 파일을 삭제 하였습니다.");
		} else {
			System.out.println("c:\\data\\xyz.txt 파일이 존재하지 않습니다.");
		}
		System.out.println("============================================");
		
		//절대경로 표현방법 : 최상위 디렉토리(C: 또는 /)로부터 파일경로 표현
		//File fileFour=new File("c:/java/workspace/java-3/src");
		
		//상대경로 표현방법 : 현재 작업디렉토리로부터 파일경로 표현 
		// => 이클립스의 현재 작업디렉토리 : 프로젝트 디렉토리
		File fileFour=new File("src");

		if(fileFour.exists()) {
			//File.toString() : File 인스턴스에 저장된 파일경로를 문자열로 반환하는 메소드
			//System.out.println("파일경로 = "+fileFour.toString());
			//System.out.println("파일경로 = "+fileFour);
			
			//File.getAbsolutePath() : File 인스턴스에 저장된 파일경로를 절대경로 표현방법의 문자열로 반환하는 메소드
			System.out.println("파일경로 = "+fileFour.getAbsolutePath());
		} else {
			System.out.println("파일경로의 파일(디렉토리)이 존재하지 않습니다.");
		}
		
		System.out.println("============================================");

		File fileFive=new File("c:/");
		
		//File.isDirectory() : File 인스턴스에 저장된 파일경로의 파일이 디렉토리인 경우 true 반환
		if(fileFive.isDirectory()) {
			//File.listFiles() : File 인스턴스에 저장된 파일경로의 하위 파일 목록을 File 배열로 반환하는 메소드
			File[] subFile=fileFive.listFiles();
			
			System.out.println(fileFive+" 디렉토리의 하위목록 >>");
			for(File file:subFile) {
				//File.isFile() : File 인스턴스에 저장된 파일경로의 파일이 일반파일인 경우 true 반환
				if(file.isFile()) {
					System.out.println("일반파일 = "+file);
				} else {
					System.out.println("디렉토리 = "+file);
				}
			}
		}
		System.out.println("============================================");
	}
}







