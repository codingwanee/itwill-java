package site.itwill.awt;

import java.awt.Frame;

public class FrameOneApp {
	public static void main(String[] args) {
		//Frame() : �������� �����ϴ� ������ 
		//Frame f=new Frame();//������ ����
		//Frame(String title) : ���� �ο��� �������� �����ϴ� ������ 
		Frame f=new Frame("������");
		
		//Frame.setTitle(String title) : �������� ������ �����ϴ� �޼ҵ�
		//f.setTitle("������");
		
		/*
		//Component.setSize(int width, int height) : ���� ���̸� �����Ͽ� ���۳�Ʈ(�����̳�)�� ũ�⸦ �����ϴ� �޼ҵ�
		// => ũ�� �Ǵ� ��ġ ���� : pixel(�ϳ��� ���� ��µǴ� ��)
		f.setSize(400, 300);
		
		//Component.setLocation(int x, int y) : x�� y�� �����Ͽ� ���۳�Ʈ(�����̳�)�� ��ġ�� �����ϴ� �޼ҵ�
		f.setLocation(500,100);
		*/
		
		//Component.setBounds(int x, int y, int width, int height) : ���۳�Ʈ(�����̳�)�� ũ��� ��ġ�� �����ϴ� �޼ҵ� 
		f.setBounds(500, 100, 400, 300);
		
		//Frame.setResizable(boolean b) : ������ ũ�� ���� ������ �����ϴ� �޼ҵ�
		// => false : ũ�� ���� �Ұ���, true : ũ�� ���� ����(�⺻)
		f.setResizable(false);
		
		//Component.setVisible(boolean b) : ���۳�Ʈ(�����̳�)�� ���� ��� ������ �����ϴ� �޼ҵ�
		// => false : �����(�⺻), true : ���
		f.setVisible(true);
	}
}
