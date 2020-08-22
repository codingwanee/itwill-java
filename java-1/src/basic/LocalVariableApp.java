package basic;

//지역변수(Local Variable) : 메소드 영역(블럭) 안에 선언되어 사용되는 변수
// => 메소드 안에서 다양한 블럭 사용 가능 : 제어문 블럭
// => 지역변수는 선언된 블럭 내부에서만 사용 가능 >> 블럭 외부에서 사용 불가능
// => 블럭이 종료될 경우 블럭 내부에서 선언된 지역변수 자동 소멸
public class LocalVariableApp {
	public static void main(String[] args) {
		int num1=100;
		//임의블럭
		{
			//중복 선언 에러 발생 - 이미 선언된 변수를 다시 선언할 경우 에러 발생
			//int num1=300;
			int num2=200;
			System.out.println("========== 임의블럭 내부 시작 ==========");
			//임의블럭 외부에서 선언된 지역변수 사용 가능
			System.out.println("num1 = "+num1);			
			System.out.println("num2 = "+num2);			
			System.out.println("========== 임의블럭 내부 종료 ==========");
		}
		//중복 선언 에러 미발생 - num2 변수가 임의블럭 종료시 소멸
		//int num2=300;
		
		System.out.println("num1 = "+num1);
		//임의블럭 내부에서 선언된 변수는 임의블럭이 종료된 경우 자동 소멸
		//System.out.println("num2 = "+num2);
	}
}




