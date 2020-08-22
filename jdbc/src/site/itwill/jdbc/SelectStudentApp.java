package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT 테이블에서 모든 학생정보를 검색하여 출력하는 JDBC 프로그램
public class SelectStudentApp {
	public static void main(String[] args) {
		Connection con=null;
		Statement stmt=null;
		//ResultSet : SELECT 명령에 의한 검색결과를 저장하기 위한 인스턴스
		ResultSet rs=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			
			stmt=con.createStatement();
			
			//다중행에 대한 검색결과는 정렬 기능을 제공하는 것을 권장
			String sql="select * from student order by no";
			//SELECT 명령은 Statement.executeQuery(String sql) 메소드로 전달하여 실행
			// => 검색결과를 ResultSet 인스턴스에 저장하여 반환
			//ResultSet 인스턴스에 저장된 검색결과는 행(Row)단위로 처리하기 위한 커서(Cursor)를 제공
			// => 커서의 최초 위치는 BOF(Before Of File) 영역에 존재
			//ResultSet.next() : 커서를 아래로 이동하는 메소드 - 커서 위치의 행 처리
			// => false 반환 : 이동 커서 위치에 처리행이 없는 경우 - EOF(End Of File) 영역
			// => true : 이동 커서 위치에 처리행이 존재할 경우
			rs=stmt.executeQuery(sql);
			
			/*
			//SELECT 명령에 대한 검색결과 유무를 판단하여 명령을 선택 실행
			if(rs.next()) {//커서를 아래로 이동하여 처리행이 존재할 경우
				System.out.println("[결과]검색결과가 존재합니다.");
			} else {//커서를 아래로 이동하여 처리행이 없을 경우
				System.out.println("[결과]검색결과가 없습니다.");
			}
			*/
			
			//SELECT 명령에 대한 검색결과에 대한 반복 처리
			// => 커서가 EOF 영역에 위치하면 반복문 종료 
			while(rs.next()) {
				//커서가 위치한 처리행에서 필요한 컬럼값을 반환받아 처리(출력)
				//ResultSet.getXXX(int columnIndex) 또는 ResultSet.getXXX(String columnName)
				// => 커서가 위치한 처리행에서 원하는 컬럼값을 반환하는 메소드
				// => XXX : 컬럼값을 반환받기 위한 Java 자료형
				// => columnIndex : 검색대상의 위치값(1부터 1씩 증가되는 값 사용)
				//int no=rs.getInt(1);
				int no=rs.getInt("no");
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String address=rs.getString("address");
				//Date birthday=rs.getDate("birthday");
				//모든 컬럼값은 문자열(String)로 반환받아 저장 가능
				String birthday=rs.getString("birthday");
				
				System.out.println("학번 = "+no);
				System.out.println("이름 = "+name);
				System.out.println("전화번호 = "+phone);
				System.out.println("주소 = "+address);
				//System.out.println("생년월일 = "+birthday);
				System.out.println("생년월일 = "+birthday.substring(0, 10));
				System.out.println("===============================");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("[에러]OracleDriver 클래스가 존재하지 않습니다.");
		} catch (SQLException e) {
			System.out.println("[에러]DBMS 오류 = "+e.getMessage());
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}


