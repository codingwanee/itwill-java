package example;

public class OperatorExampleApp {
	public static void main(String[] args) {
		//245678�ʸ� �Ͻú��� �������� ��ȯ�Ͽ� ����ϼ���.
		int cho=245678;
		System.out.print(cho+"�� = ");
		
		//�ʴ��� �ð��� ��(��)�� ��ȯ
		int day=cho/(24*60*60);//24*60*60 = 86400
		cho%=86400;//���� �� ������ �ð��� �ٽ� ���� >> �ú���
		
		//�ʴ��� �ð��� ��(��)�� ��ȯ
		int hour=cho/(60*60);
		cho%=3600;//���� �� ������ �ð��� �ٽ� ���� >> ����
		
		//�ʴ��� �ð��� ��(��)�� ��ȯ
		int min=cho/60;
		int sec=cho%60;//���� �� ������ ���� >> ��
		
		System.out.println(day+"�� "+hour+"�� "+min+"�� "+sec+"��");
		
		//�Ѵ��� ������ 1�� 5õ���� ����⸦ 20�� ������ ��� �����ؾߵ� �ݾ��� ����Ͽ� ����ϼ���.
		//��, 15�� �̻� ������ ��� 1��� 25% �������� �����Ͽ� ����ϼ���.
		int dan=150000000, su=20;
		long kum=(long)(su>=15?dan*0.75:dan)*su;
		System.out.println("����� ���� ��� = "+kum);
	}
}