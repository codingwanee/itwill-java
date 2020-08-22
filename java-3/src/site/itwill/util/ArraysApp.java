package site.itwill.util;

import java.util.Arrays;

//Arrays 클래스 : 배열의 요소들을 처리하기 위한 기능을 제공하는 클래스
public class ArraysApp {
	public static void main(String[] args) {
		String[] fruits={"복숭아","포도","참외","딸기","수박"};
		
		//Arrays.toString(Object[] o) : 파라메터로 전달된 배열의 요소값들을 
		//문자열로 변환하여 반환하는 메소드
		System.out.println("정렬 전 >> "+Arrays.toString(fruits));

		//Arrays.sort(Object[] o) : 파라메터로 전달된 배열의 요소값들을 정렬하여 재배치하는 메소드
		Arrays.sort(fruits);

		System.out.println("정렬 후 >> "+Arrays.toString(fruits));
	}
}
