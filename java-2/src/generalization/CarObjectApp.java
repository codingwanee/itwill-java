package generalization;

public class CarObjectApp {
	public static void main(String[] args) {
		CarObject tico=new CarObject("Ƽ��", 2019);
		
		//���������� ����� �ν��Ͻ��� �̿��Ͽ� Ŭ������ �޼ҵ� ȣ��
		System.out.println("�𵨸� = "+tico.getModelName());
		System.out.println("����⵵ = "+tico.getProductionYear());
		System.out.println("============================================");
		//��� Java Ŭ������ Object Ŭ������ ��ӹ����Ƿ� �ν��Ͻ��� Object Ŭ������ �޼ҵ� ȣ�� ���� 
		//Object.toString() : ���������� ����� �ν��Ͻ� ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//Object Ŭ������ toString() �޼ҵ带 �������̵� �����ϸ� ������ ��ü ����ȯ�� ���� �ڽ�Ŭ������ �޼ҵ� ȣ�� 
		System.out.println(tico.toString());
		//���������� ����� ��� �ڵ����� toString() �޼ҵ� ȣ��
		System.out.println(tico);
		System.out.println("============================================");
		String str="ȫ�浿";
		//Object Ŭ������ toString() �޼ҵ� ��� String Ŭ������ �������̵�
		//����� toString() �޼ҵ� ȣ��
		//System.out.println("�̸� = "+str.toString());
		System.out.println("�̸� = "+str);
		System.out.println("============================================");
	}
}
