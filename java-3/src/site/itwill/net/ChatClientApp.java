package site.itwill.net;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//ä�� Ŭ���̾�Ʈ ���α׷�
// => �������� ������ �޼����� ���� ���۳�Ʈ�� ��� - �ݺ�ó��
// => ���۳�Ʈ�� �޼����� �Է��Ͽ� ������ ���� - �̺�Ʈ �ڵ鷯
public class ChatClientApp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	private JTextField field;//�Է� ���۳�Ʈ
	private JTextArea area;//��� ���۳�Ʈ
	
	private Socket socket;//���� ���� ���������� �����ϱ� ���� �ʵ�
	private BufferedReader in;//�޼��� �Է½�Ʈ��
	private PrintWriter out;//�޼��� ��½�Ʈ��
	
	private String aliasName;//��ȭ���� �����ϱ� ���� �ʵ�
	
	public ChatClientApp(String title) {
		super(title);
		
		field=new JTextField();
		area=new JTextArea();
		
		JScrollPane pane=new JScrollPane(area);
		
		getContentPane().add(pane, BorderLayout.CENTER);
		getContentPane().add(field, BorderLayout.SOUTH);
		
		area.setFocusable(false);
		area.setFont(new Font("����", Font.BOLD, 20));
		field.setFont(new Font("����", Font.BOLD, 20));
		
		//�Է� ���۳�Ʈ���� �̺�Ʈ�� �߻��� ��� ó���� �̺�Ʈ �ڵ鷯 ���
		field.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(400, 50, 400, 500);
		setVisible(true);
		
		try {
			socket=new Socket("192.168.14.31", 5000);//���� ����
			
			//������ �Է½�Ʈ���� �����޾� Ȯ���Ͽ� �ʵ忡 ����
			in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//������ ��½�Ʈ���� �����޾� Ȯ���Ͽ� �ʵ忡 ����
			out=new PrintWriter(socket.getOutputStream(),true);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "������ ������ �� �����ϴ�."
					, "���ӿ���", JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		
		//��ȭ���� �Է¹޾� ���� ����
		while(true) {
			//�Է� ���̾�α׸� �̿��Ͽ� ��ȭ���� �Է¹޾� ���� 
			aliasName=JOptionPane.showInputDialog(this, "��ȭ���� �Է��� �ּ���."
					, "��ȭ�� �Է�", JOptionPane.QUESTION_MESSAGE);
			if(aliasName!=null && !aliasName.equals("")) break;
			JOptionPane.showMessageDialog(this, "��ȭ���� �ݵ�� �Է��� �ּ���."
					, "�Է¿���", JOptionPane.ERROR_MESSAGE);
		}	
		
		out.println(aliasName);
		
		//�������� ������ �޼����� ���� ���۳�Ʈ�� ��� - ���ѷ���
		while(true) {
			try {
				area.append(in.readLine()+"\n");
				//JTextArea.setCaretPosition(int position)
				// => JTextArea ���۳�Ʈ�� ��� ��ġ�� �����ϴ� �޼ҵ�
				area.setCaretPosition(area.getText().length());
			} catch (IOException e) {
				JOptionPane.showMessageDialog(this, "������ ������ ���������ϴ�."
					, "���ӿ���", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		}
	}
	
	public static void main(String[] args) {
		new ChatClientApp("ä�� ���α׷�");
	}

	//�̺�Ʈ ó�� >> ���۳�Ʈ���� �Էµ� �޼����� ���� ������ ����
	@Override
	public void actionPerformed(ActionEvent e) {
		//�Է� ���۳�Ʈ�� �޼����� ��ȯ�޾� ����
		String message=field.getText();
		
		if(!message.equals("")) {//�Է� �޼����� ������ ���
			//�Է� �޼����� ������ ����
			out.println(message);
			//�Է� ���۳�Ʈ �ʱ�ȭ
			field.setText("");
		}
	}
}






