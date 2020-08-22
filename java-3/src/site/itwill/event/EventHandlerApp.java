package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//이벤트 프로그램 작성하는 방법

//1.컴퍼넌트(컨테이너)를 이용하여 디자인 클래스 작성 - 프레임 생성 
// => 컴퍼넌트(컨테이너)에서는 다양한 이벤트 발생 - 이벤트 소스

//2.이벤트 소스에서 이벤트가 발생될 경우에 대한 이벤트 처리 목적의 클래스 작성 - 이벤트 핸들러
// => 발생된 이벤트 처리를 목적으로 하는 리스너 인터페이스를 상속받아 작성
// => XXXEvent 클래스로 생성된 이벤트를 처리하기 위해 XXXListener 인터페이스를 제공 
//    ex) ActionEvent 클래스의 이벤트 처리를 위해 ActionListener 인터페이스를 상속받는 이벤트 핸들러 작성
// => 리스너 인터페이스의 추상메소드를 오버라이드 선언하여 이벤트 처리 명령 작성

//3.이벤트 소스에서 이벤트가 발생될 경우 이벤트 처리 핸들러가 동작되도록 설정
// => 이벤트 핸들러의 처리 메소드 자동 호출되어 이벤트 처리
public class EventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventHandlerApp(String title) {
		super(title);
		
		//버튼을 누를 경우 ActionEvent 발생
		Button exit=new Button("프로그램 종료");
		setLayout(new FlowLayout());		
		add(exit);
		
		//Button.addActionListener(ActionListener listener) : ActionListener
		//인터페이스를 상속받은 자식클래스의 인스턴스를 전달하여 버튼에서
		//발생될 액션이벤트가 처리되도록 이벤트 핸들러 등록
		// => 이벤트가 발생될 경우 자동으로 등록된 이벤트 핸들러의 메소드 호출
		exit.addActionListener(new ExitButtonEventHandler());
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventHandlerApp("EventHandler");
	}
}

//ActionEvent를 처리하기 위한 이벤트 핸들러 클래스
// => 디자인 클래스의 컴퍼넌트 변경 불가능
class ExitButtonEventHandler implements ActionListener {
	//Listener 인터페이스의 추상메소드를 오버라이드 선언 - 이벤트 처리 목적
	// => 해당 이벤트가 발생될 경우 자동 호출
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.exit(int status) : 프로그램에 존재하는 모든 스레드를 제거하는 메소드
		// => 프로그램 종료 메소드
		System.exit(0);
	}
}
