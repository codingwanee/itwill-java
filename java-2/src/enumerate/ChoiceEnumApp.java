package enumerate;

//Enum �������� JDK 1.5�̻󿡼� �����Ͽ� ��� ����
public class ChoiceEnumApp {
	public static void main(String[] args) {
		//����ʵ带 ǥ���� ��� ����ʵ�� ���
		// => �ǹ� �ִ� ���ڿ��� ǥ�� ����
		System.out.println("���� = "+ChoiceEnumOne.INSERT);
		System.out.println("���� = "+ChoiceEnumOne.UPDATE);
		System.out.println("���� = "+ChoiceEnumOne.DELETE);
		System.out.println("�˻� = "+ChoiceEnumOne.SELECT);
		System.out.println("============================================");
		//������ ����� ������ ������������ ���� ����
		// => ������ ����� ��ǥ������ ǥ�� 
		ChoiceEnumOne choice=ChoiceEnumOne.INSERT;
		//������ ���������� �ٸ� �ڷ����� ����� ������ ��� ���� �߻�
		//ChoiceEnumOne choice=0;
		
		System.out.println("choice = "+choice);
		System.out.println("============================================");
		//EnumType.values() : ����ʵ带 �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ��� �������� �ڵ����� �����ϴ� �޼ҵ�
		for(ChoiceEnumOne temp:ChoiceEnumOne.values()) {
			//EnumType.ordinal() : ����ʵ忡 �ڵ����� �ο��� �������� ��ȯ�ϴ� �޼ҵ�
			// => ��� �������� �ڵ����� �����ϴ� �޼ҵ�
			System.out.println(temp+" = "+temp.ordinal());
		}
		System.out.println("============================================");
		System.out.println("���� = "+ChoiceEnumTwo.ADD);
		System.out.println("���� = "+ChoiceEnumTwo.MODIFY);
		System.out.println("���� = "+ChoiceEnumTwo.REMOVE);
		System.out.println("�˻� = "+ChoiceEnumTwo.SEARCH);
		System.out.println("============================================");
		System.out.println(ChoiceEnumTwo.ADD+" = "+ChoiceEnumTwo.ADD.getValue());
		System.out.println(ChoiceEnumTwo.MODIFY+" = "+ChoiceEnumTwo.MODIFY.getValue());
		System.out.println(ChoiceEnumTwo.REMOVE+" = "+ChoiceEnumTwo.REMOVE.getValue());
		System.out.println(ChoiceEnumTwo.SEARCH+" = "+ChoiceEnumTwo.SEARCH.getValue());
		System.out.println("============================================");
		//switch ��ɿ� ������ ���������� ����� ��� case ���� ������ ����� ��� ����
		// => ����ʵ带 �����Ͽ� �ڷ��� ������ �ǹ�
		switch (choice) {
		case INSERT:
		//case ADD:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case UPDATE:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case DELETE:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case SELECT:
			System.out.println("# ������ �����մϴ�. #");
			break;
		}	
		System.out.println("============================================");
	}
}




