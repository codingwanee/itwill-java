package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public BorderLayoutApp(String title) {
		super(title);
		
		Button button1=new Button("버튼-1");
		Button button2=new Button("버튼-2");
		Button button3=new Button("버튼-3");
		Button button4=new Button("버튼-4");
		Button button5=new Button("버튼-5");
		
		/*
		BorderLayout layout=new BorderLayout();
		setLayout(layout);//프레임의 배치관리자를 BorderLayout으로 변경
		*/
		
		//Frame의 기본 배치관리자가 BorderLayout이므로 배치관리자 변경 불필요 
		//setLayout(new BorderLayout());
		
		//Container.add(Component c, String index) : 원하는 위치(동,서,남,북,중앙)에 컴퍼넌트 부착하는 메소드
		// => 배치관리자가 BorderLayout인 경우에만 사용하는 메소드
		// => 위치에 대한 문자열은 BorderLayout 클래스의 상수필드를 사용하는 것을 권장
		// => 중앙를 제외한 위치는 생략 가능
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutApp("BorderLayout");
	}
}





