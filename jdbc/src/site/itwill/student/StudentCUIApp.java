package site.itwill.student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//�л� ���� ���α׷� >> �޴� ���ÿ� ���� �л����� ����,����,����,�˻� ��� ���� : CUI
public class StudentCUIApp {
	//Ű����� ���ڿ��� �Է¹ޱ� ���� �Է½�Ʈ���� �����ϱ� ���� �ʵ�
	private BufferedReader br;
	
	public StudentCUIApp() {
		//Ű���� �Է½�Ʈ�� ���� �� ����
		br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] menu={"1.�л����� �߰�","2.�л����� ����","3.�л����� ����"
			,"4.�л��̸� �˻�","5.��ü�л� �˻�","6.���α׷� ����"};
		
		System.out.println("<<�л� ���� ���α׷�>>");
		
		//�޴� ���ÿ� ���� ��� ���� >> �ݺ� ó��
		while(true) {
			//�޴� ���
			for(String item:menu) {
				System.out.println(item);
			}
			
			//�޴� ���� >> �Է°��� ���� ��ȿ�� �˻�
			int choice;
			try {
				System.out.print("����[1~6] >> ");
				choice=Integer.parseInt(br.readLine());
				if(choice<1 || choice>6) throw new RuntimeException();
			} catch (Exception e) {
				System.out.println("[����]�޴��� �߸� ���� �Ͽ����ϴ�. �ٽ� ������ �ּ���.");
				System.out.println();
				continue;
			}
			
			if(choice==6) break;
			System.out.println();
			//���� �޴��� ���� ��� ���� >> �޼ҵ� ȣ��
			switch (choice) {
			case 1:	addStudent(); break;
			case 2:	modifyStudent(); break;
			case 3:	removeStudent(); break;
			case 4:	searchNameStudent(); break;
			case 5:	searchAllStudent(); break;
			}
			System.out.println();
		}
		System.out.println("[�޼���]�л� ���� ���α׷��� �����մϴ�.");
	}
	
	public static void main(String[] args) {
		new StudentCUIApp();
	}
	
	//[�л����� �߰�] �޴��� ������ ��� ȣ��Ǵ� �޼ҵ�
	// => Ű����� �л������� �Է¹޾� STUDENT ���̺� ���� �� ��� ���
	private void addStudent() {
		System.out.println("### �л����� �߰� ###");
		try {
			//Ű����� �й�,�̸�,��ȭ��ȣ,�ּ�,��������� �Է¹޾� ����
			// => �Է°��� ���� ��ȿ�� �˻� 
			int no;
			while(true) {
				System.out.print("�й� �Է� >> ");
				String temp=br.readLine();
			
				//�й��� �Է����� ���� ��� ���Է�
				if(temp.equals("")) {
					System.out.println("[�Է¿���]�й��� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				
				//�Է� �й��� 4�ڸ��� ���ڰ� �ƴ� ��� ���Է�
				//Pattern noP=Pattern.compile("[0-9]{4}");
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[�Է¿���]�й��� 4�ڸ� ���ڷθ� �Է� �����մϴ�.");
					continue;
				}
				
				//STUDENT ���̺� �̹� ����� �л������� ��� ���Է�
				// => �й��� ���� STUDENT ���̺��� �л����� ���� ���� �Ǵ� 
				no=Integer.parseInt(temp);
				//�й��� �����Ͽ� �л������� ��ȯ�ϴ� DAO Ŭ������ �޼ҵ� ȣ��
				// => �й��� �л������� ���� ��� null ��ȯ, �ִ� ��� �л����� ��ȯ
				StudentDTO student=StudentDAO.getStudentDAO().selectNoStudent(no);
				if(student!=null) {
					System.out.println("[�Է¿���]�̹� ������� �й��� �Է� �Ͽ����ϴ�.");
					continue;
				}
				break;
			}
			
			String name;
			while(true) {
				System.out.print("�̸� �Է� >> ");
				name=br.readLine();
				//�̸��� �Է����� ���� ��� ���Է�
				if(name.equals("")) {
					System.out.println("[�Է¿���]�̸��� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			String phone;
			while(true) {
				System.out.print("��ȭ��ȣ �Է� >> ");
				phone=br.readLine();
				//��ȭ��ȣ�� �Է����� ���� ��� ���Է�
				if(phone.equals("")) {
					System.out.println("[�Է¿���]��ȭ��ȣ�� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				
				Pattern phoneP=Pattern.compile("(01[016789])-\\d{3,4}-\\d{4}");
				Matcher phoneM=phoneP.matcher(phone);
				if(!phoneM.matches()) {
					System.out.println("[�Է¿���]��ȭ��ȣ�� ���Ŀ� �°� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			String address;
			while(true) {
				System.out.print("�ּ� �Է� >> ");
				address=br.readLine();
				//�ּҸ� �Է����� ���� ��� ���Է�
				if(address.equals("")) {
					System.out.println("[�Է¿���]�ּҸ� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			String birthday;
			while(true) {
				System.out.print("������� �Է� >> ");
				birthday=br.readLine();
				//��������� �Է����� ���� ��� ���Է�
				if(birthday.equals("")) {
					System.out.println("[�Է¿���]��������� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				
				Pattern birthdayP=Pattern.compile("(18|19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
				Matcher birthdayM=birthdayP.matcher(birthday);
				if(!birthdayM.matches()) {
					System.out.println("[�Է¿���]��������� ���Ŀ� �°� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			//StudentDTO �ν��Ͻ��� �����Ͽ� �Է°����� �ʵ尪 ���� >> �л�����
			StudentDTO student=new StudentDTO();
			student.setNo(no);
			student.setName(name);
			student.setPhone(phone);
			student.setAddress(address);
			student.setBirthday(birthday);
			
			//�л������� �����Ͽ� STUDENT ���̺� �����ϴ� DAO Ŭ������ �޼ҵ� ȣ��
			int rows=StudentDAO.getStudentDAO().insertStudent(student);
			
			//��ȯ���� ��� ���
			System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//[�л����� ����] �޴��� ������ ��� ȣ��Ǵ� �޼ҵ�
	// => �й��� �Է¹޾� STUDENT ���̺� ����� �л������� �˻��Ͽ� ��� ��
	//    �����ϰ��� �ϴ� �л������� �Է¹޾� STUDENT ���̺��� �л������� ���� �� ��� ���
	// => �й��� �л������� �������� ���� ��� �޼��� ��� >> �޼ҵ� ���� 
	private void modifyStudent() {
		System.out.println("### �л����� ���� ###");
		try {
			//Ű����� �й��� �Է¹޾� ���� 
			int no;
			while(true) {
				System.out.print("�й� �Է� >> ");
				String temp=br.readLine();
			
				if(temp.equals("")) {
					System.out.println("[�Է¿���]�й��� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[�Է¿���]�й��� 4�ڸ� ���ڷθ� �Է� �����մϴ�.");
					continue;
				}
				
				no=Integer.parseInt(temp);
				break;
			}
			
			//�й��� �����Ͽ� �л������� �˻��ϴ� DAO Ŭ������ �޼ҵ� ȣ��
			StudentDTO student=StudentDAO.getStudentDAO().selectNoStudent(no);
			
			if(student==null) {//�˻��� �л������� ���� ���
				System.out.println("[���]�����ϰ��� �ϴ� �л������� �������� �ʽ��ϴ�.");
				return;
			}
			
			//�˻��� �л����� ��� >> StudentDTO �ν��Ͻ��� �ʵ尪 ���
			System.out.println("==========================================================");
			System.out.println("�й�\t�̸�\t��ȭ��ȣ\t�ּ�\t\t�������");
			System.out.println("==========================================================");
			System.out.println(student.getNo()+"\t"
				+student.getName()+"\t"+student.getPhone()
				+"\t"+student.getAddress()+"\t"+student.getBirthday());
			System.out.println("==========================================================");
			
			System.out.println("[�޼���]���氪 �Է� >> �������� ���� ��� ���͸� �Է�");
			//Ű����� �л������� ���� ���氪(�̸�,��ȭ��ȣ,�ּ�,�������) �Է�
			System.out.print("�̸� �Է� >> ");
			String name=br.readLine();
			
			String phone;
			while(true) {
				System.out.print("��ȭ��ȣ �Է� >> ");
				phone=br.readLine();
				Pattern phoneP=Pattern.compile("(01[016789])-\\d{3,4}-\\d{4}");
				Matcher phoneM=phoneP.matcher(phone);
				if(!phone.equals("") && !phoneM.matches()) {
					System.out.println("[�Է¿���]��ȭ��ȣ�� ���Ŀ� �°� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			System.out.print("�ּ� �Է� >> ");
			String address=br.readLine();
			
			String birthday;
			while(true) {
				System.out.print("������� �Է� >> ");
				birthday=br.readLine();
				Pattern birthdayP=Pattern.compile("(18|19|20)\\d{2}-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])");
				Matcher birthdayM=birthdayP.matcher(birthday);
				if(!birthday.equals("") && !birthdayM.matches()) {
					System.out.println("[�Է¿���]��������� ���Ŀ� �°� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			//�˻��Ǿ� ��ȯ�� StudentDTO �ν��Ͻ��� �ʵ尪 ����
			// => ���氪�� �����ϴ� �ʵ尪�� ����
			if(!name.equals("")) student.setName(name);
			if(!phone.equals("")) student.setPhone(phone);
			if(!address.equals("")) student.setAddress(address);
			if(!birthday.equals("")) student.setBirthday(birthday);
			
			//�����ϰ��� �ϴ� �л������� �����Ͽ� STUDENT ���̺��� �л������� �����ϴ� DAO Ŭ������ �޼ҵ� ȣ��
			int rows=StudentDAO.getStudentDAO().updateStudent(student);
			
			//��ȯ ��� ���
			System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//[�л����� ����] �޴��� ������ ��� ȣ��Ǵ� �޼ҵ�
	// => Ű����� �й��� �Է¹޾� STUDENT ���̺� ����� �л������� ���� �� ��� ���
	// => �й��� �л������� �������� ���� ��� �޼��� ��� >> �޼ҵ� ����
	private void removeStudent() {
		System.out.println("### �л����� ���� ###");
		try {
			//Ű����� �й��� �Է¹޾� ���� 
			int no;
			while(true) {
				System.out.print("�й� �Է� >> ");
				String temp=br.readLine();
			
				if(temp.equals("")) {
					System.out.println("[�Է¿���]�й��� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				
				Pattern noP=Pattern.compile("\\d{4}");
				Matcher noM=noP.matcher(temp);
				if(!noM.matches()) {
					System.out.println("[�Է¿���]�й��� 4�ڸ� ���ڷθ� �Է� �����մϴ�.");
					continue;
				}
				
				no=Integer.parseInt(temp);
				break;
			}
			
			//�й��� �����Ͽ� STUDENT ���̺��� �л������� �����ϴ� DAO Ŭ������ �޼ҵ� ȣ��
			int rows=StudentDAO.getStudentDAO().deleteStudent(no);
			
			//��� ���
			if(rows>0) {//�������� ������ ���
				System.out.println("[���]"+rows+"���� �л������� ���� �Ͽ����ϴ�.");
			} else {//�������� �������� ���� ���
				System.out.println("[���]�����ϰ��� �ϴ� �л������� �������� �ʽ��ϴ�.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	//[�л��̸� �˻�] �޴��� ������ ��� ȣ��Ǵ� �޼ҵ�
	// => Ű����� �̸��� �Է¹޾� STUDENT ���̺��� �л������� �˻��Ͽ� ��ȯ�޾� ���
	// => �˻��� �л������� �������� ���� ��� �޼��� ��� >> �޼ҵ� ���� 
	private void searchNameStudent() {
		System.out.println("### �л��̸� �˻� ###");
		try {
			//Ű����� �̸��� �Է¹޾� ����
			String name;
			while(true) {
				System.out.print("�̸� �Է� >> ");
				name=br.readLine();
				//�̸��� �Է����� ���� ��� ���Է�
				if(name.equals("")) {
					System.out.println("[�Է¿���]�̸��� �ݵ�� �Է��� �ּ���.");
					continue;
				}
				break;
			}
			
			//�̸��� �����Ͽ� STUDENT ���̺� ����� �л������� �˻��Ͽ� ��ȯ�ϴ� DAO Ŭ������ �޼ҵ� ȣ��
			List<StudentDTO> studentList=StudentDAO.getStudentDAO().selectNameStudent(name);
			
			if(studentList.isEmpty()) {//�˻����� �������� ���� ���
				System.out.println("[���]�˻��� �л������� �������� �ʽ��ϴ�.");
				return;
			}
			
			//�˻����� ������ ��� ��� �л����� ��� >> �ݺ�ó��
			System.out.println("==========================================================");
			System.out.println("�й�\t�̸�\t��ȭ��ȣ\t�ּ�\t\t�������");
			System.out.println("==========================================================");
			for(StudentDTO student:studentList) {
				System.out.println(student.getNo()+"\t"
					+student.getName()+"\t"+student.getPhone()
					+"\t"+student.getAddress()+"\t"+student.getBirthday());
			}
			System.out.println("==========================================================");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//[��ü�л� �˻�] �޴��� ������ ��� ȣ��Ǵ� �޼ҵ�
	// => STUDENT ���̺� ����� ��� �л������� �˻��Ͽ� ���
	private void searchAllStudent() {
		//STUDENT ���̺� ����� ��� �л������� �˻��Ͽ� ��ȯ�ϴ� DAO Ŭ������ �޼ҵ� ȣ��
		List<StudentDTO> studentList=StudentDAO.getStudentDAO().selectAllStudent();

		if(studentList.isEmpty()) {//�˻����� �������� ���� ���
			System.out.println("[���]����� �л������� �������� �ʽ��ϴ�.");
			return;
		}
		
		//�˻����� ������ ��� ��� �л����� ��� >> �ݺ�ó��
		System.out.println("==========================================================");
		System.out.println("�й�\t�̸�\t��ȭ��ȣ\t�ּ�\t\t�������");
		System.out.println("==========================================================");
		for(StudentDTO student:studentList) {
			System.out.println(student.getNo()+"\t"
				+student.getName()+"\t"+student.getPhone()
				+"\t"+student.getAddress()+"\t"+student.getBirthday());
		}
		System.out.println("==========================================================");
	}	
}