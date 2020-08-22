package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelApp extends Frame {
	private static final long serialVersionUID = 1L;

	public PanelApp(String title) {
		super(title);
		
		//프레임 북쪽에 부착될 컴퍼넌트(컨테이너) 생성
		Button red=new Button("빨간색");
		Button green=new Button("초록색");
		Button blue=new Button("파란색");
		
		//Panel : 컴퍼넌트를 부착하기 위한 컨테이너 >> FlowLayout
		Panel panel=new Panel();
		
		//패널에 컴퍼넌트 부착
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		
		//프레임 중앙에 부착될 컴퍼넌트 생성
		TextArea area=new TextArea();
		
		//프레임 남쪽에 부착될 컴퍼넌트 생성
		TextField field=new TextField();
		
		//프레임에 컴퍼넌트(컨테이너) 부착
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);
	
		//Component.setFont(Font f) : Font 인스턴스를 전달받아 컴퍼넌트의 글자 관련 속성을 변경하는 메소드
		// => Font 클래스 : 글자 관련 속성정보(글꼴, 스타일, 크기, )를 저장할 목적의 클래스
		// => 컨테이너에서 메소드를 호출할 경우 종속된 컴퍼넌트에 적용
		panel.setFont(new Font("굴림", Font.PLAIN, 16));
		area.setFont(new Font("굴림", Font.BOLD, 16));
		field.setFont(new Font("굴림", Font.BOLD+Font.ITALIC, 16));
		
		//Component.setForeground(Color c) : Color 인스턴스를 전달받아 컴퍼넌트의 전경색을 변경하는 메소드
		// => Color 클래스 : 색상정보(RED:0~255, GREEN:0~255, BLUE:0~255)를 저장할 목적의 클래스
		// => 컨테이너에서 메소드를 호출할 경우 종속된 컴퍼넌트에 미적용
		red.setForeground(new Color(255, 0, 0));
		green.setForeground(new Color(0, 255, 0));
		blue.setForeground(new Color(0, 0, 255));
		
		//Component.setBackground(Color c) : Color 인스턴스를 전달받아 컴퍼넌트의 배경색을 변경하는 메소드
		//Color 클래스에는 많이 사용되는 색상들이 상수필드로 선언되어 사용 가능 
		panel.setBackground(Color.GRAY);
		
		//Component.setEnabled(boolean b) : 컴퍼넌트의 활성 또는 비활성을 변경하는 메소드
		// => false : 비활성, true : 활성(기본)
		red.setEnabled(false);
		
		//TextComponent.setEditable(boolean b) : 텍스트 컴퍼넌트의 수정 가능 또는 수정 불가능을 변경하는 메소드
		// => false : 수정 불가능, true : 수정 가능(기본)
		//area.setEditable(false);
		
		//Component.setFocusable(boolean b) : 컴퍼넌트의 포커스(촛점) 위치 가능 또는 포커스 위치 불가능을 변경하는 메소드
		// => false : 포커스 위치 불가능, true : 포커스 위치 가능(기본)
		area.setFocusable(false);
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelApp("Panel");
	}
}
