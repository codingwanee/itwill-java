package site.itwill.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class PanelApp extends Frame {
	private static final long serialVersionUID = 1L;

	public PanelApp(String title) {
		super(title);
		
		//������ ���ʿ� ������ ���۳�Ʈ(�����̳�) ����
		Button red=new Button("������");
		Button green=new Button("�ʷϻ�");
		Button blue=new Button("�Ķ���");
		
		//Panel : ���۳�Ʈ�� �����ϱ� ���� �����̳� >> FlowLayout
		Panel panel=new Panel();
		
		//�гο� ���۳�Ʈ ����
		panel.add(red);
		panel.add(green);
		panel.add(blue);
		
		//������ �߾ӿ� ������ ���۳�Ʈ ����
		TextArea area=new TextArea();
		
		//������ ���ʿ� ������ ���۳�Ʈ ����
		TextField field=new TextField();
		
		//�����ӿ� ���۳�Ʈ(�����̳�) ����
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		add(field, BorderLayout.SOUTH);
	
		//Component.setFont(Font f) : Font �ν��Ͻ��� ���޹޾� ���۳�Ʈ�� ���� ���� �Ӽ��� �����ϴ� �޼ҵ�
		// => Font Ŭ���� : ���� ���� �Ӽ�����(�۲�, ��Ÿ��, ũ��, )�� ������ ������ Ŭ����
		// => �����̳ʿ��� �޼ҵ带 ȣ���� ��� ���ӵ� ���۳�Ʈ�� ����
		panel.setFont(new Font("����", Font.PLAIN, 16));
		area.setFont(new Font("����", Font.BOLD, 16));
		field.setFont(new Font("����", Font.BOLD+Font.ITALIC, 16));
		
		//Component.setForeground(Color c) : Color �ν��Ͻ��� ���޹޾� ���۳�Ʈ�� ������� �����ϴ� �޼ҵ�
		// => Color Ŭ���� : ��������(RED:0~255, GREEN:0~255, BLUE:0~255)�� ������ ������ Ŭ����
		// => �����̳ʿ��� �޼ҵ带 ȣ���� ��� ���ӵ� ���۳�Ʈ�� ������
		red.setForeground(new Color(255, 0, 0));
		green.setForeground(new Color(0, 255, 0));
		blue.setForeground(new Color(0, 0, 255));
		
		//Component.setBackground(Color c) : Color �ν��Ͻ��� ���޹޾� ���۳�Ʈ�� ������ �����ϴ� �޼ҵ�
		//Color Ŭ�������� ���� ���Ǵ� ������� ����ʵ�� ����Ǿ� ��� ���� 
		panel.setBackground(Color.GRAY);
		
		//Component.setEnabled(boolean b) : ���۳�Ʈ�� Ȱ�� �Ǵ� ��Ȱ���� �����ϴ� �޼ҵ�
		// => false : ��Ȱ��, true : Ȱ��(�⺻)
		red.setEnabled(false);
		
		//TextComponent.setEditable(boolean b) : �ؽ�Ʈ ���۳�Ʈ�� ���� ���� �Ǵ� ���� �Ұ����� �����ϴ� �޼ҵ�
		// => false : ���� �Ұ���, true : ���� ����(�⺻)
		//area.setEditable(false);
		
		//Component.setFocusable(boolean b) : ���۳�Ʈ�� ��Ŀ��(����) ��ġ ���� �Ǵ� ��Ŀ�� ��ġ �Ұ����� �����ϴ� �޼ҵ�
		// => false : ��Ŀ�� ��ġ �Ұ���, true : ��Ŀ�� ��ġ ����(�⺻)
		area.setFocusable(false);
		
		setBounds(500, 100, 300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelApp("Panel");
	}
}
