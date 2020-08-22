package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//회원정보를 전달받아 파일에 저장하는 프로그램
public class MemberSaveApp {
	public static void main(String[] args) throws IOException {
		//파일 출력스트림에 추가기능을 사용할 경우 파일 입력스트림에 입력 문제 발생
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/data/member.txt"));
		
		//writeObject() 메소드를 호출할 경우 NotSerializableException 발생
		//NotSerializableException를 객체직렬화 선언되어 있지 않은 클래스
		//인스턴스를 전달할 경우 발생되는 예외
		oos.writeObject(new Member("aaa", "홍길동", "서울시 강남구"));
		oos.writeObject(new Member("bbb", "임꺽정", "수원시 팔달구"));
		oos.writeObject(new Member("ccc", "전우치", "인천시 월미구"));
		
		oos.close();
		
		System.out.println("c:\\data\\member.txt 파일에 회원정보를 저장 하였습니다.");
	}
}







