package basic;

public class SwitchApp {
	public static void main(String[] args) {
		int choice=1;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		}
		System.out.println("============================================");
		choice=2;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		}
		System.out.println("============================================");
		choice=3;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		}
		System.out.println("============================================");
		choice=4;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		}
		System.out.println("============================================");
		choice=5;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
		default:
			System.out.println("������ �̵��մϴ�.");
		}
		System.out.println("============================================");
		choice=1;
		System.out.println("choice = "+choice);
		
		switch(choice) {
		case 1:
			System.out.println("�������� �̵��մϴ�.");
			break;
		case 2:
			System.out.println("�ݼ����� �̵��մϴ�.");
			break;
		case 3:
			System.out.println("ȭ������ �̵��մϴ�.");
			break;
		default:
			System.out.println("������ �̵��մϴ�.");
		}

		System.out.println("============================================");
		int age=27;
		
		//����� ���̿� ���� ���ɴ븦 ����Ͽ� ����ϼ���.(10�� ~ 40��)
		switch(age/10) {
		case 1:
			System.out.println("[���]����� "+age+"���̹Ƿ� 10���Դϴ�.");
			break;
		case 2:
			System.out.println("[���]����� "+age+"���̹Ƿ� 20���Դϴ�.");
			break;
		case 3:
			System.out.println("[���]����� "+age+"���̹Ƿ� 30���Դϴ�.");
			break;
		case 4:
			System.out.println("[���]����� "+age+"���̹Ƿ� 40���Դϴ�.");
			//break;
		}
		System.out.println("============================================");
		int num1=20,num2=10;
		String operator="*";
		int result=0;
		
		//JDK1.7 �̻󿡼��� ���ڿ� �� ����
		switch(operator) {
			case "*": result=num1*num2; break;
			case "/": result=num1/num2; break;
			case "+": result=num1+num2; break;
			case "-": result=num1-num2; break;
		}
		
		System.out.println("[���]"+num1+" "+operator+" "+num2+" = "+result);
		System.out.println("============================================");
	}
}
