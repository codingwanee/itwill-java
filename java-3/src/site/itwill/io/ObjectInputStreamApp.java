package site.itwill.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectInputStream 클래스 : 입력스트림을 전달받아 객체 단위로
		//입력 가능한 기능을 제공하기 위한 클래스 - 확장
		ObjectInputStream ois=new ObjectInputStream
				(new FileInputStream("c:/data/object.txt"));
		
		//ObjectInputStream.readObject() : 입력스트림에서 객체를 읽어 반환하는 메소드
		// => 반환되는 인스턴스 타입이 Object이므로 반드시 명시적 객체 형변환 후 사용
		// => ClassNotFoundException 발생 - 예외처리
		String string=(String)ois.readObject();
		Date date=(Date)ois.readObject();
		@SuppressWarnings("unchecked")
		List<String> list=(List<String>)ois.readObject();
		
		System.out.println("string = "+string);
		System.out.println("date = "+date);
		System.out.println("list = "+list);
		
		ois.close();
	}
}







