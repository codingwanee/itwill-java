package site.itwill.lang;

public class StringApp {
	public static void main(String[] args) {
		//"" 기호를 이용하여 문자열 상수가 저장된 String 인스턴스 생성
		String str1="ABC";
		
		//String.toString() : String 인스턴스에 저장된 문자열 상수를 반환하는 메소드
		//System.out.println("str1.toString() = "+str1.toString());
		//String 인스턴스에 저장된 문자열 상수를 출력할 경우 toString() 메소드 호출 생략
		System.out.println("str1 = "+str1);
		System.out.println("============================================");
		
		//"" 기호로 String 인스턴스를 생성할 경우 동일한 문자열 상수가 저장된
		//String 인스턴스를 새로 생성하지 않고 기존 String 인스턴스 정보를 제공받아 사용
		String str2="ABC";
		//참조변수를 관계연산자로 비교할 경우 참조변수에 저장된 인스턴스 정보를 비교하여 결과 제공
		// => String 인스턴스에 저장된 문자열 상수를 비교하는 것이 아니다.  
		if(str1==str2) {
			System.out.println("str1 참조변수와 str2 참조변수에 저장된 인스턴스 정보가 같습니다.");
		} else {
			System.out.println("str1 참조변수와 str2 참조변수에 저장된 인스턴스 정보가 다릅니다.");
		}
		System.out.println("============================================");
		
		//생성자(Constructor)를 이용하여 String 인스턴스 생성
		String str3=new String("ABC");
		if(str1==str3) {
			System.out.println("str1 참조변수와 str3 참조변수에 저장된 인스턴스 정보가 같습니다.");
		} else {
			System.out.println("str1 참조변수와 str3 참조변수에 저장된 인스턴스 정보가 다릅니다.");
		}
		System.out.println("============================================");
		
		//String.equals(String s) : 인스턴스에 저장된 문자열 상수를 비교하여
		//다른 경우 false, 같은 경우 true를 반환하는 메소드
		if(str1.equals(str3)) {
			System.out.println("인스턴스에 저장된 문자열 상수가 같습니다.");
		} else {
			System.out.println("인스턴스에 저장된 문자열 상수가 다릅니다.");
		}
		System.out.println("============================================");

		//equals() 메소드는 대소문자를 구분하여 비교 결과 반환
		String str4="abc";
		if(str1.equals(str4)) {
			System.out.println("인스턴스에 저장된 문자열 상수가 같습니다.");
		} else {
			System.out.println("인스턴스에 저장된 문자열 상수가 다릅니다.");
		}
		System.out.println("============================================");

		//String.equalsIgnoreCase(String s) : 대소문자를 구분하지 않고 비교 결과 반환
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("인스턴스에 저장된 문자열 상수가 같습니다.");
		} else {
			System.out.println("인스턴스에 저장된 문자열 상수가 다릅니다.");
		}
		System.out.println("============================================");
		
		//String.compareTo(String s) : 문자열을 비교하여 호출 인스턴스의 문자열이
		//큰 경우 양수, 파라메터에 전달된 인스턴스의 문자열이 큰 경우 음수, 같은 경우 0을 반환하는 메솓, 
		if(str1.compareTo(str4)>=0) {
			System.out.println("str1 인스턴스의 문자열 상수가 크거나 같습니다.");
		} else {
			System.out.println("str4 인스턴스의 문자열 상수가 더 큽니다.");
		}
		System.out.println("============================================");
		
		//문자열 상수는 내부적으로 문자배열로 처리 - 첨자(Index)를 이용한 처리 가능
		String str5="ABCDEFG";

		//String.length() : String 인스턴스에 저장된 문자열 상수의 문자 갯수를 반환하는 메소드
		System.out.println("str5.length() = "+str5.length());
		System.out.println("============================================");

		//String.charAt(int index) : String 인스턴스에 저장된 문자열 상수에서
		//파라메터에 전달된 index 위치의 문자를 반환하는 메소드
		System.out.println("str5.charAt(1) = "+str5.charAt(1));
		//IndexOutOfBoundsException 예외 발생
		//System.out.println("str5.charAt(10) = "+str5.charAt(10));
		System.out.println("============================================");

		//String.indexOf(int ch) 또는 String.indexOf(String s) : String 인스턴스에
		//저장된 문자열 상수에서 파라메터로 전달된 문자(문자열)을 검색하여
		//시작위치(int beginIndex)를 반환하는 메소드
		System.out.println("str5.indexOf('A') = "+str5.indexOf('A'));
		System.out.println("str5.indexOf('E') = "+str5.indexOf('E'));
		System.out.println("str5.indexOf(\"CD\") = "+str5.indexOf("CD"));
		//검색 문자(문자열)이 존재하지 않을 경우 -1 반환
		System.out.println("str5.indexOf('X') = "+str5.indexOf('X'));
		System.out.println("============================================");

		String str6="Java";
		//String.concat(String s) : String 인스턴스에 저장된 문자열 상수에
		//파라메터로 전달된 문자열 상수를 추가(결합) 후 String 인스턴스를 반환하는 메소드
		// => + 연산자를 이용하여 문자열 결합 가능
		str6=str6.concat(" Programming");//결합 후 반환결과 저장
		System.out.println("str6 = "+str6);
		System.out.println("============================================");
		
		//String.toUpperCase() : String 인스턴스에 저장된 문자열 상수의 
		//모든 영문자를 대문자로 변환 후 String 인스턴스를 반환하는 메소드
		System.out.println("str6.toUpperCase() = "+str6.toUpperCase());
		//String.toLowerCase() : String 인스턴스에 저장된 문자열 상수의 
		//모든 영문자를 소문자로 변환 후 String 인스턴스를 반환하는 메소드
		System.out.println("str6.toLowerCase() = "+str6.toLowerCase());
		System.out.println("============================================");
		
		String str7="   홍길동          ";
		System.out.println("입력된 이름은 ["+str7+"]입니다.");
		
		//String.trim() : String 인스턴스에 저장된 문자열 상수의 앞 또는 뒤에 
		//존재하는 모든 공백을 제거 후 String 인스턴스를 반환하는 메소드
		System.out.println("입력된 이름은 ["+str7.trim()+"]입니다.");
		System.out.println("============================================");
		
		String str8="     홍    길     동     ";
		System.out.println("입력된 이름은 ["+str8+"]입니다.");

		//String.replace(String regEx, String replacement) : String 인스턴스에 
		//저장된 문자열 상수에서 첫번째 파라메터에 전달된 String 인스턴스의 
		//문자열(정규표현식)을 검색하여 두번째 파라메터에 전달된 String 인스턴스의
		//문자열로 변경 후 String 인스턴스를 반환하는 메소드
		System.out.println("입력된 이름은 ["+str8.replace(" ", "")
			.replace("홍", "고")+"]입니다.");
		System.out.println("============================================");
		String str9="010-1234-5678";
		
		System.out.println("str9 = "+str9);
		
		//String.split(String regEx) : String 인스턴스에 저장된 문자열 상수에서
		//파라메터에 전달된 String 인스턴스의 문자열(정규표현식)을 이용하여
		//문자열 분리 후 String 인스턴스 배열로 반환하는 메소드
		String[] array=str9.split("-");
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
		}
		System.out.println("============================================");
		
		//String.substring(int beginIndex, int endIndex) : String 인스턴스에
		//저장된 문자열 상수에서 시작 위치값(beginIndex - 문자 포함)부터 
		//마지막 위치값(endIndex - 문자 미포함)까지의 문자열을 분리 후
		//String 인스턴스로 반환하는 메소드
		System.out.println("str9.substring(0,3) = "+str9.substring(0,3));
		System.out.println("str9.substring(4,8) = "+str9.substring(4,8));
		System.out.println("str9.substring(9,13) = "+str9.substring(9,13));
		//시작 위치값만 전달할 경우 마지막 위치값은 자동으로 문자열의 
		//마지막까지 표현되어 분리
		System.out.println("str9.substring(9) = "+str9.substring(9));
		System.out.println("============================================");
	}
}