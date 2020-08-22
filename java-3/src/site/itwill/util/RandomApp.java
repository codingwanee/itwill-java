package site.itwill.util;

import java.util.Random;

//Random 클래스 : 난수 발생 관련 기능을 제공하는 클래스
public class RandomApp {
	public static void main(String[] args) {
		//Random(int seed) : 파라메터에 시드값을 전달하여 인스턴스 생성하는 생성자
		// => Seed : 프로그램 실행 시 다른 난수가 발생되도록 설정하는 long 타입의 정수값
		//System.currentTimeMillis() : 현재 시스템의 타임스템프값을 반환하는 메소드
		// => Timestamp : 1970년 1월 1일 기준으로 밀리초당 1씩 증가되는 long 타입의 정수값
		//Random random=new Random(System.currentTimeMillis());
		
		//Random 클래스의 기본 생성자는 시드값을 자동으로 설정 >> System.currentTimeMillis() 메소드 호출
		Random random=new Random();
		
		for(int i=1;i<=5;i++) {
			//Random.nextInt(int bound) : 0~bound-1 범위의 정수난수를 발생하여 반환하는 메소드
			System.out.println(i+"번째 난수 >> "+random.nextInt(100));//0~99
		}
	}
}



