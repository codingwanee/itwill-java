package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame ���۳�Ʈ������ WindowEvent �߻� 
// => WindowAdapter Ŭ������ ��ӹ޾� �̺�Ʈ ó�� >> �̺�Ʈ �ڵ鷯�� ����Ŭ������ �ۼ�
public class WindowEventAdapterHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public WindowEventAdapterHandlerApp(String title) {
		super(title);

		//addWindowListener(new WindowEventHandler());
		
		//�߻�Ŭ������ ��ӹ޴� �̸� ���� Ŭ������ �̺�Ʈ �ڵ鷯�� �ۼ��Ͽ� ���
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEventAdapterHandlerApp("WindowEvent");
	}
	
	/*
	//WindowAdapter Ŭ������ �߻�Ŭ������ ����� �޼ҵ� �� �ʿ��� Ŭ������ �������̵� �����Ͽ� ��� 
	// => Frame ���۳�Ʈ������ ����ϴ� �̺�Ʈ �ڵ鷯 >> Anonymous Inner Class �ۼ��ϴ� ���� ����
	public class WindowEventHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	*/
}
