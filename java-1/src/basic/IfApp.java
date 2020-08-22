package basic;

public class IfApp {
	public static void main(String[] args) {
		int score=80;
		//점수가 60점이상인 경우 합격 메세지를 출력하세요.
		if(score>=60) {
			System.out.println("[메세지]점수가 60점이상이므로 합격입니다.");
		}
		System.out.println("============================================");
		
		score=50;
		//점수가 60점미만인 경우 불합격 메세지를 출력하세요.
		if(score<60) {
			System.out.println("[메세지]점수가 60점미만이므로 불합격입니다.");
		}
		System.out.println("============================================");
		
		score=80;
		//점수가 60점이상인 경우 합격 메세지를 출력하고 60점미만인 경우 불합격 메세지 출력하세요.
		if(score>=60) {
			System.out.println("[메세지]점수가 60점이상이므로 합격입니다.");
		} else {
			System.out.println("[메세지]점수가 60점미만이므로 불합격입니다.");
		}
		System.out.println("============================================");

		int number=10;
		//정수변수에 저장된 상수를 홀수와 짝수로 구분하여 출력하세요.
		/*
		if(number%2==0) {
			System.out.println("[결과]"+number+" = 짝수");
		} else {
			System.out.println("[결과]"+number+" = 홀수");
		}
		*/
		if(number%2!=0) {
			System.out.println("[결과]"+number+" = 홀수");
		} else {
			System.out.println("[결과]"+number+" = 짝수");
		}
		System.out.println("============================================");

		char mun='O';
		
		//문자변수에 저장된 상수가 알파벳인지 아닌지를 구분하여 출력하세요.
		if(mun>='A' && mun<='Z' || mun>='a' && mun<='z') {
			System.out.println("[결과]알파벳이 맞습니다.");
		} else {
			System.out.println("[결과]알파벳이 아닙니다.");
		}
		System.out.println("============================================");
		
		int kor=85;
		
		//국어점수가 0~100 범위의 유효값인지 아닌지를 판단하여 결과를 출력하세요.
		if(kor>=0 && kor<=100) {
			//System.out.println("[메세지]정상적인 국어점수가 입력 되었습니다.");
			
			//국어점수에 대한 학점을 계산하여 출력하세요.
			// => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
			String grade;
			if(kor>=90) grade="A";
			else if(kor>=80) grade="B";
			else if(kor>=70) grade="C";
			else if(kor>=60) grade="D";
			else grade="F";
			
			System.out.println("[결과]국어점수 = "+kor+"점 >> "+grade+"학점");
		} else {
			System.out.println("[에러]비정상적인 국어점수가 입력 되었습니다.");
		}
		System.out.println("============================================");
		
		boolean sw=false;
		
		//논리형(Boolean) 변수에 저장된 값에 따른 명령 선택 실행
		/*
		if(sw) {//변수값이 true 경우 명령 실행
			System.out.println("[결과]스위치를 켰습니다.<ON>");
		} else {
			System.out.println("[결과]스위치를 껐습니다.<OFF>");
		}
		*/
		if(!sw) {//변수값이 false 경우 명령 실행
			System.out.println("[결과]스위치를 껐습니다.<OFF>");
		} else {
			System.out.println("[결과]스위치를 켰습니다.<ON>");
		}
		System.out.println("============================================");
		int choice=1;
		//제어문에서 변수에 상수를 저장할 경우 상수를 저장하는 변수 선언시
		//초기값을 부여하여 선언하는 것을 권장
		// => NullString("") : 문자가 하나도 없는 문자열 상수
		String name="";
		
		if(choice==1) {
			name="홍길동";
		} else if(choice==2) {
			name="임꺽정";
		} /* else { name="전우치"; 
		} */
		System.out.println("[결과]당신이 선택한 사람은 <"+name+">님입니다.");
		System.out.println("============================================");
	}
}
