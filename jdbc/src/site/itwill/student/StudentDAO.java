package site.itwill.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object) 클래스 : 데이타소스(DataSource)에 정보의
//저장,변경,삭제,검색 기능을 제공하기 위한 메소드가 선언된 클래스
// => DAO 인터페이스를 상속받아 작성하는 것을 권장
// => 싱글톤 클래스(프로그램에 인스턴스를 하나만 제공하는 클래스)로 작성하는 것을 권장
//DataSource : 데이타를 저장하기 위한 저장장치 또는 소프트웨어(RDBMS)

//STUDENT 테이블에 학생정보의 저장,삭제,변경,검색 기능을 제공하기 위한 클래스
public class StudentDAO extends DBCPManager {
	//클래스의 인스턴스를 저장하기 위한 정적 필드 선언 >> 시스템 필드
	private static StudentDAO _dao;
	
	//생성자를 은닉화하여 선언 >> 클래스 외부에서 생성자 접근 불가 - 인스턴스 생성 불가능
	private StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	//정적영역 >> 인스턴스를 생성하여 시스템 필드에 저장
	static {
		_dao=new StudentDAO();
	}
	
	//시스템 필드에 저장된 인스턴스를 반환하는 정적 메소드
	public static StudentDAO getStudentDAO() {
		return _dao;
	}
	*/
	
	public static StudentDAO getStudentDAO() {
		if(_dao==null) {
			_dao=new StudentDAO();
		}
		return _dao;
	}
	
	//학생정보를 전달받아 STUDENT 테이블에 행정보로 삽입하는 메소드 >> 저장행의 갯수 반환
	public int insertStudent(StudentDTO student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			//부모클래스의 메소드 호출 >> DBCP로부터 Connection 인스턴스 반환받아 저장
			con=getConnection();
			
			String sql="insert into student values(?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, student.getNo());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getPhone());
			pstmt.setString(4, student.getAddress());
			pstmt.setString(5, student.getBirthday());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]insertStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//학생정보를 전달받아 STUDENT 테이블의 행정보를 변경하는 메소드 >> 변경행의 갯수 반환
	public int updateStudent(StudentDTO student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="update student set name=?,phone=?"
					+ ",address=?,birthday=? where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getPhone());
			pstmt.setString(3, student.getAddress());
			pstmt.setString(4, student.getBirthday());
			pstmt.setInt(5, student.getNo());
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]updateStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//학번을 전달받아 STUDENT 테이블의 행정보를 삭제하는 메소드 >> 삭제행의 갯수 반환
	public int deleteStudent(int no) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			con=getConnection();
			
			String sql="delete from student where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rows=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("[에러]deleteStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//학번을 전달받아 STUDENT 테이블의 행정보를 검색하는 메소드 >> 하나의 학생정보 반환
	public StudentDTO selectNoStudent(int no) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		StudentDTO student=null;
		try {
			con=getConnection();
			
			String sql="select * from student where no=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, no);
			
			rs=pstmt.executeQuery();
			
			if(rs.next()) {//검색행이 존재할 경우
				//검색행의 컬럼값을 저장하기 위한 DTO 인스턴스 생성 
				student=new StudentDTO();
				//검색행의 컬럼값을 이용하여 DTO 인스턴스의 필드값 변경
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
			}
		} catch (SQLException e) {
			System.out.println("[에러]selectNoStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		//검색행의 없으면 null 반환, 검색행이 있으면 DTO 인스턴스 반환
		return student;
	}

	//이름을 전달받아 STUDENT 테이블의 행정보를 검색하는 메소드 >> 다수의 학생정보 반환
	public List<StudentDTO> selectNameStudent(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<StudentDTO> studentList=new ArrayList<StudentDTO>();
		try {
			con=getConnection();
					
			//전달된 이름과 동일한 이름의 학생정보를 검색
			//String sql="select * from student where name=? order by no";
			//전달된 이름(문자)과 포함된 이름의 학생정보를 검색
			String sql="select * from student where name like '%'||?||'%' order by no";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//검색행을 DTO 인스턴스에 저장
				StudentDTO student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
				//List 인스턴스에 DTO 인스턴스를 요소로 추가
				studentList.add(student);
			}
 		} catch (SQLException e) {
			System.out.println("[에러]selectNoStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
	
	//STUDENT 테이블의 모든 행정보를 검색하는 메소드 >> 다수의 학생정보 반환
	public List<StudentDTO> selectAllStudent() {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<StudentDTO> studentList=new ArrayList<StudentDTO>();
		try {
			con=getConnection();
					
			String sql="select * from student order by no";
			pstmt=con.prepareStatement(sql);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				StudentDTO student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
				studentList.add(student);
			}
 		} catch (SQLException e) {
			System.out.println("[에러]selectAllStudent() 메소드의 SQL 오류 = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
}
