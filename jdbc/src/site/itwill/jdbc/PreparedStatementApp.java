package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//PreparedStatement 인스턴스 : SQL 명령을 접속되어 있는 DBMS 서버에
//전달하여 실행 결과를 반환하는 기능을 제공하는 인스턴스
//장점 : SQL 명령에 변수값을 포함하고자 할 경우 InParameter 이용
// => 메소드를 이용하여 변수값을 전달하여 포함하므로 가독성 및 유지보수의 효율성이 높다.
// => 입력값에 SQL 명령 사용 불가 - InSQL 해킹 공격 무효 처리 가능 
//단점 : PreparedStatement 인스턴스 하나로 하나의 SQL 명령을 전달하여 실행
public class PreparedStatementApp {
	public static void main(String[] args) throws Exception {
		/*
		//키보드로 학생정보를 입력받아 STUDENT 테이블에 저장한 후 STUDENT 
		//테이블에서 모든 학생정보를 검색하여 출력하는 JDBC 프로그램
		
		//키보드로 학생정보를 입력받기 위한 입력스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		//키보드로 학생정보를 입력받아 저장
		System.out.println("<<학생정보 입력>>");
		System.out.print("학번 입력 >> ");
		int no=Integer.parseInt(br.readLine());
		System.out.print("이름 입력 >> ");
		String name=br.readLine();
		System.out.print("전화번호 입력 >> ");
		String phone=br.readLine();
		System.out.print("주소 입력 >> ");
		String address=br.readLine();
		System.out.print("생년월일 입력 >> ");
		String birthday=br.readLine();
		System.out.println("============================================================");
		//입력받은 학생정보를 STUDENT 테이블에 저장 - JDBC
		Connection con=ConnectionFactory.getConnection();
		
		String sql1="insert into student values(?,?,?,?,?)";
		//Connection.prepareStatement(String sql) : ?(InParameter)를 포함한 
		//SQL 명령을 저장하는 PreparedStatement 인스턴스를 생성하여 반환하는 메소드
		// => InParameter : 값을 전달받기 위한 기호 
		// => InParameter가 포함되어 있는 미완성된 SQL 명령
		PreparedStatement pstmt=con.prepareStatement(sql1);
		//InParameter에 값을 전달하여 SQL 명령 완성
		//PreparedStatement.setXXX(int parameterIndex,XXX value)
		// => 원하는 위치의 InParameter에 값을 전달하는 메소드
		// => InParameter의 갯수만큼 메소드 호출하여 원하는 InParameter에 값 전달
		pstmt.setInt(1, no);
		pstmt.setString(2, name);
		pstmt.setString(3, phone);
		pstmt.setString(4, address);
		pstmt.setString(5, birthday);
		
		//PreparedStatement 인스턴스에 저장된 SQL 명령을 전달
		//PreparedStatement.executeUpdate() : DML 명령 전달 >> 반환값 : int 
		//PreparedStatement.executeQuery() : DQL 명령 전달 >> 반환값 : ResultSet
		int rows=pstmt.executeUpdate();
		System.out.println("[결과]"+rows+"명의 학생정보를 저장 하였습니다.");
		System.out.println("============================================================");
		//STUDENT 테이블에서 모든 학생정보를 검색하여 출력 - JDBC
		String sql2="select * from student order by no";
		pstmt=con.prepareStatement(sql2);
		
		ResultSet rs=pstmt.executeQuery();
				
		System.out.println("<<학생목록>>");
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		ConnectionFactory.close(con, pstmt, rs);
		System.out.println("============================================================");
		*/
		
		//키보드로 학생이름을 입력받아 STUDENT 테이블에서 검색하여 출력하는 JDBC 프로그램

		//키보드로 학생이름을 입력받기 위한 입력스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("<<학생정보 검색>>");
		System.out.print("이름 입력 >> ");
		String name=br.readLine();
		System.out.println("============================================================");
		Connection con=ConnectionFactory.getConnection();

		String sql="select * from student where name=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, name);
		
		ResultSet rs=pstmt.executeQuery();
		
		if(rs.next()) {
			do {
				System.out.println("학번 = "+rs.getInt("no")
					+", 이름 = "+rs.getString("name"));
			} while(rs.next());
		} else {
			System.out.println("[결과]검색된 학생정보가 없습니다.");
		}
		
		ConnectionFactory.close(con, pstmt, rs);
		System.out.println("============================================================");
	}
}






