package site.itwill.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//�̺�Ʈ ���α׷� �ۼ��ϴ� ���

//1.���۳�Ʈ(�����̳�)�� �̿��Ͽ� ������ Ŭ���� �ۼ� - ������ ���� 
// => ���۳�Ʈ(�����̳�)������ �پ��� �̺�Ʈ �߻� - �̺�Ʈ �ҽ�

//2.�̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��쿡 ���� �̺�Ʈ ó�� ������ Ŭ���� �ۼ� - �̺�Ʈ �ڵ鷯
// => �߻��� �̺�Ʈ ó���� �������� �ϴ� ������ �������̽��� ��ӹ޾� �ۼ�
// => XXXEvent Ŭ������ ������ �̺�Ʈ�� ó���ϱ� ���� XXXListener �������̽��� ���� 
//    ex) ActionEvent Ŭ������ �̺�Ʈ ó���� ���� ActionListener �������̽��� ��ӹ޴� �̺�Ʈ �ڵ鷯 �ۼ�
// => ������ �������̽��� �߻�޼ҵ带 �������̵� �����Ͽ� �̺�Ʈ ó�� ��� �ۼ�

//3.�̺�Ʈ �ҽ����� �̺�Ʈ�� �߻��� ��� �̺�Ʈ ó�� �ڵ鷯�� ���۵ǵ��� ����
// => �̺�Ʈ �ڵ鷯�� ó�� �޼ҵ� �ڵ� ȣ��Ǿ� �̺�Ʈ ó��
public class EventHandlerApp extends Frame {
	private static final long serialVersionUID = 1L;

	public EventHandlerApp(String title) {
		super(title);
		
		//��ư�� ���� ��� ActionEvent �߻�
		Button exit=new Button("���α׷� ����");
		setLayout(new FlowLayout());		
		add(exit);
		
		//Button.addActionListener(ActionListener listener) : ActionListener
		//�������̽��� ��ӹ��� �ڽ�Ŭ������ �ν��Ͻ��� �����Ͽ� ��ư����
		//�߻��� �׼��̺�Ʈ�� ó���ǵ��� �̺�Ʈ �ڵ鷯 ���
		// => �̺�Ʈ�� �߻��� ��� �ڵ����� ��ϵ� �̺�Ʈ �ڵ鷯�� �޼ҵ� ȣ��
		exit.addActionListener(new ExitButtonEventHandler());
		
		setBounds(500, 100, 300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventHandlerApp("EventHandler");
	}
}

//ActionEvent�� ó���ϱ� ���� �̺�Ʈ �ڵ鷯 Ŭ����
// => ������ Ŭ������ ���۳�Ʈ ���� �Ұ���
class ExitButtonEventHandler implements ActionListener {
	//Listener �������̽��� �߻�޼ҵ带 �������̵� ���� - �̺�Ʈ ó�� ����
	// => �ش� �̺�Ʈ�� �߻��� ��� �ڵ� ȣ��
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.exit(int status) : ���α׷��� �����ϴ� ��� �����带 �����ϴ� �޼ҵ�
		// => ���α׷� ���� �޼ҵ�
		System.exit(0);
	}
}
