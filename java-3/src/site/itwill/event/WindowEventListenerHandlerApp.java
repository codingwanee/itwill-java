package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame ���۳�Ʈ������ WindowEvent �߻� 
// => WindowListener �������̽��� ��ӹ޾� �̺�Ʈ ó��
// => WindowListener �������̽��� 7�� �߻�޼ҵ尡 ����Ǿ� �����Ƿ� ��� �������̵� ����
public class WindowEventListenerHandlerApp extends Frame implements WindowListener {
	private static final long serialVersionUID = 1L;

	public WindowEventListenerHandlerApp(String title) {
		super(title);
		
		addWindowListener(this);
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new WindowEventListenerHandlerApp("WindowEvent");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened() �޼ҵ� ȣ��");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing() �޼ҵ� ȣ��");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed() �޼ҵ� ȣ��");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified() �޼ҵ� ȣ��");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified() �޼ҵ� ȣ��");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated() �޼ҵ� ȣ��");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated() �޼ҵ� ȣ��");
	}
}
