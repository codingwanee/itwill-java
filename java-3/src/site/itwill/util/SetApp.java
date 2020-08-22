package site.itwill.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {
		//���׸� Ÿ���� ������� ���� ��� - ��� �ν��Ͻ��� Object Ÿ������ ����
		//HashSet set=new HashSet();
		
		//���׸� Ÿ���� ����� ��� - ���ظ� Ÿ�� ��� ���޵� Ŭ������ �ν��Ͻ��� ����
		//HashSet<String> set=new HashSet<String>();
		
		//���������� �θ� �������� �̿��Ͽ� �����ϴ� ���� ���� - ���������� ȿ���� ����
		Set<String> set=new HashSet<String>();
		
		//Set.add(Element e) : ������Ʈ(�ν��Ͻ�)�� �����Ͽ� �ݷ��ǿ� �����ϴ� �޼ҵ�
		// => ����Ǵ� ������ ������ �ߺ��� ������ �ν��Ͻ� ���� �Ұ�
		set.add("������");
		//set.add(100);
		set.add("����");
		set.add("����");
		set.add("����");
		
		//Set.toString() : �ݷ����� ������Ʈ�� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ������Ʈ�� ���ڿ��� ��ȯ�Ͽ� ����� ��� �޼ҵ� ȣ�� ���� ����
		//System.out.println("set.toString() = "+set.toString());
		System.out.println("set = "+set);
		System.out.println("============================================");
		set.add("����");//���� ������ �ν��Ͻ��� ������ ��� ���� �Ұ�
		System.out.println("set = "+set);
		System.out.println("============================================");
		//Set.remove(Element e) : ������Ʈ�� ���޹޾� �ݷ��ǿ��� �����ϴ� �޼ҵ�
		set.remove("����");
		System.out.println("set = "+set);
		System.out.println("============================================");
		//Set.size() : �ݷ��ǿ� ����� ������Ʈ�� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("set.size() = "+set.size());
		System.out.println("============================================");
		
		//Set.iterator() : �ݷ����� ������Ʈ���� �ϰ�ó�� �� �� �ִ� Iterator �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Iterator : �ݷ��ǿ� ����� ������Ʈ�� ���ʴ�� ������ �� �ִ� �ν��Ͻ� >> �ݺ������� 
		Iterator<String> iterator=set.iterator();
		
		//Iterator.hasNext() : Iterator �ν��Ͻ��� ������Ʈ�� ������ �� �ִ� ��� true�� ��ȯ�ϴ� �޼ҵ�
		while(iterator.hasNext()) {
			//Iterator.next() : Iterator �ν��Ͻ��� ������Ʈ�� ��ȯ�ϴ� �޼ҵ�
			// => Iterator �ν��Ͻ��� �ڵ����� ���� ������Ʈ�� �̵�
			System.out.println("�����ϴ� ���� = "+iterator.next());
		}
		System.out.println("============================================");
		//Iterator �ν��Ͻ��� ���������� ����ϴ� for ����� ����Ͽ� �ϰ�ó��
		for(String temp:set) {
			System.out.println("�����ϴ� ���� = "+temp);
		}
		System.out.println("============================================");
		//Set.clear() : �ݷ��ǿ� ����� ��� ������Ʈ�� �����ϴ� �޼ҵ�
		set.clear();

		//Set.isEmrty() : �ݷ��ǿ� ����� ������Ʈ�� ���� ��� true�� ��ȯ�ϴ� �޼ҵ�
		if(set.isEmpty()) {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ϳ��� �����ϴ�.");
		} else {
			System.out.println("Set �ݷ��ǿ� ����� ��Ұ� �ֽ��ϴ�.");
		}
		System.out.println("============================================");
	} 
}
