package basic;

public class VariableApp {
	public static void main(String[] args) {
		int su;//변수 선언
		su=10;//변수에 상수 저장 : 대입연산자(=) 이용
		System.out.print("변경 전 변수값 >> ");
		System.out.println(su);//변수값(변수에 저장된 상수) 출력
		
		//int su;//동일한 이름의 변수 생성 불가
		su=20;//변수에는 상수를 하나만 저장 가능 - 기존 상수가 제거되고 새로운 상수가 저장
		/*
		System.out.print("변경 후 변수값 >> ");
		System.out.println(su);
		*/
		
		//""+대상 또는 대상+"" >> 문자열 결합
		System.out.println("변경 후 변수값 >> "+su);
		
		/*
		System.out.println("올해는 "+2+0+1+9+"년입니다.");
		System.out.println(2+0+1+9+"년은 돼지띠입니다.");
		System.out.println(""+2+0+1+9+"년은 돼지띠입니다.");
		System.out.println("결과 = "+10+20);
		System.out.println("결과 = "+(10+20));
		System.out.println("결과 = "+10*20);
		System.out.println("결과 = "+(10*20));
		*/
		
		//변수 선언 및 초기화 작업 - 변수를 생성하여 초기값(상수)를 저장
		int num=30;
		System.out.println("num = "+num);
		
		//동일한 자료형의 변수는 , 기호를 이용하여 나열 선언 가능
		int kor=80,eng=90,mat=100;
		int tot=kor+eng+mat;
		System.out.println("점수합계 = "+tot+"점");
		
		/*
		int age;
		//변수에 상수가 저장되어 있지 않은 상태에서 사용될 경우 에러 발생 - 초기화 에러
		System.out.println("나이 = "+age);
		*/
		
		/*
		//변수에 저장될 수 없는 상수를 저장할 경우 에러 발생 - 데이타 변형 방지
		int age=20.0;
		System.out.println("나이 = "+age);
		*/
	}
}
