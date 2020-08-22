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

//��� ���� ���α׷�
public class PenguinGameApp extends JFrame {
	private static final long serialVersionUID = 1L;

	//�������� ���� ���̸� ǥ���ϱ� ���� ����ʵ� 
	public static final int JFRAME_WIDTH=616;
	public static final int JFRAME_HEIGHT=416;
	
	//��� �̹����� ũ�⸦ ǥ���ϱ� ���� ����ʵ�
	public static final int PENGUIN_SIZE=60;

	//����̹����� �����ϱ� ���� �ʵ�
	//Image Ŭ���� : �̹��� ������ ������ �����ϱ� ���� Ŭ����
	private Image backImage;
	
	//����̹����� �����ϱ� ���� �ʵ�
	private Image[] penguins;	

	//��µ� ��� �̹��� ������ �����ϱ� ���� �ʵ�
	private int penguinNo;
	
	//��� �̹����� ��µ� ��ǥ���� �����ϱ� ���� �ʵ�
	private int penguinX, penguinY;	
	
	//��� �̹����� �̵����� ������ �����ϱ� ���� �ʵ�
	// => 1 : ���� ���� �̵�, 2 : ������ ���� �̵�(�⺻)
	private int direction;
	
	//������ ���� ������ �����ϱ� ���� �ʵ�
	// => false : ��������, true : �������(�⺻)
	private boolean isRun;
	
	//����� ���� ������ �����ϱ� ���� �ʵ�
	// => false : ���� ����, true : ���� ����(�⺻) 
	private boolean isPenguinAlive;	
	
	//������ ũ�⸦ ǥ���ϱ� ���� ����ʵ�
	public static final int STONE_SIZE=30;
	
	//������ �̹����� �����ϱ� ���� �ʵ�
	private Image stoneImage;
	
	//������ �������� �����ϱ� ���� �ʵ�
	private Set<Stone> stoneSet;
	
	public PenguinGameApp(String title) {
		super(title);
	
		//��� �̹��� ������ �о� Image �ν��Ͻ��� �����Ͽ� �ʵ� ����
		//Toolkit Ŭ���� : �׷��� ���� ������ �����ϱ� ���� Ŭ����
		//Toolkit.getDefaultToolkit() : Toolkit �ν��Ͻ��� ��ȯ�ϴ� �޼ҵ�
		//Toolkit.getImage(String fileName) : �̹��� ������ �о� Image �ν��Ͻ� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		// => ������Ʈ ���丮�� �⺻ ��ġ�� �Ͽ� ���� ��� ǥ��  
		backImage=Toolkit.getDefaultToolkit().getImage("images/back.jpg");
		
		//��� �̹��� ������ �о� Image �ν��Ͻ��� �����Ͽ� �ʵ� ����
		penguins=new Image[3];
		for(int i=0;i<penguins.length;i++) {
			penguins[i]=Toolkit.getDefaultToolkit()
					.getImage("images/penguin"+(i+1)+".gif");
		}		
		
		//������ �̹��� ������ �о� Image �ν��Ͻ��� �����Ͽ� �ʵ� ����
		stoneImage=Toolkit.getDefaultToolkit().getImage("images/stone.gif");
		
		init();
		
		stoneSet=new HashSet<Stone>();
		
		//Ű���� ���� �̺�Ʈ�� �߻��� ��� ó���� �̺�Ʈ �ڵ鷯 ���
		addKeyListener(new KeyEventHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, JFRAME_WIDTH, JFRAME_HEIGHT);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PenguinGameApp("PenguinGame");
	}
	
	//���� ���� ���� �ʱ�ȭ �۾� �޼ҵ� - �ʵ� �ʱ�ȭ
	private void init() {
		penguinNo=0;
		penguinX=JFRAME_WIDTH/2-PENGUIN_SIZE/2;
		penguinY=JFRAME_HEIGHT-PENGUIN_SIZE;
		direction=2;
		isRun=true;
		isPenguinAlive=true;
		
		//��� �̵� ������ ����
		new PenguinAnimationThread().start();
		
		//������ ���� ������ ����
		new createStone().start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);//ȭ�� �ʱ�ȭ
		
		//Graphics.drawImage(Image image, int x, int y, int width, int height, ImageObserver observer)
		// => Image �ν��Ͻ��� ����� �̹����� ���ϴ� ��ġ�� ũ��� ����ϴ� �޼ҵ�
		//��� �̹��� ���
		g.drawImage(backImage, 0, 0, JFRAME_WIDTH, JFRAME_HEIGHT, this);

		//��� �̹��� ���
		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);
		
		synchronized (stoneSet) {
			for(Stone stone:stoneSet) {
				g.drawImage(stoneImage, stone.stoneX, stone.stoneY, STONE_SIZE, STONE_SIZE, this);
			}
		}
		
		if(!isRun && isPenguinAlive) {//���� ���� ������ ���
			g.setFont(new Font("����", Font.BOLD, 50));
			g.setColor(Color.RED);
			g.drawString("��� ����", 200, 200);
		}
		
		if(!isPenguinAlive) {//��� ���� ������ ���
			g.setFont(new Font("����", Font.BOLD, 50));
			g.setColor(Color.RED);
			g.drawString("���� ����", 200, 200);
			g.drawString("�ٽ� (F5)", 200, 300);
		}
	}
	
	//Ű���� ���� �̺�Ʈ�� �߻��� ��� ó���� ������ �̺�Ʈ �ڵ鷯 Ŭ����
	// => ����Ű�� ���� ��� ��� �̵� �������� ���� ó��
	// => [P]�� ���� ��� ���� ���� �Ǵ� ���� ���� ����
	// => [F5]�� ���� ��� ���� ����� - ����� �������¿����� ����
	public class KeyEventHandler extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			//Ű���� �̺�Ʈ�� �߻��� Ű���� �ڵ尪�� ��ȯ�޾� ����
			int keyCode=e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_LEFT: 
				direction=1;	
				break;
			case KeyEvent.VK_RIGHT: 
				direction=2;	
				break;
			case KeyEvent.VK_P: 
				isRun=!isRun;//���¸� �ݴ�� �����ϴ� ��� - ���(Toggle) ���
				repaint();
				break;
			case KeyEvent.VK_F5: 
				if(!isPenguinAlive) init();
				break;
			}
		}
	}
	
	//��� �̹����� �̵��ϴ� ������ �����ϱ� ���� ������ Ŭ����
	public class PenguinAnimationThread extends Thread {
		@Override
		public void run() {
			//����� ���������� ��쿡�� ����
			// => ����� ���� ������ ��� ������ ����
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
				
				//����� �̵��ӵ� ����
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//������ ������ �����ϱ� ���� Ŭ����
	// => ������ ������ �̿��Ͽ� �̵��ǵ��� ������ Ŭ���� �ۼ�
	public class Stone extends Thread {
		//������ ��� ��ǥ���� �����ϱ� ���� �ʵ�
		private int stoneX, stoneY;
		
		//�������� ���� ������ �����ϱ� ���� �ʵ�
		// => false : ���� ����, true : ���� ����(�⺻) 
		private boolean isStoneAlive;
		
		//�������� ���� �ӵ������� �����ϱ� ���� �ʵ�
		private int stoneSpeed;
		
		public Stone() {
			stoneX=new Random().nextInt(JFRAME_WIDTH-STONE_SIZE);
			stoneY=0;
			isStoneAlive=true;
			stoneSpeed=30;
			//������ Ŭ������ �ν��Ͻ��� ������ ��� �����尡 �����Ǿ� run() �޼ҵ��� ��� ����
			start();
		}
		
		@Override
		public void run() {
			//�������� Y ��ǥ�� ���� - ������ �ϰ�
			while(isPenguinAlive && isStoneAlive) {
				if(isRun) {
					stoneY+=5;
					if(stoneY>=JFRAME_HEIGHT-STONE_SIZE) {//�����̰� �ٴڿ� ���� ���
						isStoneAlive=false;
						synchronized (stoneSet) {
							stoneSet.remove(this);
						}
					}
					
					//��� ��� ��ǥ���� ������ ��� ��ǥ���� ���Ͽ� 
					//�ߺ��� ��� ����� �������·� ����
					if(stoneY+20>=JFRAME_HEIGHT-PENGUIN_SIZE) {
						if(stoneX+10>=penguinX && stoneX+10<=penguinX+PENGUIN_SIZE
							|| stoneX+20>=penguinX && stoneX+20<=penguinX-PENGUIN_SIZE) {
							isPenguinAlive=false;
							penguinX=penguinY=-PENGUIN_SIZE;//��� �����
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
	
	//������ �����ϴ� ������ Ŭ����
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