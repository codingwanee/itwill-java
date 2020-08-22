package site.itwill.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//UCP(Universal Connection Pool) 라이브러리를 이용한 프로그램
public class UcpApp {
	public static void main(String[] args) throws SQLException {
		//PoolDataSourceFactory.getPoolDataSource() 
		// => PoolDataSource 인스턴스를 반환하는 메소드
		//PoolDataSource : Connection 인스턴스를 저장하기 위한 인스턴스 
		PoolDataSource pds=PoolDataSourceFactory.getPoolDataSource();
		
		//PoolDataSource.setConnectionFactoryClassName(String dirverName)
		// => PoolDataSource 인스턴스의 Driver 클래스를 변경하는 메소드
		//pds.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
		pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
		
		//PoolDataSource.setURL(String url)
		// => PoolDataSource 인스턴스의 접속 URL 주소를 변경하는 메소드
		pds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		
		//PoolDataSource.setUser(String user)
		// => PoolDataSource 인스턴스의 접속 사용자를 변경하는 메소드
		pds.setUser("scott");
		
		//PoolDataSource.setPassword(String password)
		// => PoolDataSource 인스턴스의 접속 사용자의 비밀번호를 변경하는 메소드
		pds.setPassword("tiger");
		
		//PoolDataSource.setInitialPoolSize(int size)
		// => PoolDataSource 인스턴스의 최초 생성되는 Connection 인스턴스의 갯수를 변경하는 메소드
		pds.setInitialPoolSize(2);

		//PoolDataSource.setMaxPoolSize(int size)
		// => PoolDataSource 인스턴스의 최대 생성되는 Connection 인스턴스의 갯수를 변경하는 메소드
		pds.setMaxPoolSize(3);

		//PoolDataSource.getAvailableConnectionsCount()
		// => PoolDataSource 인스턴스의 제공 가능한 Connection 인스턴스의 갯수를 반환하는 메소드
		System.out.println("Connection 갯수 = "+pds.getAvailableConnectionsCount());
		
		//PoolDataSource.getConnection() 
		// => PoolDataSource 인스턴스에 저장된 Connection 인스턴스를 반환하는 메소드
		// => PoolDataSource 인스턴스에 Connection 인스턴스가 없는 경우 생성하여 저장
		Connection con1=pds.getConnection();
		System.out.println("con1 = "+con1);
		System.out.println("Connection 갯수 = "+pds.getAvailableConnectionsCount());
		//Connection 인스턴스를 제거하면 PoolDataSource 인스턴스가 
		//새로운 Connection 인스턴스를 생성하여 저장
		//con1.close();
		System.out.println("Connection 갯수 = "+pds.getAvailableConnectionsCount());
		
		Connection con2=pds.getConnection();
		System.out.println("con2 = "+con2);
		//con2.close();
		
		Connection con3=pds.getConnection();
		System.out.println("con3 = "+con3);
		//con3.close();
		
		Connection con4=pds.getConnection();
		System.out.println("con4 = "+con4);
		con4.close();
	}
}