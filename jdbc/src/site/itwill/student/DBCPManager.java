package site.itwill.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//DBCP(DataBase ConnectionPool) ���� �ν��Ͻ��� �����Ͽ� Connection
//�ν��Ͻ��� ��ȯ�ϰų� Connection �ν��Ͻ� �� Connection �ν��Ͻ���  
//�Ļ��� �ν��Ͻ��� �����ϴ� �޼ҵ尡 ����� Ŭ����

//RDBMS�� ����ϴ� DAO Ŭ������ �ݵ�� ��� �ޱ� ���� Ŭ���� 
// => �߻�Ŭ����(��� ���� Ŭ����)�� �����ϴ� ���� ����
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
	
	//PoolDataSource �ν��Ͻ��� ����� Connection �ν��Ͻ��� �����޾� ��ȯ�ϴ� �޼ҵ�
	public Connection getConnection() {
		Connection con=null;
		try {
			con=_pds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	//���޹��� Connection �� �Ļ��� �ν��Ͻ��� �����ϴ� �޼ҵ�
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



