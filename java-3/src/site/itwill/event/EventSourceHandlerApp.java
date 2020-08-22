package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//디자인 클래스와 이벤트 핸들러 클래스를 동일 클래스로 작성
// => 디자인 클래스의 컴퍼넌트 변경 가능 - 이벤트 관련 컴퍼넌트는 필드로 선언
// => 이벤트 소스가 적은 경우 사용
public class EventSourceHandlerApp extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;

	public EventSourceHandlerApp(String title) {
		super(title);
		
		Button exit=new Button("프로그램 종료");
		setLayout(new FlowLayout());		
		add(exit);
		
		exit.addActionListener(this);
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventSourceHandlerApp("EventHandler");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
