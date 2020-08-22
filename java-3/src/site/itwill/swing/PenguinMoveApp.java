package site.itwill.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//키보드를 눌러 펭귄을 이동하는 프로그램 
public class PenguinMoveApp extends JFrame {
	private static final long serialVersionUID = 1L;

	//프레임의 폭과 높이를 표현하기 위한 상수필드 
	public static final int JFRAME_WIDTH=616;
	public static final int JFRAME_HEIGHT=416;
	
	//펭귄 이미지의 크기를 표현하기 위한 상수필드
	public static final int PENGUIN_SIZE=60;
	
	//배경이미지를 저장하기 위한 필드
	//Image 클래스 : 이미지 파일의 정보를 저장하기 위한 클래스
	private Image backImage;
	
	//펭귄이미지를 저장하기 위한 필드
	private Image[] penguins;
	
	//출력될 펭귄 이미지 정보를 저장하기 위한 필드
	private int penguinNo;
	
	//펭귄 이미지가 출력될 좌표값을 저장하기 위한 필드
	private int penguinX, penguinY;
	
	public PenguinMoveApp(String title) {
		super(title);
		
		//배경 이미지 파일을 읽어 Image 인스턴스로 생성하여 필드 저장
		//Toolkit 클래스 : 그래픽 관련 정보를 저장하기 위한 클래스
		//Toolkit.getDefaultToolkit() : Toolkit 인스턴스를 반환하는 메소드
		//Toolkit.getImage(String fileName) : 이미지 파일을 읽어 Image 인스턴스 생성하여 반환하는 메소드
		// => 프로젝트 디렉토리를 기본 위치로 하여 파일 경로 표현  
		backImage=Toolkit.getDefaultToolkit().getImage("images/back.jpg");
		
		//펭귄 이미지 파일을 읽어 Image 인스턴스로 생성하여 필드 저장
		penguins=new Image[3];
		for(int i=0;i<penguins.length;i++) {
			penguins[i]=Toolkit.getDefaultToolkit()
					.getImage(getClass().getClassLoader().getResource("images/penguin"+(i+1)+".gif"));
		}
		
		//penguinNo=0;
		
		//펭귄 이미지가 출력될 최초 좌표값을 계산하여 필드에 저장
		penguinX=JFRAME_WIDTH/2-PENGUIN_SIZE/2;
		penguinY=JFRAME_HEIGHT-PENGUIN_SIZE;
		
		//프레임에서 키보드 관련 이벤트가 발생될 경우 처리될 이벤트 핸들러 등록 
		addKeyListener(new PenguinMoveHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PenguinMoveApp("PenguinMove");
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);//화면 초기화
		
		//Graphics.drawImage(Image image, int x, int y, int width, int height, ImageObserver observer)
		// => Image 인스턴스에 저장된 이미지를 원하는 위치와 크기로 출력하는 메소드
		//배경 이미지 출력
		g.drawImage(backImage, 0, 0, JFRAME_WIDTH, JFRAME_HEIGHT, this);

		//펭귄 이미지 출력
		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);
	}
	
	//KeyEvent(키보드 관련 이벤트)를 처리하기 위한 이벤트 핸들러 클래스
	public class PenguinMoveHandler implements KeyListener {
		//키보드를 눌렀다 띄었을 때 자동 호출되는 이벤트 메소드 	
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		//키보드를 눌렀을 때 자동 호출되는 이벤트 메소드 	
		@Override
		public void keyPressed(KeyEvent e) {
			//KeyEvent 클래스 : 키보드 관련 이벤트 정보를 저장하기 위한 클래스
			//KeyEvent.getKeyCode() : 이벤트가 발생된 키보드 코드값을 반환하는 메소드
			int keyCode=e.getKeyCode();
			//System.out.println("keyCode = "+keyCode);

			//KeyEvent.getKeyChar() : 이벤트가 발생된 키보드 문자값을 반환하는 메소드
			//int keyChar=e.getKeyChar();
			//System.out.println("keyChar = "+keyChar);
			
			//왼쪽 또는 오른쪽 방향키를 누른 경우 펭귄 출력 X 좌표값 변경
			// => repaint() 메소드를 호출하여 paint() 메소드 자동 호출 - 재출력
			// => 키보드 코드값을 키보드 관련 상수필드와 비교하여 처리
			switch (keyCode) {
			case KeyEvent.VK_LEFT:
				penguinX-=10;
				if(penguinX<=0) {
					penguinX=0;
				}
				penguinNo++;
				penguinNo%=3;
				repaint();
				break;

			case KeyEvent.VK_RIGHT:
				penguinX+=10;
				if(penguinX>=JFRAME_WIDTH-PENGUIN_SIZE) {
					penguinX=JFRAME_WIDTH-PENGUIN_SIZE;
				}
				penguinNo++;
				penguinNo%=3;
				repaint();
				break;
			}
		}

		//키보드를 띄었을 때 자동 호출되는 이벤트 메소드 	
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}





