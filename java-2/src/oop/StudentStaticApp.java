package oop;

public class StudentStaticApp {
	public static void main(String[] args) {
		StudentStatic student1=new StudentStatic(1000, "ȫ�浿", 100);
		StudentStatic student2=new StudentStatic(2000, "�Ӳ���", 80);
		StudentStatic student3=new StudentStatic(3000, "����ġ", 90);
		StudentStatic student4=new StudentStatic(4000, "������", 70);
		StudentStatic student5=new StudentStatic(5000, "����", 90);
		
		System.out.println("�й� = "+student1.getNum()+", �̸� = "+student1.getName()+", ���� = "+student1.getScore());
		System.out.println("�й� = "+student2.getNum()+", �̸� = "+student2.getName()+", ���� = "+student2.getScore());
		System.out.println("�й� = "+student3.getNum()+", �̸� = "+student3.getName()+", ���� = "+student3.getScore());
		System.out.println("�й� = "+student4.getNum()+", �̸� = "+student4.getName()+", ���� = "+student4.getScore());
		System.out.println("�й� = "+student5.getNum()+", �̸� = "+student5.getName()+", ���� = "+student5.getScore());
		System.out.println("============================================");
		/*
		//�����迭 : �ν��Ͻ� ������ ���� �� ������ �� �ִ� ������Ұ� �������� �迭
		// => ��� ������ҿ��� �⺻������ null ���� - ������ҿ� �ν��Ͻ� ������ �ݵ�� ����
		StudentStatic[] studentArray=new StudentStatic[5];
		
		//�ν��Ͻ��� �����Ͽ� ������ ������ҿ� �ν��Ͻ� ���� ����
		studentArray[0]=new StudentStatic(1000, "ȫ�浿", 100);
		studentArray[1]=new StudentStatic(2000, "�Ӳ���", 80);
		studentArray[2]=new StudentStatic(3000, "����ġ", 90);
		studentArray[3]=new StudentStatic(4000, "������", 70);
		studentArray[4]=new StudentStatic(5000, "����", 90);
		*/
		
		StudentStatic[] studentArray={new StudentStatic(1000, "ȫ�浿", 100)
			,new StudentStatic(2000, "�Ӳ���", 80),new StudentStatic(3000, "����ġ", 90)
			,new StudentStatic(4000, "������", 70),new StudentStatic(5000, "����", 90)};
		
		//��� �л��鿡 ���� �����հ踦 ����Ͽ� ���
		//int tot=0;
		
		//�ݺ����� �̿��Ͽ� �ϰ�ó�� ����
		/*
		for(int i=0;i<studentArray.length;i++) {
			System.out.println("�й� = "+studentArray[i].getNum()
				+", �̸� = "+studentArray[i].getName()+", ���� = "+studentArray[i].getScore());
			//tot+=studentArray[i].getScore();
		}
		*/
		
		for(StudentStatic student:studentArray) {
			System.out.println("�й� = "+student.getNum()+", �̸� = "+student.getName()+", ���� = "+student.getScore());
			//�����޼ҵ�� Ŭ������ �̿��Ͽ� ȣ��
			StudentStatic.setTot(StudentStatic.getTot()+student.getScore());			
		}
		
		System.out.println("============================================");
		//System.out.println("��� �л��� ���� �հ� = "+tot);
		System.out.println("��� �л��� ���� �հ� = "+StudentStatic.getTot());
		System.out.println("============================================");
	}
}
