package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//PreparedStatement �ν��Ͻ� : SQL ����� ���ӵǾ� �ִ� DBMS ������
//�����Ͽ� ���� ����� ��ȯ�ϴ� ����� �����ϴ� �ν��Ͻ�
//���� : SQL ��ɿ� �������� �����ϰ��� �� ��� InParameter �̿�
// => �޼ҵ带 �̿��Ͽ� �������� �����Ͽ� �����ϹǷ� ������ �� ���������� ȿ������ ����.
// => �Է°��� SQL ��� ��� �Ұ� - InSQL ��ŷ ���� ��ȿ ó�� ���� 
//���� : PreparedStatement �ν��Ͻ� �ϳ��� �ϳ��� SQL ����� �����Ͽ� ����
public class PreparedStatementApp {
	public static void main(String[] args) throws Exception {
		/*
		//Ű����� �л������� �Է¹޾� STUDENT ���̺� ������ �� STUDENT 
		//���̺��� ��� �л������� �˻��Ͽ� ����ϴ� JDBC ���α׷�
		
		//Ű����� �л������� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//Ű����� �л������� �Է¹޾� ����
		System.out.println("<<�л����� �Է�>>");
		System.out.print("�й� �Է� >> ");
		int no=Integer.parseInt(br.readLine());
		System.out.print("�̸� �Է� >> ");
		String name=br.readLine();
		System.out.print("��ȭ��ȣ �Է� >> ");
		String phone=br.readLine();
		System.out.print("�ּ� �Է� >> ");
		String address=br.readLine();
		System.out.print("������� �Է� >> ");
		String birthday=br.readLine();
		System.out.println("============================================================");
		//�Է¹��� �л������� STUDENT ���̺� ���� - JDBC
		Connection con=ConnectionFactory.getConnection();
		
		String sql1="insert into student values(?,?,?,?,?)";
		//Connection.prepareStatement(String sql) : ?(InParameter)�� ������ 
		//SQL ����� �����ϴ� PreparedStatement �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => InParameter : ���� ���޹ޱ� ���� ��ȣ 
		// => InParameter�� ���ԵǾ� �ִ� �̿ϼ��� SQL ���
		PreparedStatement pstmt=con.prepareStatement(sql1);
		//InParameter�� ���� �����Ͽ� SQL ��� �ϼ�
		//PreparedStatement.setXXX(int parameterIndex,XXX value)
		// => ���ϴ� ��ġ�� InParameter�� ���� �����ϴ� �޼ҵ�
		// => InParameter�� ������ŭ �޼ҵ� ȣ���Ͽ� ���ϴ� InParameter�� �� ����
		pstmt.setInt(1, no);
		pstmt.setString(2, name);
		pstmt.setString(3, phone);
		pstmt.setString(4, address);
		pstmt.setString(5, birthday);
		
		//PreparedStatement �ν��Ͻ��� ����� SQL ����� ����
		//PreparedStatement.executeUpdate() : DML ��� ���� >> ��ȯ�� : int 
		//PreparedStatement.executeQuery() : DQL ��� ���� >> ��ȯ�� : ResultSet
		int rows=pstmt.executeUpdate();
		System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		System.out.println("============================================================");
		//STUDENT ���̺��� ��� �л������� �˻��Ͽ� ��� - JDBC
		String sql2="select * from student order by no";
		pstmt=con.prepareStatement(sql2);
		
		ResultSet rs=pstmt.executeQuery();
				
		System.out.println("<<�л����>>");
		while(rs.next()) {
			System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		ConnectionFactory.close(con, pstmt, rs);
		System.out.println("============================================================");
		*/
		
		//Ű����� �л��̸��� �Է¹޾� STUDENT ���̺��� �˻��Ͽ� ����ϴ� JDBC ���α׷�

		//Ű����� �л��̸��� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("<<�л����� �˻�>>");
		System.out.print("�̸� �Է� >> ");
		String name=br.readLine();
		System.out.println("============================================================");
		Connection con=ConnectionFactory.getConnection();

		String sql="select * from student where name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, name);
		
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			do {
				System.out.println("�й� = "+rs.getInt("no")
					+", �̸� = "+rs.getString("name"));
			} while(rs.next());
		} else {
			System.out.println("[���]�˻��� �л������� �����ϴ�.");
		}
		
		ConnectionFactory.close(con, pstmt, rs);
		System.out.println("============================================================");
	}
}






