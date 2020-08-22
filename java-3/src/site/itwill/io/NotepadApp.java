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

//�ؽ�Ʈ ���� ���� ���α׷� - �޸���
public class NotepadApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JMenuItem init, open, save, exit;
	private JTextArea area;
	private FileDialog openDialog, saveDialog;
	
	//�������� ������ ��θ� �����ϱ� ���� �ʵ�
	private String filePath;
	
	//JTextArea ���۳�Ʈ�� ���� ���� ���¸� �����ϱ� ���� �ʵ�
	// => false : �̺���, true : ���� 
	private boolean state;
	
	public NotepadApp(String title) {
		super(title);
		
		JMenuBar bar=new JMenuBar();
		JMenu menu=new JMenu("����(F)");
		menu.setMnemonic('F');
		
		init=new JMenuItem("���� �����(N)", 'N');
		open=new JMenuItem("����(O)", 'O');
		save=new JMenuItem("����(S)", 'S');
		exit=new JMenuItem("������(X)", 'X');
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
		area.setFont(new Font("����", Font.PLAIN, 16));
		JScrollPane pane=new JScrollPane(area);
		getContentPane().add(pane, BorderLayout.CENTER);
		
		//���� �� ���� ���� FileDialog ���۳�Ʈ ����
		openDialog=new FileDialog(this, "����", FileDialog.LOAD);
		saveDialog=new FileDialog(this, "����", FileDialog.SAVE);
	
		init.addActionListener(this);
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
		//JTextArea ���۳�Ʈ���� Ű���� ���� �̺�Ʈ�� �߻��� ��� ó���� �̺�Ʈ �ڵ鷯 ���
		area.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				//�̺�Ʈ�� �߻��� Ű���� ���ڰ��� NULL ���ڰ� �ƴ� ��� �ʵ尪 ����
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
		new NotepadApp("���� ���� - �޸���");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object eventSource=e.getSource();
		
		if(eventSource==init) {
			if(saveConfirm()) {
				//JTextArea ���۳�Ʈ �ʱ�ȭ
				area.setText("");
				//JFrame ���۳�Ʈ�� ���� �ʱ�ȭ
				setTitle("���� ���� - �޸���");
				//�������� ���ϰ���� �����ϴ� �ʵ� �ʱ�ȭ
				filePath=null;
				//���� ���� ���������� �����ϴ� �ʵ� �ʱ�ȭ
				state=false;
			}
		} else if(eventSource==open) {
			if(!saveConfirm()) return;
			
			//���� ���� FileDialog ���۳�Ʈ�� ȭ�鿡 ���
			// => FileDialog ���۳�Ʈ���� ������ �����ϰų� ����� ��� FileDialog ���۳�Ʈ�� �ڵ����� ��������. 
			openDialog.setVisible(true);
			
			//FileDialog ���۳�Ʈ���� [���]�� ������ ��� �޼ҵ� ����
			if(openDialog.getFile()==null) return;
			
			//FileDialog ���۳�Ʈ���� ������ ���Ͽ� ���� ���ϰ�θ� �ʵ忡 ����
			filePath=openDialog.getDirectory()+openDialog.getFile();
			
			//JFrame ���۳�Ʈ�� ���� ����
			setTitle(openDialog.getFile()+" - �޸���");
			
			//JTextArea ���۳�Ʈ �ʱ�ȭ
			area.setText("");
			
			try {
				//���ϰ�θ� �����Ͽ� ���� �Է½�Ʈ���� �����Ͽ� Ȯ��
				BufferedReader in=new BufferedReader(new FileReader(filePath));
				
				//���Ͽ� ����� ������ ���پ� �о� JTextArea ���۳�Ʈ�� �߰�
				while(true) {
					//������������ ���ϳ����� �о�� ��ȯ - �� �پ� �о�� ����
					String text=in.readLine();
					if(text==null) break;
					area.append(text+"\n");
				}
				in.close();//���� �Է½�Ʈ�� ����
			} catch (FileNotFoundException exception) {
				JOptionPane.showMessageDialog(this
					, "������ ������ �������� �ʽ��ϴ�.", "����", JOptionPane.ERROR_MESSAGE);
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			
		} else if(eventSource==save) {
			//JTextArea ���۳�Ʈ�� ���ڿ��� ���� ���ϴ� ���Ͽ� ����
			if(filePath==null) {//�������� ������ �������� �ʴ� ���
				//���� ���� FileDialog ���۳�Ʈ�� ȭ�鿡 ���
				saveDialog.setVisible(true);//���� ���ϸ� �Է�
				
				//FileDialog.getFile() : ������ ���ϸ��� ��ȯ�ϴ� �޼ҵ�
				if(saveDialog.getFile()==null) return;//��Ҹ� ������ ��� �޼ҵ� ����
			
				//������ ������ ��θ� �ʵ忡 ���� - �������� ����
				//FileDialog.getDirectory() : ������ ������ �����ϴ� ���丮�� ��ȯ�ϴ� �޼ҵ�
				filePath=saveDialog.getDirectory()+saveDialog.getFile();
				
				//JFrame ���۳�Ʈ�� ���� ����
				setTitle(saveDialog.getFile()+" - �޸���");
			}
			
			try {
				//������ ������ ��θ� �����Ͽ� ���� ��½�Ʈ���� �����Ͽ� Ȯ��
				BufferedWriter out=new BufferedWriter(new FileWriter(filePath));
				
				//JTextArea ���۳�Ʈ�� ��� ���ڿ��� ��ȯ�޾� ����
				String text=area.getText();
				//Windows �ü�������� Enter�� "\n"�� �ƴ� "\r\n"���� ǥ��
				//String text=area.getText().replace("\n", "\r\n");
				
				//���ڿ��� ���� ��½�Ʈ������ ���� >> ����
				out.write(text);
				
				out.close();//���� ��½�Ʈ�� ����
				
				state=false;
			} catch (IOException exception) {
				exception.printStackTrace();
			}
			
		} else if(eventSource==exit) {
			if(saveConfirm()) System.exit(0);
		}
	}
	
	//JTextArea ���۳�Ʈ�� ������ ����� ��� Ư�� �̺�Ʈ���� JTextArea ���۳�Ʈ��
	//���泻�뿡 ���� ���� ������ ���� ó���ϱ� ���� �޼ҵ�
	// => ��ȯ�� - false : ��� ����, true : ���� �Ǵ� ������
	private boolean saveConfirm() {
		if(state) {//JTextArea ���۳�Ʈ�� ������ ����� ���
			//JOptionPane.showConfirmDialog(Component parent, String message, String title, int option)
			// => ���� ���̾�α׸� ����ϴ� �޼ҵ� >> ���� ����� ��ȯ
			int choice=JOptionPane.showConfirmDialog(this
				, "����� ������ ���� �Ͻðڽ��ϱ�?", "Ȯ��"
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
