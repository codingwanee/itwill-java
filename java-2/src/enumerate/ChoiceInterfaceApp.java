package enumerate;

//�������̽��� ����ʵ带 ������ ����� ���� >> ������(EnumType)�� �̿��Ͽ� ���� ���� 
// => ����� ��ǥ������ ǥ���ϱ⿡ ������
// => �ǹ� �ִ� ���ڿ��� ǥ���ϱ⿡ ������
// => ����ʵ带 �����Ͽ� �ڷ��� ������ ���ǹ�
public class ChoiceInterfaceApp {
	public static void main(String[] args) {
		//����ʵ带 ǥ���� ��� ����� ��� ���
		System.out.println("���� = "+ChoiceInterfaceOne.INSERT);
		System.out.println("���� = "+ChoiceInterfaceOne.UPDATE);
		System.out.println("���� = "+ChoiceInterfaceOne.DELETE);
		System.out.println("�˻� = "+ChoiceInterfaceOne.SELECT);
		System.out.println("============================================");
		//����ʵ�� ������ �ڷ����� ������ ���� ����
		int choice=ChoiceInterfaceOne.INSERT;
		System.out.println("choice = "+choice);
		System.out.println("============================================");
		System.out.println("���� = "+ChoiceInterfaceTwo.ADD);
		System.out.println("���� = "+ChoiceInterfaceTwo.MODIFY);
		System.out.println("���� = "+ChoiceInterfaceTwo.REMOVE);
		System.out.println("�˻� = "+ChoiceInterfaceTwo.SEARCH);
		System.out.println("============================================");
		switch(choice) {
		//case ChoiceInterfaceOne.INSERT:
		case ChoiceInterfaceTwo.ADD:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case ChoiceInterfaceOne.UPDATE:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case ChoiceInterfaceOne.DELETE:
			System.out.println("# ������ �����մϴ�. #");
			break;
		case ChoiceInterfaceOne.SELECT:
			System.out.println("# ������ �����մϴ�. #");
			break;
		}
		System.out.println("============================================");
	}
}



