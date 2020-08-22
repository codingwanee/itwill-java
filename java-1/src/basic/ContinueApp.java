package basic;

public class ContinueApp {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3) continue;
			System.out.println("i = "+i);
		}
		System.out.println("============================================");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) continue;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");
		
		loop:
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				//if(j==3) break; ��ɰ� ������ ����� ����
				if(j==3) continue loop;
				System.out.println("i = "+i+", j = "+j);
			}
		}
		System.out.println("============================================");

		//1~100 ������ �������� ¦������ �հ踦 ����Ͽ� ����ϼ���.
		int tot=0;
		for(int i=1;i<=100;i++) {
			if(i%2!=0) continue;
			tot+=i;
		}
		System.out.println("1~100 ������ ¦������ �հ� = "+tot);
		System.out.println("============================================");
	}
}
