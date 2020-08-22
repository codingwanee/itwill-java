package oop;

//실행이 목적인 클래스 >> main 메소드 - 프로그램(Application)
public class MethodApp {
	public static void main(String[] args) {
		//프로젝트에 결합(Build)되어 있는 클래스는 프로젝트 내에서 사용 가능
		// >> 동일한 패키지의 클래스는 패키지명 없이 클래스명으로 표현 가능
		//클래스로 인스턴스를 생성하여 참조변수에 저장
		Method method=new Method();
		
		//참조변수에 저장된 인스턴스를 이용하여 메소드 호출 => . 연산자 사용
		method.display1();
		method.display2();
		method.display1();
		System.out.println("============================================");
		
		method.displayTotOne();
		method.displayTotOne();
		System.out.println("============================================");
		
		//파라메터에 정보를 전달하여 메소드 호출
		method.displayTotTwo(50);
		method.displayTotTwo(75);
		System.out.println("============================================");
		
		method.displayTotThree(30,70);
		method.displayTotThree(16,87);
		method.displayTotThree(55,7);
		System.out.println("============================================");
		//메소드 호출 결과를 반환받아 변수에 저장 - 반환값의 지속적인 사용
		int tot=method.returnTot(10, 80);
		System.out.println("합계 = "+tot);
		System.out.println("합계 = "+method.returnTot(33, 77));
		System.out.println("============================================");
		/*
		boolean result=method.isOddEven(10);
		if(result) {
			System.out.println("입력값은 [짝수]입니다.");
		} else {
			System.out.println("입력값은 [홀수]입니다.");
		}
		*/
		
		//if 명령의 조건식 대신 boolean 상수를 반환하는 메소드를 호출하여 명령 선택 실행
		if(method.isOddEven(10)) {
			System.out.println("입력값은 [짝수]입니다.");
		} else {
			System.out.println("입력값은 [홀수]입니다.");
		}
		System.out.println("============================================");
		int[] array=method.returnArray();
		System.out.print("반환받은 배열 요소값 >> ");
		for(int num:array) {
			System.out.print(num+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		System.out.println("합계 = "+method.returnSumOne(10, 20, 30));
		System.out.println("============================================");
		//int[] intArray={10,20,30};
		int[] intArray={10,20,30,40,50};
		System.out.println("합계 = "+method.returnSumTwo(intArray));
		System.out.println("============================================");
		System.out.println("합계 = "+method.returnSumThree());
		System.out.println("합계 = "+method.returnSumThree(10,20,30));
		System.out.println("합계 = "+method.returnSumThree(10,20,30,40,50));
		System.out.println("============================================");
	}
}