package site.itwill.thread;

//������� ����(�ܾ�)�� ������ ������ Ŭ����
public class Account {
	private int money;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int money) {
		super();
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//�Ա� ó�� �޼ҵ� : �Աݾ��� ���޹޾� �ܾ� ����
	//����ȭ �޼ҵ� : �����尡 �޼ҵ带 ȣ���Ͽ� ����� �����ϱ� ������ 
	//�ٸ� �������� �޼ҵ� ��û�� ���� ó���� �Ͻ� �����ϴ� �޼ҵ�
	public /* synchronized */ void deposit(String name, int amount) {
		money+=amount;
		System.out.println("[�޼���]�Ա� ���� = �Ա��� : "+name
			+", �Աݾ� : "+amount+"�� >> �ܾ� : "+money+"��");
	}
	
	//��� ó�� �޼ҵ� : ��ݾ��� ���޹޾� �ܾ� ����
	public /* synchronized */ void withDraw(String name, int amount) {
		if(money<amount) {//�ܾ��� ���ڶ� ���
			System.out.println("[����]��� ���� = ����� : "+name
					+", ��ݾ� : "+amount+"�� >> �ܾ� : "+money+"��");
			return;
		}
		money-=amount;
		System.out.println("[�޼���]��� ���� = ����� : "+name
				+", ��ݾ� : "+amount+"�� >> �ܾ� : "+money+"��");
	}
}