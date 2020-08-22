package site.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {
		//Map 인터페이스를 상속받은 클래스는 제네릭 타입을 2개 사용하여 선언
		// => 키와 값에 제네릭 타입을 따로 설정하여 사용
		// => 엔트리의 키는 Set 인터페이스를 이용하여 구현되므로 순서가 없으며 미중복 
		//HashMap<String, String> map=new HashMap<String, String>();
		Map<String, String> map=new HashMap<String, String>();
		
		//Map.put(String mapKey, Object mapValue) : 키와 값을 전달하여 엔트리로 저장하는 메소드
		// => 전달된 키가 중복될 경우 해당 엔트리의 값 변경
		map.put("number", "1000");
		map.put("name", "홍길동");
		map.put("phone", "010-1234-5678");
		map.put("hobby", "낚시");
		
		//Map.toString() : 콜렉션의 저장된 엔트리를 문자열로 변환하여 반환하는 메소드
		// => 엔트리를 문자열로 변환하여 출력할 경우 메소드 호출 생략 가능
		//System.out.println("map.toString() = "+map.toString());
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		map.put("hobby", "등산");
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		//Map.remove(String mapKey) : key를 전달받아 해당 엔트리를 제거하는 메소드
		map.remove("hobby");
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		//Map.size() : 저장 엔트리의 갯수를 반환하는 메소드
		System.out.println("map.size() = "+map.size());
		System.out.println("============================================");
		
		//Map.get(String mapKey) : 키를 전달받아 해당 엔트리의 값을 반환하는 메소드
		// => 전달받은 키에 대한 엔트리가 없을 경우 null 반환
		System.out.println("map.get(\"name\") = "+map.get("name"));
		System.out.println("map.get(\"hobby\") = "+map.get("hobby"));
		System.out.println("============================================");

		System.out.println("학생번호 = "+map.get("number"));
		System.out.println("학생이름 = "+map.get("name"));
		System.out.println("전화번호 = "+map.get("phone"));
		System.out.println("============================================");
		
		//Map.values() : 콜렉션에 저장된 모든 엔트리의 값들(Collection 인스턴스)만 반환하는 메소드
		Iterator<String> iteratorValue=map.values().iterator();
		
		while(iteratorValue.hasNext()) {
			System.out.println("학생정보 = "+iteratorValue.next());
		}
		System.out.println("============================================");
		
		//Map.keySet() : 콜렉션에 저장된 모든 엔트리의 키들(Set 인스턴스)만 반환하는 메소드
		Iterator<String> iteratorKey=map.keySet().iterator();
		
		while(iteratorKey.hasNext()) {
			String key=iteratorKey.next();
			System.out.println("학생정보("+key+") = "+map.get(key));
		}
		System.out.println("============================================");
		
		for(String value:map.values()) {
			System.out.println("학생정보 = "+value);
		}
		System.out.println("============================================");
		
		for(String key:map.keySet()) {
			System.out.println("학생정보("+key+") = "+map.get(key));
		}
		System.out.println("============================================");

	}
}
