package generalization;

public class MemberApp {
	public static void main(String[] args) {
		Member member1=new Member();
		
		member1.setEmail("abc@daum.net");
		member1.setName("ȫ�浿");
		
		member1.display();
		System.out.println("============================================");
		Member member2=new Member("xyz@naver.com", "�Ӳ���");
		member2.display();
		System.out.println("============================================");
	}
}
