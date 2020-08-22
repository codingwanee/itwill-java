package site.itwill.event;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//Frame 컴퍼넌트에서는 WindowEvent 발생 
// => WindowAdapter 클래스를 상속받아 이벤트 처리 >> 이벤트 핸들러를 내부클래스로 작성
public class WindowEventAdapterHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public WindowEventAdapterHandlerApp(String title) {
		super(title);

		//addWindowListener(new WindowEventHandler());
		
		//추상클래스를 상속받는 이름 없는 클래스로 이벤트 핸들러를 작성하여 등록
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
	//WindowAdapter 클래스는 추상클래스로 선언된 메소드 중 필요한 클래스만 오버라이드 선언하여 사용 
	// => Frame 컴퍼넌트에서만 사용하는 이벤트 핸들러 >> Anonymous Inner Class 작성하는 것을 권장
	public class WindowEventHandler extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	*/
}
