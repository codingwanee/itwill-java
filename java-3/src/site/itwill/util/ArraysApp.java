package site.itwill.util;

import java.util.Arrays;

//Arrays Ŭ���� : �迭�� ��ҵ��� ó���ϱ� ���� ����� �����ϴ� Ŭ����
public class ArraysApp {
	public static void main(String[] args) {
		String[] fruits={"������","����","����","����","����"};
		
		//Arrays.toString(Object[] o) : �Ķ���ͷ� ���޵� �迭�� ��Ұ����� 
		//���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println("���� �� >> "+Arrays.toString(fruits));

		//Arrays.sort(Object[] o) : �Ķ���ͷ� ���޵� �迭�� ��Ұ����� �����Ͽ� ���ġ�ϴ� �޼ҵ�
		Arrays.sort(fruits);

		System.out.println("���� �� >> "+Arrays.toString(fruits));
	}
}
