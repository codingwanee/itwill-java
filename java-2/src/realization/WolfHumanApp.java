package realization;

public class WolfHumanApp {
	public static void main(String[] args) {
		WolfHuman wh=new WolfHuman();
		
		wh.speak();
		wh.walk();
		wh.change();
		wh.cryLoudly();
		wh.fastWalk();
		System.out.println("============================================");
		//�θ�Ŭ������ ���������� �����Ͽ� �ν��Ͻ��� ������ ��� �θ�Ŭ������ �޼ҵ� ���� 
		Human human=new WolfHuman();
		
		human.speak();
		human.walk();
		
		System.out.println("============================================");
		//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ�Ŭ������ �޼ҵ� ����
		((WolfHuman)human).change();
		System.out.println("============================================");
		//�ڽ�Ŭ������ ������ ��� �θ�Ŭ������ �������� �ڷ����� �θ�
		//�������̽� �ڷ������� ����� ��ü ����ȯ�Ͽ� ���� ����
		Wolf wolf=(Wolf)human;
		
		//������ ��ü ����ȯ�� ���� �ڽ�Ŭ������ �޼ҵ尡 �ڵ� ����
		wolf.cryLoudly();
		wolf.fastWalk();
		System.out.println("============================================");
	}
}