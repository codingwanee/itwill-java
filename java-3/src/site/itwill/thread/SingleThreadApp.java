package site.itwill.thread;

public class SingleThreadApp {
	public static void main(String[] args) throws InterruptedException {
		/*
		System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ� ����");
		System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ��� ��� ����-1");
		SingleThread st=new SingleThread();
		st.display();
		System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ��� ��� ����-2");
		System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ� ����");
		*/
		
		//Thread.currentThread() : ���� ����� �����ϱ� ���� Thread �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Thread.getName() : Thread �ν��Ͻ��� ����� �������̸��� ��ȯ�ϴ� �޼ҵ�
		/*
		System.out.println("SingleThreadApp Ŭ������ main() �޼ҵ� >> ["
				+Thread.currentThread().getName()+"]�� ���� ��� ����");
		
		new SingleThread().display();
		*/
		
		for(char i='a';i<='z';i++) {
			System.out.print(i);
			//Thread.sleep(long ms) : �����带 ���ϴ� �ð�(ms)��ŭ �����ǵ��� ó���ϴ� �޼ҵ�
			// => InterruptedException ���� �߻� - ����ó��
			Thread.sleep(100);
		}
		
		new SingleThread().display();
	}
}




