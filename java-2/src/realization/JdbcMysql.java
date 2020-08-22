package realization;

//Mysql DBMS 시스템을 연결하여 기능을 제공할 목적의 클래스
// => 인터페이스를 상속받아 작성 : 인터페이스에서 원하는 목적의 메소드 구현
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[삽입]Mysql DBMS를 이용하여 정보를 저장 하였습니다.");
	}
	
	@Override
	public void update() {
		System.out.println("[변경]Mysql DBMS를 이용하여 저장된 정보를 변경 하였습니다.");
	}
	
	@Override
	public void delete() {
		System.out.println("[삭제]Mysql DBMS를 이용하여 저장된 정보를 삭제 하였습니다.");
	}
	
	@Override
	public void select() {
		System.out.println("[검색]Mysql DBMS를 이용하여 저장된 정보를 검색 하였습니다.");
	}
}
