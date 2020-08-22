package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ �ڵ鷯 Ŭ������ ������ Ŭ���� �ȿ� �̸��� ���� ����Ŭ����(Anonymous Inner Class)�� �����Ͽ� �ۼ�
// => �̺�Ʈ �߻� ���۳�Ʈ�� �̺�Ʈ ó�� �ڵ鷯 ��� �޼ҵ忡�� ���� �̺�Ʈ �ڵ鷯�� �ۼ�
// => �������̽��� ��ӹ��� �̸� ���� �ڽ�Ŭ������ �ν��Ͻ��� ���� ����
public class EventAnonymousInnerHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;
	
	public EventAnonymousInnerHandlerApp(String title) {
		super(title);
		
		Button exit=new Button("���α׷� ����");
		setLayout(new FlowLayout());		
		add(exit);
		
		//�������̽��� ��ӹ޾� �������̵� ������ �̸� ���� Ŭ������ �ν��Ͻ� ����
		// => �̺�Ʈ�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯�� ���
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setBounds(500, 100, 300, 300);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new EventAnonymousInnerHandlerApp("EventHandler");
	}
}




