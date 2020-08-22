package site.itwill.util;

//참조형을 선언할 경우 제네릭 타입을 이용하여 선언 가능
// => 제네릭(Generic) 타입 : 식별자를 참조형 대신 사용하기 위한 미지정 자료형 - JDK1.5이상
// => 제네릭 타입은 ,를 이용하여 나열 선언
// => 제네릭 타입의 식별자는 대문자로 선언하는 것을 권장
// => 제네릭 타입에 참조형을 전달하면 제네릭 타입이 참조형으로 변환되어 사용
public class Generic<T> {
	private T field;

	public Generic() {
		// TODO Auto-generated constructor stub
	}

	public Generic(T field) {
		super();
		this.field = field;
	}

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
}
