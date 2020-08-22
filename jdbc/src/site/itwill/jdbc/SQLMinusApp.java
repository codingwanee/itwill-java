package site.itwill.jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

//키보드로 SQL 명령(INSERT,UPDATE,DELETE,SELECT)을 입력받아 DBMS 
//서버에 전달하여 반환된 처리 결과를 출력하는 JDBC 프로그램
// => SQL 명령을 계속 입력받아 전달하여 처리 결과를 출력
// => EXIT 명령을 입력한 경우 프로그램 종료 - 대소문자 미구분
// => 입력된 SQL 명령이 잘못된 경우 반환받은 에러 메세지 출력
// => SQLPLUS 프로그램을 참조하여 처리 결과 출력
public class SQLMinusApp {
	public static void main(String[] args) throws Exception {
		//SQL 명령을 입력받기 위한 키보드 입력 스트림 생성
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Connection con=ConnectionFactory.getConnection();
		Statement stmt=con.createStatement();
		ResultSet rs=null;
		
		while(true) {
			//키보드로 SQL 명령을 입력받아 저장
			System.out.print("SQL> ");
			String sql=br.readLine().trim();
			
			//입력된 문자열이 [exit]인 경우 반복문 종료 >> 프로그램 종료
			if(sql.equalsIgnoreCase("exit")) break;
			
			//SQL 명령을 입력하지 않은 경우 반복문 재실행
			if(sql==null || sql.equals("")) continue;
			
			//SQL 명령을 전달하여 실행결과를 반환받아 처리(출력)
			try {
				if(stmt.execute(sql)) {//DQL 명령을 전달한 경우
					rs=stmt.getResultSet();
					
					//검색결과에 대한 컬럼정보를 반환받아 저장
					ResultSetMetaData rsmd=rs.getMetaData();
					
					//검색결과에 대한 검색대상의 갯수를 반환받아 저장
					int columnCount=rsmd.getColumnCount();
					
					//검색결과 출력
					if(rs.next()) {//검색행이 존재할 경우
						System.out.println("==========================================================================");
						//검색대상에 대한 컬럼명 출력 
						for(int i=1;i<=columnCount;i++) {
							System.out.print(rsmd.getColumnLabel(i)+"\t");
						}
						System.out.println();
						System.out.println("==========================================================================");
						do {
							//처리행의 컬럼값를 반환받아 출력
							for(int i=1;i<=columnCount;i++) {
								String columnValue=rs.getString(i);
								if(rsmd.getColumnTypeName(i).equals("DATE")) {
									columnValue=columnValue.substring(0, 10);
								}
								if(columnValue==null) {
									columnValue="   ";
								}
								System.out.print(columnValue+"\t");
							}
							System.out.println();
						} while(rs.next());
					} else {//검색행이 존재하지 않을 경우
						System.out.println("검색된 결과가 하나도 없습니다.");
					}
				} else {//DML 명령을 전달한 경우
					int rows=stmt.getUpdateCount();
					System.out.println(rows+"개의 행을 "
						+sql.substring(0, 6).toUpperCase()+" 하였습니다.");
				}
			} catch (SQLException e) {//전달된 SQL 명령에 오류가 존재할 경우
				System.out.println("SQL 오류 = "+e.getMessage());
			}	
			System.out.println();
		}
		ConnectionFactory.close(con, stmt, rs);
		System.out.println("[메세지]SQLMinus 프로그램을 종료합니다.");
	}
}








