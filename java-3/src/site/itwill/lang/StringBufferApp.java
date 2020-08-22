package site.itwill.lang;

public class StringBufferApp {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		//StringBuffer.append(Object o) : StringBuffer 인스턴스에 저장된 
		//문자열 상수에 파라메터로 대상을 전달받아 추가 시키는 메소드
		sb.append("ABCDEFG");
		
		//StringBuffer.toString() : StringBuffer 인스턴스에 저장된 문자열 
		//상수를 String 인스턴스에 저장하여 반환하는 메소드
		String str=sb.toString();
		System.out.println("str = "+str);
		System.out.println("============================================");

		//StringBuffer 인스턴스에 저장된 문자열 상수를 반환받아 출력할 경우 toString() 메소드 호출 생략 가능
		System.out.println("sb = "+sb);
		System.out.println("============================================");

		//StringBuffer.insert(int offset, Object o) : StringBuffer 인스턴스에
		//저장된 문자열 상수에 파라메터로 전달된 대상을 원하는 위치에 삽입하는 메소드
		sb.insert(4, "X");
		System.out.println("sb = "+sb);
		System.out.println("============================================");
		
		//StringBuffer.deleteCharAt(int index) : StringBuffer 인스턴스에
		//저장된 문자열 상수에 파라메터로 전달된 위치의 문자를 제거하는 메소드
		sb.deleteCharAt(2);
		System.out.println("sb = "+sb);
		System.out.println("============================================");
		
		//StringBuffer.delete(int start, int end) : StringBuffer 인스턴스에
		//저장된 문자열 상수에 첫번째 파라메터로 전달된 위치부터 두번째 파라메터로
		//전달된 위치 전까지의 문자들을 제거하는 메소드
		sb.delete(4, 6);
		System.out.println("sb = "+sb);
		System.out.println("============================================");
			
		//StringBuffer.reverse() : StringBuffer 인스턴스에 저장된 문자열 상수의
		//문자들을 반대로 나열하여 재배치하는 메소드
		sb.reverse();
		System.out.println("sb = "+sb);
		System.out.println("============================================");
	}
}






