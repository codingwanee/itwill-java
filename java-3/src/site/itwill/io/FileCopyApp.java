package site.itwill.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//Ű����� �������ϸ�� Ÿ�����ϸ��� �Է¹޾� �����ϴ� ���α׷� �ۼ�
//ex) �������ϸ� >> c:\data\setup.exe
//    Ÿ�����ϸ� >> c:\data\setup_copy.exe
//    [���]������ ���������� ���� �Ͽ����ϴ�.
// => ���������� �������� ���� ��� �����޼��� ��� �� ���α׷� ����
// => Ÿ�������� ������ ��� ������ ������ �Է¹޾� ó��
public class FileCopyApp {
	public static void main(String[] args) throws IOException {
		//Ű���� �Է½�Ʈ���� �����Ͽ� ���ڿ� �Է½�Ʈ������ Ȯ���Ͽ� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�������ϸ� >> ");
		//Ű����� ���ڿ��� �Է¹޾� File �ν��Ͻ� ����
		File source=new File(br.readLine());
		
		if(!source.exists()) {//���ϰ���� ������ �������� ���� ���
			System.out.println("[����]���������� �������� �ʽ��ϴ�.");
			System.exit(0);
		}
		
		System.out.print("Ÿ�����ϸ� >> ");
		File targer=new File(br.readLine());
		
		if(targer.exists()) {//���ϰ���� ������ ������ ���
			while(true) {
				System.out.print("���� ������ �����մϴ�.�����ڽ��ϱ�?[Y/N] >> ");
				String answer=br.readLine();
				if(answer.equalsIgnoreCase("N")) {
					System.out.println("[�޼���]���� ���縦 ��� �Ͽ����ϴ�.");
					System.exit(0);
				}
				if(answer.equalsIgnoreCase("Y")) break;
				System.out.println("[����]Y ���� �Ǵ� N ���ڸ� �Է� �����մϴ�.");
			}
		}
		
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream(source));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(targer));
		
		while(true) {
			int readByte=bis.read();
			if(readByte==-1) break;
			bos.write(readByte);
		}
		
		bis.close();
		bos.close();
		
		System.out.println("[���]������ ���������� ���� �Ͽ����ϴ�.");
	}
}