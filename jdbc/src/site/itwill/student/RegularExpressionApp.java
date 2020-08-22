package site.itwill.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//����ǥ����(Regular Expression) : ��Ÿ���ڸ� �̿��Ͽ� ������ ��Ģ�� ���ڿ� ǥ��
/*
^���ڿ� : ���ڿ��� ���۵��� �ǹ�
���ڿ�$ : ���ڿ��� ������� �ǹ�
. : ������ �� ���ڸ� �ǹ�(\ ���ڴ� ǥ�� �Ұ���)
[����1����2����3] : ������ ���ڵ� �� �ϳ��� �ǹ�
[^����1����2����3] : ������ ���ڵ��� �ƴ� �� �� �ϳ��� �ǹ�
[����1-����2] : ����1���� ����2������ ���� ���� �� �ϳ��� �ǹ�
(���ڿ�1|���ڿ�2) : ������ ���ڿ��� �� �ϳ��� �ǹ�
���ڿ�+ : ���ڿ��� 1���̻� �ݺ����� �ǹ�
���ڿ�* : ���ڿ��� 0���̻� �ݺ����� �ǹ�
���ڿ�? : ���ڿ��� 0�� �Ǵ� 1���� �������� �ǹ�
���ڿ�{����} : ���ڿ��� �ݺ�Ƚ���� ���ڸ�ŭ�� �ǹ�
���ڿ�{����1,����2} : ���ڿ��� �ݺ�Ƚ���� ����1���� ����2������ �ǹ�

\s : ������ �����ϴ� ���ڿ��� �ǹ�
\S : ������ �������� �ʴ� ���ڿ��� �ǹ�
\w : ���ĺ� �Ǵ� ����, _ ���ڷθ� ǥ���Ǵ� ���ڿ��� �ǹ�
\W : ���ĺ� �Ǵ� ����, _�� ������ ���ڷ� ǥ���Ǵ� ���ڿ��� �ǹ�
\d : ���������� ���ڷθ� ǥ���Ǵ� ���ڿ��� �ǹ�
\D : ���ڸ� ������ ���ڷθ� ǥ���Ǵ� ���ڿ��� �ǹ�
\��Ÿ���� : ��Ÿ���ڸ� ���ڷ� ǥ��(Escape Character)

(?!)���ڿ� : ���ڿ����� ��ҹ��ڸ� �������� ������ �ǹ�
(?=���ڿ�) : ���ڿ��� �����ϰ� ������ �ǹ�
(?!���ڿ�) : ���ڿ��� �����ϰ� ���� ���� �ǹ�
*/

//Ű����� ���ڿ��� �Է¹޾� ����ǥ�������� ��ȿ�� �˻� �� ����� ����ϴ� ���α׷�
public class RegularExpressionApp {
	public static void main(String[] args) throws Exception {
		//Ű����� ���ڿ��� �Է¹ޱ� ���� �Է½�Ʈ�� ����
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		/*
		//Ű����� ���̵� �Է¹޾� �Է°��� ���� ��ȿ�� �˻�
		// => �����ڷ� ���۵Ǹ� ������,����,_�� �������� 6~20 ������ ���ڷ� ǥ��
		System.out.print("���̵� �Է� >> ");
		String id=br.readLine();
		
		//Pattern Ŭ���� : ����ǥ������ �����ϱ� ���� Ŭ����
		//Pattern.compile(String regex) : ���ڿ��� ���޹޾� Pattern 
		//�ν��Ͻ��� ����ǥ�������� ��ȯ �����Ͽ�  ��ȯ�ϴ� �޼ҵ�
		//Pattern idPattern=Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{5,19}");
		Pattern idPattern=Pattern.compile("^[a-zA-Z]\\w{5,19}");
		
		//Pattern.matcher(String input) : ���ڿ��� ���޹޾� Pattern �ν��Ͻ��� 
		//����ǥ���İ� ���ϱ� ���� Matcher �ν��Ͻ��� ��ȯ���� �޼ҵ�
		//Matcher Ŭ���� : ����ǥ���İ� ���ڿ��� ���ϱ� ���� ����� �����ϴ� Ŭ���� 
		Matcher idMatcher=idPattern.matcher(id);
		//Matcher.matches() : ����ǥ���İ� ���ڿ��� ��ü ���Ͽ� ������
		//�ٸ� ��� false, ���� ��� true ��ȯ�ϴ� �޼ҵ� 
		if(idMatcher.matches()) {
			System.out.println("[���]�ùٸ� ������ ���̵� �Է� �Ͽ����ϴ�.");
		} else {
			System.out.println("[���]�߸��� ������ ���̵� �Է� �Ͽ����ϴ�.");
		}
		*/
		
		/*
		//Ű����� ��й�ȣ�� �Է¹޾� �Է°��� ���� ��ȿ�� �˻�
		// => ������,����,Ư�����ڸ� �ݵ�� 1���̻� �����Ͽ� �Է��ϸ� 8~30 ������ ���� ǥ�� 
		System.out.print("��й�ȣ �Է� >> ");
		String passwd=br.readLine();
		
		Pattern passwdPattern=Pattern.compile("^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_-]).{8,30}");
		Matcher passwdMatcher=passwdPattern.matcher(passwd);
		if(passwdMatcher.matches()) {
			System.out.println("[���]�ùٸ� ������ ��й�ȣ�� �Է� �Ͽ����ϴ�.");
		} else {
			System.out.println("[���]�߸��� ������ ��й�ȣ�� �Է� �Ͽ����ϴ�.");
		}
		*/
		
		/*
		//Ű����� �̸��� �Է¹޾� �Է°��� ���� ��ȿ�� �˻�
		// => �ѱ۸� �Է� �����ϸ� 2~5 ������ ���� ǥ�� 
		System.out.print("�̸� �Է� >> ");
		String name=br.readLine();
		
		Pattern namePattern=Pattern.compile("^[��-�R]{2,5}$");
		Matcher nameMatcher=namePattern.matcher(name);
		if(nameMatcher.matches()) {
			System.out.println("[���]�ùٸ� ������ �̸��� �Է� �Ͽ����ϴ�.");
		} else {
			System.out.println("[���]�߸��� ������ �̸��� �Է� �Ͽ����ϴ�.");
		}
		*/
		
		//Ű����� �̸����� �Է¹޾� �Է°��� ���� ��ȿ�� �˻�
		// => [���̵�@������] ������ ���ڿ� 
		System.out.print("�̸��� �Է� >> ");
		String email=br.readLine();
		
		Pattern emailPattern=Pattern.compile("^([a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+(\\.[a-zA-Z0-9-]+)+)*$");
		Matcher emailMatcher=emailPattern.matcher(email);
		if(emailMatcher.matches()) {
			System.out.println("[���]�ùٸ� ������ �̸����� �Է� �Ͽ����ϴ�.");
		} else {
			System.out.println("[���]�߸��� ������ �̸����� �Է� �Ͽ����ϴ�.");
		}
	}
}
