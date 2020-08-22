package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		//제네릭 타입을 사용하지 않은 경우 - 모든 인스턴스가 Object 타입으로 저장
		//HashSet set=new HashSet();
		
		//제네릭 타입을 사용한 경우 - 제넥릭 타입 대신 전달된 클래스의 인스턴스만 저장
		//HashSet<String> set=new HashSet<String>();
		
		//참조변수는 부모 참조형을 이용하여 생성하는 것을 권장 - 유지보수의 효율성 증가
		Set<String> set=new HashSet<String>();
		
		//Set.add(Element e) : 엘리먼트(인스턴스)를 전달하여 콜렉션에 저장하는 메소드
		// => 저장되는 순서가 없으며 중복된 정보의 인스턴스 저장 불가
		set.add("복숭아");
		//set.add(100);
		set.add("딸기");
		set.add("포도");
		set.add("참외");
		
		//Set.toString() : 콜렉션의 엘리먼트를 문자열로 변환하여 반환하는 메소드
		// => 엘리먼트를 문자열로 변환하여 출력할 경우 메소드 호출 생략 가능
		//System.out.println("set.toString() = "+set.toString());
		System.out.println("set = "+set);
		System.out.println("============================================");
		set.add("딸기");//동일 정보의 인스턴스가 존재할 경우 저장 불가
		System.out.println("set = "+set);
		System.out.println("============================================");
		//Set.remove(Element e) : 엘리먼트을 전달받아 콜렉션에서 제거하는 메소드
		set.remove("참외");
		System.out.println("set = "+set);
		System.out.println("============================================");
		//Set.size() : 콜렉션에 저장된 엘리먼트의 갯수를 반환하는 메소드
		System.out.println("set.size() = "+set.size());
		System.out.println("============================================");
		
		//Set.iterator() : 콜렉션의 엘리먼트들을 일괄처리 할 수 있는 Iterator 인스턴스를 반환하는 메소드
		//Iterator : 콜렉션에 저장된 엘리먼트에 차례대로 접근할 수 있는 인스턴스 >> 반복지시자 
		Iterator<String> iterator=set.iterator();
		
		//Iterator.hasNext() : Iterator 인스턴스로 엘리먼트에 접근할 수 있는 경우 true를 반환하는 메소드
		while(iterator.hasNext()) {
			//Iterator.next() : Iterator 인스턴스로 엘리먼트를 반환하는 메소드
			// => Iterator 인스턴스는 자동으로 다음 엘리먼트로 이동
			System.out.println("좋아하는 과일 = "+iterator.next());
		}
		System.out.println("============================================");
		//Iterator 인스턴스를 내부적으로 사용하는 for 명령을 사용하여 일괄처리
		for(String temp:set) {
			System.out.println("좋아하는 과일 = "+temp);
		}
		System.out.println("============================================");
		//Set.clear() : 콜렉션에 저장된 모든 엘리먼트를 제거하는 메소드
		set.clear();

		//Set.isEmrty() : 콜렉션에 저장된 엘리먼트가 없는 경우 true를 반환하는 메소드
		if(set.isEmpty()) {
			System.out.println("Set 콜렉션에 저장된 요소가 하나도 없습니다.");
		} else {
			System.out.println("Set 콜렉션에 저장된 요소가 있습니다.");
		}
		System.out.println("============================================");
	} 
}
