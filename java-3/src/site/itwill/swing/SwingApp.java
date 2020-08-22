package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class SwingApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JMenuItem init, exit;
	private JButton red, green, blue, black;
	private JTextArea area;
	private JTextField field;
	
	public SwingApp(String title) {
		super(title);
		
		JMenuBar bar=new JMenuBar();
		JMenu file=new JMenu("����(F)");
		//JMenu.setMnemonic(char mnemonic) : ���޵� ���ڸ� ����Ű�� ����ǵ��� �����ϴ� �޼ҵ�
		// => Alt�� ���޵� ���ڸ� ���� ���� ��� �޴� ���� >> ���޹��ڿ� ������ ���� ���ڿ��� _�� ǥ��
		file.setMnemonic('F');
		//JMenuItem ���۳�Ʈ������ �󺧰� ���๮��(����)�� �����Ͽ� ���۳�Ʈ ���� ����
		init=new JMenuItem("ȭ�� �ʱ�ȭ(I)",'I');
		exit=new JMenuItem("���α׷� ����(E)",'E');
		//JMenuItem.setAccelerator(KeyStroke KeyStroke) : KeyStroke �ν��Ͻ��� �����Ͽ� �޴������ۿ� ����Ű�� �����ϴ� �޼ҵ�
		//KeyStroke Ŭ���� : ���Ű�� ���������� �����ϱ� ���� Ŭ����
		// => KeyStroke.getKeyStroke(int keyCode, int modifiers) : ���ڿ� ���Ű�� �����Ͽ� KeyStroke �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		//exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK+InputEvent.SHIFT_DOWN_MASK));
		file.add(init);
		file.addSeparator();
		file.add(exit);
		bar.add(file);
		setJMenuBar(bar);
		
		red=new JButton("������");
		green=new JButton("�ʷϻ�");
		blue=new JButton("�Ķ���");
		black=new JButton("������");
		
		JPanel panel=new JPanel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(black);
		
		area=new JTextArea();
		field=new JTextField();
		
		//JScrollPane �����̳� : ��� ���۳�Ʈ�� ��ũ���� �����ϴ� �����̳�
		JScrollPane pane=new JScrollPane(area);
		
		Container container=getContentPane();
		container.add(panel, BorderLayout.NORTH);
		container.add(pane, BorderLayout.CENTER);
		container.add(field, BorderLayout.SOUTH);
		
		black.setEnabled(false);
		area.setFocusable(false);
		area.setFont(new Font("����", Font.BOLD, 16));
		field.setFont(new Font("����", Font.BOLD, 16));
		red.setForeground(Color.RED);
		green.setForeground(Color.GREEN);
		blue.setForeground(Color.BLUE);
		black.setForeground(Color.BLACK);
		
		init.addActionListener(this);
		exit.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		black.addActionListener(this);
		field.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 100, 400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new SwingApp("Swing");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource=e.getSource();
		
		if(eventSource instanceof JMenuItem) {
			if(eventSource==init) {
				area.setText("");
			} else if(eventSource==exit) {
				System.exit(0);
			}
		} else if(eventSource instanceof JButton) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			black.setEnabled(true);
			
			((JButton)eventSource).setEnabled(false);
			if(eventSource==red) {
				area.setForeground(Color.RED);
			} else if(eventSource==green) {
				area.setForeground(Color.GREEN);
			} else if(eventSource==blue) {
				area.setForeground(Color.BLUE);
			} else if(eventSource==black) {
				area.setForeground(Color.BLACK);
			}
		} else if(eventSource instanceof JTextField) {
			String text=field.getText();
			
			if(!text.equals("")) {//�Էµ� ���ڿ��� ���� ���
				area.append(text+"\n");
				field.setText("");
			}
		}
	}
}
