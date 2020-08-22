package site.itwill.util;

import java.util.ArrayList;
import java.util.List;

//학생정보를 관리(저장,변경,삭제,검색)할 목적의 클래스 >> BO(Business Object) 클래스 - Manager 클래스
public class StudentManager {
	//학생정보들을 저장하기 위한 필드 - 콜렉션(List)
	private List<Student> studentList=new ArrayList<Student>();
	
	public StudentManager() {
		// TODO Auto-generated constructor stub
	}
	
	//학번을 전달받아 학생정보를 검색하여 첨자를 반환하는 메소드
	// => 저장된 학생정보 중 전달 학번이 존재하지 않을 경우 -1 반환
	//클래스 내부에서만 접근 가능하도록 private 접근지정자로 메소드 선언
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
	
	
	//학생정보를 전달받아 콜렉션 필드에 저장(추가)하는 메소드
	// => 전달받은 학생정보가 저장되지 않을 경우 false 반환,저장될 경우 true 반환
	// => 전달받은 학생정보 중 학번에 대한 학생정보가 이미 존재할 경우 미저장 
	public boolean insert(Student student) {
		if(getIndex(student.getNum())!=-1) {
			return false;
		}
		studentList.add(student);
		return true; 
	}
	
	//학생정보를 전달받아 콜렉션 필드에 저장된 학생정보를 변경하는 메소드
	// => 전달받은 학생정보가 변경되지 않을 경우 false 반환,변경될 경우 true 반환
	// => 전달받은 학생정보가 콜렉션 필드에 저장되어 있지 않을 경우 미변경
	public boolean update(Student student) {
		int index=getIndex(student.getNum());
		if(index==-1) {
			return false;
		}
		studentList.set(index, student);
		return true;
	}
	
	//학번을 전달받아 콜렉션 필드에 저장된 학생정보를 삭제하는 메소드
	// => 전달받은 학번의 학생정보가 삭제되지 않을 경우 false 반환,삭제될 경우 true 반환
	// => 전달받은 학번의 학생정보가 콜렉션 필드에 저장되어 있지 않을 경우 미삭제
	public boolean delete(int num) {
		int index=getIndex(num);
		if(index==-1) {
			return false;
		}
		studentList.remove(index);
		return true;
	}
	
	//학번을 전달받아 콜렉션 필드에 저장된 학생정보를 검색하여 반환하는 메소드
	// => 전달받은 학번의 학생정보가 콜렉션 필드에 저장되어 있지 않을 경우 null 반환
	public Student select(int num) {
		int index=getIndex(num);
		if(index==-1) {
			return null;
		}
		return studentList.get(index);
	}
	
	//콜렉션 필드에 저장된 모든 학생정보를 반환하는 메소드 
	public List<Student> selectAll() {
		return studentList;
	}
}
