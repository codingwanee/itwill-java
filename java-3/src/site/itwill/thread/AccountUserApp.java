package site.itwill.thread;

public class AccountUserApp {
	public static void main(String[] args) {
		Account account=new Account(10000);//잔액 : 10000
		
		//스레드 인스턴스로 스레드를 생성하여 run() 메소드의 명령 실행
		new AccountUser("홍길동", account).start();
		new AccountUser("임꺽정", account).start();
		new AccountUser("전우치", account).start();
	}
}
