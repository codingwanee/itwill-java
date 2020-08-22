package oop;

public class StudentStaticApp {
	public static void main(String[] args) {
		StudentStatic student1=new StudentStatic(1000, "홍길동", 100);
		StudentStatic student2=new StudentStatic(2000, "임꺽정", 80);
		StudentStatic student3=new StudentStatic(3000, "전우치", 90);
		StudentStatic student4=new StudentStatic(4000, "일지매", 70);
		StudentStatic student5=new StudentStatic(5000, "장길산", 90);
		
		System.out.println("학번 = "+student1.getNum()+", 이름 = "+student1.getName()+", 점수 = "+student1.getScore());
		System.out.println("학번 = "+student2.getNum()+", 이름 = "+student2.getName()+", 점수 = "+student2.getScore());
		System.out.println("학번 = "+student3.getNum()+", 이름 = "+student3.getName()+", 점수 = "+student3.getScore());
		System.out.println("학번 = "+student4.getNum()+", 이름 = "+student4.getName()+", 점수 = "+student4.getScore());
		System.out.println("학번 = "+student5.getNum()+", 이름 = "+student5.getName()+", 점수 = "+student5.getScore());
		System.out.println("============================================");
		/*
		//참조배열 : 인스턴스 정보를 여러 개 저장할 수 있는 참조요소가 여러개인 배열
		// => 모든 참조요소에는 기본적으로 null 저장 - 참조요소에 인스턴스 정보를 반드시 저장
		StudentStatic[] studentArray=new StudentStatic[5];
		
		//인스턴스를 생성하여 각각의 참조요소에 인스턴스 정보 저장
		studentArray[0]=new StudentStatic(1000, "홍길동", 100);
		studentArray[1]=new StudentStatic(2000, "임꺽정", 80);
		studentArray[2]=new StudentStatic(3000, "전우치", 90);
		studentArray[3]=new StudentStatic(4000, "일지매", 70);
		studentArray[4]=new StudentStatic(5000, "장길산", 90);
		*/
		
		StudentStatic[] studentArray={new StudentStatic(1000, "홍길동", 100)
			,new StudentStatic(2000, "임꺽정", 80),new StudentStatic(3000, "전우치", 90)
			,new StudentStatic(4000, "일지매", 70),new StudentStatic(5000, "장길산", 90)};
		
		//모든 학생들에 대한 점수합계를 계산하여 출력
		//int tot=0;
		
		//반복문을 이용하여 일괄처리 가능
		/*
		for(int i=0;i<studentArray.length;i++) {
			System.out.println("학번 = "+studentArray[i].getNum()
				+", 이름 = "+studentArray[i].getName()+", 점수 = "+studentArray[i].getScore());
			//tot+=studentArray[i].getScore();
		}
		*/
		
		for(StudentStatic student:studentArray) {
			System.out.println("학번 = "+student.getNum()+", 이름 = "+student.getName()+", 점수 = "+student.getScore());
			//정적메소드는 클래스를 이용하여 호출
			StudentStatic.setTot(StudentStatic.getTot()+student.getScore());			
		}
		
		System.out.println("============================================");
		//System.out.println("모든 학생의 점수 합계 = "+tot);
		System.out.println("모든 학생의 점수 합계 = "+StudentStatic.getTot());
		System.out.println("============================================");
	}
}
