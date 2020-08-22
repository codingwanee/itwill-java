package site.itwill.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//학생 관리 프로그램 >> 메뉴 선택에 따른 학생정보 저장,삭제,변경,검색 기능 구현 : CUI
public class StudentCUIApp {
	//키보드로 문자열을 입력받기 위한 입력스트림을 저장하기 위한 필드
	private BufferedReader br;
	
	public StudentCUIApp() {
		//키보드 입력스트림 생성 및 저장
		br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] menu={"1.학생정보 추가","2.학생정보 변경","3.학생정보 삭제"
			,"4.학생이름 검색","5.전체학생 검색","6.프로그램 종료"};
		
		System.out.println("<<학생 관리 프로그램>>");
		
		//메뉴 선택에 따른 기능 구현 >> 반복 처리
		while(true) {
			//메뉴 출력
			for(String item:menu) {
				System.out.println(item);
			}
			
			//메뉴 선택 >> 입력값에 대한 유효성 검사
			int choice;
			try {
				System.out.print("선택[1~6] >> ");
				choice=Integer.parseInt(br.readLine());
				if(choice<1 || choice>6) throw new RuntimeException();
			} catch (Exception e) {
				System.out.println("[에러]메뉴를 잘못 선택 하였습니다. 다시 선택해 주세요.");
				System.out.println();
				continue;
			}
			
			if(choice==6) break;
			System.out.println();
			//선택 메뉴에 따른 기능 구현 >> 메소드 호출
			switch (choice) {
			case 1:	addStudent(); break;
			case 2:	modifyStudent(); break;
			case 3:	removeStudent(); break;
			case 4:	searchNameStudent(); break;
			case 5:	searchAllStudent(); break;
			}
			System.out.println();
		}
		System.out.println("[메세지]학생 관리 프로그램을 종료합니다.");
	}
	
	public static void main(String[] args) {
		new StudentCUIApp();
	}
	
	//[학생정보 추가] 메뉴를 선택한 경우 호출되는 메소드
	// => 키보드로 학생정보를 입력받아 STUDENT 테이블에 저장 후 결과 출력
	private void addStudent() {
		System.out.println("### 학생정보 추가 ###");
		try {
			//키보드로 학번,이름,전화번호,주소,생년월일을 입력받아 저장
			// => 입력값에 대한 유효성 검사 
			int no;
			while(true) {
				System.out.print("학번 입력 >> ");
				String temp=br.readLine();
			
				//학번을 입력하지 않은 경우 재입력
				if(temp.equals("")) {
					System.out.println("[입력오류]학번을 반드시 입력해 주세요.");
					continue;
				}
				
				//입력 학번이 4자리가 숫자가 아닌 경우 재입력
				//Pattern noP=Pattern.compile("[0-9]{4}");
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[입력오류]학번은 4자리 숫자로만 입력 가능합니다.");
					continue;
				}
				
				//STUDENT 테이블에 이미 저장된 학생정보인 경우 재입력
				// => 학번에 대한 STUDENT 테이블의 학생정보 저장 유무 판단 
				no=Integer.parseInt(temp);
				//학번을 전달하여 학생정보를 반환하는 DAO 클래스의 메소드 호출
				// => 학번의 학생정보가 없는 경우 null 반환, 있는 경우 학생정보 반환
				StudentDTO student=StudentDAO.getStudentDAO().selectNoStudent(no);
				if(student!=null) {
					System.out.println("[입력오류]이미 사용중인 학번을 입력 하였습니다.");
					continue;
				}
				break;
			}
			
			String name;
			while(true) {
				System.out.print("이름 입력 >> ");
				name=br.readLine();
				//이름을 입력하지 않은 경우 재입력
				if(name.equals("")) {
					System.out.println("[입력오류]이름을 반드시 입력해 주세요.");
					continue;
				}
				break;
			}
			
			String phone;
			while(true) {
				System.out.print("전화번호 입력 >> ");
				phone=br.readLine();
				//전화번호를 입력하지 않은 경우 재입력
				if(phone.equals("")) {
					System.out.println("[입력오류]전화번호를 반드시 입력해 주세요.");
					continue;
				}
				
				Pattern phoneP=Pattern.compile("(01[016789])-\\d{3,4}-\\d{4}");
				Matcher phoneM=phoneP.matcher(phone);
				if(!phoneM.matches()) {
					System.out.println("[입력오류]전화번호를 형식에 맞게 입력해 주세요.");
					continue;
				}
				break;
			}
			
			String address;
			while(true) {
				System.out.print("주소 입력 >> ");
				address=br.readLine();
				//주소를 입력하지 않은 경우 재입력
				if(address.equals("")) {
					System.out.println("[입력오류]주소를 반드시 입력해 주세요.");
					continue;
				}
				break;
			}
			
			String birthday;
			while(true) {
				System.out.print("생년월일 입력 >> ");
				birthday=br.readLine();
				//생년월일을 입력하지 않은 경우 재입력
				if(birthday.equals("")) {
					System.out.println("[입력오류]생년월일을 반드시 입력해 주세요.");
					continue;
				}
				
				Pattern birthdayP=Pattern.compile("(18|19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
				Matcher birthdayM=birthdayP.matcher(birthday);
				if(!birthdayM.matches()) {
					System.out.println("[입력오류]생년월일을 형식에 맞게 입력해 주세요.");
					continue;
				}
				break;
			}
			
			//StudentDTO 인스턴스를 생성하여 입력값으로 필드값 변경 >> 학생정보
			StudentDTO student=new StudentDTO();
			student.setNo(no);
			student.setName(name);
			student.setPhone(phone);
			student.setAddress(address);
			student.setBirthday(birthday);
			
			//학생정보를 전달하여 STUDENT 테이블에 저장하는 DAO 클래스의 메소드 호출
			int rows=StudentDAO.getStudentDAO().insertStudent(student);
			
			//반환받은 결과 출력
			System.out.println("[결과]"+rows+"명의 학생정보를 저장 하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//[학생정보 변경] 메뉴를 선택한 경우 호출되는 메소드
	// => 학번을 입력받아 STUDENT 테이블에 저장된 학생정보를 검색하여 출력 후
	//    변경하고자 하는 학생정보를 입력받아 STUDENT 테이블의 학생정보를 변경 후 결과 출력
	// => 학번의 학생정보가 존재하지 않을 경우 메세지 출력 >> 메소드 종료 
	private void modifyStudent() {
		System.out.println("### 학생정보 변경 ###");
		try {
			//키보드로 학번을 입력받아 저장 
			int no;
			while(true) {
				System.out.print("학번 입력 >> ");
				String temp=br.readLine();
			
				if(temp.equals("")) {
					System.out.println("[입력오류]학번을 반드시 입력해 주세요.");
					continue;
				}
				
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[입력오류]학번은 4자리 숫자로만 입력 가능합니다.");
					continue;
				}
				
				no=Integer.parseInt(temp);
				break;
			}
			
			//학번을 전달하여 학생정보를 검색하는 DAO 클래스의 메소드 호출
			StudentDTO student=StudentDAO.getStudentDAO().selectNoStudent(no);
			
			if(student==null) {//검색된 학생정보가 없는 경우
				System.out.println("[결과]변경하고자 하는 학생정보가 존재하지 않습니다.");
				return;
			}
			
			//검색된 학생정보 출력 >> StudentDTO 인스턴스의 필드값 출력
			System.out.println("==========================================================");
			System.out.println("학번\t이름\t전화번호\t주소\t\t생년월일");
			System.out.println("==========================================================");
			System.out.println(student.getNo()+"\t"
				+student.getName()+"\t"+student.getPhone()
				+"\t"+student.getAddress()+"\t"+student.getBirthday());
			System.out.println("==========================================================");
			
			System.out.println("[메세지]변경값 입력 >> 변경하지 않을 경우 엔터만 입력");
			//키보드로 학생정보에 대한 변경값(이름,전화번호,주소,생년월일) 입력
			System.out.print("이름 입력 >> ");
			String name=br.readLine();
			
			String phone;
			while(true) {
				System.out.print("전화번호 입력 >> ");
				phone=br.readLine();
				Pattern phoneP=Pattern.compile("(01[016789])-\\d{3,4}-\\d{4}");
				Matcher phoneM=phoneP.matcher(phone);
				if(!phone.equals("") && !phoneM.matches()) {
					System.out.println("[입력오류]전화번호를 형식에 맞게 입력해 주세요.");
					continue;
				}
				break;
			}
			
			System.out.print("주소 입력 >> ");
			String address=br.readLine();
			
			String birthday;
			while(true) {
				System.out.print("생년월일 입력 >> ");
				birthday=br.readLine();
				Pattern birthdayP=Pattern.compile("(18|19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
				Matcher birthdayM=birthdayP.matcher(birthday);
				if(!birthday.equals("") && !birthdayM.matches()) {
					System.out.println("[입력오류]생년월일을 형식에 맞게 입력해 주세요.");
					continue;
				}
				break;
			}
			
			//검색되어 반환된 StudentDTO 인스턴스의 필드값 변경
			// => 변경값이 존재하는 필드값만 변경
			if(!name.equals("")) student.setName(name);
			if(!phone.equals("")) student.setPhone(phone);
			if(!address.equals("")) student.setAddress(address);
			if(!birthday.equals("")) student.setBirthday(birthday);
			
			//변경하고자 하는 학생정보를 전달하여 STUDENT 테이블의 학생정보를 변경하는 DAO 클래스의 메소드 호출
			int rows=StudentDAO.getStudentDAO().updateStudent(student);
			
			//반환 결과 출력
			System.out.println("[결과]"+rows+"명의 학생정보를 변경 하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//[학생정보 삭제] 메뉴를 선택한 경우 호출되는 메소드
	// => 키보드로 학번을 입력받아 STUDENT 테이블에 저장된 학생정보를 삭제 후 결과 출력
	// => 학번의 학생정보가 존재하지 않을 경우 메세지 출력 >> 메소드 종료
	private void removeStudent() {
		System.out.println("### 학생정보 삭제 ###");
		try {
			//키보드로 학번을 입력받아 저장 
			int no;
			while(true) {
				System.out.print("학번 입력 >> ");
				String temp=br.readLine();
			
				if(temp.equals("")) {
					System.out.println("[입력오류]학번을 반드시 입력해 주세요.");
					continue;
				}
				
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[입력오류]학번은 4자리 숫자로만 입력 가능합니다.");
					continue;
				}
				
				no=Integer.parseInt(temp);
				break;
			}
			
			//학번을 전달하여 STUDENT 테이블의 학생정보를 삭제하는 DAO 클래스의 메소드 호출
			int rows=StudentDAO.getStudentDAO().deleteStudent(no);
			
			//결과 출력
			if(rows>0) {//삭제행이 존재할 경우
				System.out.println("[결과]"+rows+"명의 학생정보를 삭제 하였습니다.");
			} else {//삭제행이 존재하지 않을 경우
				System.out.println("[결과]삭제하고자 하는 학생정보가 존재하지 않습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//[학생이름 검색] 메뉴를 선택한 경우 호출되는 메소드
	// => 키보드로 이름을 입력받아 STUDENT 테이블에서 학생정보를 검색하여 반환받아 출력
	// => 검색된 학생정보가 존재하지 않을 경우 메세지 출력 >> 메소드 종료 
	private void searchNameStudent() {
		System.out.println("### 학생이름 검색 ###");
		try {
			//키보드로 이름을 입력받아 저장
			String name;
			while(true) {
				System.out.print("이름 입력 >> ");
				name=br.readLine();
				//이름을 입력하지 않은 경우 재입력
				if(name.equals("")) {
					System.out.println("[입력오류]이름을 반드시 입력해 주세요.");
					continue;
				}
				break;
			}
			
			//이름을 전달하여 STUDENT 테이블에 저장된 학생정보를 검색하여 반환하는 DAO 클래스의 메소드 호출
			List<StudentDTO> studentList=StudentDAO.getStudentDAO().selectNameStudent(name);
			
			if(studentList.isEmpty()) {//검색행이 존재하지 않을 경우
				System.out.println("[결과]검색된 학생정보가 존재하지 않습니다.");
				return;
			}
			
			//검색행이 존재할 경우 모든 학생정보 출력 >> 반복처리
			System.out.println("==========================================================");
			System.out.println("학번\t이름\t전화번호\t주소\t\t생년월일");
			System.out.println("==========================================================");
			for(StudentDTO student:studentList) {
				System.out.println(student.getNo()+"\t"
					+student.getName()+"\t"+student.getPhone()
					+"\t"+student.getAddress()+"\t"+student.getBirthday());
			}
			System.out.println("==========================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//[전체학생 검색] 메뉴를 선택한 경우 호출되는 메소드
	// => STUDENT 테이블에 저장된 모든 학생정보를 검색하여 출력
	private void searchAllStudent() {
		//STUDENT 테이블에 저장된 모든 학생정보를 검색하여 반환하는 DAO 클래스의 메소드 호출
		List<StudentDTO> studentList=StudentDAO.getStudentDAO().selectAllStudent();

		if(studentList.isEmpty()) {//검색행이 존재하지 않을 경우
			System.out.println("[결과]저장된 학생정보가 존재하지 않습니다.");
			return;
		}
		
		//검색행이 존재할 경우 모든 학생정보 출력 >> 반복처리
		System.out.println("==========================================================");
		System.out.println("학번\t이름\t전화번호\t주소\t\t생년월일");
		System.out.println("==========================================================");
		for(StudentDTO student:studentList) {
			System.out.println(student.getNo()+"\t"
				+student.getName()+"\t"+student.getPhone()
				+"\t"+student.getAddress()+"\t"+student.getBirthday());
		}
		System.out.println("==========================================================");
	}	
}