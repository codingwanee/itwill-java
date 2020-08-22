package site.itwill.util;

//�л�����(�й�,�̸�)�� ������ ������ Ŭ���� >> VO(Value Object) Ŭ����
// => �ٸ� �л������� ���ϱ� ���� Comparable �������̽��� ��ӹ޾� �ۼ�
public class Student implements Comparable<Student> {
	private int num;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[�й� = "+num+", �̸� = "+name+"]";
	}

	@Override
	public int compareTo(Student o) {
		//this �ʵ尪�� �Ķ���� �ʵ尪�� ��(����)�Ͽ� ��� ��ȯ 
		//return num-o.num;//�й��� ���� �������� ����
		//return o.num-num;//�й��� ���� �������� ����
		return name.compareTo(o.name);//�̸��� ���� �������� ����
		//return o.name.compareTo(name);//�̸��� ���� �������� ����
	}
}
