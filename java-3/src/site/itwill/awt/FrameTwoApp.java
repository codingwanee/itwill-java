package site.itwill.awt;

import java.awt.Frame;

//GUI ���α׷��� Frame Ŭ������ ��ӹ޾� �ۼ��ϴ� ���� ����
public class FrameTwoApp extends Frame {
	private static final long serialVersionUID = 1L;

	//�����ڿ��� �����ӿ� ���� ������ �۾�
	public FrameTwoApp(String title) {
		super(title);//Frame(String title) ������ ȣ�� - ������ ���� �ο�
		setBounds(500, 100, 400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		//�θ�Ŭ���� �ν��Ͻ� ���� �� �ڽ�Ŭ���� �ν��Ͻ� ����
		// => Frame �ν��Ͻ� ���� - ������ ���� 
		new FrameTwoApp("������");
	}
}





