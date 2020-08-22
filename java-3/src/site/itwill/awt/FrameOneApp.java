package site.itwill.awt;

import java.awt.Frame;

public class FrameOneApp {
	public static void main(String[] args) {
		//Frame() : 프레임을 생성하는 생성자 
		//Frame f=new Frame();//프레임 생성
		//Frame(String title) : 제목에 부여된 프레임을 생성하는 생성자 
		Frame f=new Frame("프레임");
		
		//Frame.setTitle(String title) : 프레임의 제목을 변경하는 메소드
		//f.setTitle("프레임");
		
		/*
		//Component.setSize(int width, int height) : 폭과 높이를 전달하여 컴퍼넌트(컨테이너)의 크기를 변경하는 메소드
		// => 크기 또는 위치 단위 : pixel(하나의 색이 출력되는 점)
		f.setSize(400, 300);
		
		//Component.setLocation(int x, int y) : x과 y를 전달하여 컴퍼넌트(컨테이너)의 위치를 변경하는 메소드
		f.setLocation(500,100);
		*/
		
		//Component.setBounds(int x, int y, int width, int height) : 컴퍼넌트(컨테이너)의 크기와 위치를 변경하는 메소드 
		f.setBounds(500, 100, 400, 300);
		
		//Frame.setResizable(boolean b) : 프레임 크기 변경 유무를 변경하는 메소드
		// => false : 크기 변경 불가능, true : 크기 변경 가능(기본)
		f.setResizable(false);
		
		//Component.setVisible(boolean b) : 컴퍼넌트(컨테이너)에 대한 출력 유무를 변경하는 메소드
		// => false : 미출력(기본), true : 출력
		f.setVisible(true);
	}
}
