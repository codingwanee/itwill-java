package realization;

//�������̽��� ��ӹ��� Ŭ������ �ݵ�� �������̽��� ����� �߻�޼ҵ带 
//��� �������̵� ���� => ��üȭ
public class WolfHuman extends Human implements Wolf {
	@Override
	public void cryLoudly() {
		System.out.println("[����]ū�Ҹ��� ���¢�� �� �ִ� �ɷ�");
	}

	@Override
	public void fastWalk() {
		System.out.println("[����]�׹߷� ������ �޸� �� �ִ� �ɷ�");
	}
	
	public void change() {
		System.out.println("[�����ΰ�]������ �� �ִ� �ɷ�");
	}
}




