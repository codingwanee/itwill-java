package site.itwill.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//ȸ�������� ���޹޾� ���Ͽ� �����ϴ� ���α׷�
public class MemberSaveApp {
	public static void main(String[] args) throws IOException {
		//���� ��½�Ʈ���� �߰������ ����� ��� ���� �Է½�Ʈ���� �Է� ���� �߻�
		ObjectOutputStream oos=new ObjectOutputStream
				(new FileOutputStream("c:/data/member.txt"));
		
		//writeObject() �޼ҵ带 ȣ���� ��� NotSerializableException �߻�
		//NotSerializableException�� ��ü����ȭ ����Ǿ� ���� ���� Ŭ����
		//�ν��Ͻ��� ������ ��� �߻��Ǵ� ����
		oos.writeObject(new Member("aaa", "ȫ�浿", "����� ������"));
		oos.writeObject(new Member("bbb", "�Ӳ���", "������ �ȴޱ�"));
		oos.writeObject(new Member("ccc", "����ġ", "��õ�� ���̱�"));
		
		oos.close();
		
		System.out.println("c:\\data\\member.txt ���Ͽ� ȸ�������� ���� �Ͽ����ϴ�.");
	}
}







