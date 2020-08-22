package site.itwill.util;

import java.util.Collections;
import java.util.List;

public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		
		//�л������� �����Ͽ� ������ �ݷ��� ����
		manager.insert(new Student(1000, "ȫ�浿"));
		manager.insert(new Student(2000, "�Ӳ���"));
		manager.insert(new Student(3000, "����ġ"));
		manager.insert(new Student(4000, "������"));
		
		//boolean insertResult=manager.insert(new Student(1000, "����"));
		boolean insertResult=manager.insert(new Student(5000, "����"));
		if(insertResult) {
			System.out.println("[�޼���]�л������� ���������� ���� �Ͽ����ϴ�.");
		} else {
			System.out.println("[����]�̹� �����ϴ� �л��� �й��̹Ƿ� ���� ���� �Ͽ����ϴ�.");
		}
		System.out.println("============================================");
		
		//�ݷ��ǿ� ����� �л����� �� �й��� 2000�� �л��� �л������� ��ȯ�޾� ���
		Student searchStudent=manager.select(2000);
		//Student searchStudent=manager.select(6000);
		
		if(searchStudent==null) {
			System.out.println("[����]�˻��ϰ��� �ϴ� �й��� �л������� �������� �ʽ��ϴ�.");
		} else {
			//Student Ŭ������ toString() �޼ҵ� �ڵ� ȣ��
			System.out.println("�˻��л� >> "+searchStudent);
		}
		System.out.println("============================================");
		
		//�˻��� �л������� �̸��� "�Ӱ���"���� �����Ͽ� �Ͽ� �ݷ��ǿ� ����� �л����� ����
		searchStudent.setName("�Ӱ���");
		manager.update(searchStudent);
		
		System.out.println(manager.select(2000));
		System.out.println("============================================");
		
		//�ݷ��ǿ� ����� �л����� �� �й��� 4000�� �л������� �ݷ��ǿ��� ����
		if(manager.delete(4000)) {
			System.out.println("[�޼���]�л������� ���������� �����Ͽ����ϴ�.");
		} else {
			System.out.println("[����]�����ϰ��� �ϴ� �й��� �л������� �������� �ʽ��ϴ�.");
		}
		System.out.println("============================================");
		
		//�ݷ��ǿ� ����� ��� �л������� ��ȯ�޾� ���
		List<Student> students=manager.selectAll();
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("============================================");
		//Arrays Ŭ���� �Ǵ� Collections Ŭ������ sort() �޼ҵ忡 ���޵�
		//�迭 �Ǵ� �ݷ����� ������Ʈ�� �� ���� �������̽��� ��ӹ޾� �ۼ�
		// => Comparable �������̽��� ��ӹ޾� compareTo() �޼ҵ带 �������̵� ����
		// => compareTo() �޼ҵ忡�� ������ �ϱ� ���� ����� ����
		
		//List �ν��Ͻ��� ����� �л������� �̸����� �������� �����Ͽ� ���
		Collections.sort(students);		
		
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("============================================");
		
	}
}





