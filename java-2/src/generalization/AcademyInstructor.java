package generalization;

//�п���������(�����ȣ,�����̸�,���ǰ���)�� ������ ������ Ŭ����
// => �����ȣ�� �����̸� ���� �Ӽ��� ����� AcademyPerson Ŭ������ ��ӹ޾� ���
public class AcademyInstructor extends AcademyPerson {
	private String subject;
	
	public AcademyInstructor() {
		// TODO Auto-generated constructor stub
	}

	public AcademyInstructor(int number, String name, String subject) {
		super(number, name);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("�����ȣ = "+getNumber());
		System.out.println("�����̸� = "+getName());
		System.out.println("���ǰ��� = "+subject);
	}
}
