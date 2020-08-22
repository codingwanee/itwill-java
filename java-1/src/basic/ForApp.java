package basic;

public class ForApp {
	public static void main(String[] args) {
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("Java Programming");
		System.out.println("============================================");
		
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		//for ����� ������ 1 ����(�ʱ��) �� X����(���ǽ�) 1�� ����(������)�ϸ� X�� �ݺ� ó�� 
		for(int i=1;i<=5;i++) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		for(int i=5;i>=1;i--) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"Java Programming"�� ȭ�鿡 5�� ����ϼ���.
		for(int i=1;i<=10;i+=2) {
			System.out.println("Java Programming");
		}
		System.out.println("============================================");
		
		//"1    2    3    4    5"�� ȭ�鿡 ����ϼ���.
		for(int i=1;i<=5;i++) {
			System.out.print(i+"\t");
		}
		System.out.println();//Enter
		System.out.println("============================================");
		
		//"5    4    3    2    1"�� ȭ�鿡 ����ϼ���.
		/*
		for(int i=1;i<=5;i++) {
			System.out.print((6-i)+"\t");
		}
		*/
		for(int i=5;i>=1;i--) {
			System.out.print(i+"\t");
		}
		System.out.println();
		System.out.println("============================================");
		
		//"1    3    5    7    9"�� ȭ�鿡 ����ϼ���.
		/*
		for(int i=1;i<=10;i+=2) {
			System.out.print(i+"\t");
		}
		*/
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}
		}
		System.out.println();
		System.out.println("============================================");
		
		//1~100 ������ �������� �հ踦 ����Ͽ� ����ϼ���.
		// => 1+2+3+...+98+99+100 = ?
		int tot=0;
		for(int i=1;i<=100;i++) {
			tot+=i;
		}
		System.out.println("1~100 ������ �������� �հ� = "+tot);
		System.out.println("============================================");
		
		//A~Z ������ ���ĺ��� ����ϼ���.
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("============================================");

		//�� ���������� ����� ��� ���̿� �����ϴ� 5�� ����� ������ ����Ͽ� ����ϼ���.
		//int begin=27,last=88;
		int begin=88,last=27;
				
		if(begin>last) {
			/*
			System.out.println("[����]���� �Է°��� ������ �Է°����� �۾ƾ� �˴ϴ�.");
			System.exit(0);
			*/
			
			//�� ������ ����� ����� ���� �ٲپ� ���� - ġȯ �˰���(Swap Algorithm)
			int temp=begin;
			begin=last;
			last=temp;
		}
		
		int cnt=0;
		for(int i=begin;i<=last;i++) {
			if(i%5==0) cnt++;
		}
		System.out.println(begin+" ~ "+last
				+" ������ ���� �� 5�� ����� ���� = "+cnt);
		System.out.println("============================================");
		
		for(int i=1,j=5;i<=3;i++,j--) {
			System.out.println("i = "+i+", j = "+j);
		}
		System.out.println("============================================");

		int i=1;
		for(;i<=4;i++) {
			System.out.print(i+"  ");
		}
		//i=5;
		for(;i>=1;i--) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		/*
		for(;;) {
			System.out.println("���� �ݺ��Ǵ� ���");
		}
		*/
		//System.out.println("============================================");
	}
}