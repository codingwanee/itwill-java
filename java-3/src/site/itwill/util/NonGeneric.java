package site.itwill.util;

//필드 자료형에 따라 여러 개의 클래스를 선언하여 사용
//해결방법 >> 필드의 타입을 Object 클래스로 선언하여 모든 인스턴스를 저장
// => Object 클래스는 모든 클래스의 부모클래스로 Object 참조변수에 자식 인스턴스 저장 가능
public class NonGeneric {
	private Object field;
	
	public NonGeneric() {
		// TODO Auto-generated constructor stub
	}

	public NonGeneric(Object field) {
		super();
		this.field = field;
	}

	public Object getField() {
		return field;
	}

	public void setField(Object field) {
		this.field = field;
	}
}
