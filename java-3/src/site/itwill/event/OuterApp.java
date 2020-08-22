package site.itwill.event;

import site.itwill.event.Outer.Inner;
import site.itwill.event.Outer.Nested;

public class OuterApp {
	public static void main(String[] args) {
		Outer outer=new Outer(100);
		outer.outerDisplay();
		outer.outerInnerDisplay();
		System.out.println("============================================");
		//내부클래스는 외부클래스를 이용하여 표현 가능
		// => 외부클래스의 인스턴스 이용하여 내부클래스의 인스턴스 생성 가능 
		Inner inner=outer.new Inner(300);
		inner.innerDisplay();
		inner.innerOuterDisplay();
		System.out.println("============================================");
		//내부정적클래스는 외부클래스를 이용하여 표현 가능
		// => 내부정적클래스는 외부클래스의 인스턴스 없이 인스턴스 생성 가능
		Nested nested=new Nested(400);
		nested.nestedDisplay();
		System.out.println("============================================");
	}
}
