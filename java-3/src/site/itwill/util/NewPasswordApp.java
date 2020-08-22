package site.itwill.util;

import java.util.Random;
import java.util.UUID;

//새로운 비밀번호를 생성하여 반환받아 출력하는 프로그램
public class NewPasswordApp {
	//새로운 비밀번호를 생성하여 반환하는 메소드
	public static String newPasswordOne() {
		Random random=new Random();
		
		String str="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		String newPassword="";
		for(int i=1;i<=10;i++) {
			newPassword+=str.charAt(random.nextInt(str.length()));
		}
		
		return newPassword;
	}
	
	public static String newPasswordTwo() {
		//UUID 클래스 : 범용적인 고유값(UUID)에 관련된 기능을 제공하는 클래스
		//UUID.randomUUID() : 범용적인 고유값을 생성하여 UUID 인스턴스에 저장하여 반환하는 메소드
		// => UUID 인스턴스의 범용적인 고유값 : 36개의 숫자와 알파벳 소문자, - 문자(4개)로 구성
		//UUID.toString() : 범용적인 고유값을 String 인스턴스로 변환하여 반환하는 메소드
		return UUID.randomUUID().toString()
				.replace("-","").substring(0, 10).toUpperCase();
	}
	
	public static void main(String[] args) {
		System.out.println("임시비밀번호-1 = "+newPasswordOne());
		System.out.println("임시비밀번호-2 = "+newPasswordTwo());
	}
}




