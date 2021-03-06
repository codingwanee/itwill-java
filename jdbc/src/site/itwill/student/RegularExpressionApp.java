package site.itwill.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//정규표현식(Regular Expression) : 메타문자를 이용하여 일정한 규칙의 문자열 표현
/*
^문자열 : 문자열로 시작됨을 의미
문자열$ : 문자열로 종료됨을 의미
. : 임의의 한 문자를 의미(\ 문자는 표현 불가능)
[문자1문자2문자3] : 나열된 문자들 중 하나를 의미
[^문자1문자2문자3] : 나열된 문자들이 아닌 것 중 하나를 의미
[문자1-문자2] : 문자1부터 문자2까지의 범위 문자 중 하나를 의미
(문자열1|문자열2) : 나열된 문자열들 중 하나를 의미
문자열+ : 문자열이 1번이상 반복됨을 의미
문자열* : 문자열이 0번이상 반복됨을 의미
문자열? : 문자열이 0번 또는 1번이 존재함을 의미
문자열{숫자} : 문자열의 반복횟수가 숫자만큼을 의미
문자열{숫자1,숫자2} : 문자열의 반복횟수가 숫자1부터 숫자2까지를 의미

\s : 공백이 존재하는 문자열을 의미
\S : 공백이 존재하지 않는 문자열을 의미
\w : 알파벳 또는 숫자, _ 문자로만 표현되는 문자열을 의미
\W : 알파벳 또는 숫자, _를 제외한 문자로 표현되는 문자열을 의미
\d : 숫자형태의 문자로만 표현되는 문자열을 의미
\D : 숫자를 제외한 문자로만 표현되는 문자열을 의미
\메타문자 : 메타문자를 문자로 표현(Escape Character)

(?!)문자열 : 문자열에서 대소문자를 구분하지 않음을 의미
(?=문자열) : 문자열을 포함하고 있음을 의미
(?!문자열) : 문자열을 포함하고 있지 않음 의미
*/

//키보드로 문자열을 입력받아 정규표현식으로 유효성 검사 후 결과를 출력하는 프로그램
public class RegularExpressionApp {
	public static void main(String[] args) throws Exception {
		//키보드로 문자열을 입력받기 위한 입력스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*
		//키보드로 아이디를 입력받아 입력값에 대한 유효성 검사
		// => 영문자로 시작되며 영문자,숫자,_의 조합으로 6~20 범위의 문자로 표현
		System.out.print("아이디 입력 >> ");
		String id=br.readLine();
		
		//Pattern 클래스 : 정규표현식을 저장하기 위한 클래스
		//Pattern.compile(String regex) : 문자열을 전달받아 Pattern 
		//인스턴스에 정규표현식으로 변환 저장하여  반환하는 메소드
		//Pattern idPattern=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{5,19}");
		Pattern idPattern=Pattern.compile("^[a-zA-Z]\\w{5,19}");
		
		//Pattern.matcher(String input) : 문자열을 전달받아 Pattern 인스턴스의 
		//정규표현식과 비교하기 위한 Matcher 인스턴스를 반환받은 메소드
		//Matcher 클래스 : 정규표현식과 문자열을 비교하기 위한 기능을 제공하는 클래스 
		Matcher idMatcher=idPattern.matcher(id);
		//Matcher.matches() : 정규표현식과 문자열을 전체 비교하여 형식이
		//다른 경우 false, 같은 경우 true 반환하는 메소드 
		if(idMatcher.matches()) {
			System.out.println("[결과]올바른 형식의 아이디를 입력 하였습니다.");
		} else {
			System.out.println("[결과]잘못된 형식의 아이디를 입력 하였습니다.");
		}
		*/
		
		/*
		//키보드로 비밀번호를 입력받아 입력값에 대한 유효성 검사
		// => 영문자,숫자,특수문자를 반드시 1개이상 포함하여 입력하며 8~30 범위의 문자 표현 
		System.out.print("비밀번호 입력 >> ");
		String passwd=br.readLine();
		
		Pattern passwdPattern=Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{8,30}");
		Matcher passwdMatcher=passwdPattern.matcher(passwd);
		if(passwdMatcher.matches()) {
			System.out.println("[결과]올바른 형식의 비밀번호를 입력 하였습니다.");
		} else {
			System.out.println("[결과]잘못된 형식의 비밀번호를 입력 하였습니다.");
		}
		*/
		
		/*
		//키보드로 이름을 입력받아 입력값에 대한 유효성 검사
		// => 한글만 입력 가능하며 2~5 범위의 문자 표현 
		System.out.print("이름 입력 >> ");
		String name=br.readLine();
		
		Pattern namePattern=Pattern.compile("^[가-힣]{2,5}$");
		Matcher nameMatcher=namePattern.matcher(name);
		if(nameMatcher.matches()) {
			System.out.println("[결과]올바른 형식의 이름을 입력 하였습니다.");
		} else {
			System.out.println("[결과]잘못된 형식의 이름을 입력 하였습니다.");
		}
		*/
		
		//키보드로 이메일을 입력받아 입력값에 대한 유효성 검사
		// => [아이디@도메인] 형식의 문자열 
		System.out.print("이메일 입력 >> ");
		String email=br.readLine();
		
		Pattern emailPattern=Pattern.compile("^([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+(\\.[a-zA-Z0-9-]+)+)*$");
		Matcher emailMatcher=emailPattern.matcher(email);
		if(emailMatcher.matches()) {
			System.out.println("[결과]올바른 형식의 이메일을 입력 하였습니다.");
		} else {
			System.out.println("[결과]잘못된 형식의 이메일을 입력 하였습니다.");
		}
	}
}
