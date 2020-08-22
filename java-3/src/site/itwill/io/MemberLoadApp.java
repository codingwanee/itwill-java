package site.itwill.io;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//���Ͽ� ����� ȸ�������� ���޹޾� ����ϴ� ���α׷�
public class MemberLoadApp {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois=null;
		try {
			ois=new ObjectInputStream(new FileInputStream("c:/data/member.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("[����]����Ÿ ������ ã�� �� �����ϴ�.");
			System.exit(0);
		}
		
		System.out.println("<<ȸ������>>");
		while(true) {
			try {
				//readObject() �޼ҵ� ȣ��� EOF�� ���� ��� EOFException �߻� - ���� ó��
				Member member=(Member)ois.readObject();
				System.out.println(member);
			} catch (EOFException e) {
				break;
			}
		}
		ois.close();
	}
}




