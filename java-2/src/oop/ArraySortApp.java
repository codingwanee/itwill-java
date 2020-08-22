package oop;

import java.util.Arrays;

//배열요소에 저장된 상수를 정렬하여 출력하는 프로그램을 작성하세요.
public class ArraySortApp {
	public static void main(String[] args) {
		int[] array={30,50,10,40,20};
		
		/*
		System.out.print("정렬 전 요소값 >> ");
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
		
		System.out.print("정렬 후 요소값 >> ");
		for(int num:array) {
			System.out.print(num+"  ");
		}
		System.out.println();
		*/
		
		System.out.print("정렬 전 요소값 >> ");
		//Arrays 클래스 : 배열 관련 기능을 제공하는 클래스
		//Arrays.toString(ArrayReference) : 배열의 요소값들을 문자열로 변환하여 반환하는 메소드
		System.out.println(Arrays.toString(array));
		
		//Arrays.sort(ArrayReference) : 배열 요소값을 비교하여 순차적으로 저장하는 메소드
		Arrays.sort(array);
		
		System.out.print("정렬 후 요소값 >> ");
		System.out.println(Arrays.toString(array));
	}
}