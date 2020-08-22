package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ �ڵ鷯 Ŭ������ ������ Ŭ���� �ȿ� ����Ŭ������ �����Ͽ� �ۼ�
// => ������ Ŭ������ ���۳�Ʈ ���� ���� - �̺�Ʈ ���� ���۳�Ʈ�� �ʵ�� ����
// => �̺�Ʈ �ҽ��� ���� ��� ���
public class EventInnerHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventInnerHandlerApp(String title) {
		super(title);
		
		Button exit=new Button("���α׷� ����");
		setLayout(new FlowLayout());		
		add(exit);
		
		//������ Ŭ������ �̺�Ʈ �ڵ鷯 Ŭ������ �̿��Ͽ� �ν��Ͻ� ���� ����
		exit.addActionListener(new ExitButtonEventHandler());
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventInnerHandlerApp("EventHandler");
	}
	
	//������ Ŭ������ �ʵ� �Ǵ� �޼ҵ带 ��� ����
	public class ExitButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}
}


