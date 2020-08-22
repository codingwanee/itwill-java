package site.itwill.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//프레임에 날짜와 시간을 출력하는 프로그램
public class DigitalClockApp extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel clockLabel;//출력 컴퍼넌트
	private JButton startBtn, stopBtn;
	
	//출력 컴퍼넌트를 변경하는 명령의 중지상태 또는 실행상태를 판단하기 위한 필드
	// => false : 중지상태, true : 실행상태(기본)
	private boolean isRun;
	
	public DigitalClockApp(String title) {
		super(title);
		
		isRun=true;
		
		clockLabel=new JLabel("",JLabel.CENTER);
		clockLabel.setFont(new Font("굴림", Font.BOLD, 30));
		clockLabel.setForeground(Color.DARK_GRAY);
		
		startBtn=new JButton("다시실행");
		stopBtn=new JButton("일시중지");
		JPanel panel=new JPanel();
		panel.add(startBtn);
		panel.add(stopBtn);
		panel.setFont(new Font("굴림", Font.BOLD, 20));
		startBtn.setEnabled(false);
		
		getContentPane().setBackground(Color.WHITE);
		getContentPane().add(clockLabel,BorderLayout.CENTER);
		getContentPane().add(panel,BorderLayout.SOUTH);
		
		//스레드 인스턴스로 새로운 스레드 생성하여 run() 메소드의 명령 실행
		new ClockThread().start();
		
		//버튼 이벤트에 대한 이벤트 핸들러 등록
		startBtn.addActionListener(new ButtonEventHandler());
		stopBtn.addActionListener(new ButtonEventHandler());
		
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(350, 100, 600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DigitalClockApp("DigitalClock");
	}
	
	//시스템 날짜와 시간정보를 1초마다 계속 제공받아 출력 컴퍼넌트를 변경하는 스레드 클래스
	public class ClockThread extends Thread {
		@Override
		public void run() {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			while(true) {
				if(isRun) {//실행상태인 경우 명령 실행
					/*
					Date now=new Date();
					String clock=sdf.format(now);
					clockLabel.setText(clock);
					*/
					clockLabel.setText(sdf.format(new Date()));
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	//버튼을 누른 경우 동작될 이벤트 핸들러 클래스
	public class ButtonEventHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			Object eventButton=e.getSource();
			
			if(eventButton==startBtn) {
				isRun=true;
				startBtn.setEnabled(false);
				stopBtn.setEnabled(true);
			} else if(eventButton==stopBtn) {
				isRun=false;
				startBtn.setEnabled(true);
				stopBtn.setEnabled(false);
			}
		}
	}
} 














