package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//Ű����� SQL ���(INSERT,UPDATE,DELETE,SELECT)�� �Է¹޾� DBMS 
//������ �����Ͽ� ��ȯ�� ó�� ����� ����ϴ� JDBC ���α׷�
// => SQL ����� ��� �Է¹޾� �����Ͽ� ó�� ����� ���
// => EXIT ����� �Է��� ��� ���α׷� ���� - ��ҹ��� �̱���
// => �Էµ� SQL ����� �߸��� ��� ��ȯ���� ���� �޼��� ���
// => SQLPLUS ���α׷��� �����Ͽ� ó�� ��� ���
public class SQLMinusApp {
	public static void main(String[] args) throws Exception {
		//SQL ����� �Է¹ޱ� ���� Ű���� �Է� ��Ʈ�� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Connection con=ConnectionFactory.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		
		while(true) {
			//Ű����� SQL ����� �Է¹޾� ����
			System.out.print("SQL> ");
			String sql=br.readLine().trim();
			
			//�Էµ� ���ڿ��� [exit]�� ��� �ݺ��� ���� >> ���α׷� ����
			if(sql.equalsIgnoreCase("exit")) break;
			
			//SQL ����� �Է����� ���� ��� �ݺ��� �����
			if(sql==null || sql.equals("")) continue;
			
			//SQL ����� �����Ͽ� �������� ��ȯ�޾� ó��(���)
			try {
				if(stmt.execute(sql)) {//DQL ����� ������ ���
					rs=stmt.getResultSet();
					
					//�˻������ ���� �÷������� ��ȯ�޾� ����
					ResultSetMetaData rsmd=rs.getMetaData();
					
					//�˻������ ���� �˻������ ������ ��ȯ�޾� ����
					int columnCount=rsmd.getColumnCount();
					
					//�˻���� ���
					if(rs.next()) {//�˻����� ������ ���
						System.out.println("==========================================================================");
						//�˻���� ���� �÷��� ��� 
						for(int i=1;i<=columnCount;i++) {
							System.out.print(rsmd.getColumnLabel(i)+"\t");
						}
						System.out.println();
						System.out.println("==========================================================================");
						do {
							//ó������ �÷����� ��ȯ�޾� ���
							for(int i=1;i<=columnCount;i++) {
								String columnValue=rs.getString(i);
								if(rsmd.getColumnTypeName(i).equals("DATE")) {
									columnValue=columnValue.substring(0, 10);
								}
								if(columnValue==null) {
									columnValue="   ";
								}
								System.out.print(columnValue+"\t");
							}
							System.out.println();
						} while(rs.next());
					} else {//�˻����� �������� ���� ���
						System.out.println("�˻��� ����� �ϳ��� �����ϴ�.");
					}
				} else {//DML ����� ������ ���
					int rows=stmt.getUpdateCount();
					System.out.println(rows+"���� ���� "
						+sql.substring(0, 6).toUpperCase()+" �Ͽ����ϴ�.");
				}
			} catch (SQLException e) {//���޵� SQL ��ɿ� ������ ������ ���
				System.out.println("SQL ���� = "+e.getMessage());
			}	
			System.out.println();
		}
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("[�޼���]SQLMinus ���α׷��� �����մϴ�.");
	}
}








