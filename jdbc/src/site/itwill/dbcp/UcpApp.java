package site.itwill.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

//UCP(Universal Connection Pool) ���̺귯���� �̿��� ���α׷�
public class UcpApp {
	public static void main(String[] args) throws SQLException {
		//PoolDataSourceFactory.getPoolDataSource() 
		// => PoolDataSource �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//PoolDataSource : Connection �ν��Ͻ��� �����ϱ� ���� �ν��Ͻ� 
		PoolDataSource pds=PoolDataSourceFactory.getPoolDataSource();
		
		//PoolDataSource.setConnectionFactoryClassName(String dirverName)
		// => PoolDataSource �ν��Ͻ��� Driver Ŭ������ �����ϴ� �޼ҵ�
		//pds.setConnectionFactoryClassName("oracle.jdbc.driver.OracleDriver");
		pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
		
		//PoolDataSource.setURL(String url)
		// => PoolDataSource �ν��Ͻ��� ���� URL �ּҸ� �����ϴ� �޼ҵ�
		pds.setURL("jdbc:oracle:thin:@localhost:1521:xe");
		
		//PoolDataSource.setUser(String user)
		// => PoolDataSource �ν��Ͻ��� ���� ����ڸ� �����ϴ� �޼ҵ�
		pds.setUser("scott");
		
		//PoolDataSource.setPassword(String password)
		// => PoolDataSource �ν��Ͻ��� ���� ������� ��й�ȣ�� �����ϴ� �޼ҵ�
		pds.setPassword("tiger");
		
		//PoolDataSource.setInitialPoolSize(int size)
		// => PoolDataSource �ν��Ͻ��� ���� �����Ǵ� Connection �ν��Ͻ��� ������ �����ϴ� �޼ҵ�
		pds.setInitialPoolSize(2);

		//PoolDataSource.setMaxPoolSize(int size)
		// => PoolDataSource �ν��Ͻ��� �ִ� �����Ǵ� Connection �ν��Ͻ��� ������ �����ϴ� �޼ҵ�
		pds.setMaxPoolSize(3);

		//PoolDataSource.getAvailableConnectionsCount()
		// => PoolDataSource �ν��Ͻ��� ���� ������ Connection �ν��Ͻ��� ������ ��ȯ�ϴ� �޼ҵ�
		System.out.println("Connection ���� = "+pds.getAvailableConnectionsCount());
		
		//PoolDataSource.getConnection() 
		// => PoolDataSource �ν��Ͻ��� ����� Connection �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		// => PoolDataSource �ν��Ͻ��� Connection �ν��Ͻ��� ���� ��� �����Ͽ� ����
		Connection con1=pds.getConnection();
		System.out.println("con1 = "+con1);
		System.out.println("Connection ���� = "+pds.getAvailableConnectionsCount());
		//Connection �ν��Ͻ��� �����ϸ� PoolDataSource �ν��Ͻ��� 
		//���ο� Connection �ν��Ͻ��� �����Ͽ� ����
		//con1.close();
		System.out.println("Connection ���� = "+pds.getAvailableConnectionsCount());
		
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