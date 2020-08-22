package site.app;

//import 명령을 이용하여 패키지에 존재하는 참조형이 사용되도록 처리 
import site.itwill.subject.JavaSubject;
//패키지가 다른 동일 이름의 참조형은 import 처리 불가능
//import site.uniwill.subject.JavaSubject;
import site.itwill.subject.OracleSubject;
import site.uniwill.subject.SpringSubject;

public class SubjectApp {
	public static void main(String[] args) {
		//참조형은 패키지명을 포함하여 표현하여 사용
		// => 같은 패키지에 선언된 참조형은 패키지명을 생략하여 표현 가능
		//site.itwill.subject.OracleSubject subject1=new site.itwill.subject.OracleSubject();
		
		//import 처리된 참조형은 패키지명을 생략하여 표현
		// => 자동완성 기능을 이용하여 참조형을 작성할 경우 자동 import 처리
		OracleSubject subject1=new OracleSubject();
		subject1.display();
		
		SpringSubject subject2=new SpringSubject();
		subject2.display();
		
		//패키지에 동일 이름의 참조형이 존재할 수 있으므로 import 처리 주의
		JavaSubject subject3=new JavaSubject();
		subject3.display();
		
		//import 처리 불가능한 참조형은 패키지명을 포함하여 표현
		site.uniwill.subject.JavaSubject subject4=new site.uniwill.subject.JavaSubject();
		subject4.display();
	}
}
