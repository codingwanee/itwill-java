package oop;

//ȸ������(���̵�,��й�ȣ,�̸�)�� ������ ������ Ŭ����
public class MemberThis {
	//�ʵ忡 ����� �⺻�� >> ������ : 0, �Ǽ��� : 0.0, ���� : false, ������ : null
	//�ʵ忡 ����� �⺻�� ���� ���� >> �ڷ��� �ʵ��=��;
	private String id="guest";
	private String password="1234";
	private String name="���Է�";
	
	public MemberThis() {
		//�����ڿ����� �ʵ� �Ǵ� �޼ҵ� ���� ����
		/*
		id="guest";//setId("guest"); ��ɰ� ����
		password="1234";
		name="���Է�";
		*/
		
		//MemberThis(String id, String password, String name) ������ ȣ��
		//this("guest","1234","���Է�");
	}

	public MemberThis(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//ȸ�������� ����ϱ� ���� �޼ҵ�
	public void display() {
		//�޼ҵ忡�� �ν��Ͻ� �ʵ� �Ǵ� �޼ҵ忡 �����ϱ� ���� this ���
		//System.out.println("���̵� = "+this.id);
		//this Ű���带 �����ص� �ʵ� �Ǵ� �޼ҵ忡 ���� ����
		System.out.println("���̵� = "+id);
		System.out.println("��й�ȣ = "+password);
		System.out.println("�̸� = "+name);
	}
}
