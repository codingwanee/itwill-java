package site.itwill.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapApp {
	public static void main(String[] args) {
		//Map �������̽��� ��ӹ��� Ŭ������ ���׸� Ÿ���� 2�� ����Ͽ� ����
		// => Ű�� ���� ���׸� Ÿ���� ���� �����Ͽ� ���
		// => ��Ʈ���� Ű�� Set �������̽��� �̿��Ͽ� �����ǹǷ� ������ ������ ���ߺ� 
		//HashMap<String, String> map=new HashMap<String, String>();
		Map<String, String> map=new HashMap<String, String>();
		
		//Map.put(String mapKey, Object mapValue) : Ű�� ���� �����Ͽ� ��Ʈ���� �����ϴ� �޼ҵ�
		// => ���޵� Ű�� �ߺ��� ��� �ش� ��Ʈ���� �� ����
		map.put("number", "1000");
		map.put("name", "ȫ�浿");
		map.put("phone", "010-1234-5678");
		map.put("hobby", "����");
		
		//Map.toString() : �ݷ����� ����� ��Ʈ���� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ��Ʈ���� ���ڿ��� ��ȯ�Ͽ� ����� ��� �޼ҵ� ȣ�� ���� ����
		//System.out.println("map.toString() = "+map.toString());
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		map.put("hobby", "���");
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		//Map.remove(String mapKey) : key�� ���޹޾� �ش� ��Ʈ���� �����ϴ� �޼ҵ�
		map.remove("hobby");
		System.out.println("map = "+map);
		System.out.println("============================================");
		
		//Map.size() : ���� ��Ʈ���� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("map.size() = "+map.size());
		System.out.println("============================================");
		
		//Map.get(String mapKey) : Ű�� ���޹޾� �ش� ��Ʈ���� ���� ��ȯ�ϴ� �޼ҵ�
		// => ���޹��� Ű�� ���� ��Ʈ���� ���� ��� null ��ȯ
		System.out.println("map.get(\"name\") = "+map.get("name"));
		System.out.println("map.get(\"hobby\") = "+map.get("hobby"));
		System.out.println("============================================");

		System.out.println("�л���ȣ = "+map.get("number"));
		System.out.println("�л��̸� = "+map.get("name"));
		System.out.println("��ȭ��ȣ = "+map.get("phone"));
		System.out.println("============================================");
		
		//Map.values() : �ݷ��ǿ� ����� ��� ��Ʈ���� ����(Collection �ν��Ͻ�)�� ��ȯ�ϴ� �޼ҵ�
		Iterator<String> iteratorValue=map.values().iterator();
		
		while(iteratorValue.hasNext()) {
			System.out.println("�л����� = "+iteratorValue.next());
		}
		System.out.println("============================================");
		
		//Map.keySet() : �ݷ��ǿ� ����� ��� ��Ʈ���� Ű��(Set �ν��Ͻ�)�� ��ȯ�ϴ� �޼ҵ�
		Iterator<String> iteratorKey=map.keySet().iterator();
		
		while(iteratorKey.hasNext()) {
			String key=iteratorKey.next();
			System.out.println("�л�����("+key+") = "+map.get(key));
		}
		System.out.println("============================================");
		
		for(String value:map.values()) {
			System.out.println("�л����� = "+value);
		}
		System.out.println("============================================");
		
		for(String key:map.keySet()) {
			System.out.println("�л�����("+key+") = "+map.get(key));
		}
		System.out.println("============================================");

	}
}
