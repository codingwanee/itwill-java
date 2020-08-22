package site.itwill.util;

import java.util.ArrayList;
import java.util.List;

//�л������� ����(����,����,����,�˻�)�� ������ Ŭ���� >> BO(Business Object) Ŭ���� - Manager Ŭ����
public class StudentManager {
	//�л��������� �����ϱ� ���� �ʵ� - �ݷ���(List)
	private List<Student> studentList=new ArrayList<Student>();
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}
	
	//�й��� ���޹޾� �л������� �˻��Ͽ� ÷�ڸ� ��ȯ�ϴ� �޼ҵ�
	// => ����� �л����� �� ���� �й��� �������� ���� ��� -1 ��ȯ
	//Ŭ���� ���ο����� ���� �����ϵ��� private ���������ڷ� �޼ҵ� ����
	private int getIndex(int num) {
		int index=-1;
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getNum()==num) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	
	//�л������� ���޹޾� �ݷ��� �ʵ忡 ����(�߰�)�ϴ� �޼ҵ�
	// => ���޹��� �л������� ������� ���� ��� false ��ȯ,����� ��� true ��ȯ
	// => ���޹��� �л����� �� �й��� ���� �л������� �̹� ������ ��� ������ 
	public boolean insert(Student student) {
		if(getIndex(student.getNum())!=-1) {
			return false;
		}
		studentList.add(student);
		return true; 
	}
	
	//�л������� ���޹޾� �ݷ��� �ʵ忡 ����� �л������� �����ϴ� �޼ҵ�
	// => ���޹��� �л������� ������� ���� ��� false ��ȯ,����� ��� true ��ȯ
	// => ���޹��� �л������� �ݷ��� �ʵ忡 ����Ǿ� ���� ���� ��� �̺���
	public boolean update(Student student) {
		int index=getIndex(student.getNum());
		if(index==-1) {
			return false;
		}
		studentList.set(index, student);
		return true;
	}
	
	//�й��� ���޹޾� �ݷ��� �ʵ忡 ����� �л������� �����ϴ� �޼ҵ�
	// => ���޹��� �й��� �л������� �������� ���� ��� false ��ȯ,������ ��� true ��ȯ
	// => ���޹��� �й��� �л������� �ݷ��� �ʵ忡 ����Ǿ� ���� ���� ��� �̻���
	public boolean delete(int num) {
		int index=getIndex(num);
		if(index==-1) {
			return false;
		}
		studentList.remove(index);
		return true;
	}
	
	//�й��� ���޹޾� �ݷ��� �ʵ忡 ����� �л������� �˻��Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => ���޹��� �й��� �л������� �ݷ��� �ʵ忡 ����Ǿ� ���� ���� ��� null ��ȯ
	public Student select(int num) {
		int index=getIndex(num);
		if(index==-1) {
			return null;
		}
		return studentList.get(index);
	}
	
	//�ݷ��� �ʵ忡 ����� ��� �л������� ��ȯ�ϴ� �޼ҵ� 
	public List<Student> selectAll() {
		return studentList;
	}
}
