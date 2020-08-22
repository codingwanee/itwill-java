package oop;

//기능 제공이 목적인 클래스 - 참조(Reference)클래스
public class Method {
	void display1() {
		System.out.println("### Method 클래스의 display1() 메소드 호출 ###");
	}
	
	void display2() {
		System.out.println("### Method 클래스의 display2() 메소드 호출 ###");
	}
	
	void displayTotOne() {
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 범위의 정수합계 = "+tot);
	}
	
	void displayTotTwo(int num) {
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+" 범위의 정수합계 = "+tot);
	}
 
	void displayTotThree(int num1,int num2) {
		//파라메터에 전달된 값에 대한 유효성 검사
		if(num1>num2) {
			System.out.println("[에러]첫번째 파라메터에 전달된 값이 작아야 됩니다.");
			return;//메소드 종료
		}
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+" 범위의 정수합계 = "+tot);
	}
	
	int returnTot(int num1,int num2) {
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		return tot;//결과값 반환 - 메소드 종료
	}
	
	//파라메터에 전달된 정수상수를 홀수와 짝수로 구분한 결과 반환하는 메소드
	// => false : 홀수, true : 짝수
	boolean isOddEven(int num) {
		if(num%2==0) return true;
		else return false;
	}
	
	//배열을 이용하여 결과값들을 반환
	int[] returnArray() {
		int[] array={10,20,30,40,50};
		return array;//참조변수에 저장된 배열정보 반환
	}
	
	//파라메터(변수)로 정수상수를 전달받아 합계를 계산하여 반환하는 메소드
	// => 파라메터 갯수만큼 값을 전달 받아 처리
	int returnSumOne(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	//파라메터(배열)로 정수상수를 전달받아 합계를 계산하여 반환하는 메소드
	// => 파라메터에 배열정보를 하나만 전달받아 처리
	int returnSumTwo(int[] num) {
		int sum=0;
		for(int su:num) sum+=su;
		return sum;
	}
	
	//파라메터 생략기호로 정수상수를 전달받아 합계를 계산하여 반환하는 메소드
	// => ... : 파라메터 생략 기호 - 파라메터에 값을 원하는 갯수만큼 전달받아 처리 >> 배열 처리
	int returnSumThree(int... num) {
		int sum=0;
		for(int su:num) sum+=su;
		return sum;
	}
}










