package enumerate;

//인터페이스에 상수필드를 선언할 경우의 단점 >> 나열형(EnumType)을 이용하여 단점 보완 
// => 상수를 대표적으로 표현하기에 부적절
// => 의미 있는 문자열로 표현하기에 부적절
// => 상수필드를 구분하여 자료형 영역이 무의미
public class ChoiceInterfaceApp {
	public static void main(String[] args) {
		//상수필드를 표현할 경우 저장된 상수 사용
		System.out.println("삽입 = "+ChoiceInterfaceOne.INSERT);
		System.out.println("변경 = "+ChoiceInterfaceOne.UPDATE);
		System.out.println("삭제 = "+ChoiceInterfaceOne.DELETE);
		System.out.println("검색 = "+ChoiceInterfaceOne.SELECT);
		System.out.println("============================================");
		//상수필드와 동일한 자료형의 변수에 저장 가능
		int choice=ChoiceInterfaceOne.INSERT;
		System.out.println("choice = "+choice);
		System.out.println("============================================");
		System.out.println("삽입 = "+ChoiceInterfaceTwo.ADD);
		System.out.println("변경 = "+ChoiceInterfaceTwo.MODIFY);
		System.out.println("삭제 = "+ChoiceInterfaceTwo.REMOVE);
		System.out.println("검색 = "+ChoiceInterfaceTwo.SEARCH);
		System.out.println("============================================");
		switch(choice) {
		//case ChoiceInterfaceOne.INSERT:
		case ChoiceInterfaceTwo.ADD:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case ChoiceInterfaceOne.UPDATE:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case ChoiceInterfaceOne.DELETE:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		case ChoiceInterfaceOne.SELECT:
			System.out.println("# 정보를 삽입합니다. #");
			break;
		}
		System.out.println("============================================");
	}
}



