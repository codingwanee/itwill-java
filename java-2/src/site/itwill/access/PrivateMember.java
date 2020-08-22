package site.itwill.access;

public class PrivateMember {
	private String name;
	
	@SuppressWarnings("unused")
	private void display() {
		System.out.println("name = "+name);
	}
}
