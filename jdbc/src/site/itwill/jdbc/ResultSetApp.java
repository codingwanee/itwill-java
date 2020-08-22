package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Statement 인스턴스 생성 방법에 따라 ResultSet 인스턴스의 사용법 변경
// => 커서 위치 변경 및 커서 위치 처리행의 조작 가능 
public class ResultSetApp {
	public static void main(String[] args) throws SQLException {
		Connection con=ConnectionFactory.getConnection();
		
		//Connection.createStatement() : Statement 인스턴스를 생성하여 반환하는 메소드
		//Statement 인스턴스 : SQL 명령을 전달하기 위한 기능을 제공하는 인스턴스
		//Statement.executeQuery(String sql) : SELECT 명령을 전달하여 ResultSet 인스턴스를 반환하는 메소드
		//ResultSet 인스턴스 : SELECT 명령의 검색결과를 저장하기 위한 인스턴스
		// => 커서를 아래로만 이동 가능하며 처리행의 조작 불가능
		Statement stmt=con.createStatement();
		
		String sql="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		//ResultSet.next() : 커서를 다음행으로 이동하는 메소드
		// => 처리행이 없는 경우 false 반환, 처리행이 있는 경우 true 반환
		while(rs.next()) {
			//ResultSet.getRow() : ResultSet 인스턴스에 저장된 검색행의 행번호(RowIndex)를 반환하는 메소드
			System.out.println(rs.getRow()+"행 : 학번 = "
				+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
		con=ConnectionFactory.getConnection();
		
		//Connection.createStatement(int resultSetType, int resultSetConcurrency)
		// => Statement 인스턴스를 생성하여 반환하는 메소드
		// => SELECT 명령을 전달하여 반환되는 ResultSet 인스턴스의 속성 변경
		//resultSetType : ResultSet 인스턴스의 커서 이동 관련 속성 변경
		// => ResultSet.TYPE_FORWARD_ONLY : 커서를 아래행으로만 이동(기본)
		// => ResultSet.TYPE_SCROLL_INSENSITIVE : 커서를 원하는 행으로 이동 - 조작행 미반영 
		// => ResultSet.TYPE_SCROLL_SENSITIVE : 커서를 원하는 행으로 이동 - 조작행 반영
		//resultSetConcurrency : 처리행의 조작 관련 속성 변경
		// => ResultSet.CONCUR_READ_ONLY : 처리행의 조작 불가능(기본)
		// => ResultSet.CONCUR_UPDATABLE : 처리행의 조작 가능
		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		
		//sql="select * from student order by no";
		//최초 커서 위치 : BOF 영역
		rs=stmt.executeQuery(sql);
		
		//ResultSet.first() : 커서를 첫번째 행으로 이동하는 메소드
		rs.first();
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));

		//ResultSet.last() : 커서를 마지막 행으로 이동하는 메소드
		rs.last();
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		
		//ResultSet.absolute(int rowIndex) : 커서를 전달받은 행번호 위치로 이동하는 메소드
		rs.absolute(3);
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		
		//ResultSet.previous() :커서를 이전행으로 이동하는 메소드
		rs.previous();
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		System.out.println("=======================================");
		//ResultSet.beforeFirst() : 커서를 BOF 영역으로 이동하는 메소드		
		rs.beforeFirst();
		while(rs.next()) {
			System.out.println(rs.getRow()+"행 : 학번 = "
				+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		System.out.println("=======================================");
		//ResultSet.afterLast() : 커서를 EOF 영역으로 이동하는 메소드		
		rs.afterLast();
		while(rs.previous()) {
			System.out.println(rs.getRow()+"행 : 학번 = "
				+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
		con=ConnectionFactory.getConnection();

		stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

		//커서 위치 처리행을 조작하고자 할 경우 SELECT 명령에서 검색
		//대상으로 * 사용할 경우 컬럼값 변경 불가능
		sql="select no,name,phone,address,birthday from student order by no";
		rs=stmt.executeQuery(sql);

		/*
		//검색행에서 2번째 위치에 새로운 학생정보 삽입하여 테이블에 적용 >> INSERT
		rs.absolute(2);
		
		//ResultSet.moveToInsertRow() : 커서 위치에 새로운 행을 생성하는 메소드
		// => 기존 행들의 자동으로 뒤로 이동
		rs.moveToInsertRow();
		
		//Result.updateXXX(String columnName,XXX value)
		// => 커서 위치 처리행의 컬럼값을 변경하는 메소드
		rs.updateInt("no", 5000);
		rs.updateString("name", "장길산");
		rs.updateString("phone", "016-5555-5555");
		rs.updateString("address", "수원시 팔달구");
		//rs.updateDate("birthday", new Date(2000, 5, 6));
		rs.updateString("birthday", "2000-05-06 00:00:00.0");
		
		//ResultSet.InsertRow() : 커서 위치의 처리행으로 테이블에 행을 삽입하는 메소드
		rs.insertRow();
		
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		*/
		
		/*
		//검색행에서 마지막 행을 삭제하여 테이블에 적용 >> DELETE
		rs.last();

		//ResultSet.deleteRow() : 커서 위치의 처리행으로 테이블에 행을 삭제하는 메소드
		rs.deleteRow();
		*/
		
		//검색행에서 2번째 위치의 학생정보에서 이름을 [임꺽정]으로 변경하여 테이블에 적용 >> UPDATE
		rs.absolute(2);
		rs.updateString("name", "임꺽정");
		//ResultSet.updateRow() : 커서 위치의 처리행으로 테이블의 행을 변경하는 메소드
		rs.updateRow();
		System.out.println(rs.getRow()+"행 : 학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("=======================================");
	}
}












