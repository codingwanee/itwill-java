package example;

public class VariableExampleApp {
	public static void main(String[] args) {
		//가로의 길이가 10이고 세로의 길이가 7인 사각형의 넓이를 계산하여 출력하세요.
		int garo=10, sero=7;//입력
		int nulbe=garo*sero;//처리
		System.out.println("사각형의 넓이 = "+nulbe);//출력
		
		//한 대의 가격이 2000만원인 자동차를 10대 구매할 경우 지불해야될 금액을 계산하여 출력하세요.
		int 단가=20000000, 갯수=10;
		int 금액=단가*갯수;
		System.out.println("자동차 구매대금 = "+금액);
		
		//밑변의 길이가 15이고 높이가 9인 삼각형의 넓이를 계산하여 출력하세요.
		int width=15, height=9;
		double area=width*height/2.;
		System.out.println("삼각형의 넓이 = "+area);
		
		//30명 전체 인원의 몸무게가 1895Kg인 경우 1인당 평균 몸무게를 계산하여 출력하세요.
		int cnt=30,totWeight=1895;
		double aveWeight=(double)totWeight/cnt;
		System.out.println("평균 몸무게 = "+aveWeight+"Kg");
		//소숫점 2자리까지만 출력하되 반올림하여 출력되도록 처리
		//System.out.println("평균 몸무게 = "+(int)(aveWeight*100+0.5)/100.+"Kg");
		
		//System.out.printf("출력내용 및 출력서식",출력대상,...) : 화면에 원하는 결과를 출력하는 메소드
		// => 출력대상을 출력서식에 맞게 변형하여 출력하기 위한 메소드 
		// => 출력서식과 출력대상의 갯수가 반드시 일치되도록 선언
		// => 출력대상이 출력서식에 순차적으로 연결되어 출력 처리
		//출력서식 : %d(정수상수-10진수) %f(실수) %s(문자열)
		// => 출력서식에 출력자릿수를 설정하여 출력 가능 : ex) %10d  %10.2f  %-10s
		//%.2f : 실수상수를 소숫점 2자리까지만 출력되도록 처리 - 나머지를 이용한 반올림 처리 
		System.out.printf("평균 몸무게 = %.2f\n",aveWeight);
		
		//한대의 가격이 1억 5천만인 비행기를 20대 구매할 경우 지불해야될 금액을 계산하여 출력하세요.
		int dan=150000000, su=20;
		long kum=(long)dan*su;
		System.out.println("비행기 구매 대금 = "+kum);
		
		//이름이 "홍길동"인 학생의 시험성적은 국어 87점, 영어 93점, 수학 80점입니다.
		//학생의 시험성적에 대한 총점과 평균을 계산하여 이름, 총점, 평균을 출력하세요.
		//단, 평균은 소숫점 2자리까지만 출력되도록 하고 나머지를 내림처리 하세요.
		String name="홍길동";
		int kor=87, eng=93, mat=80;
		
		int tot=kor+eng+mat;
		double ave=tot/3.;				

		System.out.println(name+"님의 성적 >> 총점 = "+tot
				+", 평균 = "+(int)(ave*100)/100.);
	}
}