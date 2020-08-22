package site.itwill.util;

//제네릭 타입에 전달될 참조형에 대한 제한을 설정하기 위해 extends 사용
// => 특정 클래스를 상속받는 자식클래스만 제네릭 타입에 전달 가능
public class ExtendsGeneric<T extends Number> {
	private T field;
	
	public ExtendsGeneric() {
		// TODO Auto-generated constructor stub
	}

	public ExtendsGeneric(T field) {
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
