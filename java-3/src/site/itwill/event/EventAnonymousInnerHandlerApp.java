package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 핸들러 클래스를 디자인 클래스 안에 이름이 없는 내부클래스(Anonymous Inner Class)로 선언하여 작성
// => 이벤트 발생 컴퍼넌트의 이벤트 처리 핸들러 등록 메소드에서 직접 이벤트 핸들러를 작성
// => 인터페이스를 상속받은 이름 없는 자식클래스롤 인스턴스로 직접 생성
public class EventAnonymousInnerHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;
	
	public EventAnonymousInnerHandlerApp(String title) {
		super(title);
		
		Button exit=new Button("프로그램 종료");
		setLayout(new FlowLayout());		
		add(exit);
		
		//인터페이스를 상속받아 오버라이드 선언한 이름 없는 클래스로 인스턴스 생성
		// => 이벤트를 처리하기 위한 이벤트 핸들러로 등록
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(500, 100, 300, 300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EventAnonymousInnerHandlerApp("EventHandler");
	}
}




