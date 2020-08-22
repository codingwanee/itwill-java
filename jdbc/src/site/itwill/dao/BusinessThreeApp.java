package site.itwill.dao;

public class BusinessThreeApp {
	public static void main(String[] args) {
		/*
		System.out.println("[메세지]파일의 정보를 저장하는 기능");
		System.out.println("[메세지]파일의 정보를 검색하는 기능");
		*/
		
		/*
		FileDAO dao=new FileDAO();
		dao.add();
		dao.search();
		*/
		
		/*
		MysqlDAO dao=new MysqlDAO();
		dao.insert();
		dao.select();
		*/
		
		/*
		OracleDAO dao=new OracleDAO();
		dao.add();
		dao.search();
		*/
		
		//DAO dao=new FileDAO();
		//DAO dao=new MysqlDAO();
		DAO dao=new OracleDAO();
		
		dao.add();
		dao.search();
	}
}


