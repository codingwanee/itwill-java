package site.itwill.swing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

//GUI 프로그램은 기본적으로 다중 스레드 프로그램
// => 디자인 클래스를 실행하는 스레드와 이벤트 핸들러 클래스를 실행하는 스레드
public class PaintApp extends JFrame {
	private static final long serialVersionUID = 1L;

	//마우스의 클릭 좌표값을 저장하기 위한 필드
	private int x,y;
	
	public PaintApp(String title) {
		super(title);
		
		//Component.addMouseListener(MouseListener l) : 컴퍼넌트에서 발생되는
		//마우스 관련 이벤트 처리에 대한 이벤트 핸들러를 등록하기 위한 메소드
		addMouseListener(new MouseAdapter() {
			//마우스 버튼을 클릭한 경우 호출되는 이벤트 처리 메소드 
			@Override
			public void mouseClicked(MouseEvent e) {
				//MouseEvent.getX() : 마우스를 클릭한 위치의 X 좌표값을 반환하는 메소드
				x=e.getX();
				//MouseEvent.getY() : 마우스를 클릭한 위치의 Y 좌표값을 반환하는 메소드
				y=e.getY();
				
				//Window.repaint() : paint() 메소드를 호출하는 메소드
				repaint();
			}
		});
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PaintApp("Paint");
	}
	
	//Window.paint(Graphics g) : 컨테이너(다이얼로그, 프레임)를 출력하는 메소드
	//paint() 메소드는 WindowEvent에 의해 자동 호출
	// => 프로그램이 실행되어 컨테이너가 출력될 경우
	// => 컨테이너가 활성되거나 크기가 변경될 경우
	//Graphics 클래스 : 그림을 그리기 위한 기능을 제공하는 클래스
	@Override
	public void paint(Graphics g) {
		//System.out.println(Thread.currentThread().getName()+" 스레드에 의해 paint() 메소드 호출");
		
		//Graphics.clearRect(int x, int y, int width, int hieght)
		// => 원하는 위치의 영역를 초기화 시키는 메소드
		//Component.getWidth() : 컴퍼넌트의 폭을 반환하는 메소드
		//Component.getHeight() : 컴퍼넌트의 높이를 반환하는 메소드
		//g.clearRect(0, 0, getWidth(), getHeight());//전체 화면 초기화
		
		//부모클래스의 paint() 메소드 호출 - 화면 초기화
		super.paint(g);
		
		/*
		g.setColor(Color.RED);
		g.drawRect(20, 40, 50, 50);
		g.fillRect(20, 100, 50, 100);
		
		g.setColor(Color.GREEN);
		g.drawOval(125, 175, 50, 50);
		g.fillOval(100, 100, 100, 50);
		
		g.setColor(Color.BLUE);
		g.drawString("홍길동", 100, 300);
		*/
		
		g.drawString("["+x+","+y+"]", x, y);
	}
	
	//Swing에서는 repaint() 메소드가 update() 메소드를 호출하지 않고 paint() 메소드 호출
	@Override
	public void update(Graphics g) {
		System.out.println("update() 메소드 호출");
		super.update(g);
	}
	
	@Override
	public void repaint() {
		update(getGraphics());
		super.repaint();
	}
}




