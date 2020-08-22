package example;

public class IfExampleApp {
	public static void main(String[] args) {
		//���ں����� ����� ����� ����ϼ���.
		//��, ����� ����� ���ĺ� �ҹ����� ��� �빮�ڷ� ��ȯ�Ͽ� ����ϼ���.
		char mun='x';
		if(mun>='a' && mun<='z') mun-=32;
		System.out.println("mun = "+mun);
		System.out.println("============================================");
		
		//���������� ����� ����� 4�� ������� �ƴ����� �����Ͽ� ����ϼ���.
		int num=345644;
		if(num%4==0) {
			System.out.println(num+"��(��) 4�� ����� �½��ϴ�.");
		} else {
			System.out.println(num+"��(��) 4�� ����� �ƴմϴ�.");
		}
		System.out.println("============================================");
		
		//���ذ� ������� ���������� �����Ͽ� ����ϼ���.
		// => �⵵�� 4�� ������ �������� 0�� ��� ����
		// => �� ������ �����ϴ� �⵵ �� 100���� ������ �������� 0�� ��� ���
		// => �� ���ǵ��� �����ϴ� �⵵ �� 400���� ������ �������� 0�� ��� ����
		int year=2019;
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year+"���� �����Դϴ�.");
		} else {
			System.out.println(year+"���� ����Դϴ�.");
		}
		System.out.println("============================================");
		
		//�̸��� "ȫ�浿"�� �л��� ���輺���� ���� 87��, ���� 93��, ���� 80���Դϴ�.
		//�л��� ���輺���� ���� ������ ���, ��տ� ���� ������ ����Ͽ� 
		//�̸�, ����, ���, ������ ����ϼ���.
		// => ����, ����, ���� ���� �� �ϳ��� 0~100 ������ �ƴ� ��� 
		//    ���α׷� ���� : System.exit(0);
		// => ��տ� ���� ���� : 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
		//    (������ switch ����� ����Ͽ� ���) 
		// => ����� �Ҽ��� 2�ڸ������� ��µǵ��� �ϰ� �������� ����ó�� �ϼ���.

		String name="ȫ�浿";
		int kor=187, eng=93, mat=80;

		//�Է°��� ��ȿ�� �˻� - Validation
		/*
		if(!(kor>=0 && kor<=100) || !(eng>=0 && eng<=100) || !(mat>=0 && mat<=100)) {
			System.out.println("[����]���������� ������ �Է� �Ǿ����ϴ�.");
			System.out.println("============================================");
			System.exit(0);
		}
		*/
		boolean valid=false;
		if(kor<0 || kor>100) {
			System.out.println("[����]���������� ���������� �Է� �Ǿ����ϴ�.");
			valid=true;
		}
		if(eng<0 || eng>100) {
			System.out.println("[����]���������� ���������� �Է� �Ǿ����ϴ�.");
			valid=true;
		}
		if(mat<0 || mat>100) {
			System.out.println("[����]���������� ���������� �Է� �Ǿ����ϴ�.");
			valid=true;
		}
		if(valid) {
			System.out.println("============================================");
			System.exit(0);
		}
		
		int tot=kor+eng+mat;
		double ave=tot/3.;				
		
		String grade="";
		switch((int)ave/10) {
		case 10:
		case 9: grade="A"; break;
		case 8: grade="B"; break;
		case 7: grade="C"; break;
		case 6: grade="D"; break;
		default: grade="F";
		}

		System.out.println(name+"���� ���� >> ���� = "+tot
				+", ��� = "+(int)(ave*100)/100.+", ���� = "+grade);
		System.out.println("============================================");
	}
}







