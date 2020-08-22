package generalization;

//�п� �����ڿ�(�л�,����,����) ���� ���α׷�
public class AcademyApp {
	/*
	public static void processStudent(AcademyStudnet studnet) {
		//�п��л������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void processInstructor(AcademyInstructor instructor) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void processStaff(AcademyStaff staff) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	*/
	
	/*
	//�޼ҵ� �����ε�
	public static void process(AcademyStudnet studnet) {
		//�п��л������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void process(AcademyInstructor instructor) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void process(AcademyStaff staff) {
		//�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	*/
	
	public static void process(AcademyPerson person) {
		//�п��л�����,�п���������,�п����������� ���޹޾� ó���ϴ� �޼ҵ�
	}
	
	public static void main(String[] args) {
		/*
		//�п��л������� �����ϱ� ���� �迭 ����
		AcademyStudnet[] studnets=new AcademyStudnet[300];
		//�п����������� �����ϱ� ���� �迭 ����
		AcademyInstructor[] instructors=new AcademyInstructor[50];
		//�п����������� �����ϱ� ���� �迭 ����
		AcademyStaff[] staffs=new AcademyStaff[100];
		*/
		
		//�п��л�����,�п���������,�п����������� �����ϱ� ���� �迭 ����
		AcademyPerson[] personArray=new AcademyPerson[5];
		
		personArray[0]=new AcademyStudnet(1000, "ȫ�浿", "�� ������ ����");
		personArray[1]=new AcademyInstructor(2000, "�Ӳ���", "JAVA ����");
		personArray[2]=new AcademyStaff(3000, "����ġ", "����������");
		personArray[3]=new AcademyStudnet(4000, "������", "�� ������ ����");
		personArray[4]=new AcademyInstructor(5000, "����", "HTML ����");
		
		for(AcademyPerson person:personArray) {
			//instanceof �����ڷ� �θ����������� ����� �ν��Ͻ��� �ڽ�Ŭ������ ����ȯ ���������� �Ǵ� �� ��ü ����ȯ
			// => ��Ӱ��踦 Ȯ���Ͽ� ��ü ����ȯ - ClassCastException �߻� ����
			if(person instanceof AcademyStudnet) {
				//����� ��ü ����ȯ�� �̿��Ͽ� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
				// => ��Ӱ��谡 �ƴ� Ŭ������ ��ü ����ȯ�� �߻��� ��� ClassCastException �߻�
				System.out.println(((AcademyStudnet)person).getCourse()+"�� �л����� >>");
			} else if(person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()+"�� �������� >>");
			} else if(person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()+"�� �������� >>");
			}
			
			//�޼ҵ� �������̵� ���� ���� ������ ��ü ����ȯ�� �߻��Ǿ�  
			//�θ��ν��Ͻ��� �޼ҵ� ��� �ڽ��ν��Ͻ��� �޼ҵ� ȣ��
			//�θ����������� ����� �ڽ��ν��Ͻ��� ���� �ڽ��ν��Ͻ��� �������̵� �޼ҵ� ȣ��
			// => �޼ҵ� �������̵忡 ���� ������ ���� 
			person.display();
			System.out.println("========================================");
		}
		
		/*
		processStudent(new AcademyStudnet());
		processInstructor(new AcademyInstructor());
		processStaff(new AcademyStaff());
		processStudent(new AcademyInstructor());
		*/
		
		//���޵Ǵ� �ν��Ͻ��� ���� �ٸ� �޼ҵ� ȣ�� - �����ε忡 ���� ������
		process(new AcademyStudnet());
		process(new AcademyInstructor());
		process(new AcademyStaff());
	}
}
