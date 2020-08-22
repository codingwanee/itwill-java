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
		
		//MenuBar 클래스 : 메뉴를 부착하기 위한 컴퍼넌트 - 프레임 부착
		MenuBar mb=new MenuBar();
		
		//Menu 클래스 : 메뉴아이템을 부착하기 위한 컴퍼넌트 - 메뉴바 부착
		Menu file=new Menu("파일");
		Menu help=new Menu("도움말");
		
		//MenuItem 클래스 : 선택 기능을 제공하기 위한 컴퍼넌트 - 메뉴 부착
		//MenuShortcut 클래스 : 단축키 기능을 제공하기 위한 클래스 - Ctrl + Key(int)
		//KeyEvent 클래스 : 키보드 관련 정보를 저장할 목적의 클래스 - 상수필드로 키보드 정보 표현
		MenuItem open=new MenuItem("열기", new MenuShortcut(KeyEvent.VK_O));
		MenuItem save=new MenuItem("저장", new MenuShortcut(KeyEvent.VK_S));
		MenuItem exit=new MenuItem("끝내기");
		
		MenuItem view=new MenuItem("도움말 보기");
		MenuItem info=new MenuItem("프로그램 정보");
		
		//메뉴에 메뉴아이템을 차례대로 부착
		file.add(open);
		file.add(save);
		//Menu.addSeparator() : 메뉴에 구분선을 부착하는 메소드
		file.addSeparator();
		file.add(exit);
		
		help.add(view);
		help.addSeparator();
		help.add(info);
		
		//메뉴바에 메뉴를 차례대로 부착
		mb.add(file);
		mb.add(help);
		
		//Frame.setMenuBar(MenuBar bar) : 프레임의 메뉴바를 변경하는 메소드
		setMenuBar(mb);
		
		TextArea area=new TextArea();
		area.setFont(new Font("굴림", Font.PLAIN, 16));
		add(area);
		
		setBounds(300, 100, 800, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuBarApp("MenuBar");
	}
}
