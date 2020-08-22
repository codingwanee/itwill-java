package realization;

//Mysql DBMS �ý����� �����Ͽ� ����� ������ ������ Ŭ����
// => �������̽��� ��ӹ޾� �ۼ� : �������̽����� ���ϴ� ������ �޼ҵ� ����
public class JdbcMysql implements Jdbc {
	@Override
	public void insert() {
		System.out.println("[����]Mysql DBMS�� �̿��Ͽ� ������ ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void update() {
		System.out.println("[����]Mysql DBMS�� �̿��Ͽ� ����� ������ ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void delete() {
		System.out.println("[����]Mysql DBMS�� �̿��Ͽ� ����� ������ ���� �Ͽ����ϴ�.");
	}
	
	@Override
	public void select() {
		System.out.println("[�˻�]Mysql DBMS�� �̿��Ͽ� ����� ������ �˻� �Ͽ����ϴ�.");
	}
}
