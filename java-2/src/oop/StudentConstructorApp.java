package oop;

public class StudentConstructorApp {
	public static void main(String[] args) {
		//new �����ڷ� �⺻ �����ڸ� ȣ���Ͽ� �ν��Ͻ� ���� 
		// >> �ν��Ͻ� �ʵ忡�� �⺻���� �ڵ� ����
		StudentConstructor student1=new StudentConstructor();
		
		//Getter �޼ҵ带 ȣ���Ͽ� �ν��Ͻ� �ʵ尪 ���
		//System.out.println("�й� = "+student1.getNumber()+", �̸� = "+student1.getName()+", �ּ� = "+student1.getAddress());
		student1.display();
		System.out.println("============================================");
		//Setter �޼ҵ带 ȣ���Ͽ� �ν��Ͻ� �ʵ尪 ����
		student1.setNumber("1000");
		student1.setName("ȫ�浿");
		student1.setAddress("����� ������");
		
		student1.display();
		System.out.println("============================================");
		//������ �Ķ���Ϳ� ���� �����Ͽ� �ν��Ͻ� ������ �ʵ忡 �ʱⰪ ����
		StudentConstructor student2=new StudentConstructor("2000");
		student2.display();
		System.out.println("============================================");
		StudentConstructor student3=new StudentConstructor("3000", "�Ӳ���");
		student3.display();
		System.out.println("============================================");
		StudentConstructor student4=new StudentConstructor("4000", "����ġ","��õ�� ���̱�");
		student4.display();
		System.out.println("============================================");
	}
}
