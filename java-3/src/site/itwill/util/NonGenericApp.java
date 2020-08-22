package site.itwill.util;

//�ʵ��� Ÿ���� Object�� ����� Ŭ������ �ν��Ͻ��� �����Ͽ� ����� ���
// => �ʵ忡 ��� �ν��Ͻ��� �����Ͽ� ���� ����
// => �ʵ忡 ����� �ν��Ͻ��� ��ȯ�޾� ����ϰ��� �� ��� �ݵ�� ����� ����ȯ �ʿ�
public class NonGenericApp {
	public static void main(String[] args) {
		NonGeneric ng1=new NonGeneric();
		
		//�ʵ忡 Integer �ν��Ͻ� ���޵Ǿ� ����
		//ng1.setField(new Integer(100));
		//ng1.setField(Integer.valueOf(100));
		ng1.setField(100);//����ڽ̿� ���� ����� �ڵ����� �ν��Ͻ��� ��ȯ
		
		//ng1.getField() : Object Ÿ���� �ν��Ͻ� ��ȯ >> ����� ��ü ����ȯ �� ���
		int ng1Value=((Integer)ng1.getField()).intValue();
		//����� ��ü ����ȯ�� �߸��� ��� ClassCastException �߻�
		//double ng1Value=((Double)ng1.getField()).doubleValue();
		System.out.println("������ = "+ng1Value);
		System.out.println("============================================");
		
		NonGeneric ng2=new NonGeneric();
		ng2.setField(12.34);
		
		double ng2Value=((Double)ng2.getField()).doubleValue();
		System.out.println("�Ǽ��� = "+ng2Value);
		System.out.println("============================================");
		
		NonGeneric ng3=new NonGeneric();
		ng3.setField("ȫ�浿");
		
		String ng3Value=((String)ng3.getField()).replace("ȫ", "��");
		System.out.println("���ڿ� = "+ng3Value);
		System.out.println("============================================");
	}
}






