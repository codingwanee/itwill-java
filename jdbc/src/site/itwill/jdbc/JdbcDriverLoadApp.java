package site.itwill.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class JdbcDriverLoadApp {
	public static void main(String[] args) {
		/*
		//Driver Ŭ������ �ν��Ͻ��� �����Ͽ� JDBC Driver�� ���� ���
		// => JDBC Driver : DriverManager Ŭ������ ��ϵ� Driver �ν��Ͻ� 
		// => DriverManager Ŭ���� : DBMS ������ �����ϱ� ���� ����� �����ϴ� Ŭ����
		// => ������ Driver �ν��Ͻ��� DriverManager Ŭ������ ��� - ��ȿ���� ���
		
		//1.OracleDriver Ŭ������ �ν��Ͻ� ����
		OracleDriver oracleDriver1=new OracleDriver();
		OracleDriver oracleDriver2=new OracleDriver();
		
		//2.Driver �ν��Ͻ��� DriverManager Ŭ������ �޼ҵ带 �̿��Ͽ� JDBC Driver�� ���
		//DriverManager.registerDriver(Driver driver) : Driver �ν��Ͻ��� ���޹޾� JDBC Driver�� ����ϴ� �޼ҵ�
		// => SQLException �߻� - ����ó��
		try {
			DriverManager.registerDriver(oracleDriver1);
			DriverManager.registerDriver(oracleDriver2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//OracleDriver Ŭ������ ���ڿ��� �����Ͽ� �޸𸮿� ����
		// => ������������ OracleDriver �ν��Ͻ� ���� �� DriverManager
		//    Ŭ������ JDBC Driver�� ��� - �ѹ��� ����
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver Ŭ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		
		
		//DriverManager.getDrivers() : DriverManager Ŭ������ ��ϵ� JDBC Driver ����� ��ȯ�ϴ� �޼ҵ�
		//Enumeration : �ݷ��� �ν��Ͻ��� ������ �����޾� �ݺ� ó�� ����� �����ϴ� �ν��Ͻ�
		Enumeration<Driver> drivers=DriverManager.getDrivers();
		//Enumeration.hasMoreElements() : Enumeration �ν��Ͻ��� ����
		//������ �ν��Ͻ��� ������ ��� ��(true)�� ��ȯ�ϴ� �޼ҵ�
		while(drivers.hasMoreElements()) {
			//Enumeration.nextElement() : Enumeration �ν��Ͻ��� ����� ��Ҹ� ��ȯ�ϴ� �޼ҵ� 
			Driver driver=drivers.nextElement();
			System.out.println(driver);
		}
	}
}




