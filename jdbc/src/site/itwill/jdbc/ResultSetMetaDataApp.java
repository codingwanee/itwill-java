package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//ResultSetMetaData �ν��Ͻ� : ResultSet �ν��Ͻ��� ����� �˻������
//���� �ΰ����� ������ �����ϴ� �ν��Ͻ�
public class ResultSetMetaDataApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();
		
		String sql="select * from student order by no";
		//String sql="select no,name,phone from student order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		//ResultSet.getMetaData() : �˻������ ���� �ΰ����� ������ ������ ResultSetMetaData �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		ResultSetMetaData rsmd=rs.getMetaData();
		
		//ResultSetMetaData.getColumnCount() : �˻������ �÷������� ��ȯ�ϴ� �޼ҵ�
		int cols=rsmd.getColumnCount();
		System.out.println("�˻������ ���� = "+cols);
		System.out.println("=======================================");
		for(int i=1;i<=cols;i++) {
			//ResultSetMetaData.getColumnLabel(int columnIndex)
			// => columnIndex ��ġ�� �÷����� ��ȯ�ϴ� �޼ҵ�
			String columnLabel=rsmd.getColumnLabel(i);
			
			//ResultSetMetaData.isNullable(int columnIndex)
			// => columnIndex ��ġ�� �÷��� ���� NULL ��� ������(0 �Ǵ� 1)�� ��ȯ�ϴ� �޼ҵ�
			int isNull=rsmd.isNullable(i);
			String result="NULL";
			if(isNull==ResultSetMetaData.columnNoNulls) {
				result="NOT NULL";
			}
			
			//ResultSetMetaData.getColumnTypeName(int columnIndex)
			// => columnIndex ��ġ�� �÷� �ڷ����� ��ȯ�ϴ� �޼ҵ�
			String columnTypeName=rsmd.getColumnTypeName(i);
			
			//ResultSetMetaData.getColumnDisplaySize(int columnIndex)
			// => columnIndex ��ġ�� �÷��� ���� ���ũ�⸦ ��ȯ�ϴ� �޼ҵ�
			int columnDisplaySize=rsmd.getColumnDisplaySize(i);

			//ResultSetMetaData.getColumnClassName(int columnIndex)
			// => columnIndex ��ġ�� �÷��� ���� Java �ڷ���(Ŭ����)�� ��ȯ�ϴ� �޼ҵ�
			String columnClassName=rsmd.getColumnClassName(i);
			
			System.out.println("�÷� �󺧸� = "+columnLabel);
			System.out.println("NULL ��� ���� = "+result);
			System.out.println("�÷� �ڷ��� = "+columnTypeName);
			System.out.println("���ũ�� = "+columnDisplaySize);
			System.out.println("JAVA �ڷ��� = "+columnClassName);
			System.out.println("===================================");
		}
		
		ConnectionFactory.close(con, stmt, rs);
	}
}