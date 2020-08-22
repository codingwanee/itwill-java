package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class ObjectOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//ObjectOutputStream 클래스 : 출력스트림을 전달받아 객체 단위로 
		//전달(출력) 가능한 기능을 제공하기 위한 클래스 - 확장
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/data/object.txt"));
			
		//ObjectOutputStream.writeObject(Object o) : 인스턴스를 출력스트림으로 전달하는 메소드
		// => 파라메타가 Object 형태이므로 모든 인스턴스 전달 가능
		//oos.writeObject("홍길동");
		oos.writeObject(new String("홍길동"));
		oos.writeObject(new Date());
		oos.writeObject(Arrays.asList("임꺽정","전우치","일지매","장길산"));
		
		oos.close();
		System.out.println("c:\\data\\object.txt 파일에 객체를 전달하여 저장 하였습니다.");
	}
}








