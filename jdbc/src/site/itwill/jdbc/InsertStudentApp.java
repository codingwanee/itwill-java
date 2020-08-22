package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT ���̺� : �й�(������-PK),�̸�(������),��ȭ��ȣ(������),�ּ�(������),�������(��¥��) 
//STUDENT ���̺� ����
//CREATE TABLE STUDENT(NO NUMBER(4) PRIMARY KEY,NAME VARCHAR2(20)
//,PHONE VARCHAR2(20),ADDRESS VARCHAR2(50),BIRTHDAY DATE);

//STUDENT ���̺� �л������� �����ϴ� JDBC ���α׷�
public class InsertStudentApp {
	public static void main(String[] args) {
		//JDBC ���� �ν��Ͻ��� �����ϴ� ���������� try �����ۿ��� ����
		// => finally �������� �������� ��� ���� - �ν��Ͻ� ����
		Connection con=null;
		Statement stmt=null;
		try {
			//1.OracleDriver Ŭ������ �̿��Ͽ� DriverManager Ŭ������ JDBC Driver ���
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.JDBC Driver�� �̿��Ͽ� DBMS ����
			//DriverManager.getConnection(String url, String user, String password)
			// => ���� ���� ������ �����Ͽ� DBMS ���� �� Connecion �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
			// => SQLException �߻� : DBMS ���� - ����ó��
			//Connection �ν��Ͻ� : DBMS ���������� �̿��Ͽ� ����� �����ϴ� �ν��Ͻ�
			//URL : ���ͳݿ� �����ϴ� �ڿ��� �ּ� �������� ǥ���ϱ� ���� ���
			// => Protocol:ServerName:Port:ResourcePath
			//Oracle DBMS URL >> jdbc:oracle:thin:@ServerName(IP):1521:SID
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			//System.out.println("con = "+con);
			
			//3.Connection �ν��Ͻ��κ��� SQL ����� ������ �� �ִ� 
			//Statement �ν��Ͻ��� ��ȯ�޾� ����
			//Connection.createStatement() : Statement �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
			// => SQLException �߻�
			stmt=con.createStatement();
			
			//4.Statement �ν��Ͻ��� �̿��Ͽ� SQL ����� ���Ӽ����� ����
			//Statement.executeUpdate(String sql) : SQL ���(DML)�� �����Ͽ� ������(int)�� ��ȯ�ϴ� �޼ҵ� 
			//Statement.executeQuery(String sql) : SQL ���(DQL)�� �����Ͽ� ������(ResultSet)�� ��ȯ�ϴ� �޼ҵ�
			//String sql="insert into student values(1000,'ȫ�浿','010-1111-1111','����� ������','90/11/02')";
			//String sql="insert into student values(2000,'�Ӳ���','010-2222-2222','������ �ȴޱ�','92/06/29')";
			//String sql="insert into student values(3000,'����ġ','010-3333-3333','��õ�� ���̱�','99/03/16')";
			String sql="insert into student values(4000,'������','017-4444-4444','����� ���α�','00/05/05')";
			//DML ��� ���࿡ ���� �������� ���� ��ȯ�޾� ����
			// => SQLException �߻�
			int rows=stmt.executeUpdate(sql);
			
			//5.��ȯ���� �������� �̿��� ó�� >> ���
			System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");

		} catch (ClassNotFoundException e) {
			System.out.println("[����]OracleDriver Ŭ������ ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("[����]DBMS ���� = "+e.getMessage());
		} finally {
			//6.����� JDBC ���� ��� �ν��Ͻ� ���� - ���� ���� �ݴ�� ����
			// => close() �޼ҵ� ȣ�� - SQLException �߻�
			try {
				//if ������ �̿��Ͽ� NullPointerException �߻� ����
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}
