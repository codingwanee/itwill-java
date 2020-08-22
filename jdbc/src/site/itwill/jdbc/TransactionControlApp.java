package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//JDBC 프로그램을 이용하여 SQL 명령(DML)을 전달하여 실행하면 기본적으로
//제공되는 자동 커밋 기능에 의해 테이블에 명령 직접 적용
// => 자동 커밋 기능을 비활성화 설정하여 프로그램이 정상적으로 실행된
//    경우에만 커밋 처리하고 오류(예외) 발생시에는 롤백 처리

//STUDENT 테이블에 저장된 학생정보 중 학번이 4000인 학생정보를 삭제하는 JDBC 프로그램
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
			// => 자동 커밋 기능의 사용 유무를 변경하는 메소드
			// => false : 자동 커밋 비활성화, true : 자동 커밋 활성화(기본)
			con.setAutoCommit(false);
			
			stmt=con.createStatement();
			
			String sql="delete from student where no=4000";
			int rows=stmt.executeUpdate(sql);
			
			//SQL 명령이 전달되어 실행된 후 예외 발생
			//throw new RuntimeException("프로그램에 오류가 발생 하였습니다.");
			
			System.out.println("[결과]"+rows+"명의 학생정보를 삭제 하였습니다.");
			
			//프로그램이 정상적으로 실행된 경우 커밋 처리
			//Connection.commit() : 접속서버에 COMMIT 명령을 전달하여 실행
			con.commit();
		} catch (ClassNotFoundException e) {
			System.out.println("[에러]OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("[에러]DBMS 오류 = "+e.getMessage());
		} catch (Exception e) {
			try {
				//프로그램 실행시 오류가 발생된 경우 롤백 처리
				//Connection.rollback() : 접속서버에 ROLLBACK 명령을 전달하여 실행
				con.rollback();
				System.out.println("[에러]실행 오류 = "+e.getMessage());
			} catch (SQLException exception) {}
		} finally {
			try {
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}
