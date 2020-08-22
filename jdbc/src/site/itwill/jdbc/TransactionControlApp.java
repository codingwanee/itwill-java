package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC ���α׷��� �̿��Ͽ� SQL ���(DML)�� �����Ͽ� �����ϸ� �⺻������
//�����Ǵ� �ڵ� Ŀ�� ��ɿ� ���� ���̺� ��� ���� ����
// => �ڵ� Ŀ�� ����� ��Ȱ��ȭ �����Ͽ� ���α׷��� ���������� �����
//    ��쿡�� Ŀ�� ó���ϰ� ����(����) �߻��ÿ��� �ѹ� ó��

//STUDENT ���̺� ����� �л����� �� �й��� 4000�� �л������� �����ϴ� JDBC ���α׷�
public class TransactionControlApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			//Connection.setAutoCommit(boolean autoCommit)
			// => �ڵ� Ŀ�� ����� ��� ������ �����ϴ� �޼ҵ�
			// => false : �ڵ� Ŀ�� ��Ȱ��ȭ, true : �ڵ� Ŀ�� Ȱ��ȭ(�⺻)
			con.setAutoCommit(false);
			
			stmt=con.createStatement();
			
			String sql="delete from student where no=4000";
			int rows=stmt.executeUpdate(sql);
			
			//SQL ����� ���޵Ǿ� ����� �� ���� �߻�
			//throw new RuntimeException("���α׷��� ������ �߻� �Ͽ����ϴ�.");
			
			System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
			
			//���α׷��� ���������� ����� ��� Ŀ�� ó��
			//Connection.commit() : ���Ӽ����� COMMIT ����� �����Ͽ� ����
			con.commit();
		} catch (ClassNotFoundException e) {
			System.out.println("[����]OracleDriver Ŭ������ ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("[����]DBMS ���� = "+e.getMessage());
		} catch (Exception e) {
			try {
				//���α׷� ����� ������ �߻��� ��� �ѹ� ó��
				//Connection.rollback() : ���Ӽ����� ROLLBACK ����� �����Ͽ� ����
				con.rollback();
				System.out.println("[����]���� ���� = "+e.getMessage());
			} catch (SQLException exception) {}
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}
