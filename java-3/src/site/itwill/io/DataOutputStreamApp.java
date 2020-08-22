package site.itwill.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//DataOutputStream 클래스 : 원하는 자료형의 데이타로 전달하기 위한 출력스트림을 생성하기 위한 클래스
		// => OutputStream 인스턴스를 전달받아 확장
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("c:/data/data.txt"));
		
		//DataOutputStream.writeInt(int value) : 정수값을 출력스트림으로 전달하는 메소드
		dos.writeInt(100);
		//DataOutputStream.writeDouble(double value) : 실수값을 출력스트림으로 전달하는 메소드
		dos.writeDouble(12.34);
		//DataOutputStream.writeUTF(String str) : 문자열을 출력스트림으로 전달하는 메소드
		dos.writeUTF("홍길동");
		
		dos.close();
		System.out.println("c:\\data\\data.txt 파일에 전달값을 저장 하였습니다.");
	}
}





