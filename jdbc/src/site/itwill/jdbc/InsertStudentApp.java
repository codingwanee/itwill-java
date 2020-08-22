package site.itwill.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//STUDENT 테이블 : 학번(숫자형-PK),이름(문자형),전화번호(문자형),주소(문자형),생년월일(날짜형) 
//STUDENT 테이블 생성
//CREATE TABLE STUDENT(NO NUMBER(4) PRIMARY KEY,NAME VARCHAR2(20)
//,PHONE VARCHAR2(20),ADDRESS VARCHAR2(50),BIRTHDAY DATE);

//STUDENT 테이블에 학생정보를 저장하는 JDBC 프로그램
public class InsertStudentApp {
	public static void main(String[] args) {
		//JDBC 관련 인스턴스를 저장하는 참조변수는 try 영역밖에서 선언
		// => finally 영역에서 참조변수 사용 가능 - 인스턴스 제거
		Connection con=null;
		Statement stmt=null;
		try {
			//1.OracleDriver 클래스를 이용하여 DriverManager 클래스의 JDBC Driver 등록
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2.JDBC Driver를 이용하여 DBMS 접속
			//DriverManager.getConnection(String url, String user, String password)
			// => 서버 접속 정보를 전달하여 DBMS 접속 후 Connecion 인스턴스를 반환하는 메소드
			// => SQLException 발생 : DBMS 오류 - 예외처리
			//Connection 인스턴스 : DBMS 접속정보를 이용하여 기능을 제공하는 인스턴스
			//URL : 인터넷에 존재하는 자원을 주소 형식으로 표현하기 위한 방법
			// => Protocol:ServerName:Port:ResourcePath
			//Oracle DBMS URL >> jdbc:oracle:thin:@ServerName(IP):1521:SID
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="scott";
			String password="tiger";
			con=DriverManager.getConnection(url, user, password);
			//System.out.println("con = "+con);
			
			//3.Connection 인스턴스로부터 SQL 명령을 전달할 수 있는 
			//Statement 인스턴스를 반환받아 저장
			//Connection.createStatement() : Statement 인스턴스를 반환하는 메소드
			// => SQLException 발생
			stmt=con.createStatement();
			
			//4.Statement 인스턴스를 이용하여 SQL 명령을 접속서버에 전달
			//Statement.executeUpdate(String sql) : SQL 명령(DML)을 전달하여 실행결과(int)를 반환하는 메소드 
			//Statement.executeQuery(String sql) : SQL 명령(DQL)을 전달하여 실행결과(ResultSet)를 반환하는 메소드
			//String sql="insert into student values(1000,'홍길동','010-1111-1111','서울시 강남구','90/11/02')";
			//String sql="insert into student values(2000,'임꺽정','010-2222-2222','수원시 팔달구','92/06/29')";
			//String sql="insert into student values(3000,'전우치','010-3333-3333','인천시 월미구','99/03/16')";
			String sql="insert into student values(4000,'일지매','017-4444-4444','서울시 종로구','00/05/05')";
			//DML 명령 실행에 대한 조작행의 갯수 반환받아 저장
			// => SQLException 발생
			int rows=stmt.executeUpdate(sql);
			
			//5.반환받은 실행결과를 이용한 처리 >> 출력
			System.out.println("[결과]"+rows+"명의 학생정보를 저장 하였습니다.");

		} catch (ClassNotFoundException e) {
			System.out.println("[에러]OracleDriver 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("[에러]DBMS 오류 = "+e.getMessage());
		} finally {
			//6.사용한 JDBC 관련 모든 인스턴스 제거 - 생성 순서 반대로 제거
			// => close() 메소드 호출 - SQLException 발생
			try {
				//if 구문을 이용하여 NullPointerException 발생 방지
				if(stmt!=null) stmt.close();
				if(con!=null) con.close();
			} catch (SQLException e) {}
		}
	}
}
