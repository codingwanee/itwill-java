package site.itwill.thread;

public class AccountUserApp {
	public static void main(String[] args) {
		Account account=new Account(10000);//�ܾ� : 10000
		
		//������ �ν��Ͻ��� �����带 �����Ͽ� run() �޼ҵ��� ��� ����
		new AccountUser("ȫ�浿", account).start();
		new AccountUser("�Ӳ���", account).start();
		new AccountUser("����ġ", account).start();
	}
}
