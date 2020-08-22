package generalization;

//학원 인적자원(학생,강사,직원) 관리 프로그램
public class AcademyApp {
	/*
	public static void processStudent(AcademyStudnet studnet) {
		//학원학생정보를 전달받아 처리하는 메소드
	}
	
	public static void processInstructor(AcademyInstructor instructor) {
		//학원강사정보를 전달받아 처리하는 메소드
	}
	
	public static void processStaff(AcademyStaff staff) {
		//학원직원정보를 전달받아 처리하는 메소드
	}
	*/
	
	/*
	//메소드 오버로드
	public static void process(AcademyStudnet studnet) {
		//학원학생정보를 전달받아 처리하는 메소드
	}
	
	public static void process(AcademyInstructor instructor) {
		//학원강사정보를 전달받아 처리하는 메소드
	}
	
	public static void process(AcademyStaff staff) {
		//학원직원정보를 전달받아 처리하는 메소드
	}
	*/
	
	public static void process(AcademyPerson person) {
		//학원학생정보,학원강사정보,학원직원정보를 전달받아 처리하는 메소드
	}
	
	public static void main(String[] args) {
		/*
		//학원학생정보를 저장하기 위한 배열 선언
		AcademyStudnet[] studnets=new AcademyStudnet[300];
		//학원강사정보를 저장하기 위한 배열 선언
		AcademyInstructor[] instructors=new AcademyInstructor[50];
		//학원직원정보를 저장하기 위한 배열 선언
		AcademyStaff[] staffs=new AcademyStaff[100];
		*/
		
		//학원학생정보,학원강사정보,학원직원정보를 저장하기 위한 배열 선언
		AcademyPerson[] personArray=new AcademyPerson[5];
		
		personArray[0]=new AcademyStudnet(1000, "홍길동", "웹 개발자 과정");
		personArray[1]=new AcademyInstructor(2000, "임꺽정", "JAVA 과목");
		personArray[2]=new AcademyStaff(3000, "전우치", "영업관리팀");
		personArray[3]=new AcademyStudnet(4000, "일지매", "웹 디자인 과정");
		personArray[4]=new AcademyInstructor(5000, "장길산", "HTML 과목");
		
		for(AcademyPerson person:personArray) {
			//instanceof 연산자로 부모참조변수에 저장된 인스턴스를 자식클래스로 형변환 가능한지를 판단 후 객체 형변환
			// => 상속관계를 확인하여 객체 형변환 - ClassCastException 발생 방지
			if(person instanceof AcademyStudnet) {
				//명시적 객체 형변환을 이용하여 자식인스턴스의 메소드 호출
				// => 상속관계가 아닌 클래스의 객체 형변환이 발생될 경우 ClassCastException 발생
				System.out.println(((AcademyStudnet)person).getCourse()+"의 학생정보 >>");
			} else if(person instanceof AcademyInstructor) {
				System.out.println(((AcademyInstructor)person).getSubject()+"의 강사정보 >>");
			} else if(person instanceof AcademyStaff) {
				System.out.println(((AcademyStaff)person).getDepart()+"의 직원정보 >>");
			}
			
			//메소드 오버라이드 선언에 의해 묵시적 객체 형변환이 발생되어  
			//부모인스턴스의 메소드 대신 자식인스턴스의 메소드 호출
			//부모참조변수에 저장된 자식인스턴스에 따라 자식인스턴스의 오버라이드 메소드 호출
			// => 메소드 오버라이드에 의한 다형성 구현 
			person.display();
			System.out.println("========================================");
		}
		
		/*
		processStudent(new AcademyStudnet());
		processInstructor(new AcademyInstructor());
		processStaff(new AcademyStaff());
		processStudent(new AcademyInstructor());
		*/
		
		//전달되는 인스턴스에 따라 다른 메소드 호출 - 오버로드에 의한 다형성
		process(new AcademyStudnet());
		process(new AcademyInstructor());
		process(new AcademyStaff());
	}
}
