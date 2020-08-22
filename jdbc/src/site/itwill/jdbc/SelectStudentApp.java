package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT ���̺��� ��� �л������� �˻��Ͽ� ����ϴ� JDBC ���α׷�
public class SelectStudentApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		//ResultSet : SELECT ��ɿ� ���� �˻������ �����ϱ� ���� �ν��Ͻ�
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			stmt=con.createStatement();
			
			//�����࿡ ���� �˻������ ���� ����� �����ϴ� ���� ����
			String sql="select * from student order by no";
			//SELECT ����� Statement.executeQuery(String sql) �޼ҵ�� �����Ͽ� ����
			// => �˻������ ResultSet �ν��Ͻ��� �����Ͽ� ��ȯ
			//ResultSet �ν��Ͻ��� ����� �˻������ ��(Row)������ ó���ϱ� ���� Ŀ��(Cursor)�� ����
			// => Ŀ���� ���� ��ġ�� BOF(Before Of File) ������ ����
			//ResultSet.next() : Ŀ���� �Ʒ��� �̵��ϴ� �޼ҵ� - Ŀ�� ��ġ�� �� ó��
			// => false ��ȯ : �̵� Ŀ�� ��ġ�� ó������ ���� ��� - EOF(End Of File) ����
			// => true : �̵� Ŀ�� ��ġ�� ó������ ������ ���
			rs=stmt.executeQuery(sql);
			
			/*
			//SELECT ��ɿ� ���� �˻���� ������ �Ǵ��Ͽ� ����� ���� ����
			if(rs.next()) {//Ŀ���� �Ʒ��� �̵��Ͽ� ó������ ������ ���
				System.out.println("[���]�˻������ �����մϴ�.");
			} else {//Ŀ���� �Ʒ��� �̵��Ͽ� ó������ ���� ���
				System.out.println("[���]�˻������ �����ϴ�.");
			}
			*/
			
			//SELECT ��ɿ� ���� �˻������ ���� �ݺ� ó��
			// => Ŀ���� EOF ������ ��ġ�ϸ� �ݺ��� ���� 
			while(rs.next()) {
				//Ŀ���� ��ġ�� ó���࿡�� �ʿ��� �÷����� ��ȯ�޾� ó��(���)
				//ResultSet.getXXX(int columnIndex) �Ǵ� ResultSet.getXXX(String columnName)
				// => Ŀ���� ��ġ�� ó���࿡�� ���ϴ� �÷����� ��ȯ�ϴ� �޼ҵ�
				// => XXX : �÷����� ��ȯ�ޱ� ���� Java �ڷ���
				// => columnIndex : �˻������ ��ġ��(1���� 1�� �����Ǵ� �� ���)
				//int no=rs.getInt(1);
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				//Date birthday=rs.getDate("birthday");
				//��� �÷����� ���ڿ�(String)�� ��ȯ�޾� ���� ����
				String birthday=rs.getString("birthday");
				
				System.out.println("�й� = "+no);
				System.out.println("�̸� = "+name);
				System.out.println("��ȭ��ȣ = "+phone);
				System.out.println("�ּ� = "+address);
				//System.out.println("������� = "+birthday);
				System.out.println("������� = "+birthday.substring(0, 10));
				System.out.println("===============================");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("[����]OracleDriver Ŭ������ �������� �ʽ��ϴ�.");
		} catch (SQLException e) {
			System.out.println("[����]DBMS ���� = "+e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}


