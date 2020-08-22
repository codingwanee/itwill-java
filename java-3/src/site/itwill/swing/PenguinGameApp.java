package site.itwill.swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import javax.swing.JFrame;

//펭귄 게임 프로그램
public class PenguinGameApp extends JFrame {
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
	
	//펭귄 이미지의 이동방향 정보를 저장하기 위한 필드
	// => 1 : 왼쪽 방향 이동, 2 : 오른쪽 방향 이동(기본)
	private int direction;
	
	//게임의 상태 정보를 저장하기 위한 필드
	// => false : 중지상태, true : 실행상태(기본)
	private boolean isRun;
	
	//펭귄의 상태 정보를 저장하기 위한 필드
	// => false : 죽음 상태, true : 생존 상태(기본) 
	private boolean isPenguinAlive;	
	
	//돌멩이 크기를 표현하기 위한 상수필드
	public static final int STONE_SIZE=30;
	
	//돌멩이 이미지를 저장하기 위한 필드
	private Image stoneImage;
	
	//돌멩이 정보들을 저장하기 위한 필드
	private Set<Stone> stoneSet;
	
	public PenguinGameApp(String title) {
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
					.getImage("images/penguin"+(i+1)+".gif");
		}		
		
		//돌멩이 이미지 파일을 읽어 Image 인스턴스로 생성하여 필드 저장
		stoneImage=Toolkit.getDefaultToolkit().getImage("images/stone.gif");
		
		init();
		
		stoneSet=new HashSet<Stone>();
		
		//키보드 관련 이벤트가 발생될 경우 처리할 이벤트 핸들러 등록
		addKeyListener(new KeyEventHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PenguinGameApp("PenguinGame");
	}
	
	//게임 실행 관련 초기화 작업 메소드 - 필드 초기화
	private void init() {
		penguinNo=0;
		penguinX=JFRAME_WIDTH/2-PENGUIN_SIZE/2;
		penguinY=JFRAME_HEIGHT-PENGUIN_SIZE;
		direction=2;
		isRun=true;
		isPenguinAlive=true;
		
		//펭귄 이동 스레드 실행
		new PenguinAnimationThread().start();
		
		//돌멩이 생성 스레드 실행
		new createStone().start();
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
		
		synchronized (stoneSet) {
			for(Stone stone:stoneSet) {
				g.drawImage(stoneImage, stone.stoneX, stone.stoneY, STONE_SIZE, STONE_SIZE, this);
			}
		}
		
		if(!isRun && isPenguinAlive) {//게임 중지 상태인 경우
			g.setFont(new Font("굴림", Font.BOLD, 50));
			g.setColor(Color.RED);
			g.drawString("잠시 멈춤", 200, 200);
		}
		
		if(!isPenguinAlive) {//펭귄 죽음 상태인 경우
			g.setFont(new Font("굴림", Font.BOLD, 50));
			g.setColor(Color.RED);
			g.drawString("게임 종료", 200, 200);
			g.drawString("다시 (F5)", 200, 300);
		}
	}
	
	//키보드 관련 이벤트가 발생될 경우 처리할 목적의 이벤트 핸들러 클래스
	// => 방향키를 누른 경우 펭귄 이동 방향정보 변경 처리
	// => [P]를 누른 경우 실행 상태 또는 중지 상태 변경
	// => [F5]를 누른 경우 게임 재시작 - 펭귄의 죽음상태에서만 가능
	public class KeyEventHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			//키보드 이벤트가 발생된 키보드 코드값을 반환받아 저장
			int keyCode=e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_LEFT: 
				direction=1;	
				break;
			case KeyEvent.VK_RIGHT: 
				direction=2;	
				break;
			case KeyEvent.VK_P: 
				isRun=!isRun;//상태를 반대로 변경하는 명령 - 토글(Toggle) 기능
				repaint();
				break;
			case KeyEvent.VK_F5: 
				if(!isPenguinAlive) init();
				break;
			}
		}
	}
	
	//펭귄 이미지를 이동하는 동작을 구현하기 위한 스레드 클래스
	public class PenguinAnimationThread extends Thread {
		@Override
		public void run() {
			//펭귄이 생존상태인 경우에만 실행
			// => 펭귄이 죽은 상태인 경우 스레드 종료
			while(isPenguinAlive) {
				if(isRun) {
					switch (direction) {
					case 1:
						penguinX-=5;
						if(penguinX<=0) {
							penguinX=0;
						}
						break;
					case 2:
						penguinX+=5;
						if(penguinX>=JFRAME_WIDTH-PENGUIN_SIZE) {
							penguinX=JFRAME_WIDTH-PENGUIN_SIZE;
						}
						break;
					}
					penguinNo++;
					penguinNo%=3;
					repaint();
				}
				
				//펭귄의 이동속도 제어
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//돌멩이 정보를 저장하기 위한 클래스
	// => 돌멩이 정보를 이용하여 이동되도록 스레드 클래스 작성
	public class Stone extends Thread {
		//돌멩이 출력 좌표값을 저장하기 위한 필드
		private int stoneX, stoneY;
		
		//돌멩이의 상태 정보를 저장하기 위한 필드
		// => false : 죽음 상태, true : 생존 상태(기본) 
		private boolean isStoneAlive;
		
		//돌멩이의 낙하 속도정보를 저장하기 위한 필드
		private int stoneSpeed;
		
		public Stone() {
			stoneX=new Random().nextInt(JFRAME_WIDTH-STONE_SIZE);
			stoneY=0;
			isStoneAlive=true;
			stoneSpeed=30;
			//스레드 클래스로 인스턴스를 생성할 경우 스레드가 생성되어 run() 메소드의 명령 실행
			start();
		}
		
		@Override
		public void run() {
			//돌멩이의 Y 좌표값 변경 - 돌멩이 하강
			while(isPenguinAlive && isStoneAlive) {
				if(isRun) {
					stoneY+=5;
					if(stoneY>=JFRAME_HEIGHT-STONE_SIZE) {//돌멩이가 바닥에 닿은 경우
						isStoneAlive=false;
						synchronized (stoneSet) {
							stoneSet.remove(this);
						}
					}
					
					//펭귄 출력 좌표값과 돌멩이 출력 좌표값을 비교하여 
					//중복될 경우 펭귄의 죽음상태로 변경
					if(stoneY+20>=JFRAME_HEIGHT-PENGUIN_SIZE) {
						if(stoneX+10>=penguinX && stoneX+10<=penguinX+PENGUIN_SIZE
							|| stoneX+20>=penguinX && stoneX+20<=penguinX-PENGUIN_SIZE) {
							isPenguinAlive=false;
							penguinX=penguinY=-PENGUIN_SIZE;//펭귄 숨기기
							synchronized (stoneSet) {
								stoneSet.clear();
							}
						}
					}
					repaint();
				}
				
				try {
					Thread.sleep(stoneSpeed);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//돌멩이 생성하는 스레드 클래스
	public class createStone extends Thread {
		@Override
		public void run() {
			while(isPenguinAlive) {
				if(isRun) {
					synchronized(stoneSet) {
						stoneSet.add(new Stone());
					}
				}
				
				try {
					Thread.sleep(250);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}