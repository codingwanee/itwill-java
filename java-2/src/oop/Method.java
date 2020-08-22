package oop;

//��� ������ ������ Ŭ���� - ����(Reference)Ŭ����
public class Method {
	void display1() {
		System.out.println("### Method Ŭ������ display1() �޼ҵ� ȣ�� ###");
	}
	
	void display2() {
		System.out.println("### Method Ŭ������ display2() �޼ҵ� ȣ�� ###");
	}
	
	void displayTotOne() {
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 ������ �����հ� = "+tot);
	}
	
	void displayTotTwo(int num) {
		int tot=0;
		for(int i=1;i<=num;i++) {
			tot+=i;
		}
		System.out.println("1~"+num+" ������ �����հ� = "+tot);
	}
 
	void displayTotThree(int num1,int num2) {
		//�Ķ���Ϳ� ���޵� ���� ���� ��ȿ�� �˻�
		if(num1>num2) {
			System.out.println("[����]ù��° �Ķ���Ϳ� ���޵� ���� �۾ƾ� �˴ϴ�.");
			return;//�޼ҵ� ����
		}
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		System.out.println(num1+"~"+num2+" ������ �����հ� = "+tot);
	}
	
	int returnTot(int num1,int num2) {
		int tot=0;
		for(int i=num1;i<=num2;i++) {
			tot+=i;
		}
		return tot;//����� ��ȯ - �޼ҵ� ����
	}
	
	//�Ķ���Ϳ� ���޵� ��������� Ȧ���� ¦���� ������ ��� ��ȯ�ϴ� �޼ҵ�
	// => false : Ȧ��, true : ¦��
	boolean isOddEven(int num) {
		if(num%2==0) return true;
		else return false;
	}
	
	//�迭�� �̿��Ͽ� ��������� ��ȯ
	int[] returnArray() {
		int[] array={10,20,30,40,50};
		return array;//���������� ����� �迭���� ��ȯ
	}
	
	//�Ķ����(����)�� ��������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �Ķ���� ������ŭ ���� ���� �޾� ó��
	int returnSumOne(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	
	//�Ķ����(�迭)�� ��������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => �Ķ���Ϳ� �迭������ �ϳ��� ���޹޾� ó��
	int returnSumTwo(int[] num) {
		int sum=0;
		for(int su:num) sum+=su;
		return sum;
	}
	
	//�Ķ���� ������ȣ�� ��������� ���޹޾� �հ踦 ����Ͽ� ��ȯ�ϴ� �޼ҵ�
	// => ... : �Ķ���� ���� ��ȣ - �Ķ���Ϳ� ���� ���ϴ� ������ŭ ���޹޾� ó�� >> �迭 ó��
	int returnSumThree(int... num) {
		int sum=0;
		for(int su:num) sum+=su;
		return sum;
	}
}










