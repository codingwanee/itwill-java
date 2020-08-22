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
		JMenu file=new JMenu("파일(F)");
		//JMenu.setMnemonic(char mnemonic) : 전달된 문자를 단축키로 실행되도록 변경하는 메소드
		// => Alt와 전달된 문자를 같이 누른 경우 메뉴 선택 >> 전달문자와 동일한 라벨의 문자에는 _가 표현
		file.setMnemonic('F');
		//JMenuItem 컴퍼넌트에서는 라벨과 단축문자(생략)를 전달하여 컴퍼넌트 생성 가능
		init=new JMenuItem("화면 초기화(I)",'I');
		exit=new JMenuItem("프로그램 종료(E)",'E');
		//JMenuItem.setAccelerator(KeyStroke KeyStroke) : KeyStroke 인스턴스를 전달하여 메뉴아이템에 단축키를 변경하는 메소드
		//KeyStroke 클래스 : 기능키와 문자정보를 저장하기 위한 클래스
		// => KeyStroke.getKeyStroke(int keyCode, int modifiers) : 문자와 기능키를 전달하여 KeyStroke 인스턴스를 생성하여 반환하는 메소드
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
		//exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK+InputEvent.SHIFT_DOWN_MASK));
		file.add(init);
		file.addSeparator();
		file.add(exit);
		bar.add(file);
		setJMenuBar(bar);
		
		red=new JButton("빨간색");
		green=new JButton("초록색");
		blue=new JButton("파란색");
		black=new JButton("검정색");
		
		JPanel panel=new JPanel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(black);
		
		area=new JTextArea();
		field=new JTextField();
		
		//JScrollPane 컨테이너 : 출력 컴퍼넌트에 스크롤을 제공하는 컨테이너
		JScrollPane pane=new JScrollPane(area);
		
		Container container=getContentPane();
		container.add(panel, BorderLayout.NORTH);
		container.add(pane, BorderLayout.CENTER);
		container.add(field, BorderLayout.SOUTH);
		
		black.setEnabled(false);
		area.setFocusable(false);
		area.setFont(new Font("굴림", Font.BOLD, 16));
		field.setFont(new Font("굴림", Font.BOLD, 16));
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
			
			if(!text.equals("")) {//입력된 문자열을 있을 경우
				area.append(text+"\n");
				field.setText("");
			}
		}
	}
}
