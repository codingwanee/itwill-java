package site.itwill.io;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

//텍스트 파일 편집 프로그램 - 메모장
public class NotepadApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JMenuItem init, open, save, exit;
	private JTextArea area;
	private FileDialog openDialog, saveDialog;
	
	//편집중인 파일의 경로를 저장하기 위한 필드
	private String filePath;
	
	//JTextArea 컴퍼넌트의 내용 변경 상태를 저장하기 위한 필드
	// => false : 미변경, true : 변경 
	private boolean state;
	
	public NotepadApp(String title) {
		super(title);
		
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("파일(F)");
		menu.setMnemonic('F');
		
		init=new JMenuItem("새로 만들기(N)", 'N');
		open=new JMenuItem("열기(O)", 'O');
		save=new JMenuItem("저장(S)", 'S');
		exit=new JMenuItem("끝내기(X)", 'X');
		init.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_MASK));
		open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));

		menu.add(init);
		menu.add(open);
		menu.add(save);
		menu.addSeparator();
		menu.add(exit);
		bar.add(menu);
		setJMenuBar(bar);
		
		area=new JTextArea();
		area.setFont(new Font("굴림", Font.PLAIN, 16));
		JScrollPane pane=new JScrollPane(area);
		getContentPane().add(pane, BorderLayout.CENTER);
		
		//열기 및 저장 관련 FileDialog 컴퍼넌트 생성
		openDialog=new FileDialog(this, "열기", FileDialog.LOAD);
		saveDialog=new FileDialog(this, "저장", FileDialog.SAVE);
	
		init.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		//JTextArea 컴퍼넌트에서 키보드 관련 이벤트가 발생된 경우 처리할 이벤트 핸들러 등록
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//이벤트를 발생한 키보드 문자값이 NULL 문자가 아닌 경우 필드값 변경
				if(e.getKeyChar()!='\0') {
					state=true;
				}
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if(saveConfirm()) System.exit(0);
			}
		});
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setBounds(150, 50, 1000, 600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NotepadApp("제목 없음 - 메모장");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource=e.getSource();
		
		if(eventSource==init) {
			if(saveConfirm()) {
				//JTextArea 컴퍼넌트 초기화
				area.setText("");
				//JFrame 컴퍼넌트의 제목 초기화
				setTitle("제목 없음 - 메모장");
				//편집중인 파일경로을 저장하는 필드 초기화
				filePath=null;
				//변경 유무 상태정보를 저장하는 필드 초기화
				state=false;
			}
		} else if(eventSource==open) {
			if(!saveConfirm()) return;
			
			//열기 관련 FileDialog 컴퍼넌트를 화면에 출력
			// => FileDialog 컴퍼넌트에서 파일을 선택하거나 취소한 경우 FileDialog 컴퍼넌트는 자동으로 숨겨진다. 
			openDialog.setVisible(true);
			
			//FileDialog 컴퍼넌트에서 [취소]를 선택한 경우 메소드 종료
			if(openDialog.getFile()==null) return;
			
			//FileDialog 컴퍼넌트에서 선택한 파일에 대한 파일경로를 필드에 저장
			filePath=openDialog.getDirectory()+openDialog.getFile();
			
			//JFrame 컴퍼넌트의 제목 변경
			setTitle(openDialog.getFile()+" - 메모장");
			
			//JTextArea 컴퍼넌트 초기화
			area.setText("");
			
			try {
				//파일경로를 전달하여 파일 입력스트림을 생성하여 확장
				BufferedReader in=new BufferedReader(new FileReader(filePath));
				
				//파일에 저장된 내용을 한줄씩 읽어 JTextArea 컴퍼넌트에 추가
				while(true) {
					//엔터전까지의 파일내용을 읽어와 반환 - 한 줄씩 읽어와 저장
					String text=in.readLine();
					if(text==null) break;
					area.append(text+"\n");
				}
				in.close();//파일 입력스트림 제거
			} catch (FileNotFoundException exception) {
				JOptionPane.showMessageDialog(this
					, "선택한 파일이 존재하지 않습니다.", "에러", JOptionPane.ERROR_MESSAGE);
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			
		} else if(eventSource==save) {
			//JTextArea 컴퍼넌트의 문자열을 얻어와 원하는 파일에 저장
			if(filePath==null) {//편집중인 파일이 존재하지 않는 경우
				//저장 관련 FileDialog 컴퍼넌트를 화면에 출력
				saveDialog.setVisible(true);//저장 파일명 입력
				
				//FileDialog.getFile() : 선택한 파일명을 반환하는 메소드
				if(saveDialog.getFile()==null) return;//취소를 선택한 경우 메소드 종료
			
				//선택한 파일의 경로를 필드에 저장 - 편집중인 파일
				//FileDialog.getDirectory() : 선택한 파일이 존재하는 디렉토리를 반환하는 메소드
				filePath=saveDialog.getDirectory()+saveDialog.getFile();
				
				//JFrame 컴퍼넌트의 제목 변경
				setTitle(saveDialog.getFile()+" - 메모장");
			}
			
			try {
				//선택한 파일의 경로를 전달하여 파일 출력스트림을 생성하여 확장
				BufferedWriter out=new BufferedWriter(new FileWriter(filePath));
				
				//JTextArea 컴퍼넌트의 모든 문자열을 반환받아 저장
				String text=area.getText();
				//Windows 운영체제에서는 Enter를 "\n"이 아닌 "\r\n"으로 표현
				//String text=area.getText().replace("\n", "\r\n");
				
				//문자열을 파일 출력스트림으로 전달 >> 저장
				out.write(text);
				
				out.close();//파일 출력스트림 제거
				
				state=false;
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			
		} else if(eventSource==exit) {
			if(saveConfirm()) System.exit(0);
		}
	}
	
	//JTextArea 컴퍼넌트의 내용이 변경된 경우 특정 이벤트에서 JTextArea 컴퍼넌트의
	//변경내용에 대한 저장 유무를 선택 처리하기 위한 메소드
	// => 반환값 - false : 취소 선택, true : 저장 또는 미저장
	private boolean saveConfirm() {
		if(state) {//JTextArea 컴퍼넌트의 내용이 변경된 경우
			//JOptionPane.showConfirmDialog(Component parent, String message, String title, int option)
			// => 선택 다이얼로그를 출력하는 메소드 >> 선택 결과값 반환
			int choice=JOptionPane.showConfirmDialog(this
				, "변경된 내용을 저장 하시겠습니까?", "확인"
				, JOptionPane.YES_NO_CANCEL_OPTION);
			
			if(choice==JOptionPane.YES_OPTION) {
				if(filePath==null) {
					saveDialog.setVisible(true);
					if(saveDialog.getFile()==null) return false;
					filePath=saveDialog.getDirectory()+saveDialog.getFile();
				}
				try {
					BufferedWriter out=new BufferedWriter(new FileWriter(filePath));
					String text=area.getText();
					out.write(text);
					out.close();
				} catch (IOException exception) {
					exception.printStackTrace();
				}
			} else if(choice==JOptionPane.CANCEL_OPTION) {
				return false;
			}
		}
		return true;
	}

}
