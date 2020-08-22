package site.itwill.dao;

public class FileDAO implements DAO {
	@Override
	public void add() {
		System.out.println("[메세지]파일의 정보를 저장하는 기능");
	}
	
	@Override
	public void search() {
		System.out.println("[메세지]파일의 정보를 검색하는 기능");
	}
}
