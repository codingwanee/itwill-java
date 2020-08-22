package site.itwill.awt;

import java.awt.Button;
import java.awt.Frame;

public class NonLayoutApp extends Frame {
	private static final long serialVersionUID = 1L;

	public NonLayoutApp(String title) {
		super(title);
		
		Button button1=new Button("��ư-1");
		Button button2=new Button("��ư-2");
		
		//Container.setLayout(LayoutManager layout) : �����̳��� ��ġ�����ڸ� �����ϴ� �޼ҵ�
		// => �Ķ���Ϳ� null�� �����Ͽ� �޼ҵ带 ȣ���� ��� ��ġ������ �̻��
		setLayout(null);//�������� ��ġ������ ����
		
		//��ġ�����ڸ� ������� ���� ��� ���۳�Ʈ�� ũ��� �����ġ �����ϰ� �����̳� ����
		button1.setBounds(80, 100, 50, 80);
		button2.setBounds(190, 130, 100, 120);
		
		add(button1);
		add(button2);
		
		setBounds(500, 100, 400, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NonLayoutApp("NonLayout");
	}
}
