package site.itwill.dao;

public class BusinessThreeApp {
	public static void main(String[] args) {
		/*
		System.out.println("[�޼���]������ ������ �����ϴ� ���");
		System.out.println("[�޼���]������ ������ �˻��ϴ� ���");
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


