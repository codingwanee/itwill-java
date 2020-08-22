package site.itwill.thread;

public class MultiThreadApp {
	public static void main(String[] args) throws InterruptedException {
		//Thread Ŭ������ ��ӹ��� �ڽ�Ŭ������ �̿��Ͽ� �ν��Ͻ� ����
		// => �ڽ�Ŭ������ �ν��Ͻ��� ������ ��� �θ�Ŭ������ �ν��Ͻ�(Thread �ν��Ͻ�)�� ���� ����
		MultiThreadOne thread1=new MultiThreadOne();
		//�ڽ�Ŭ������ ������ �ν��Ͻ��� start() �޼ҵ� ȣ��
		// => ������ �ν��Ͻ��� �̿��Ͽ� ������ ���� >> run() �޼ҵ��� ��� ����
		// => ������ ������� run() �޼ҵ尡 ����Ǹ� �ڵ� �Ҹ�
		thread1.start();
		
		new MultiThreadOne().start();
		
		//run() �޼ҵ尡 �������̵� ����� �ڽ�Ŭ������ �̿��Ͽ� �ν��Ͻ� ����
		MultiThreadTwo mtt=new MultiThreadTwo();
		//Thread Ŭ������ �ڽ��ν��Ͻ��� ���޹޾� Thread �ν��Ͻ� ����
		Thread t2=new Thread(mtt);
		t2.start();

		new Thread(new MultiThreadTwo()).start();
		
		/*
		System.out.println("MultiThreadApp Ŭ������ main() �޼ҵ� >> ["
				+Thread.currentThread().getName()+"]�� ���� ��� ����");
		*/
		
		for(int i=0;i<=9;i++) {
			System.out.print(i);
			Thread.sleep(500);
		}
	}
}
