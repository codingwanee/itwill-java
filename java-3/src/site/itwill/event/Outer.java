package site.itwill.event;

//외부클래스(Outer Class) : 내부클래스를 포함한 클래스
// => 내부클래스를 인스턴스로 생성하여 사용 가능
public class Outer {
	private int outerNum;
	
	public Outer() {
		// TODO Auto-generated constructor stub
	}

	public Outer(int outerNum) {
		super();
		this.outerNum = outerNum;
	}

	public int getOuterNum() {
		return outerNum;
	}

	public void setOuterNum(int outerNum) {
		this.outerNum = outerNum;
	}
	
	public void outerDisplay() {
		System.out.println("outerNum = "+outerNum);
	}
	
	public void outerInnerDisplay() {
		//내부클래스를 이용하여 인스턴스 생성
		Inner inner=new Inner(200);
		inner.innerDisplay();
	}
	
	//내부클래스(Inner Class) : 클래스 안에 선언된 클래스
	// => 외부클래스에서만 사용 가능한 클래스 선언
	// => 외부클래스의 필드와 메소드에 접근 가능
	public class Inner {
		private int innerNum;
		
		public Inner() {
			// TODO Auto-generated constructor stub
		}

		public Inner(int innerNum) {
			super();
			this.innerNum = innerNum;
		}

		public int getInnerNum() {
			return innerNum;
		}

		public void setInnerNum(int innerNum) {
			this.innerNum = innerNum;
		}
		
		public void innerDisplay() {
			System.out.println("innerNum = "+innerNum);
		}
		
		public void innerOuterDisplay() {
			//System.out.println("outerNum = "+outerNum);
			outerDisplay();
		}
	}
	
	//정적내부클래스(Nested Class) : 클래스 안에 선언된 정적클래스
	// => 외부클래스를 통해 다른 클래스에서 사용 가능한 클래스 선언
	// => 외부클래스의 정적필드와 정적메소드 사용 가능
	public static class Nested {
		private int nestedNum;
		
		public Nested() {
			// TODO Auto-generated constructor stub
		}

		public Nested(int nestedNum) {
			super();
			this.nestedNum = nestedNum;
		}

		public int getNestedNum() {
			return nestedNum;
		}

		public void setNestedNum(int nestedNum) {
			this.nestedNum = nestedNum;
		}
		
		public void nestedDisplay() {
			System.out.println("nestedNum = "+nestedNum);
		}
	}
}







