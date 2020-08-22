package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public BorderLayoutApp(String title) {
		super(title);
		
		Button button1=new Button("��ư-1");
		Button button2=new Button("��ư-2");
		Button button3=new Button("��ư-3");
		Button button4=new Button("��ư-4");
		Button button5=new Button("��ư-5");
		
		/*
		BorderLayout layout=new BorderLayout();
		setLayout(layout);//�������� ��ġ�����ڸ� BorderLayout���� ����
		*/
		
		//Frame�� �⺻ ��ġ�����ڰ� BorderLayout�̹Ƿ� ��ġ������ ���� ���ʿ� 
		//setLayout(new BorderLayout());
		
		//Container.add(Component c, String index) : ���ϴ� ��ġ(��,��,��,��,�߾�)�� ���۳�Ʈ �����ϴ� �޼ҵ�
		// => ��ġ�����ڰ� BorderLayout�� ��쿡�� ����ϴ� �޼ҵ�
		// => ��ġ�� ���� ���ڿ��� BorderLayout Ŭ������ ����ʵ带 ����ϴ� ���� ����
		// => �߾Ӹ� ������ ��ġ�� ���� ����
		add(button1, BorderLayout.WEST);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);
		
		setBounds(500, 100, 400, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BorderLayoutApp("BorderLayout");
	}
}





