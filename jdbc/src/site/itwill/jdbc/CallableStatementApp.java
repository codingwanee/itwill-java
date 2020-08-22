package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;

//Ű����� �й��� �Է¹޾� STUDENT ���̺��� �ش� �л������� �����ϴ� JDBC ���α׷�
public class CallableStatementApp {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("<<�л����� ����>>");
		System.out.print("���� �й� �Է� >> ");
		int no=Integer.parseInt(br.readLine());
		System.out.println("=======================================");
		Connection con=ConnectionFactory.getConnection();
		
		//�й��� �Է¹޾� STUDENT ���̺��� �л������� �����ϴ� ���� ���ν��� ȣ���Ͽ� ��� 
		/*
		CREATE OR REPLACE PROCEDURE DELETE_STUDENT(VNO IN NUMBER) IS
		BEGIN
			DELETE FROM STUDENT WHERE NO=VNO;
			COMMIT;
		END;
		/	
		*/
		
		//Connection.prepareCall(String sql) 
		// => ���� ���ν����� ȣ���ϴ� ����� ����� CallableStatement �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//CallableStatement �ν��Ͻ����� ���� ���ν����� ȣ���ϴ� ����� ���� 
		// => ���� ���ν����� ȣ���ϴ� ��� : {call �������ν�����(��,...)}
		// => �� ��� InParameter ��� ����
		// => executeUpdate() �Ǵ� executeQuery() �޼ҵ�� ��� ����
		String sql="{call DELETE_STUDENT(?)}";
		CallableStatement cstmt=con.prepareCall(sql);
		cstmt.setInt(1, no);
		
		cstmt.executeUpdate();
		
		System.out.println("[���]�л������� ���� �Ͽ����ϴ�.");
		
		ConnectionFactory.close(con, cstmt);
		System.out.println("=======================================");
	}
}








