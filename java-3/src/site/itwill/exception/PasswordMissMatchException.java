package site.itwill.exception;

//비밀번호가 맞지 않을 경우 발생되는 예외를 처리하기 위한 클래스
public class PasswordMissMatchException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public PasswordMissMatchException() {
		//super();
	}
	
	//예외메세지를 전달받아 제공하기 위한 생성자
	// => Exception 클래스의 필드에 저장되도록 super 키워드로 Exception 클래스 생성자 호출
	public PasswordMissMatchException(String message) {
		super(message);
	}
}




