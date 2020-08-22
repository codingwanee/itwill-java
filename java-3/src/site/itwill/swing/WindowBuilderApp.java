package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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
import javax.swing.border.EmptyBorder;

public class WindowBuilderApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JMenuItem init;
	private JMenuItem exit;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JButton red;
	private JButton green;
	private JButton blue;
	private JButton black;
	private JTextArea area;
	private JTextField field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderApp frame = new WindowBuilderApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 100, 400, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnf = new JMenu("\uD30C\uC77C(F)");
		mnf.setMnemonic('F');
		menuBar.add(mnf);
		
		init = new JMenuItem("\uD654\uBA74 \uCD08\uAE30\uD654");
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_MASK));
		mnf.add(init);
		
		mnf.addSeparator();
		
		exit = new JMenuItem("\uD504\uB85C\uADF8\uB7A8 \uC885\uB8CC");
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_MASK));
		mnf.add(exit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		red = new JButton("\uBE68\uAC04\uC0C9");
		red.setForeground(Color.RED);
		panel.add(red);
		
		green = new JButton("\uCD08\uB85D\uC0C9");
		green.setForeground(Color.GREEN);
		panel.add(green);
		
		blue = new JButton("\uD30C\uB780\uC0C9");
		blue.setForeground(Color.BLUE);
		panel.add(blue);
		
		black = new JButton("\uAC80\uC815\uC0C9");
		black.setEnabled(false);
		panel.add(black);
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		area = new JTextArea();
		area.setFocusable(false);
		scrollPane.setViewportView(area);
		
		field = new JTextField();
		contentPane.add(field, BorderLayout.SOUTH);
		field.setColumns(10);
		
		init.addActionListener(this);
		exit.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		black.addActionListener(this);
		field.addActionListener(this);
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
