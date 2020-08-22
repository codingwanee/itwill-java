package site.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		
		//순서대로 저장되며 중복 요소값 저장 발생 가능
		List<String> list=new ArrayList<String>();
		//List<String> list=new Vector<String>();

		//List.add(Element e) : 엘리먼트를 전달받아 콜렉션에 엘리먼트를 추가하는 메소드
		list.add("복숭아");
		list.add("딸기");
		list.add("포도");
		list.add("수박");

		//List.toString() : 콜렉션의 저장된 엘리먼트를 문자열로 변환하여 반환하는 메소드
		// => 요소값을 문자열로 변환하여 출력할 경우 메소드 호출 생략 가능
		//System.out.println("list.toString() = "+list.toString());
		System.out.println("list = "+list);
		System.out.println("============================================");

		list.add("딸기");
		System.out.println("list = "+list);
		System.out.println("============================================");
		
		//List.add(int index, Element e) : 첨자와 엘리먼트를 전달받아 첨자위치의 엘리먼트를 삽입하는 메소드
		list.add(2, "참외");
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.remove(Element e) : 엘리먼트를 전달받아 엘리먼트를 제거하는 메소드
		// => 엘리먼트가 여러 개인 경우 첫번째 엘리먼트만 제거
		//list.remove("딸기");
		
		//List.remove(int index) : 첨자를 전달받아 첨자위치의 엘리먼트를 제거하는 메소드
		list.remove(5);
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.set(int index, Element e) : 첨자와 엘리먼트를 전달받아 첨자위치의 엘리먼트를 변경하는 메소드
		list.set(3,"청포도");
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.size() : 저장 엘리먼트의 갯수를 반환하는 메소드
		System.out.println("list.size() = "+list.size());
		System.out.println("============================================");
		
		//List.get(int index) : 첨자를 전달받아 첨자위치의 엘리먼트를 반환하는 메소드
		// => 범위를 벗어난 첨자를 사용할 경우 IndexOutOfBoundsException 예외 발생
		System.out.println("list.get(2) = "+list.get(2));
		System.out.println("============================================");
		
		for(int i=0;i<list.size();i++) {
			System.out.println("좋아하는 과일 = "+list.get(i));
		}
		System.out.println("============================================");

		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println("좋아하는 과일 = "+iterator.next());
		}
		System.out.println("============================================");
		
		for(String temp:list) {
			System.out.println("좋아하는 과일 = "+temp);
		}
		System.out.println("============================================");

		//List.clear() : 콜렉션의 모든 엘리먼트를 제거하는 메소드
		list.clear();
		//List.isEmpty() : 콜렉션에 저장된 엘리먼트가 없는 경우 true를 반환하는 메소드  
		if(list.isEmpty()) {
			System.out.println("콜렉션에 저장된 엘리먼트가 존재하지 않습니다.");	
		}
		
		if(list.size()==0) {
			System.out.println("콜렉션에 저장된 엘리먼트가 존재하지 않습니다.");	
		}
		System.out.println("============================================");
		//Arrays.asList(Element e1,Element e2,Element e3,...)
		// => 엘리먼트들을 전달받아 List 인스턴스에 저장하여 반환하는 메소드
		List<Integer> numberList=Arrays.asList(30,50,10,20,40);
		System.out.println("numberList = "+numberList);
		System.out.println("============================================");
		
		//Collections.sort(List list) : 콜렉션을 전달받아 콜렉션의 엘리먼트를 정렬하는 메소드
		Collections.sort(numberList);
		System.out.println("numberList = "+numberList);
		System.out.println("============================================");
	}
}