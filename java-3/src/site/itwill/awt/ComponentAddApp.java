package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class ComponentAddApp extends Frame {
	private static final long serialVersionUID = 1L;

	public ComponentAddApp(String title) {
		super(title);
		
		//Button(String label) : 라벨이 부여된 버튼 컴퍼넌트를 생성하기 위한 생성자
		Button button=new Button("버튼");
		
		//Container.add(Component c) : 컴퍼넌트를 전달받아 컨테이너에 부착하는 메소드
		add(button);//버튼을 프레임에 부착
		
		setBounds(500, 100, 300, 300);
		setVisible(true);//프레임 출력 >> 프레임에 종속된 컴퍼넌트도 같이 출력
	}
	
	public static void main(String[] args) {
		new ComponentAddApp("컴퍼넌트 부착");
	}
}
