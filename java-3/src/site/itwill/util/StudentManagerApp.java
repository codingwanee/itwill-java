package site.itwill.util;

import java.util.Collections;
import java.util.List;

public class StudentManagerApp {
	public static void main(String[] args) {
		StudentManager manager=new StudentManager();
		
		//학생정보를 생성하여 전달해 콜렉션 저장
		manager.insert(new Student(1000, "홍길동"));
		manager.insert(new Student(2000, "임꺽정"));
		manager.insert(new Student(3000, "전우치"));
		manager.insert(new Student(4000, "일지매"));
		
		//boolean insertResult=manager.insert(new Student(1000, "장길산"));
		boolean insertResult=manager.insert(new Student(5000, "장길산"));
		if(insertResult) {
			System.out.println("[메세지]학생정보를 성공적으로 저장 하였습니다.");
		} else {
			System.out.println("[에러]이미 존재하는 학생의 학번이므로 저장 실패 하였습니다.");
		}
		System.out.println("============================================");
		
		//콜렉션에 저장된 학생정보 중 학번이 2000인 학생의 학생정보를 반환받아 출력
		Student searchStudent=manager.select(2000);
		//Student searchStudent=manager.select(6000);
		
		if(searchStudent==null) {
			System.out.println("[에러]검색하고자 하는 학번의 학생정보가 존재하지 않습니다.");
		} else {
			//Student 클래스의 toString() 메소드 자동 호출
			System.out.println("검색학생 >> "+searchStudent);
		}
		System.out.println("============================================");
		
		//검색된 학생정보의 이름을 "임걱정"으로 변경하여 하여 콜레션에 저장된 학생정보 변경
		searchStudent.setName("임걱정");
		manager.update(searchStudent);
		
		System.out.println(manager.select(2000));
		System.out.println("============================================");
		
		//콜렉션에 저장된 학생정보 중 학번이 4000인 학생정보를 콜레션에서 제거
		if(manager.delete(4000)) {
			System.out.println("[메세지]학생정보를 성공적으로 삭제하였습니다.");
		} else {
			System.out.println("[에러]삭제하고자 하는 학번의 학생정보가 존재하지 않습니다.");
		}
		System.out.println("============================================");
		
		//콜렉션에 저장된 모든 학생정보를 반환받아 출력
		List<Student> students=manager.selectAll();
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("============================================");
		//Arrays 클래스 또는 Collections 클래스의 sort() 메소드에 전달될
		//배열 또는 콜렉션의 엘리먼트는 비교 관련 인터페이스를 상속받아 작성
		// => Comparable 인터페이스를 상속받아 compareTo() 메소드를 오버라이드 선언
		// => compareTo() 메소드에서 정렬을 하기 위한 명령을 구현
		
		//List 인스턴스에 저장된 학생정보를 이름으로 오름차순 정렬하여 출력
		Collections.sort(students);		
		
		for(Student student:students) {
			System.out.println(student);
		}
		System.out.println("============================================");
		
	}
}





