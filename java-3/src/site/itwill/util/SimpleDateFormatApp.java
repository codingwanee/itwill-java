package site.itwill.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//SimpleDateFormat Ŭ���� : Date �ν��Ͻ��� �����ϱ� ���� ����� �����ϴ� Ŭ����
public class SimpleDateFormatApp {
	public static void main(String[] args) throws ParseException {
		//SimpleDateFormat(String pattern) : �Ķ���Ϳ� ��¥�� �ð��� ����
		//���������� ���޹޾� SimpleDateFormat �ν��Ͻ��� �����ϴ� ������
		// => ��¥�� �ð������� ���ϱ�ȣ�� ���ڿ��� ǥ��
		// => ��¥�� �ð� ���� ���ϱ�ȣ : y  M  d  H  m  s  E��
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E����");
	
		Date now=new Date();
		//SimpleDateFormat.format(Date date) : �Ķ���Ϳ� Date �ν��Ͻ���
		//�����Ͽ� SimpleDateFormat �ν��Ͻ��� ����� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Date �ν��Ͻ� >> String �ν��Ͻ�
		String printDate=sdf.format(now);
		System.out.println("���� ��¥ = "+printDate);
		
		//SimpleDateFormat.applyPattern(String pattern) : SimpleDateFormat 
		//�ν��Ͻ��� ����� ���������� �����ϴ� �޼ҵ�
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("���� = "+sdf.format(now));
		
		String want="2000-01-01 00:00:00";
		
		//SimpleDateFormat.parse(String str) : �Ķ���Ϳ� ���޵� ����������
		//���ڿ��� ���޹޾� Date �ν��Ͻ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => String �ν��Ͻ� >> Date �ν��Ͻ�
		// => ParseException : �������¿� ���� ���� ���ڿ��� ������ ��� ���� 
		Date wantDate=sdf.parse(want);
		System.out.println("wantDate = "+wantDate);
		
		//Date.getTime() : Date �ν��Ͻ��� ����� ��¥�� �ð������� Ÿ�ӽ����������� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => Timestamp : 1970�� 1�� 1���� �������� �и��ʴ� 1�� ������ long ������ ������
		System.out.println("now �ν��Ͻ��� Ÿ�ӽ������� = "+now.getTime());
		System.out.println("wantDate �ν��Ͻ��������� Ÿ�ӽ������� = "+wantDate.getTime());
		
		//System.currentTimeMillis() : �ý����� ���� Ÿ�ӽ��������� ��ȯ�ϴ� �޼ҵ�
		System.out.println("�ý����� ���� Ÿ�ӽ������� = "+System.currentTimeMillis());
		
		//Ÿ�ӽ��������� ����ϴ� ���� : ��¥�� �ð������� ���� ����(+,-) ����
		System.out.println("2000�� 1�� 1�Ϻ��� ��������� �ð� = "
				+(now.getTime()-wantDate.getTime())+"ms");
	}
}