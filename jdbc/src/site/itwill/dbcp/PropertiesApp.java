package site.itwill.dbcp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//Properties 파일(.properties) : 프로그램 실행에 필요한 정보를 제공하는 텍스트 파일
// => 프로그램 소스를 변경하지 않고 Properties 파일의 내용만을 변경하여
//    프로그램의 실행 결과 변경 가능 - 유지보수의 효율성 증가
// => Properties 파일에 저장된 값은 모두 문자열(String)로 제공

//user.properties 파일을 읽어 제공되는 값을 출력하는 프로그램
public class PropertiesApp {
	public static void main(String[] args) throws IOException {
		//1.Properties 파일을 읽기 위한 파일 입력스트림 생성
		//FileInputStream 클래스를 이용하여 입력스트림 생성
		// => Properties 파일의 경로에 문제 발생 가능
		//InputStream in=new FileInputStream("bin/site/itwill/dbcp/user.properties");
		
		//리플렉션을 이용하여 입력스트림 생성
		// => 클래스명.class - 메모리에 저장된 클래스 정보(Clazz)를 표현하는 방법
		//Class.getClassLoader() : 메소드에 저장된 클래스(Clazz)의 ClassLoader 인스턴스를 반환하는 메소드
		//ClassLoader.getResourceAsStream(String resource) : 리소스 파일을 읽기 입력스트림을 생성하여 반환하는 메소드
		InputStream in=PropertiesApp.class.getClassLoader()
			.getResourceAsStream("site/itwill/dbcp/user.properties");
		
		//2.Properties 인스턴스 생성
		// => Map 인스턴스와 유사한 형태의 인스턴스 
		Properties properties=new Properties();
		
		//3.Properties 파일의 입력스트림으로부터 정보를 읽어 Properties 인스턴스에 저장
		//Properties.load(InputStream in) : 입력스트림에서 정보를 읽어 Properties 인스턴스에 저장하는 메소드
		properties.load(in);
		
		//4.Properties 인스턴스에서 고유값(Key:String)을 이용하여 값(Value:String)을 반환받아 사용
		//Properties.get(String key) : 고유값에 대한 값을 반환하는 메소드
		// => Object 클래스로 값을 반환하므로 반드시 객체 형변환 사용
		String id=(String)properties.get("id");
		String passwd=(String)properties.get("passwd");
		String name=(String)properties.get("name");
		
		System.out.println("user.properties 파일에 저장된 정보 >>");
		System.out.println("아이디 = "+id);
		System.out.println("비밀번호 = "+passwd);
		System.out.println("이름 = "+name);
	}
}










