package site.itwill.dbcp;

import java.sql.Connection;

//DBCP(DataBase Connection Pool) : Connection 인스턴스를 미리 생성하여 저장하기 위한 클래스
// => Connection 인스턴스를 제공 받거나 Connection 인스턴스를 돌려주는 기능 제공
// => JDBC 프로그램의 실행 속도 향상 또는 Connection 인스턴스의 갯수 제한
public class ConnectionPoolApp {
	public static void main(String[] args) throws Exception {
		//ConnectionPool 인스턴스 생성
		// => Connection 인스턴스가 미리 생성되어 ConnectionPool 인스턴스에 저장
		// => DBCP 관련 클래스는 Singleton 클래스로 작성 : 생성자로 인스턴스 생성 불가능 
		
		//ConnectionPool 클래스의 생성자가 은닉화 선언되어 사용 불가능
		//ConnectionPool cp=new ConnectionPool();
		
		//ConnectionPool.getInstance() : ConnectionPool 인스턴스 반환하는 메소드
		// => 동일한 인스턴스 반환 - 싱글톤
		/*
		ConnectionPool cp1=ConnectionPool.getInstance();
		ConnectionPool cp2=ConnectionPool.getInstance();
		
		System.out.println("cp1 = "+cp1);
		System.out.println("cp2 = "+cp2);
		System.out.println("ConnectionPool.getInstance() = "+ConnectionPool.getInstance());
		*/
		
		//반환받은 인스턴스를 참조변수에 저장하지 않고 메소드 호출 사용
		//ConnectionPool.getConnection() : ConnectionPool 인스턴스에 저장된 Connection 인스턴스를 반환하는 메소드
		Connection con1=ConnectionPool.getInstance().getConnection();
		System.out.println("con1 = "+con1);
		//ConnectionPool.freeConnection(Connection con) : ConnectionPool 인스턴스에 Connection 인스턴스를 돌려주는 메소드
		// => ConnectionPool 인스턴스에 Connection 인스턴스 다시 저장
		//ConnectionPool.getInstance().freeConnection(con1);
		
		Connection con2=ConnectionPool.getInstance().getConnection();	
		System.out.println("con2 = "+con2);
		//ConnectionPool.getInstance().freeConnection(con2);
		
		Connection con3=ConnectionPool.getInstance().getConnection();	
		System.out.println("con3 = "+con3);
		//ConnectionPool.getInstance().freeConnection(con3);
		
		Connection con4=ConnectionPool.getInstance().getConnection();	
		System.out.println("con4 = "+con4);
		ConnectionPool.getInstance().freeConnection(con4);
	}
}