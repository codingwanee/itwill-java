package generalization;

//�̺�Ʈ�� ������ ȸ������(�̸���,�̸�,�ּ�)�� ������ ������ Ŭ����
// => ȸ�������� �����ϴ� Member Ŭ����(�̸���,�̸�)�� ��ӹ޾� �ۼ�
public class EventMember extends Member {
	//private String email;
	//private String name;
	private String address;
	
	public EventMember() {
		// TODO Auto-generated constructor stub
		//super Ű����� �θ�Ŭ������ ������ ȣ�� 
		// => ������ ��� �θ�Ŭ������ �⺻ ������ ȣ��
		//super();//�θ�Ŭ������ �⺻ ������ ȣ��
	}

	/*
	public EventMember(String email, String name, String address) {
		super();
		//this.email = email;//����ȭ ����� �ʵ忡 ������ ��� ���� �߻�
		//�ڽ�Ŭ������ ������� ���� �޼ҵ�� �ڵ����� �θ�Ŭ������ �޼ҵ� ��� 
		// => �ڽ�Ŭ������ �޼ҵ忡���� �θ�Ŭ������ �޼ҵ� ȣ�� ���� : super Ű���� ���
		setEmail(email);
		//this.name = name;
		setName(name);
		this.address = address;
	}
	*/
	
	//Alt+Shift+S >> O >> �θ�Ŭ������ ������ ���� >> �ʵ� ���� >> Generate
	public EventMember(String email, String name, String address) {
		super(email, name);
		this.address = address;
	}

	/*
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	*/

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	/*
	public void displayEvent() {
		//System.out.println("�̸��� = "+email);
		System.out.println("�̸��� = "+getEmail());
		//System.out.println("�̸� = "+name);
		System.out.println("�̸� = "+getName());
		System.out.println("�ּ� = "+address);
	}
	*/
	
	//�޼ҵ� �������̵� ���� - �θ�Ŭ������ �޼ҵ�� >> Ctrl+Space >> Override ����
	//@Override : API �������� �޼ҵ��� �������̵� �޼����� �����ϱ� ���� ������̼�()
	// => �������̵� �ۼ� ��Ģ��� �������� ���� ��� ���� ��
	@Override
	public void display() {
		//super Ű����� �������̵� ����Ǿ� ������ �θ�Ŭ������ �޼ҵ� ȣ��
		super.display();
		System.out.println("�ּ� = "+address);
	}
}




