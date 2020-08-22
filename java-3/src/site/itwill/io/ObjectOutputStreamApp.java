package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Date;

public class ObjectOutputStreamApp {
	public static void main(String[] args) throws IOException {
		//ObjectOutputStream Ŭ���� : ��½�Ʈ���� ���޹޾� ��ü ������ 
		//����(���) ������ ����� �����ϱ� ���� Ŭ���� - Ȯ��
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/data/object.txt"));
			
		//ObjectOutputStream.writeObject(Object o) : �ν��Ͻ��� ��½�Ʈ������ �����ϴ� �޼ҵ�
		// => �Ķ��Ÿ�� Object �����̹Ƿ� ��� �ν��Ͻ� ���� ����
		//oos.writeObject("ȫ�浿");
		oos.writeObject(new String("ȫ�浿"));
		oos.writeObject(new Date());
		oos.writeObject(Arrays.asList("�Ӳ���","����ġ","������","����"));
		
		oos.close();
		System.out.println("c:\\data\\object.txt ���Ͽ� ��ü�� �����Ͽ� ���� �Ͽ����ϴ�.");
	}
}








