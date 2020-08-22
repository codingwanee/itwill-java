package site.itwill.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object) Ŭ���� : ����Ÿ�ҽ�(DataSource)�� ������
//����,����,����,�˻� ����� �����ϱ� ���� �޼ҵ尡 ����� Ŭ����
// => DAO �������̽��� ��ӹ޾� �ۼ��ϴ� ���� ����
// => �̱��� Ŭ����(���α׷��� �ν��Ͻ��� �ϳ��� �����ϴ� Ŭ����)�� �ۼ��ϴ� ���� ����
//DataSource : ����Ÿ�� �����ϱ� ���� ������ġ �Ǵ� ����Ʈ����(RDBMS)

//STUDENT ���̺� �л������� ����,����,����,�˻� ����� �����ϱ� ���� Ŭ����
public class StudentDAO extends DBCPManager {
	//Ŭ������ �ν��Ͻ��� �����ϱ� ���� ���� �ʵ� ���� >> �ý��� �ʵ�
	private static StudentDAO _dao;
	
	//�����ڸ� ����ȭ�Ͽ� ���� >> Ŭ���� �ܺο��� ������ ���� �Ұ� - �ν��Ͻ� ���� �Ұ���
	private StudentDAO() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	//�������� >> �ν��Ͻ��� �����Ͽ� �ý��� �ʵ忡 ����
	static {
		_dao=new StudentDAO();
	}
	
	//�ý��� �ʵ忡 ����� �ν��Ͻ��� ��ȯ�ϴ� ���� �޼ҵ�
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
	
	//�л������� ���޹޾� STUDENT ���̺� �������� �����ϴ� �޼ҵ� >> �������� ���� ��ȯ
	public int insertStudent(StudentDTO student) {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rows=0;
		try {
			//�θ�Ŭ������ �޼ҵ� ȣ�� >> DBCP�κ��� Connection �ν��Ͻ� ��ȯ�޾� ����
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
			System.out.println("[����]insertStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�л������� ���޹޾� STUDENT ���̺��� �������� �����ϴ� �޼ҵ� >> �������� ���� ��ȯ
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
			System.out.println("[����]updateStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�й��� ���޹޾� STUDENT ���̺��� �������� �����ϴ� �޼ҵ� >> �������� ���� ��ȯ
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
			System.out.println("[����]deleteStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt);
		}
		return rows;
	}
	
	//�й��� ���޹޾� STUDENT ���̺��� �������� �˻��ϴ� �޼ҵ� >> �ϳ��� �л����� ��ȯ
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
			
			if(rs.next()) {//�˻����� ������ ���
				//�˻����� �÷����� �����ϱ� ���� DTO �ν��Ͻ� ���� 
				student=new StudentDTO();
				//�˻����� �÷����� �̿��Ͽ� DTO �ν��Ͻ��� �ʵ尪 ����
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
			}
		} catch (SQLException e) {
			System.out.println("[����]selectNoStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		//�˻����� ������ null ��ȯ, �˻����� ������ DTO �ν��Ͻ� ��ȯ
		return student;
	}

	//�̸��� ���޹޾� STUDENT ���̺��� �������� �˻��ϴ� �޼ҵ� >> �ټ��� �л����� ��ȯ
	public List<StudentDTO> selectNameStudent(String name) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		List<StudentDTO> studentList=new ArrayList<StudentDTO>();
		try {
			con=getConnection();
					
			//���޵� �̸��� ������ �̸��� �л������� �˻�
			//String sql="select * from student where name=? order by no";
			//���޵� �̸�(����)�� ���Ե� �̸��� �л������� �˻�
			String sql="select * from student where name like '%'||?||'%' order by no";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1, name);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				//�˻����� DTO �ν��Ͻ��� ����
				StudentDTO student=new StudentDTO();
				student.setNo(rs.getInt("no"));
				student.setName(rs.getString("name"));
				student.setPhone(rs.getString("phone"));
				student.setAddress(rs.getString("address"));
				student.setBirthday(rs.getString("birthday").substring(0, 10));
				//List �ν��Ͻ��� DTO �ν��Ͻ��� ��ҷ� �߰�
				studentList.add(student);
			}
 		} catch (SQLException e) {
			System.out.println("[����]selectNoStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
	
	//STUDENT ���̺��� ��� �������� �˻��ϴ� �޼ҵ� >> �ټ��� �л����� ��ȯ
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
			System.out.println("[����]selectAllStudent() �޼ҵ��� SQL ���� = "+e.getMessage());
		} finally {
			close(con, pstmt, rs);
		}
		return studentList;
	}
}
