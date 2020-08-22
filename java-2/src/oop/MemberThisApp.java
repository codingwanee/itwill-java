package oop;

public class MemberThisApp {
	public static void main(String[] args) {
		MemberThis member1=new MemberThis();
		member1.display();
		System.out.println("============================================");
		member1.setId("abc");
		member1.setPassword("1234");
		member1.setName("È«±æµ¿");
		member1.display();
		System.out.println("============================================");
		MemberThis member2=new MemberThis("xyz", "6789", "ÀÓ²©Á¤");
		member2.display();
		System.out.println("============================================");
	}
}
