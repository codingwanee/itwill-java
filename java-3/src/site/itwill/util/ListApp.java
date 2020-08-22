package site.itwill.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {
		//ArrayList<String> list=new ArrayList<String>();
		
		//������� ����Ǹ� �ߺ� ��Ұ� ���� �߻� ����
		List<String> list=new ArrayList<String>();
		//List<String> list=new Vector<String>();

		//List.add(Element e) : ������Ʈ�� ���޹޾� �ݷ��ǿ� ������Ʈ�� �߰��ϴ� �޼ҵ�
		list.add("������");
		list.add("����");
		list.add("����");
		list.add("����");

		//List.toString() : �ݷ����� ����� ������Ʈ�� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ��Ұ��� ���ڿ��� ��ȯ�Ͽ� ����� ��� �޼ҵ� ȣ�� ���� ����
		//System.out.println("list.toString() = "+list.toString());
		System.out.println("list = "+list);
		System.out.println("============================================");

		list.add("����");
		System.out.println("list = "+list);
		System.out.println("============================================");
		
		//List.add(int index, Element e) : ÷�ڿ� ������Ʈ�� ���޹޾� ÷����ġ�� ������Ʈ�� �����ϴ� �޼ҵ�
		list.add(2, "����");
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.remove(Element e) : ������Ʈ�� ���޹޾� ������Ʈ�� �����ϴ� �޼ҵ�
		// => ������Ʈ�� ���� ���� ��� ù��° ������Ʈ�� ����
		//list.remove("����");
		
		//List.remove(int index) : ÷�ڸ� ���޹޾� ÷����ġ�� ������Ʈ�� �����ϴ� �޼ҵ�
		list.remove(5);
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.set(int index, Element e) : ÷�ڿ� ������Ʈ�� ���޹޾� ÷����ġ�� ������Ʈ�� �����ϴ� �޼ҵ�
		list.set(3,"û����");
		System.out.println("list = "+list);
		System.out.println("============================================");

		//List.size() : ���� ������Ʈ�� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("list.size() = "+list.size());
		System.out.println("============================================");
		
		//List.get(int index) : ÷�ڸ� ���޹޾� ÷����ġ�� ������Ʈ�� ��ȯ�ϴ� �޼ҵ�
		// => ������ ��� ÷�ڸ� ����� ��� IndexOutOfBoundsException ���� �߻�
		System.out.println("list.get(2) = "+list.get(2));
		System.out.println("============================================");
		
		for(int i=0;i<list.size();i++) {
			System.out.println("�����ϴ� ���� = "+list.get(i));
		}
		System.out.println("============================================");

		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println("�����ϴ� ���� = "+iterator.next());
		}
		System.out.println("============================================");
		
		for(String temp:list) {
			System.out.println("�����ϴ� ���� = "+temp);
		}
		System.out.println("============================================");

		//List.clear() : �ݷ����� ��� ������Ʈ�� �����ϴ� �޼ҵ�
		list.clear();
		//List.isEmpty() : �ݷ��ǿ� ����� ������Ʈ�� ���� ��� true�� ��ȯ�ϴ� �޼ҵ�  
		if(list.isEmpty()) {
			System.out.println("�ݷ��ǿ� ����� ������Ʈ�� �������� �ʽ��ϴ�.");	
		}
		
		if(list.size()==0) {
			System.out.println("�ݷ��ǿ� ����� ������Ʈ�� �������� �ʽ��ϴ�.");	
		}
		System.out.println("============================================");
		//Arrays.asList(Element e1,Element e2,Element e3,...)
		// => ������Ʈ���� ���޹޾� List �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		List<Integer> numberList=Arrays.asList(30,50,10,20,40);
		System.out.println("numberList = "+numberList);
		System.out.println("============================================");
		
		//Collections.sort(List list) : �ݷ����� ���޹޾� �ݷ����� ������Ʈ�� �����ϴ� �޼ҵ�
		Collections.sort(numberList);
		System.out.println("numberList = "+numberList);
		System.out.println("============================================");
	}
}