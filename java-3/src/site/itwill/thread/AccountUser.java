package site.itwill.thread;

//������¸� ����� �� �ִ� ����� ������ ������ ������ Ŭ����
// => Ŭ������ ������ ������� �Ա� ��� �� ��� ��� ����
public class AccountUser extends Thread {
	private String userName;
	private Account account;
	
	public AccountUser() {
		// TODO Auto-generated constructor stub
	}

	public AccountUser(String userName, Account account) {
		super();
		this.userName = userName;
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		//(int)(Math.random()*100+1)*100 >> 100~10000 ������ 100 ���� �������� �߻�
		synchronized (account) {
			account.withDraw(userName, (int)(Math.random()*100+1)*100);//���
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		synchronized (account) {
			account.deposit(userName, (int)(Math.random()*100+1)*100);//�Ա�
		}
	}
}








