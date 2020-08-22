package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class ComponentAddApp extends Frame {
	private static final long serialVersionUID = 1L;

	public ComponentAddApp(String title) {
		super(title);
		
		//Button(String label) : ���� �ο��� ��ư ���۳�Ʈ�� �����ϱ� ���� ������
		Button button=new Button("��ư");
		
		//Container.add(Component c) : ���۳�Ʈ�� ���޹޾� �����̳ʿ� �����ϴ� �޼ҵ�
		add(button);//��ư�� �����ӿ� ����
		
		setBounds(500, 100, 300, 300);
		setVisible(true);//������ ��� >> �����ӿ� ���ӵ� ���۳�Ʈ�� ���� ���
	}
	
	public static void main(String[] args) {
		new ComponentAddApp("���۳�Ʈ ����");
	}
}
