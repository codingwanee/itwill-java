package site.itwill.awt;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.TextArea;
import java.awt.event.KeyEvent;

public class MenuBarApp extends Frame {
	private static final long serialVersionUID = 1L;

	/**
	 * @param title
	 */
	public MenuBarApp(String title) {
		super(title);
		
		//MenuBar Ŭ���� : �޴��� �����ϱ� ���� ���۳�Ʈ - ������ ����
		MenuBar mb=new MenuBar();
		
		//Menu Ŭ���� : �޴��������� �����ϱ� ���� ���۳�Ʈ - �޴��� ����
		Menu file=new Menu("����");
		Menu help=new Menu("����");
		
		//MenuItem Ŭ���� : ���� ����� �����ϱ� ���� ���۳�Ʈ - �޴� ����
		//MenuShortcut Ŭ���� : ����Ű ����� �����ϱ� ���� Ŭ���� - Ctrl + Key(int)
		//KeyEvent Ŭ���� : Ű���� ���� ������ ������ ������ Ŭ���� - ����ʵ�� Ű���� ���� ǥ��
		MenuItem open=new MenuItem("����", new MenuShortcut(KeyEvent.VK_O));
		MenuItem save=new MenuItem("����", new MenuShortcut(KeyEvent.VK_S));
		MenuItem exit=new MenuItem("������");
		
		MenuItem view=new MenuItem("���� ����");
		MenuItem info=new MenuItem("���α׷� ����");
		
		//�޴��� �޴��������� ���ʴ�� ����
		file.add(open);
		file.add(save);
		//Menu.addSeparator() : �޴��� ���м��� �����ϴ� �޼ҵ�
		file.addSeparator();
		file.add(exit);
		
		help.add(view);
		help.addSeparator();
		help.add(info);
		
		//�޴��ٿ� �޴��� ���ʴ�� ����
		mb.add(file);
		mb.add(help);
		
		//Frame.setMenuBar(MenuBar bar) : �������� �޴��ٸ� �����ϴ� �޼ҵ�
		setMenuBar(mb);
		
		TextArea area=new TextArea();
		area.setFont(new Font("����", Font.PLAIN, 16));
		add(area);
		
		setBounds(300, 100, 800, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuBarApp("MenuBar");
	}
}
