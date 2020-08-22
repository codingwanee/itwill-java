package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Statement �ν��Ͻ� : SQL ����� ���ӵǾ� �ִ� DBMS ������ �����Ͽ�
//���� ����� ��ȯ�ϴ� ����� �����ϴ� �ν��Ͻ�
//���� : Statement �ν��Ͻ� �ϳ��� �ټ��� SQL ����� �����Ͽ� ����
//���� : SQL ��ɿ� �������� �����ϰ��� �� ��� ���ڿ� ���� ��� �̿�
// => ���ڿ� ������ �̿��Ͽ� SQL ����� �ۼ��ϹǷ� �������� ������ ���������� ȿ������ ����.
// => InSQL ��ŷ ����(�� ��� SQL ����� �Է��ϴ� ��ŷ���)�� ��� 
public class StatementApp {
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
		
		Statement stmt=con.createStatement();
		
		String sql1="insert into student values("+no+",'"+name
			+"','"+phone+"','"+address+"','"+birthday+"')";
		int rows=stmt.executeUpdate(sql1);
		
		System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		System.out.println("============================================================");
		//STUDENT ���̺��� ��� �л������� �˻��Ͽ� ��� - JDBC
		String sql2="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql2);
		
		System.out.println("<<�л����>>");
		while(rs.next()) {
			System.out.println("�й� = "+rs.getInt("no")+", �̸� = "+rs.getString("name"));
		}
		ConnectionFactory.close(con, stmt, rs);
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
		
		Statement stmt=con.createStatement();
		
		String sql="select * from student where name='"+name+"' order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		if(rs.next()) {
			do {
				System.out.println("�й� = "+rs.getInt("no")
					+", �̸� = "+rs.getString("name"));
			} while(rs.next());
		} else {
			System.out.println("[���]�˻��� �л������� �����ϴ�.");
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("============================================================");
	}
}



















