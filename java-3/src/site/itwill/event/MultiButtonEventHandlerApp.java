package site.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//��ư�� ���� ��� �ش� ��ư�� �������� ĵ������ ������ �����ϴ� ���α׷�
public class MultiButtonEventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	//�̺�Ʈ �ڵ鷯 �޼ҵ忡�� ���۳�Ʈ�� �����ϱ� ���� �ʵ� ����
	private Canvas canvas;
	private Button red, green, blue, white;
	
	public MultiButtonEventHandlerApp(String title) {
		super(title);
		
		red=new Button("������");
		green=new Button("�ʷϻ�");
		blue=new Button("�Ķ���");
		white=new Button("�Ͼ��");
		
		Panel panel=new Panel();
		
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);
		
		canvas=new Canvas();
		
		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		panel.setBackground(Color.GRAY);
		panel.setFont(new Font("����", Font.BOLD, 20));

		white.setEnabled(false);

		//Button.setActionCommand(String command) : Button ���۳�Ʈ�� ActionCommand �����ϴ� �޼ҵ�
		// => ��ư�� �󺧸� ��� ActionCommand�� ���� �����Ͽ� ���
		red.setActionCommand("RED");
		green.setActionCommand("GREEN");
		blue.setActionCommand("BLUE");
		white.setActionCommand("WHITE");
		
		//���۳�Ʈ�� �̺�Ʈ �ڵ鷯 ���
		/*
		red.addActionListener(new RedButtonHandler());
		green.addActionListener(new GreenButtonHandler());
		blue.addActionListener(new BlueButtonHandler());
		white.addActionListener(new WhiteButtonHandler());
		*/
		red.addActionListener(new ColorButtonHandler());
		green.addActionListener(new ColorButtonHandler());
		blue.addActionListener(new ColorButtonHandler());
		white.addActionListener(new ColorButtonHandler());
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); 
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MultiButtonEventHandlerApp("MultiEventHandler");
	}

	/*
	public void initButton() {
		red.setEnabled(true);
		green.setEnabled(true);
		blue.setEnabled(true);
		white.setEnabled(true);
	}
	
	public class RedButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.RED);
			red.setEnabled(false);
		}
	}
	
	public class GreenButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.GREEN);
			green.setEnabled(false);
		}
	}
	
	public class BlueButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.BLUE);
			blue.setEnabled(false);
		}
	}
	
	public class WhiteButtonHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			initButton();
			canvas.setBackground(Color.WHITE);
			white.setEnabled(false);
		}
	}
	*/
	
	public class ColorButtonHandler implements ActionListener {
		//�̺�Ʈ �ڵ鷯 �޼ҵ忡���� ���۳�Ʈ�� �̺�Ʈ ������ �Ķ���ͷ� �ڵ� ���޹޾� ���
		@Override
		public void actionPerformed(ActionEvent e) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			white.setEnabled(true);
			
			//ActionEvent.getActionCommand() : ActionEvent�� �߻��� ���۳�Ʈ�� ActionCommand�� ��ȯ�ϴ� �޼ҵ�
			//ActionCommand : ActionEvent�� �߻��� ���۳�Ʈ(Button, MenuItem)�� ���� ���� ���ڿ� - ��ư�� �⺻ ActionCommand�� ��ư �󺧸����� ����
			String actionCommand=e.getActionCommand();
			//System.out.println("actionCommand = "+actionCommand);			
			
			//�̺�Ʈ ���۳�Ʈ�� ActionCommand�� ���Ͽ� �̺�Ʈ ó��
			/*
			if(actionCommand.equals("������")) {
				canvas.setBackground(Color.RED);
				red.setEnabled(false);
			} else if(actionCommand.equals("�ʷϻ�")) {
				canvas.setBackground(Color.GREEN);
				green.setEnabled(false);
			} else if(actionCommand.equals("�Ķ���")) {
				canvas.setBackground(Color.BLUE);
				blue.setEnabled(false);
			} else if(actionCommand.equals("�Ͼ��")) {
				canvas.setBackground(Color.WHITE);
				white.setEnabled(false);
			}
			*/
			if(actionCommand.equals("RED")) {
				canvas.setBackground(Color.RED);
				red.setEnabled(false);
			} else if(actionCommand.equals("GREEN")) {
				canvas.setBackground(Color.GREEN);
				green.setEnabled(false);
			} else if(actionCommand.equals("BLUE")) {
				canvas.setBackground(Color.BLUE);
				blue.setEnabled(false);
			} else if(actionCommand.equals("WHITE")) {
				canvas.setBackground(Color.WHITE);
				white.setEnabled(false);
			}
		}
	}
}
