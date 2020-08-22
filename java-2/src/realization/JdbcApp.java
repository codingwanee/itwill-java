package realization;

//JDBC 프로그램(Java와 DBMS 시스템을 연결하여 작성한 프로그램)
// => 인터페이스를 제공하여 시스템 관련 클래스를 작성 - 결합도 낮춰 유지보수의 효율성 증가
public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql jdbc=new JdbcMysql();
		
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
		*/
		
		/*
		JdbcOracle jdbc=new JdbcOracle();
		
		jdbc.add();
		jdbc.modify();
		jdbc.remove();
		jdbc.search();
		*/
		
		//인터페이스를 이용하여 참조변수를 생성하여 자식인스턴스 저장
		// => 시스템이 변경되어도 시스템 관련 인스턴스만 변경
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		//부모인터페이스로 자식인스턴스의 오버라이드 메소드 호출
		// => 참조변수에 저장된 자식인스턴스에 따라 다른 자식클래스의 메소드 호출
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}





