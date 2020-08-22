package site.itwill.event;

import site.itwill.event.Outer.Inner;
import site.itwill.event.Outer.Nested;

public class OuterApp {
	public static void main(String[] args) {
		Outer outer=new Outer(100);
		outer.outerDisplay();
		outer.outerInnerDisplay();
		System.out.println("============================================");
		//����Ŭ������ �ܺ�Ŭ������ �̿��Ͽ� ǥ�� ����
		// => �ܺ�Ŭ������ �ν��Ͻ� �̿��Ͽ� ����Ŭ������ �ν��Ͻ� ���� ���� 
		Inner inner=outer.new Inner(300);
		inner.innerDisplay();
		inner.innerOuterDisplay();
		System.out.println("============================================");
		//��������Ŭ������ �ܺ�Ŭ������ �̿��Ͽ� ǥ�� ����
		// => ��������Ŭ������ �ܺ�Ŭ������ �ν��Ͻ� ���� �ν��Ͻ� ���� ����
		Nested nested=new Nested(400);
		nested.nestedDisplay();
		System.out.println("============================================");
	}
}
