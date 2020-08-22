package site.itwill.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;
	
	public FlowLayoutApp(String title) {
		super(title);
		
		Button button1=new Button("버튼-1");
		Button button2=new Button("버튼-2");
		Button button3=new Button("버튼-3");
		Button button4=new Button("버튼-4");
		Button button5=new Button("버튼-5");
		Button button6=new Button("버튼-6");
		
		//프레임의 배치관리자를 FlowLayout으로 변경
		setLayout(new FlowLayout());
		
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		
		setBounds(500, 100, 400, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutApp("FlowLayout");
	}
}
