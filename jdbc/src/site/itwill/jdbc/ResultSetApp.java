package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Statement �ν��Ͻ� ���� ����� ���� ResultSet �ν��Ͻ��� ���� ����
// => Ŀ�� ��ġ ���� �� Ŀ�� ��ġ ó������ ���� ���� 
public class ResultSetApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		//Connection.createStatement() : Statement �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		//Statement �ν��Ͻ� : SQL ����� �����ϱ� ���� ����� �����ϴ� �ν��Ͻ�
		//Statement.executeQuery(String sql) : SELECT ����� �����Ͽ� ResultSet �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//ResultSet �ν��Ͻ� : SELECT ����� �˻������ �����ϱ� ���� �ν��Ͻ�
		// => Ŀ���� �Ʒ��θ� �̵� �����ϸ� ó������ ���� �Ұ���
		Statement stmt=con.createStatement();
		
		String sql="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		//ResultSet.next() : Ŀ���� ���������� �̵��ϴ� �޼ҵ�
		// => ó������ ���� ��� false ��ȯ, ó������ �ִ� ��� true ��ȯ
		while(rs.next()) {
			//ResultSet.getRow() : ResultSet �ν��Ͻ��� ����� �˻����� ���ȣ(RowIndex)�� ��ȯ�ϴ� �޼ҵ�
			System.out.println(rs.getRow()+"�� : �й� = "
				+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
		con=ConnectionFactory.getConnection();
		
		//Connection.createStatement(int resultSetType, int resultSetConcurrency)
		// => Statement �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => SELECT ����� �����Ͽ� ��ȯ�Ǵ� ResultSet �ν��Ͻ��� �Ӽ� ����
		//resultSetType : ResultSet �ν��Ͻ��� Ŀ�� �̵� ���� �Ӽ� ����
		// => ResultSet.TYPE_FORWARD_ONLY : Ŀ���� �Ʒ������θ� �̵�(�⺻)
		// => ResultSet.TYPE_SCROLL_INSENSITIVE : Ŀ���� ���ϴ� ������ �̵� - ������ �̹ݿ� 
		// => ResultSet.TYPE_SCROLL_SENSITIVE : Ŀ���� ���ϴ� ������ �̵� - ������ �ݿ�
		//resultSetConcurrency : ó������ ���� ���� �Ӽ� ����
		// => ResultSet.CONCUR_READ_ONLY : ó������ ���� �Ұ���(�⺻)
		// => ResultSet.CONCUR_UPDATABLE : ó������ ���� ����
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//sql="select * from student order by no";
		//���� Ŀ�� ��ġ : BOF ����
		rs=stmt.executeQuery(sql);
		
		//ResultSet.first() : Ŀ���� ù��° ������ �̵��ϴ� �޼ҵ�
		rs.first();
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));

		//ResultSet.last() : Ŀ���� ������ ������ �̵��ϴ� �޼ҵ�
		rs.last();
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		
		//ResultSet.absolute(int rowIndex) : Ŀ���� ���޹��� ���ȣ ��ġ�� �̵��ϴ� �޼ҵ�
		rs.absolute(3);
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		
		//ResultSet.previous() :Ŀ���� ���������� �̵��ϴ� �޼ҵ�
		rs.previous();
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		System.out.println("=======================================");
		//ResultSet.beforeFirst() : Ŀ���� BOF �������� �̵��ϴ� �޼ҵ�		
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println(rs.getRow()+"�� : �й� = "
				+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		System.out.println("=======================================");
		//ResultSet.afterLast() : Ŀ���� EOF �������� �̵��ϴ� �޼ҵ�		
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getRow()+"�� : �й� = "
				+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
		con=ConnectionFactory.getConnection();

		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		//Ŀ�� ��ġ ó������ �����ϰ��� �� ��� SELECT ��ɿ��� �˻�
		//������� * ����� ��� �÷��� ���� �Ұ���
		sql="select no,name,phone,address,birthday from student order by no";
		rs=stmt.executeQuery(sql);

		/*
		//�˻��࿡�� 2��° ��ġ�� ���ο� �л����� �����Ͽ� ���̺� ���� >> INSERT
		rs.absolute(2);
		
		//ResultSet.moveToInsertRow() : Ŀ�� ��ġ�� ���ο� ���� �����ϴ� �޼ҵ�
		// => ���� ����� �ڵ����� �ڷ� �̵�
		rs.moveToInsertRow();
		
		//Result.updateXXX(String columnName,XXX value)
		// => Ŀ�� ��ġ ó������ �÷����� �����ϴ� �޼ҵ�
		rs.updateInt("no", 5000);
		rs.updateString("name", "����");
		rs.updateString("phone", "016-5555-5555");
		rs.updateString("address", "������ �ȴޱ�");
		//rs.updateDate("birthday", new Date(2000, 5, 6));
		rs.updateString("birthday", "2000-05-06 00:00:00.0");
		
		//ResultSet.InsertRow() : Ŀ�� ��ġ�� ó�������� ���̺� ���� �����ϴ� �޼ҵ�
		rs.insertRow();
		
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		*/
		
		/*
		//�˻��࿡�� ������ ���� �����Ͽ� ���̺� ���� >> DELETE
		rs.last();

		//ResultSet.deleteRow() : Ŀ�� ��ġ�� ó�������� ���̺� ���� �����ϴ� �޼ҵ�
		rs.deleteRow();
		*/
		
		//�˻��࿡�� 2��° ��ġ�� �л��������� �̸��� [�Ӳ���]���� �����Ͽ� ���̺� ���� >> UPDATE
		rs.absolute(2);
		rs.updateString("name", "�Ӳ���");
		//ResultSet.updateRow() : Ŀ�� ��ġ�� ó�������� ���̺��� ���� �����ϴ� �޼ҵ�
		rs.updateRow();
		System.out.println(rs.getRow()+"�� : �й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
	}
}












