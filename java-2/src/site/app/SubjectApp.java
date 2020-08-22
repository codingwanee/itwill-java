package site.app;

//import ����� �̿��Ͽ� ��Ű���� �����ϴ� �������� ���ǵ��� ó�� 
import site.itwill.subject.JavaSubject;
//��Ű���� �ٸ� ���� �̸��� �������� import ó�� �Ұ���
//import site.uniwill.subject.JavaSubject;
import site.itwill.subject.OracleSubject;
import site.uniwill.subject.SpringSubject;

public class SubjectApp {
	public static void main(String[] args) {
		//�������� ��Ű������ �����Ͽ� ǥ���Ͽ� ���
		// => ���� ��Ű���� ����� �������� ��Ű������ �����Ͽ� ǥ�� ����
		//site.itwill.subject.OracleSubject subject1=new site.itwill.subject.OracleSubject();
		
		//import ó���� �������� ��Ű������ �����Ͽ� ǥ��
		// => �ڵ��ϼ� ����� �̿��Ͽ� �������� �ۼ��� ��� �ڵ� import ó��
		OracleSubject subject1=new OracleSubject();
		subject1.display();
		
		SpringSubject subject2=new SpringSubject();
		subject2.display();
		
		//��Ű���� ���� �̸��� �������� ������ �� �����Ƿ� import ó�� ����
		JavaSubject subject3=new JavaSubject();
		subject3.display();
		
		//import ó�� �Ұ����� �������� ��Ű������ �����Ͽ� ǥ��
		site.uniwill.subject.JavaSubject subject4=new site.uniwill.subject.JavaSubject();
		subject4.display();
	}
}
