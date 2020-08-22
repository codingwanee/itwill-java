package enumerate;

public enum ChoiceEnumTwo {
	//생성자를 선언한 경우 상수필드 선언시 초기값을 전달하여 상수필드 생성
	//ADD,MODIFY,REMOVE,SEARCH;
	ADD(1),MODIFY(2),REMOVE(3),SEARCH(4);
	
	//상수필드에 자료형을 설정하기 위한 필드 선언
	// => private final 필드 선언
	// => 상수필드에 원하는 상수를 저장하기 위해 생성자를 반드시 선언
	private final int value;
	
	//상수필드에 초기값을 전달하여 저장하기 위한 생성자
	// => 생성자를 private 접근지정자로 은닉화 선언
	// => 상수필드에 상수를 저장하기 위해 반드시 파라메터 선언 
	private ChoiceEnumTwo(int value) {
		this.value=value;
	}

	//상수필드값을 확인하기 위한 Getter 메소드
	public int getValue() {
		return value;
	}
}




