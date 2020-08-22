package site.itwill.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//DBCP(DataBase ConnectionPool) 관련 인스턴스를 생성하여 Connection
//인스턴스를 반환하거나 Connection 인스턴스 및 Connection 인스턴스로  
//파생된 인스턴스를 제거하는 메소드가 선언된 클래스

//RDBMS를 사용하는 DAO 클래스가 반드시 상속 받기 위한 클래스 
// => 추상클래스(상속 전용 클래스)로 선언하는 것을 권장
public abstract class DBCPManager {
	private static PoolDataSource _pds;
	
	static {
		_pds=PoolDataSourceFactory.getPoolDataSource();
		try {
			_pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
			_pds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			_pds.setUser("scott");
			_pds.setPassword("tiger");
			_pds.setInitialPoolSize(3);
			_pds.setMaxPoolSize(5);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//PoolDataSource 인스턴스에 저장된 Connection 인스턴스를 제공받아 반환하는 메소드
	public Connection getConnection() {
		Connection con=null;
		try {
			con=_pds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//전달받은 Connection 및 파생된 인스턴스를 제거하는 메소드
	public void close(Connection con) {
		try {
			if(con!=null) con.close();
		} catch (SQLException e) {}
	}
	
	public void close(Connection con,PreparedStatement pstmt) {
		try {
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {}
	}
	
	public void close(Connection con,PreparedStatement pstmt,ResultSet rs) {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(con!=null) con.close();
		} catch (SQLException e) {}
	}
}



