package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();

		/*
		String sql1="update student set name='��浿' where no=1000";
		//DML ����� executeQuery() �޼ҵ�� ���� ����
		// => �޼ҵ� ��ȯ������ ResultSet �ν��Ͻ�(�˻����)�� �����ϹǷ� ó�� �Ұ���
		//ResultSet rs=stmt.executeQuery(sql1);
		int rows=stmt.executeUpdate(sql1);
		System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		System.out.println("=======================================");
		
		String sql2="select * from student order by no";
		//DQL ����� executeUpdate() �޼ҵ�� ���� ����
		// => �޼ҵ� ��ȯ������ int(������ ����)�� �����ϹǷ� ó�� �Ұ���
		//int rows=stmt.executeUpdate(sql2);
		ResultSet rs=stmt.executeQuery(sql2);
		
		while(rs.next()) {
			System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}

		ConnectionFactory.close(con, stmt, rs);
 		System.out.println("=======================================");
 		*/
		
		//String sql="update student set name='��浿' where no=1000";
		String sql="select * from student order by no";
		
		//���޵� SQL ����� Ȯ�������� ���� ��� execute() �޼ҵ� �̿�
		//Statement.execute(String sql) : ��� SQL ����� �����ϴ� �޼ҵ�
		// => false ��ȯ : DML ����� ������ ���
		// => true ��ȯ : DQL ����� ������ ���
		boolean result=stmt.execute(sql);
		
		ResultSet rs=null;
		if(result) {//SELECT ����� ������ ���
			//Statement.getResultSet() : ���޵Ǿ� ����� SQL ��ɿ� ���� �˻������ ��ȯ�ϴ� �޼ҵ� 
			rs=stmt.getResultSet();
			while(rs.next()) {
				System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
			}	
		} else {//INSERT,UPDATE,DELETE ����� ������ ���
			//Statement.getUpdateCount() : ���޵Ǿ� ����� SQL ��ɿ� ���� �������� ������ ��ȯ�ϴ� �޼ҵ� 
			int rows=stmt.getUpdateCount();
			System.out.println("[���]"+rows+"���� �л������� "
				+sql.substring(0, 6).toUpperCase()+" �Ͽ����ϴ�.");
		}
		ConnectionFactory.close(con, stmt, rs);
 		System.out.println("=======================================");
	}
}