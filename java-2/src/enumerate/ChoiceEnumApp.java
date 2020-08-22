package enumerate;

//Enum 참조형은 JDK 1.5이상에서 선언하여 사용 가능
public class ChoiceEnumApp {
	public static void main(String[] args) {
		//상수필드를 표현할 경우 상수필드명 사용
		// => 의미 있는 문자열로 표현 가능
		System.out.println("삽입 = "+ChoiceEnumOne.INSERT);
		System.out.println("변경 = "+ChoiceEnumOne.UPDATE);
		System.out.println("삭제 = "+ChoiceEnumOne.DELETE);
		System.out.println("검색 = "+ChoiceEnumOne.SELECT);
		System.out.println("============================================");
		//나열형 상수는 나열형 참조변수에만 저장 가능
		// => 나열형 상수를 대표적으로 표현 
		ChoiceEnumOne choice=ChoiceEnumOne.INSERT;
		//나열형 참조변수에 다른 자료형의 상수를 저장할 경우 에러 발생
		//ChoiceEnumOne choice=0;
		
		System.out.println("choice = "+choice);
		System.out.println("============================================");
		//EnumType.values() : 상수필드를 배열로 변환하여 반환하는 메소드
		// => 모든 나열형에 자동으로 제공하는 메소드
		for(ChoiceEnumOne temp:ChoiceEnumOne.values()) {
			//EnumType.ordinal() : 상수필드에 자동으로 부여된 고유값을 반환하는 메소드
			// => 모든 나열형에 자동으로 제공하는 메소드
			System.out.println(temp+" = "+temp.ordinal());
		}
		System.out.println("============================================");
		System.out.println("삽입 = "+ChoiceEnumTwo.ADD);
		System.out.println("변경 = "+ChoiceEnumTwo.MODIFY);
		System.out.println("삭제 = "+ChoiceEnumTwo.REMOVE);
		System.out.println("검색 = "+ChoiceEnumTwo.SEARCH);
		System.out.println("============================================");
		System.out.println(ChoiceEnumTwo.ADD+" = "+ChoiceEnumTwo.ADD.getValue());
		System.out.println(ChoiceEnumTwo.MODIFY+" = "+ChoiceEnumTwo.MODIFY.getValue());
		System.out.println(ChoiceEnumTwo.REMOVE+" = "+ChoiceEnumTwo.REMOVE.getValue());
		System.out.println(ChoiceEnumTwo.SEARCH+" = "+ChoiceEnumTwo.SEARCH.getValue());
		System.out.println("============================================");
		//switch 명령에 나열형 참조변수를 사용할 경우 case 값은 나열형 상수만 사용 가능
		// => 상수필드를 구분하여 자료형 영역이 의미
		switch (choice) {
		case INSERT:
		//case ADD:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case UPDATE:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case DELETE:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case SELECT:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		}	
		System.out.println("============================================");
	}
}




