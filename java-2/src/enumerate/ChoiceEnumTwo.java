package enumerate;

public enum ChoiceEnumTwo {
	//�����ڸ� ������ ��� ����ʵ� ����� �ʱⰪ�� �����Ͽ� ����ʵ� ����
	//ADD,MODIFY,REMOVE,SEARCH;
	ADD(1),MODIFY(2),REMOVE(3),SEARCH(4);
	
	//����ʵ忡 �ڷ����� �����ϱ� ���� �ʵ� ����
	// => private final �ʵ� ����
	// => ����ʵ忡 ���ϴ� ����� �����ϱ� ���� �����ڸ� �ݵ�� ����
	private final int value;
	
	//����ʵ忡 �ʱⰪ�� �����Ͽ� �����ϱ� ���� ������
	// => �����ڸ� private ���������ڷ� ����ȭ ����
	// => ����ʵ忡 ����� �����ϱ� ���� �ݵ�� �Ķ���� ���� 
	private ChoiceEnumTwo(int value) {
		this.value=value;
	}

	//����ʵ尪�� Ȯ���ϱ� ���� Getter �޼ҵ�
	public int getValue() {
		return value;
	}
}




