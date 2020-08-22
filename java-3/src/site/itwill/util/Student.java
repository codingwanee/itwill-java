package site.itwill.util;

//학생정보(학번,이름)를 저장할 목적의 클래스 >> VO(Value Object) 클래스
// => 다른 학생정보를 비교하기 위해 Comparable 인터페이스를 상속받아 작성
public class Student implements Comparable<Student> {
	private int num;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[학번 = "+num+", 이름 = "+name+"]";
	}

	@Override
	public int compareTo(Student o) {
		//this 필드값과 파라메터 필드값을 비교(연산)하여 결과 반환 
		//return num-o.num;//학번에 의해 오름차순 정렬
		//return o.num-num;//학번에 의해 내림차순 정렬
		return name.compareTo(o.name);//이름에 의해 오름차순 정렬
		//return o.name.compareTo(name);//이름에 의해 내림차순 정렬
	}
}
