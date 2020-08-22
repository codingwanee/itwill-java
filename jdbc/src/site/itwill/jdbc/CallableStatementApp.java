package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;

//키보드로 학번을 입력받아 STUDENT 테이블에서 해당 학생정보를 삭제하는 JDBC 프로그램
public class CallableStatementApp {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("<<학생정보 삭제>>");
		System.out.print("삭제 학번 입력 >> ");
		int no=Integer.parseInt(br.readLine());
		System.out.println("=======================================");
		Connection con=ConnectionFactory.getConnection();
		
		//학번을 입력받아 STUDENT 테이블에서 학생정보를 삭제하는 저장 프로시저 호출하여 사용 
		/*
		CREATE OR REPLACE PROCEDURE DELETE_STUDENT(VNO IN NUMBER) IS
		BEGIN
			DELETE FROM STUDENT WHERE NO=VNO;
			COMMIT;
		END;
		/	
		*/
		
		//Connection.prepareCall(String sql) 
		// => 저장 프로시져를 호출하는 명령이 저장된 CallableStatement 인스턴스를 반환하는 메소드
		//CallableStatement 인스턴스에는 저장 프로시져를 호출하는 명령이 저장 
		// => 저장 프로시져를 호출하는 명령 : {call 저장프로시져명(값,...)}
		// => 값 대신 InParameter 사용 가능
		// => executeUpdate() 또는 executeQuery() 메소드로 명령 전달
		String sql="{call DELETE_STUDENT(?)}";
		CallableStatement cstmt=con.prepareCall(sql);
		cstmt.setInt(1, no);
		
		cstmt.executeUpdate();
		
		System.out.println("[결과]학생정보를 삭제 하였습니다.");
		
		ConnectionFactory.close(con, cstmt);
		System.out.println("=======================================");
	}
}








