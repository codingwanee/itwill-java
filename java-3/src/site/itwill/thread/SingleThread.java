package site.itwill.thread;

public class SingleThread {
	public void display() {
		/*
		System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");
		System.out.println("SingleThread Ŭ������ display() �޼ҵ��� ��� ����");
		System.out.println("SingleThread Ŭ������ display() �޼ҵ� ����");
		*/
		
		/*
		System.out.println("SingleThread Ŭ������ display() �޼ҵ� >> ["
				+Thread.currentThread().getName()+"]�� ���� ��� ����");
		*/
		
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}