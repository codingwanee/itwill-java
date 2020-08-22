package basic;

public class ArrayApp {
	public static void main(String[] args) {
		//new int[3] : 정수상수를 3개 저장할 수 있는 배열 생성 
		// - 배열요소에는 기본값 자동 저장
		//int[] num : 배열정보를 저장할 수 있는 참조변수 생성 
		// - 배열정보를 참조변수에 저장하여 참조변수로 배열요소 참조
		int[] num=new int[3];
		
		System.out.println("num = "+num);
		System.out.println("============================================");
		//참조변수와 첨자를 사용하여 배열 요소 표현
		System.out.println("num[0] = "+num[0]);
		System.out.println("num[1] = "+num[1]);
		System.out.println("num[2] = "+num[2]);
		//배열 요소의 첨자를 잘못 사용한 경우 프로그램 실행시 예외(Exception) 발생
		// => ArrayIndexOutOfBoundsException 발생
		//System.out.println("num[3] = "+num[3]);
		System.out.println("============================================");
		//참조변수.length : 배열정보를 저장하는 참조변수에서 사용하며 배열 요소의 갯수 제공
		System.out.println("배열 요소의 갯수 = "+num.length);
		System.out.println("============================================");
		int index=1;
		//첨자에 정수상수 대신 변수 또는 연산식 사용 가능
		num[index-1]=10;
		num[index]=20;
		num[index+1]=30;
		
		//for 명령을 이용한 배열의 일괄처리 - 첨자 이용(입력,연산,출력)
		for(int i=0;i<num.length;i++) {
			System.out.println("num["+i+"] = "+num[i]);
		}
		System.out.println("============================================");
		//{} 안에 상수를 나열하여 배열 생성 가능
		int[] su={10,20,30,40,50};

		//for 명령을 이용한 배열의 일괄처리 - 반복지시자(Iterator) 이용(연산,출력)
		for(int temp:su) {
			System.out.print(temp+"\t");
		}
		System.out.println();
		System.out.println("============================================");
		int[] array={54,70,64,87,96,21,65,76,11,34,56,41,77,91};
		
		//배열 요소값들의 합계를 계산하여 출력하세요.
		int tot=0;
		
		/*
		for(int i=0;i<array.length;i++) {
			tot+=array[i];
		}
		*/
		
		for(int temp:array) {
			tot+=temp;
		}
		
		System.out.println("합계 = "+tot);
		System.out.println("============================================");
		//배열 요소에 저장된 값 중 30~60 범위의 요소 갯수를 계산하여 출력하세요.
		int cnt=0;
		
		/*
		for(int i=0;i<array.length;i++) {
			if(array[i]>=30 && array[i]<=60) cnt++;
		}
		*/
		
		for(int temp:array) {
			if(temp>=30 && temp<=60) cnt++;
		}
		
		System.out.println("30~60 범위의 요소 갯수 = "+cnt);
		System.out.println("============================================");
	}
}










