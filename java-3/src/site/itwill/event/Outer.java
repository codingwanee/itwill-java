package site.itwill.event;

//�ܺ�Ŭ����(Outer Class) : ����Ŭ������ ������ Ŭ����
// => ����Ŭ������ �ν��Ͻ��� �����Ͽ� ��� ����
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
		//����Ŭ������ �̿��Ͽ� �ν��Ͻ� ����
		Inner inner=new Inner(200);
		inner.innerDisplay();
	}
	
	//����Ŭ����(Inner Class) : Ŭ���� �ȿ� ����� Ŭ����
	// => �ܺ�Ŭ���������� ��� ������ Ŭ���� ����
	// => �ܺ�Ŭ������ �ʵ�� �޼ҵ忡 ���� ����
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
	
	//��������Ŭ����(Nested Class) : Ŭ���� �ȿ� ����� ����Ŭ����
	// => �ܺ�Ŭ������ ���� �ٸ� Ŭ�������� ��� ������ Ŭ���� ����
	// => �ܺ�Ŭ������ �����ʵ�� �����޼ҵ� ��� ����
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







