package site.itwill.dbcp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//Properties ����(.properties) : ���α׷� ���࿡ �ʿ��� ������ �����ϴ� �ؽ�Ʈ ����
// => ���α׷� �ҽ��� �������� �ʰ� Properties ������ ���븸�� �����Ͽ�
//    ���α׷��� ���� ��� ���� ���� - ���������� ȿ���� ����
// => Properties ���Ͽ� ����� ���� ��� ���ڿ�(String)�� ����

//user.properties ������ �о� �����Ǵ� ���� ����ϴ� ���α׷�
public class PropertiesApp {
	public static void main(String[] args) throws IOException {
		//1.Properties ������ �б� ���� ���� �Է½�Ʈ�� ����
		//FileInputStream Ŭ������ �̿��Ͽ� �Է½�Ʈ�� ����
		// => Properties ������ ��ο� ���� �߻� ����
		//InputStream in=new FileInputStream("bin/site/itwill/dbcp/user.properties");
		
		//���÷����� �̿��Ͽ� �Է½�Ʈ�� ����
		// => Ŭ������.class - �޸𸮿� ����� Ŭ���� ����(Clazz)�� ǥ���ϴ� ���
		//Class.getClassLoader() : �޼ҵ忡 ����� Ŭ����(Clazz)�� ClassLoader �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//ClassLoader.getResourceAsStream(String resource) : ���ҽ� ������ �б� �Է½�Ʈ���� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		InputStream in=PropertiesApp.class.getClassLoader()
			.getResourceAsStream("site/itwill/dbcp/user.properties");
		
		//2.Properties �ν��Ͻ� ����
		// => Map �ν��Ͻ��� ������ ������ �ν��Ͻ� 
		Properties properties=new Properties();
		
		//3.Properties ������ �Է½�Ʈ�����κ��� ������ �о� Properties �ν��Ͻ��� ����
		//Properties.load(InputStream in) : �Է½�Ʈ������ ������ �о� Properties �ν��Ͻ��� �����ϴ� �޼ҵ�
		properties.load(in);
		
		//4.Properties �ν��Ͻ����� ������(Key:String)�� �̿��Ͽ� ��(Value:String)�� ��ȯ�޾� ���
		//Properties.get(String key) : �������� ���� ���� ��ȯ�ϴ� �޼ҵ�
		// => Object Ŭ������ ���� ��ȯ�ϹǷ� �ݵ�� ��ü ����ȯ ���
		String id=(String)properties.get("id");
		String passwd=(String)properties.get("passwd");
		String name=(String)properties.get("name");
		
		System.out.println("user.properties ���Ͽ� ����� ���� >>");
		System.out.println("���̵� = "+id);
		System.out.println("��й�ȣ = "+passwd);
		System.out.println("�̸� = "+name);
	}
}










