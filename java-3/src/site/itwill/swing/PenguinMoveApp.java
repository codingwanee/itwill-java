package site.itwill.swing;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

//Ű���带 ���� ����� �̵��ϴ� ���α׷� 
public class PenguinMoveApp extends JFrame {
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
	
	public PenguinMoveApp(String title) {
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
					.getImage(getClass().getClassLoader().getResource("images/penguin"+(i+1)+".gif"));
		}
		
		//penguinNo=0;
		
		//��� �̹����� ��µ� ���� ��ǥ���� ����Ͽ� �ʵ忡 ����
		penguinX=JFRAME_WIDTH/2-PENGUIN_SIZE/2;
		penguinY=JFRAME_HEIGHT-PENGUIN_SIZE;
		
		//�����ӿ��� Ű���� ���� �̺�Ʈ�� �߻��� ��� ó���� �̺�Ʈ �ڵ鷯 ��� 
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
		super.paint(g);//ȭ�� �ʱ�ȭ
		
		//Graphics.drawImage(Image image, int x, int y, int width, int height, ImageObserver observer)
		// => Image �ν��Ͻ��� ����� �̹����� ���ϴ� ��ġ�� ũ��� ����ϴ� �޼ҵ�
		//��� �̹��� ���
		g.drawImage(backImage, 0, 0, JFRAME_WIDTH, JFRAME_HEIGHT, this);

		//��� �̹��� ���
		g.drawImage(penguins[penguinNo], penguinX, penguinY, PENGUIN_SIZE, PENGUIN_SIZE, this);
	}
	
	//KeyEvent(Ű���� ���� �̺�Ʈ)�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 Ŭ����
	public class PenguinMoveHandler implements KeyListener {
		//Ű���带 ������ ����� �� �ڵ� ȣ��Ǵ� �̺�Ʈ �޼ҵ� 	
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		//Ű���带 ������ �� �ڵ� ȣ��Ǵ� �̺�Ʈ �޼ҵ� 	
		@Override
		public void keyPressed(KeyEvent e) {
			//KeyEvent Ŭ���� : Ű���� ���� �̺�Ʈ ������ �����ϱ� ���� Ŭ����
			//KeyEvent.getKeyCode() : �̺�Ʈ�� �߻��� Ű���� �ڵ尪�� ��ȯ�ϴ� �޼ҵ�
			int keyCode=e.getKeyCode();
			//System.out.println("keyCode = "+keyCode);

			//KeyEvent.getKeyChar() : �̺�Ʈ�� �߻��� Ű���� ���ڰ��� ��ȯ�ϴ� �޼ҵ�
			//int keyChar=e.getKeyChar();
			//System.out.println("keyChar = "+keyChar);
			
			//���� �Ǵ� ������ ����Ű�� ���� ��� ��� ��� X ��ǥ�� ����
			// => repaint() �޼ҵ带 ȣ���Ͽ� paint() �޼ҵ� �ڵ� ȣ�� - �����
			// => Ű���� �ڵ尪�� Ű���� ���� ����ʵ�� ���Ͽ� ó��
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

		//Ű���带 ����� �� �ڵ� ȣ��Ǵ� �̺�Ʈ �޼ҵ� 	
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}
}





