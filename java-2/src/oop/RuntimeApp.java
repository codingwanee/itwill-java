package oop;

public class RuntimeApp {
	public static void main(String[] args) {
		//Runtime Ŭ���� : JVM(Java Virtual Machine)�� ������ ������ ������ Ŭ����
		//�����ڰ� ����ȭ ����Ǿ� new �����ڷ� ȣ�� �Ұ��� - �ν��Ͻ� ���� �Ұ���
		// => �ν��Ͻ��� ����� ������ ��� �����ϹǷ� �ν��Ͻ��� ���� �� ������ ��� �޸� ����
		// => �ν��Ͻ��� ���� �� �������� ���ϵ��� �����ڸ� ����ȭ ����
		//Runtime rt=new Runtime();
		
		//Runtime.getRuntime() : Runtime �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		// => Ŭ���� ���ο��� ������ �ϳ��� �ν��Ͻ��� ��ȯ : ������ �ν��Ͻ� ����
		Runtime rt1=Runtime.getRuntime();
		Runtime rt2=Runtime.getRuntime();
		
		System.out.println("rt1 = "+rt1);
		System.out.println("rt2 = "+rt2);
		System.out.println("============================================");
		Runtime rt=Runtime.getRuntime();
		//Runtime.totalMemory() : JVM���� ��� ������ ��ü �޸� ũ�⸦ ��ȯ�ϴ� �޼ҵ�
		//Runtime.freeMemory() : JVM���� ��� ������ ���� �޸� ũ�⸦ ��ȯ�ϴ� �޼ҵ�
		System.out.println("�޸� ���� �� ��� �޸� >> "
				+(rt.totalMemory()-rt.freeMemory())+"Byte");
		
		//Runtime.gc() : �޸� ���� ���α׷��� ������ �ݷ���(Garbage Collector)�� �����ϴ� �޼ҵ�
		//rt.gc();//�ν��Ͻ� �޼ҵ�
		System.gc();//���� �޼ҵ�
		
		System.out.println("�޸� ���� �� ��� �޸� >> "
				+(rt.totalMemory()-rt.freeMemory())+"Byte");
		System.out.println("============================================");
	}
}





