package generalization;

//�п��л�����(�л���ȣ,�л��̸�,��������)�� ������ ������ Ŭ����
// => �л���ȣ�� �л��̸� ���� �Ӽ��� ����� AcademyPerson Ŭ������ ��ӹ޾� ���
public class AcademyStudnet extends AcademyPerson {
	private String course;
	
	public AcademyStudnet() {
		// TODO Auto-generated constructor stub
	}

	public AcademyStudnet(int number, String name, String course) {
		super(number, name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	@Override
	public void display() {
		System.out.println("�л���ȣ = "+getNumber());
		System.out.println("�л��̸� = "+getName());
		System.out.println("�������� = "+course);
	}
}




