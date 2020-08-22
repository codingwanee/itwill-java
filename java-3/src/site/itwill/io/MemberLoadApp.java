package site.itwill.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//파일에 저장된 회원정보를 전달받아 출력하는 프로그램
public class MemberLoadApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("c:/data/member.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("[에러]데이타 파일을 찾을 수 없습니다.");
			System.exit(0);
		}
		
		System.out.println("<<회원정보>>");
		while(true) {
			try {
				//readObject() 메소드 호출시 EOF를 읽은 경우 EOFException 발생 - 예외 처리
				Member member=(Member)ois.readObject();
				System.out.println(member);
			} catch (EOFException e) {
				break;
			}
		}
		ois.close();
	}
}




