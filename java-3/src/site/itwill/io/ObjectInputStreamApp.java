package site.itwill.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class ObjectInputStreamApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectInputStream Ŭ���� : �Է½�Ʈ���� ���޹޾� ��ü ������
		//�Է� ������ ����� �����ϱ� ���� Ŭ���� - Ȯ��
		ObjectInputStream ois=new ObjectInputStream
				(new FileInputStream("c:/data/object.txt"));
		
		//ObjectInputStream.readObject() : �Է½�Ʈ������ ��ü�� �о� ��ȯ�ϴ� �޼ҵ�
		// => ��ȯ�Ǵ� �ν��Ͻ� Ÿ���� Object�̹Ƿ� �ݵ�� ����� ��ü ����ȯ �� ���
		// => ClassNotFoundException �߻� - ����ó��
		String string=(String)ois.readObject();
		Date date=(Date)ois.readObject();
		@SuppressWarnings("unchecked")
		List<String> list=(List<String>)ois.readObject();
		
		System.out.println("string = "+string);
		System.out.println("date = "+date);
		System.out.println("list = "+list);
		
		ois.close();
	}
}







