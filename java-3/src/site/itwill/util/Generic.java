package site.itwill.util;

//�������� ������ ��� ���׸� Ÿ���� �̿��Ͽ� ���� ����
// => ���׸�(Generic) Ÿ�� : �ĺ��ڸ� ������ ��� ����ϱ� ���� ������ �ڷ��� - JDK1.5�̻�
// => ���׸� Ÿ���� ,�� �̿��Ͽ� ���� ����
// => ���׸� Ÿ���� �ĺ��ڴ� �빮�ڷ� �����ϴ� ���� ����
// => ���׸� Ÿ�Կ� �������� �����ϸ� ���׸� Ÿ���� ���������� ��ȯ�Ǿ� ���
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
