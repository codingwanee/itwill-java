package generalization;

public class MemberCastApp {
	public static void main(String[] args) {
		//�θ�Ŭ���� ��������=new �θ�Ŭ����(); 
		// => ���� : �θ��ν��Ͻ��� �����Ͽ� �θ����������� ����
		Member member1=new Member();
		//�θ����������� ����� �ν��Ͻ��� �̿��Ͽ� �θ�Ŭ������ ��ҿ� ���� ����
		member1.setEmail("aaa@itwill.site");
		member1.setName("ȫ�浿");
		
		member1.display();
		System.out.println("============================================");
		//�ڽ�Ŭ���� ��������=new �ڽ�Ŭ����();
		// => ���� : �θ��ν��Ͻ��� �ڽ��ν��Ͻ��� �����Ͽ� �ڽ��ν��Ͻ� ������ �ڽ����������� ����
		EventMember member2=new EventMember();
		
		//�ڽ����������� ����� �ν��Ͻ��� �̿��Ͽ� �ڽ�Ŭ������ ��ҿ� �θ�Ŭ������ ��ҿ� ���� ����
		member2.setEmail("bbb@itwill.site");
		member2.setName("�Ӳ���");
		member2.setAddress("����� ������");
		
		member2.display();
		System.out.println("============================================");
		//�ڽ�Ŭ���� ��������=new �θ�Ŭ����();
		// => �Ұ��� : �ڽ��ν��Ͻ��� �������� �ʾ� ������ ��� ���� �߻�
		//EventMember member3=new Member(); 
		System.out.println("============================================");
		//�θ�Ŭ���� ��������=new �ڽ�Ŭ����();
		// => ���� : �θ��ν��Ͻ��� �ڽ��ν��Ͻ��� �����Ͽ� �θ��ν��Ͻ� ������ �θ����������� ����
		Member member4=new EventMember();
		
		//�θ����������� ����� �ν��Ͻ��� �̿��Ͽ� �θ�Ŭ������ ��ҿ� ���� ����
		member4.setEmail("ccc@itwill.site");
		member4.setName("����ġ");
		
		//��ü ����ȯ�� �̿��Ͽ� �ڽ�Ŭ������ ��ҿ� ���� ����
		
		//������ ��ü ����ȯ�� �̿��Ͽ� ���������� ����� �θ��ν��Ͻ� ������
		//�����ڰ� ������ �ڽ��ν��Ͻ� ������ �Ͻ������� ��ȯ�Ͽ� �ڽ�Ŭ���� ��ҿ� ����
		/*
		EventMember member=(EventMember)member4;
		member.setAddress("������ �ȴޱ�");
		*/
		((EventMember)member4).setAddress("������ �ȴޱ�");
		
		//������ ��ü ����ȯ�� �̿��Ͽ� ���������� ����� �θ��ν��Ͻ� ������
		//JVM�� �ڵ����� �ڽ��ν��Ͻ� ������ �Ͻ������� ��ȯ�Ͽ� �ڽ�Ŭ���� ��ҿ� ����
		// => �������̵� ����� �޼ҵ��� ��� �θ�Ŭ������ �޼ҵ尡 ������ �־�  
		//    �ڽ�Ŭ������ �޼ҵ忡 ������ �� �ֵ��� �ڵ����� ��ü ����ȯ
		member4.display();
		System.out.println("============================================");
	}
}