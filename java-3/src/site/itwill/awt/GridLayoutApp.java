package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public GridLayoutApp(String title) {
		super(title);
		
		Button button1=new Button("��ư-1");
		Button button2=new Button("��ư-2");
		Button button3=new Button("��ư-3");
		Button button4=new Button("��ư-4");
		Button button5=new Button("��ư-5");
		Button button6=new Button("��ư-6");
		
		//�������� ��ġ�����ڸ� FlowLayout���� ����
		// => GridLayout(int row, int col) : ��� ���� ������ �����Ͽ� �ν��Ͻ��� �����ϴ� ������
		setLayout(new GridLayout(3, 2));
		
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
		new GridLayoutApp("GridLayout");
	}
}