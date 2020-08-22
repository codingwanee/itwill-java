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

//버튼을 누를 경우 해당 버튼의 색상으로 캔버스의 배경색을 변경하는 프로그램
public class MultiButtonEventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	//이벤트 핸들러 메소드에서 컴퍼넌트를 변경하기 위해 필드 선언
	private Canvas canvas;
	private Button red, green, blue, white;
	
	public MultiButtonEventHandlerApp(String title) {
		super(title);
		
		red=new Button("빨간색");
		green=new Button("초록색");
		blue=new Button("파란색");
		white=new Button("하얀색");
		
		Panel panel=new Panel();
		
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		panel.add(white);
		
		canvas=new Canvas();
		
		add(panel, BorderLayout.NORTH);
		add(canvas, BorderLayout.CENTER);
		
		panel.setBackground(Color.GRAY);
		panel.setFont(new Font("굴림", Font.BOLD, 20));

		white.setEnabled(false);

		//Button.setActionCommand(String command) : Button 컴퍼넌트의 ActionCommand 변경하는 메소드
		// => 버튼의 라벨명 대신 ActionCommand를 직접 지정하여 사용
		red.setActionCommand("RED");
		green.setActionCommand("GREEN");
		blue.setActionCommand("BLUE");
		white.setActionCommand("WHITE");
		
		//컴퍼넌트에 이벤트 핸들러 등록
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
		//이벤트 핸들러 메소드에서는 컴퍼넌트의 이벤트 정보를 파라메터로 자동 전달받아 사용
		@Override
		public void actionPerformed(ActionEvent e) {
			red.setEnabled(true);
			green.setEnabled(true);
			blue.setEnabled(true);
			white.setEnabled(true);
			
			//ActionEvent.getActionCommand() : ActionEvent를 발생한 컴퍼넌트의 ActionCommand를 반환하는 메소드
			//ActionCommand : ActionEvent를 발생한 컴퍼넌트(Button, MenuItem)의 동작 관련 문자열 - 버튼의 기본 ActionCommand는 버튼 라벨명으로 설정
			String actionCommand=e.getActionCommand();
			//System.out.println("actionCommand = "+actionCommand);			
			
			//이벤트 컴퍼넌트의 ActionCommand를 비교하여 이벤트 처리
			/*
			if(actionCommand.equals("빨간색")) {
				canvas.setBackground(Color.RED);
				red.setEnabled(false);
			} else if(actionCommand.equals("초록색")) {
				canvas.setBackground(Color.GREEN);
				green.setEnabled(false);
			} else if(actionCommand.equals("파란색")) {
				canvas.setBackground(Color.BLUE);
				blue.setEnabled(false);
			} else if(actionCommand.equals("하얀색")) {
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
