package site.itwill.util;

//�ʵ��� Ÿ���� ���׸� Ÿ������ ����� Ŭ������ �ν��Ͻ��� �����Ͽ� ����� ���
// => �ʵ忡 ���׸� Ÿ�� ��� ��ȯ�� Ŭ������ �ν��Ͻ��� �����Ͽ� ���� ����
// => �ʵ尪�� ��ȯ�޾� ����� ��� ��ü ����ȯ ���ʿ�
public class GenericApp {
	public static void main(String[] args) {
		//���׸� Ÿ�Կ� �������� �����ؾ߸� ���׸� ������ ��� ����
		Generic<Integer> g1=new Generic<Integer>();
		
		g1.setField(100);
		//���׸� Ÿ�Կ� ���޵� �������� �ν��Ͻ��� �ƴ� ��� ���� �߻�
		//g1.setField(12.34);
		
		int g1Value=g1.getField().intValue();
		System.out.println("������ = "+g1Value);
		System.out.println("============================================");
		
		Generic<Double> g2=new Generic<Double>();
		g2.setField(12.34);
		double g2Value=g2.getField().doubleValue();
		System.out.println("�Ǽ��� = "+g2Value);
		System.out.println("============================================");
		
		Generic<String> g3=new Generic<String>();
		g3.setField("ȫ�浿");
		String g3Value=g3.getField().replace("ȫ", "��");
		System.out.println("���ڿ� = "+g3Value);
		System.out.println("============================================");
		
	}
}






