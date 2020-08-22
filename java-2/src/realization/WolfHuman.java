package realization;

//인터페이스를 상속받은 클래스는 반드시 인터페이스에 선언된 추상메소드를 
//모두 오버라이드 선언 => 실체화
public class WolfHuman extends Human implements Wolf {
	@Override
	public void cryLoudly() {
		System.out.println("[늑대]큰소리로 울부짖을 수 있는 능력");
	}

	@Override
	public void fastWalk() {
		System.out.println("[늑대]네발로 빠르게 달릴 수 있는 능력");
	}
	
	public void change() {
		System.out.println("[늑대인간]변신할 수 있는 능력");
	}
}




