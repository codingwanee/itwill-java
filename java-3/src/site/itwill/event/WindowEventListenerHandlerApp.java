package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//Frame 컴퍼넌트에서는 WindowEvent 발생 
// => WindowListener 인터페이스를 상속받아 이벤트 처리
// => WindowListener 인터페이스는 7개 추상메소드가 선언되어 있으므로 모두 오버라이드 선언
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
		System.out.println("windowOpened() 메소드 호출");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing() 메소드 호출");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed() 메소드 호출");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified() 메소드 호출");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified() 메소드 호출");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated() 메소드 호출");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated() 메소드 호출");
	}
}
