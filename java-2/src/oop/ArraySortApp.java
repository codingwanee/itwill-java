package oop;

import java.util.Arrays;

//�迭��ҿ� ����� ����� �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
public class ArraySortApp {
	public static void main(String[] args) {
		int[] array={30,50,10,40,20};
		
		/*
		System.out.print("���� �� ��Ұ� >> ");
		for(int num:array) {
			System.out.print(num+"  ");
		}
		System.out.println();
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int num=array[i];
					array[i]=array[j];
					array[j]=num;
				}
			}
		}
		
		System.out.print("���� �� ��Ұ� >> ");
		for(int num:array) {
			System.out.print(num+"  ");
		}
		System.out.println();
		*/
		
		System.out.print("���� �� ��Ұ� >> ");
		//Arrays Ŭ���� : �迭 ���� ����� �����ϴ� Ŭ����
		//Arrays.toString(ArrayReference) : �迭�� ��Ұ����� ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		System.out.println(Arrays.toString(array));
		
		//Arrays.sort(ArrayReference) : �迭 ��Ұ��� ���Ͽ� ���������� �����ϴ� �޼ҵ�
		Arrays.sort(array);
		
		System.out.print("���� �� ��Ұ� >> ");
		System.out.println(Arrays.toString(array));
	}
}