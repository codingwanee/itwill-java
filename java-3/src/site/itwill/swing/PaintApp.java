package site.itwill.swing;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

//GUI ���α׷��� �⺻������ ���� ������ ���α׷�
// => ������ Ŭ������ �����ϴ� ������� �̺�Ʈ �ڵ鷯 Ŭ������ �����ϴ� ������
public class PaintApp extends JFrame {
	private static final long serialVersionUID = 1L;

	//���콺�� Ŭ�� ��ǥ���� �����ϱ� ���� �ʵ�
	private int x,y;
	
	public PaintApp(String title) {
		super(title);
		
		//Component.addMouseListener(MouseListener l) : ���۳�Ʈ���� �߻��Ǵ�
		//���콺 ���� �̺�Ʈ ó���� ���� �̺�Ʈ �ڵ鷯�� ����ϱ� ���� �޼ҵ�
		addMouseListener(new MouseAdapter() {
			//���콺 ��ư�� Ŭ���� ��� ȣ��Ǵ� �̺�Ʈ ó�� �޼ҵ� 
			@Override
			public void mouseClicked(MouseEvent e) {
				//MouseEvent.getX() : ���콺�� Ŭ���� ��ġ�� X ��ǥ���� ��ȯ�ϴ� �޼ҵ�
				x=e.getX();
				//MouseEvent.getY() : ���콺�� Ŭ���� ��ġ�� Y ��ǥ���� ��ȯ�ϴ� �޼ҵ�
				y=e.getY();
				
				//Window.repaint() : paint() �޼ҵ带 ȣ���ϴ� �޼ҵ�
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
	
	//Window.paint(Graphics g) : �����̳�(���̾�α�, ������)�� ����ϴ� �޼ҵ�
	//paint() �޼ҵ�� WindowEvent�� ���� �ڵ� ȣ��
	// => ���α׷��� ����Ǿ� �����̳ʰ� ��µ� ���
	// => �����̳ʰ� Ȱ���ǰų� ũ�Ⱑ ����� ���
	//Graphics Ŭ���� : �׸��� �׸��� ���� ����� �����ϴ� Ŭ����
	@Override
	public void paint(Graphics g) {
		//System.out.println(Thread.currentThread().getName()+" �����忡 ���� paint() �޼ҵ� ȣ��");
		
		//Graphics.clearRect(int x, int y, int width, int hieght)
		// => ���ϴ� ��ġ�� ������ �ʱ�ȭ ��Ű�� �޼ҵ�
		//Component.getWidth() : ���۳�Ʈ�� ���� ��ȯ�ϴ� �޼ҵ�
		//Component.getHeight() : ���۳�Ʈ�� ���̸� ��ȯ�ϴ� �޼ҵ�
		//g.clearRect(0, 0, getWidth(), getHeight());//��ü ȭ�� �ʱ�ȭ
		
		//�θ�Ŭ������ paint() �޼ҵ� ȣ�� - ȭ�� �ʱ�ȭ
		super.paint(g);
		
		/*
		g.setColor(Color.RED);
		g.drawRect(20, 40, 50, 50);
		g.fillRect(20, 100, 50, 100);
		
		g.setColor(Color.GREEN);
		g.drawOval(125, 175, 50, 50);
		g.fillOval(100, 100, 100, 50);
		
		g.setColor(Color.BLUE);
		g.drawString("ȫ�浿", 100, 300);
		*/
		
		g.drawString("["+x+","+y+"]", x, y);
	}
	
	//Swing������ repaint() �޼ҵ尡 update() �޼ҵ带 ȣ������ �ʰ� paint() �޼ҵ� ȣ��
	@Override
	public void update(Graphics g) {
		System.out.println("update() �޼ҵ� ȣ��");
		super.update(g);
	}
	
	@Override
	public void repaint() {
		update(getGraphics());
		super.repaint();
	}
}




