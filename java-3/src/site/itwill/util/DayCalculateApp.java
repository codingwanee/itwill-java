package site.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Ű����� ��������� �Է¹޾� ������� ��ƿ� ��¥(��)�� ����Ͽ� ����ϴ� ���α׷�
//ex) ������� �Է�[ex.2000-01-01] >> 2019-05-02
//    [���]�¾�� 1�� �������ϴ�.
// => �Է±�Ģ�� ���� ���� ��������� �Է��� ��� �޼��� ��� �� ���α׷� ����  
public class DayCalculateApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		//���������� ����� �ʱⰪ�� �ν��Ͻ��� �ƴ� ��� �Ϲ������� null ����
		Date birthday=null;
		try {
			System.out.print("������� �Է�[ex.2000-01-01] >> ");
			birthday=sdf.parse(scanner.nextLine());
		} catch (ParseException e) {
			//������������ ���ڿ��� �Է����� ���� ��� ���� �߻�
			System.out.println("[����]��������� ���Ŀ� ���� �ʰ� �Է� �Ͽ����ϴ�.");
			System.exit(0);
		} finally {
			scanner.close();
		}
		
		//��ƿ� �ϼ��� ����Ͽ� ���
		long day=(System.currentTimeMillis()-birthday.getTime())/(1000*60*60*24);
		
		System.out.println("[���]�¾�� "+day+"�� �������ϴ�.");
	}
}