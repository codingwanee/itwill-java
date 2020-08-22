package site.itwill.dao;

public class MysqlDAO implements DAO {
	@Override
	public void add() {
		System.out.println("[메세지]MYSQL 프로그램을 이용한 행정보를 저장하는 기능");
	}
	
	@Override
	public void search() {
		System.out.println("[메세지]MYSQL 프로그램을 이용한 행정보를 검색하는 기능");
	}
}
