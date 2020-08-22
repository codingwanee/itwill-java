package site.itwill.thread;

//은행계좌 정보(잔액)를 저장할 목적의 클래스
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
	
	//입금 처리 메소드 : 입금액을 전달받아 잔액 증가
	//동기화 메소드 : 스레드가 메소드를 호출하여 결과를 제공하기 전까지 
	//다른 스레드의 메소드 요청에 대한 처리를 일시 중지하는 메소드
	public /* synchronized */ void deposit(String name, int amount) {
		money+=amount;
		System.out.println("[메세지]입금 성공 = 입금자 : "+name
			+", 입금액 : "+amount+"원 >> 잔액 : "+money+"원");
	}
	
	//출금 처리 메소드 : 출금액을 전달받아 잔액 감소
	public /* synchronized */ void withDraw(String name, int amount) {
		if(money<amount) {//잔액이 모자란 경우
			System.out.println("[에러]출금 실패 = 출금자 : "+name
					+", 출금액 : "+amount+"원 >> 잔액 : "+money+"원");
			return;
		}
		money-=amount;
		System.out.println("[메세지]출금 성공 = 출금자 : "+name
				+", 출금액 : "+amount+"원 >> 잔액 : "+money+"원");
	}
}