package site.itwill.event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//ActionEvent가 발생하는 경우
//1.Button 컴퍼넌트를 누를 경우
//2.MenuItem 컴퍼넌트를 선택한 경우
//3.TextField 컴퍼넌트에서 엔터를 입력한 경우
public class EventSourceGetApp extends Frame implements ActionListener {
	private static final long serialVersionUID = 1L;

	private Button red, green, blue, black;
	private TextArea area;
	private TextField field;
	private MenuItem init, exit;
	
	public EventSourceGetApp(String title) {
		super(title);
		
		MenuBar bar=new MenuBar();
		Menu file=new Menu("파일");
		init=new MenuItem("화면 초기화",new MenuShortcut(KeyEvent.VK_I));
		exit=new MenuItem("프로그램 종료",new MenuShortcut(KeyEvent.VK_E));
		file.add(init);
		file.addSeparator();
		file.add(exit);
		bar.add(file);
		setMenuBar(bar);
		
		red=new Button("빨간색");
		green=new Button("초록색");
		blue=new Button("파란색");
		black=new Button("검정색");
		
		Panel panel=new Panel();
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(black);
		
		area=new TextArea();
		field=new TextField();
		
		add(panel,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		add(field,BorderLayout.SOUTH);
		
		black.setEnabled(false);
		area.setFocusable(false);
		panel.setBackground(Color.GRAY);
		red.setForeground(Color.RED);
		green.setForeground(Color.GREEN);
		blue.setForeground(Color.BLUE);
		black.setForeground(Color.BLACK);
		panel.setFont(new Font("굴림", Font.BOLD, 14));
		area.setFont(new Font("굴림", Font.BOLD, 16));
		field.setFont(new Font("굴림", Font.BOLD, 16));
		
		init.addActionListener(this);
		exit.addActionListener(this);
		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		black.addActionListener(this);
		field.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(500, 100, 400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventSourceGetApp("EventSourceGet");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//ActionEvent.getSource() : 이벤트 컴퍼넌트를 반환하는 메소드
		// => 이벤트 컴퍼넌트를 Object 클래스 타입으로 반환  
		Object eventSource=e.getSource();
		
		//이벤트 컴퍼넌트를 컴퍼넌트로 구분하여 처리
		if(eventSource instanceof MenuItem) {
			if(eventSource==init) {
				//TextComponent.setText(String text) : 문자열을 전달받아 텍스트 컴퍼넌트의 문자열을 변경하는 메소드
				area.setText("");
			} else if(eventSource==exit) {
				System.exit(0);
			}
		} else if(eventSource instanceof Button) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			black.setEnabled(true);
			
			((Button)eventSource).setEnabled(false);
			if(eventSource==red) {
				area.setForeground(Color.RED);
			} else if(eventSource==green) {
				area.setForeground(Color.GREEN);
			} else if(eventSource==blue) {
				area.setForeground(Color.BLUE);
			} else if(eventSource==black) {
				area.setForeground(Color.BLACK);
			}
		} else if(eventSource instanceof TextField) {
			//TextComponent.getText() : 텍스트 컴퍼넌트의 문자열을 얻어와 반환하는 메소드
			String text=field.getText();
			
			if(!text.equals("")) {//입력된 문자열을 있을 경우
				//TextComponent.append(String text) : 문자열을 전달받아 텍스트 컴퍼넌트의 문자열을 추가하는 메소드
				area.append(text+"\n");
				field.setText("");
			}
		}
	}
}







