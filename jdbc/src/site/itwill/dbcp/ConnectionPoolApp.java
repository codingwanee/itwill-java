package site.itwill.dbcp;

import java.sql.Connection;

//DBCP(DataBase Connection Pool) : Connection �ν��Ͻ��� �̸� �����Ͽ� �����ϱ� ���� Ŭ����
// => Connection �ν��Ͻ��� ���� �ްų� Connection �ν��Ͻ��� �����ִ� ��� ����
// => JDBC ���α׷��� ���� �ӵ� ��� �Ǵ� Connection �ν��Ͻ��� ���� ����
public class ConnectionPoolApp {
	public static void main(String[] args) throws Exception {
		//ConnectionPool �ν��Ͻ� ����
		// => Connection �ν��Ͻ��� �̸� �����Ǿ� ConnectionPool �ν��Ͻ��� ����
		// => DBCP ���� Ŭ������ Singleton Ŭ������ �ۼ� : �����ڷ� �ν��Ͻ� ���� �Ұ��� 
		
		//ConnectionPool Ŭ������ �����ڰ� ����ȭ ����Ǿ� ��� �Ұ���
		//ConnectionPool cp=new ConnectionPool();
		
		//ConnectionPool.getInstance() : ConnectionPool �ν��Ͻ� ��ȯ�ϴ� �޼ҵ�
		// => ������ �ν��Ͻ� ��ȯ - �̱���
		/*
		ConnectionPool cp1=ConnectionPool.getInstance();
		ConnectionPool cp2=ConnectionPool.getInstance();
		
		System.out.println("cp1 = "+cp1);
		System.out.println("cp2 = "+cp2);
		System.out.println("ConnectionPool.getInstance() = "+ConnectionPool.getInstance());
		*/
		
		//��ȯ���� �ν��Ͻ��� ���������� �������� �ʰ� �޼ҵ� ȣ�� ���
		//ConnectionPool.getConnection() : ConnectionPool �ν��Ͻ��� ����� Connection �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		Connection con1=ConnectionPool.getInstance().getConnection();
		System.out.println("con1 = "+con1);
		//ConnectionPool.freeConnection(Connection con) : ConnectionPool �ν��Ͻ��� Connection �ν��Ͻ��� �����ִ� �޼ҵ�
		// => ConnectionPool �ν��Ͻ��� Connection �ν��Ͻ� �ٽ� ����
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