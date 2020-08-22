package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 핸들러 클래스를 디자인 클래스 안에 내부클래스로 선언하여 작성
// => 디자인 클래스의 컴퍼넌트 변경 가능 - 이벤트 관련 컴퍼넌트는 필드로 선언
// => 이벤트 소스가 많은 경우 사용
public class EventInnerHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventInnerHandlerApp(String title) {
		super(title);
		
		Button exit=new Button("프로그램 종료");
		setLayout(new FlowLayout());		
		add(exit);
		
		//디자인 클래스는 이벤트 핸들러 클래스를 이용하여 인스턴스 생성 가능
		exit.addActionListener(new ExitButtonEventHandler());
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventInnerHandlerApp("EventHandler");
	}
	
	//디자인 클래스의 필드 또는 메소드를 사용 가능
	public class ExitButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}


