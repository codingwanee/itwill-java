package oop;

//������ ������ Ŭ���� >> main �޼ҵ� - ���α׷�(Application)
public class MethodApp {
	public static void main(String[] args) {
		//������Ʈ�� ����(Build)�Ǿ� �ִ� Ŭ������ ������Ʈ ������ ��� ����
		// >> ������ ��Ű���� Ŭ������ ��Ű���� ���� Ŭ���������� ǥ�� ����
		//Ŭ������ �ν��Ͻ��� �����Ͽ� ���������� ����
		Method method=new Method();
		
		//���������� ����� �ν��Ͻ��� �̿��Ͽ� �޼ҵ� ȣ�� => . ������ ���
		method.display1();
		method.display2();
		method.display1();
		System.out.println("============================================");
		
		method.displayTotOne();
		method.displayTotOne();
		System.out.println("============================================");
		
		//�Ķ���Ϳ� ������ �����Ͽ� �޼ҵ� ȣ��
		method.displayTotTwo(50);
		method.displayTotTwo(75);
		System.out.println("============================================");
		
		method.displayTotThree(30,70);
		method.displayTotThree(16,87);
		method.displayTotThree(55,7);
		System.out.println("============================================");
		//�޼ҵ� ȣ�� ����� ��ȯ�޾� ������ ���� - ��ȯ���� �������� ���
		int tot=method.returnTot(10, 80);
		System.out.println("�հ� = "+tot);
		System.out.println("�հ� = "+method.returnTot(33, 77));
		System.out.println("============================================");
		/*
		boolean result=method.isOddEven(10);
		if(result) {
			System.out.println("�Է°��� [¦��]�Դϴ�.");
		} else {
			System.out.println("�Է°��� [Ȧ��]�Դϴ�.");
		}
		*/
		
		//if ����� ���ǽ� ��� boolean ����� ��ȯ�ϴ� �޼ҵ带 ȣ���Ͽ� ��� ���� ����
		if(method.isOddEven(10)) {
			System.out.println("�Է°��� [¦��]�Դϴ�.");
		} else {
			System.out.println("�Է°��� [Ȧ��]�Դϴ�.");
		}
		System.out.println("============================================");
		int[] array=method.returnArray();
		System.out.print("��ȯ���� �迭 ��Ұ� >> ");
		for(int num:array) {
			System.out.print(num+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		System.out.println("�հ� = "+method.returnSumOne(10, 20, 30));
		System.out.println("============================================");
		//int[] intArray={10,20,30};
		int[] intArray={10,20,30,40,50};
		System.out.println("�հ� = "+method.returnSumTwo(intArray));
		System.out.println("============================================");
		System.out.println("�հ� = "+method.returnSumThree());
		System.out.println("�հ� = "+method.returnSumThree(10,20,30));
		System.out.println("�հ� = "+method.returnSumThree(10,20,30,40,50));
		System.out.println("============================================");
	}
}