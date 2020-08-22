package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

//Statement 인스턴스 : SQL 명령을 접속되어 있는 DBMS 서버에 전달하여
//실행 결과를 반환하는 기능을 제공하는 인스턴스
//장점 : Statement 인스턴스 하나로 다수의 SQL 명령을 전달하여 실행
//단점 : SQL 명령에 변수값을 포함하고자 할 경우 문자열 결합 기능 이용
// => 문자열 결합을 이용하여 SQL 명령을 작성하므로 가독성이 낮으며 유지보수의 효율성이 낮다.
// => InSQL 해킹 공격(값 대신 SQL 명령을 입력하는 해킹기술)에 취약 
public class StatementApp {
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
		
		Statement stmt=con.createStatement();
		
		String sql1="insert into student values("+no+",'"+name
			+"','"+phone+"','"+address+"','"+birthday+"')";
		int rows=stmt.executeUpdate(sql1);
		
		System.out.println("[결과]"+rows+"명의 학생정보를 저장 하였습니다.");
		System.out.println("============================================================");
		//STUDENT 테이블에서 모든 학생정보를 검색하여 출력 - JDBC
		String sql2="select * from student order by no";
		ResultSet rs=stmt.executeQuery(sql2);
		
		System.out.println("<<학생목록>>");
		while(rs.next()) {
			System.out.println("학번 = "+rs.getInt("no")+", 이름 = "+rs.getString("name"));
		}
		ConnectionFactory.close(con, stmt, rs);
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
		
		Statement stmt=con.createStatement();
		
		String sql="select * from student where name='"+name+"' order by no";
		ResultSet rs=stmt.executeQuery(sql);
		
		if(rs.next()) {
			do {
				System.out.println("학번 = "+rs.getInt("no")
					+", 이름 = "+rs.getString("name"));
			} while(rs.next());
		} else {
			System.out.println("[결과]검색된 학생정보가 없습니다.");
		}
		
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("============================================================");
	}
}



















