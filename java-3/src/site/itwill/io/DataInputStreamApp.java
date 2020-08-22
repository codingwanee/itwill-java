package site.itwill.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataInputStream 클래스 : 파일의 내용을 원하는 자료형으로 읽기 위한 입력스트림을 생성하기 위한 클래스
		// => InputStream 인스턴스를 전달받아 확장
		DataInputStream dis=new DataInputStream(new FileInputStream("c:/data/data.txt"));

		//파일에 저장된 순서대로 값을 읽지 않으면 문제 발생 - 실행 오류
		
		//DataInputStream.readInt() : 파일 데이타를 정수로 읽어 반환하는 메소드 
		int value1=dis.readInt();
		//DataInputStream.readDouble() : 파일 데이타를 실수로 읽어 반환하는 메소드 
		double value2=dis.readDouble();
		//DataInputStream.readUTF() : 파일 데이타를 문자열로 읽어 반환하는 메소드 
		String value3=dis.readUTF();
		
		System.out.println("정수값 = "+value1);
		System.out.println("실수값 = "+value2);
		System.out.println("문자열 = "+value3);
		
		dis.close();
	}
}







