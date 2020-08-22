package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		Statement stmt=con.createStatement();

		/*
		String sql1="update student set name='고길동' where no=1000";
		//DML 명령을 executeQuery() 메소드로 전달 가능
		// => 메소드 반환값으로 ResultSet 인스턴스(검색결과)를 제공하므로 처리 불가능
		//ResultSet rs=stmt.executeQuery(sql1);
		int rows=stmt.executeUpdate(sql1);
		System.out.println("[결과]"+rows+"명의 학생정보를 변경 하였습니다.");
		System.out.println("=======================================");
		
		String sql2="select * from student order by no";
		//DQL 명령을 executeUpdate() 메소드로 전달 가능
		// => 메소드 반환값으로 int(조작행 갯수)를 제공하므로 처리 불가능
		//int rows=stmt.executeUpdate(sql2);
		ResultSet rs=stmt.executeQuery(sql2);
		
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}

		ConnectionFactory.close(con, stmt, rs);
 		System.out.println("=======================================");
 		*/
		
		//String sql="update student set name='고길동' where no=1000";
		String sql="select * from student order by no";
		
		//전달될 SQL 명령이 확정적이지 않을 경우 execute() 메소드 이용
		//Statement.execute(String sql) : 모든 SQL 명령을 전달하는 메소드
		// => false 반환 : DML 명령을 전달한 경우
		// => true 반환 : DQL 명령을 전달한 경우
		boolean result=stmt.execute(sql);
		
		ResultSet rs=null;
		if(result) {//SELECT 명령을 전달한 경우
			//Statement.getResultSet() : 전달되어 실행된 SQL 명령에 대한 검색결과를 반환하는 메소드 
			rs=stmt.getResultSet();
			while(rs.next()) {
				System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
			}	
		} else {//INSERT,UPDATE,DELETE 명령을 전달한 경우
			//Statement.getUpdateCount() : 전달되어 실행된 SQL 명령에 대한 조작행의 갯수를 반환하는 메소드 
			int rows=stmt.getUpdateCount();
			System.out.println("[결과]"+rows+"명의 학생정보를 "
				+sql.substring(0, 6).toUpperCase()+" 하였습니다.");
		}
		ConnectionFactory.close(con, stmt, rs);
 		System.out.println("=======================================");
	}
}