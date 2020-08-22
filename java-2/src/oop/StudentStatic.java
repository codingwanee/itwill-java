package oop;

//학생정보(학번,이름,점수)를 저장할 목적의 클래스
// => 모든 학생점수 합계를 저장할 목적의 정적필드 구현
public class StudentStatic {
	private int num;
	private String name;
	private int score;
	private static int tot=0;
	
	public StudentStatic() {
		// TODO Auto-generated constructor stub
	}

	public StudentStatic(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public static int getTot() {
		return tot;
	}

	public static void setTot(int tot) {
		StudentStatic.tot = tot;
	}
}
