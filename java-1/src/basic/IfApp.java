package basic;

public class IfApp {
	public static void main(String[] args) {
		int score=80;
		//������ 60���̻��� ��� �հ� �޼����� ����ϼ���.
		if(score>=60) {
			System.out.println("[�޼���]������ 60���̻��̹Ƿ� �հ��Դϴ�.");
		}
		System.out.println("============================================");
		
		score=50;
		//������ 60���̸��� ��� ���հ� �޼����� ����ϼ���.
		if(score<60) {
			System.out.println("[�޼���]������ 60���̸��̹Ƿ� ���հ��Դϴ�.");
		}
		System.out.println("============================================");
		
		score=80;
		//������ 60���̻��� ��� �հ� �޼����� ����ϰ� 60���̸��� ��� ���հ� �޼��� ����ϼ���.
		if(score>=60) {
			System.out.println("[�޼���]������ 60���̻��̹Ƿ� �հ��Դϴ�.");
		} else {
			System.out.println("[�޼���]������ 60���̸��̹Ƿ� ���հ��Դϴ�.");
		}
		System.out.println("============================================");

		int number=10;
		//���������� ����� ����� Ȧ���� ¦���� �����Ͽ� ����ϼ���.
		/*
		if(number%2==0) {
			System.out.println("[���]"+number+" = ¦��");
		} else {
			System.out.println("[���]"+number+" = Ȧ��");
		}
		*/
		if(number%2!=0) {
			System.out.println("[���]"+number+" = Ȧ��");
		} else {
			System.out.println("[���]"+number+" = ¦��");
		}
		System.out.println("============================================");

		char mun='O';
		
		//���ں����� ����� ����� ���ĺ����� �ƴ����� �����Ͽ� ����ϼ���.
		if(mun>='A' && mun<='Z' || mun>='a' && mun<='z') {
			System.out.println("[���]���ĺ��� �½��ϴ�.");
		} else {
			System.out.println("[���]���ĺ��� �ƴմϴ�.");
		}
		System.out.println("============================================");
		
		int kor=85;
		
		//���������� 0~100 ������ ��ȿ������ �ƴ����� �Ǵ��Ͽ� ����� ����ϼ���.
		if(kor>=0 && kor<=100) {
			//System.out.println("[�޼���]�������� ���������� �Է� �Ǿ����ϴ�.");
			
			//���������� ���� ������ ����Ͽ� ����ϼ���.
			// => 100~90:A, 89~80:B, 79~70:C, 69~60:D, 59~0:F
			String grade;
			if(kor>=90) grade="A";
			else if(kor>=80) grade="B";
			else if(kor>=70) grade="C";
			else if(kor>=60) grade="D";
			else grade="F";
			
			System.out.println("[���]�������� = "+kor+"�� >> "+grade+"����");
		} else {
			System.out.println("[����]���������� ���������� �Է� �Ǿ����ϴ�.");
		}
		System.out.println("============================================");
		
		boolean sw=false;
		
		//����(Boolean) ������ ����� ���� ���� ��� ���� ����
		/*
		if(sw) {//�������� true ��� ��� ����
			System.out.println("[���]����ġ�� �׽��ϴ�.<ON>");
		} else {
			System.out.println("[���]����ġ�� �����ϴ�.<OFF>");
		}
		*/
		if(!sw) {//�������� false ��� ��� ����
			System.out.println("[���]����ġ�� �����ϴ�.<OFF>");
		} else {
			System.out.println("[���]����ġ�� �׽��ϴ�.<ON>");
		}
		System.out.println("============================================");
		int choice=1;
		//������� ������ ����� ������ ��� ����� �����ϴ� ���� �����
		//�ʱⰪ�� �ο��Ͽ� �����ϴ� ���� ����
		// => NullString("") : ���ڰ� �ϳ��� ���� ���ڿ� ���
		String name="";
		
		if(choice==1) {
			name="ȫ�浿";
		} else if(choice==2) {
			name="�Ӳ���";
		} /* else { name="����ġ"; 
		} */
		System.out.println("[���]����� ������ ����� <"+name+">���Դϴ�.");
		System.out.println("============================================");
	}
}
