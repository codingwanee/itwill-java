package site.itwill.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class JdbcDriverLoadApp {
	public static void main(String[] args) {
		/*
		//Driver 클래스로 인스턴스를 생성하여 JDBC Driver로 직접 등록
		// => JDBC Driver : DriverManager 클래스에 등록된 Driver 인스턴스 
		// => DriverManager 클래스 : DBMS 서버에 접속하기 위한 기능을 제공하는 클래스
		// => 동일한 Driver 인스턴스가 DriverManager 클래스에 등록 - 비효율적 방법
		
		//1.OracleDriver 클래스로 인스턴스 생성
		OracleDriver oracleDriver1=new OracleDriver();
		OracleDriver oracleDriver2=new OracleDriver();
		
		//2.Driver 인스턴스를 DriverManager 클래스의 메소드를 이용하여 JDBC Driver로 등록
		//DriverManager.registerDriver(Driver driver) : Driver 인스턴스를 전달받아 JDBC Driver로 등록하는 메소드
		// => SQLException 발생 - 예외처리
		try {
			DriverManager.registerDriver(oracleDriver1);
			DriverManager.registerDriver(oracleDriver2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//OracleDriver 클래스를 문자열로 전달하여 메모리에 저장
		// => 정적영역에서 OracleDriver 인스턴스 생성 후 DriverManager
		//    클래스에 JDBC Driver로 등록 - 한번만 실행
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("OracleDriver 클래스를 찾을 수 없습니다.");
			System.exit(0);
		}
		
		
		//DriverManager.getDrivers() : DriverManager 클래스에 등록된 JDBC Driver 목록을 반환하는 메소드
		//Enumeration : 콜렉션 인스턴스의 정보를 제공받아 반복 처리 기능을 제공하는 인스턴스
		Enumeration<Driver> drivers=DriverManager.getDrivers();
		//Enumeration.hasMoreElements() : Enumeration 인스턴스에 제공
		//가능한 인스턴스가 존재할 경우 참(true)을 반환하는 메소드
		while(drivers.hasMoreElements()) {
			//Enumeration.nextElement() : Enumeration 인스턴스에 저장된 요소를 반환하는 메소드 
			Driver driver=drivers.nextElement();
			System.out.println(driver);
		}
	}
}




