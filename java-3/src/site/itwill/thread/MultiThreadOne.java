package site.itwill.thread;

//Thread Ŭ������ ��ӹ޴� �ڽ�Ŭ���� �ۼ� - ������ Ŭ���� 
public class MultiThreadOne extends Thread {
	//�����ڰ� ������ ������� �����ϱ� ���� ����� �ۼ��ϴ� �޼ҵ� 
	@Override
	public void run() {
		/*
		System.out.println("MultiThreadOne Ŭ������ run() �޼ҵ� >> ["
				+Thread.currentThread().getName()+"]�� ���� ��� ����");
		*/
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
