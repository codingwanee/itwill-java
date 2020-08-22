package realization;

//JDBC ���α׷�(Java�� DBMS �ý����� �����Ͽ� �ۼ��� ���α׷�)
// => �������̽��� �����Ͽ� �ý��� ���� Ŭ������ �ۼ� - ���յ� ���� ���������� ȿ���� ����
public class JdbcApp {
	public static void main(String[] args) {
		/*
		JdbcMysql jdbc=new JdbcMysql();
		
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
		*/
		
		/*
		JdbcOracle jdbc=new JdbcOracle();
		
		jdbc.add();
		jdbc.modify();
		jdbc.remove();
		jdbc.search();
		*/
		
		//�������̽��� �̿��Ͽ� ���������� �����Ͽ� �ڽ��ν��Ͻ� ����
		// => �ý����� ����Ǿ �ý��� ���� �ν��Ͻ��� ����
		//Jdbc jdbc=new JdbcMysql();
		Jdbc jdbc=new JdbcOracle();
		
		//�θ��������̽��� �ڽ��ν��Ͻ��� �������̵� �޼ҵ� ȣ��
		// => ���������� ����� �ڽ��ν��Ͻ��� ���� �ٸ� �ڽ�Ŭ������ �޼ҵ� ȣ��
		jdbc.insert();
		jdbc.update();
		jdbc.delete();
		jdbc.select();
	}
}





