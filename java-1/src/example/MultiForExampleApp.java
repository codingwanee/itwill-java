package example;

public class MultiForExampleApp {
	public static void main(String[] args) {
		//�ڡڡڡڡ�   i=1   ��=5   
		//�ڡڡڡ�     i=2   ��=4 
		//�ڡڡ�       i=3   ��=3
		//�ڡ�         i=4   ��=2
		//��           i=5   ��=1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");

		//�ڡڡڡڡ�   i=5   ��=5   
		//�ڡڡڡ�     i=4   ��=4 
		//�ڡڡ�       i=3   ��=3
		//�ڡ�         i=2   ��=2
		//��           i=1   ��=1
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		//�ڡڡڡڡ�   i=1   �ϾẰ=0   ������=5   
		//�١ڡڡڡ�   i=2   �ϾẰ=1   ������=4
		//�١١ڡڡ�   i=3   �ϾẰ=2   ������=3
		//�١١١ڡ�   i=4   �ϾẰ=3   ������=2
		//�١١١١�   i=5   �ϾẰ=4   ������=1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("��");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");

		// 1 2 3 4 5 >> j
		//�ڡڡڡڡ�   i=1   
		//�١ڡڡڡ�   i=2
		//�١١ڡڡ�   i=3
		//�١١١ڡ�   i=4
		//�١١١١�   i=5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) System.out.print("��");
				else System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		//�١١١١�           i=1   �ϾẰ=4   ������=1
		//�١١١ڡڡ�         i=2   �ϾẰ=3   ������=3
		//�١١ڡڡڡڡ�       i=3   �ϾẰ=2   ������=5
		//�١ڡڡڡڡڡڡ�     i=4   �ϾẰ=1   ������=7
		//�ڡڡڡڡڡڡڡڡ�   i=5   �ϾẰ=0   ������=9
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("��");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		// 1 2 3 4 5 >> j
		//�ڡ١١١�   i=1
		//�١ڡ١ڡ�   i=2
		//�١١ڡ١�   i=3
		//�١ڡ١ڡ�   i=4
		//�ڡ١١١�   i=5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==6) System.out.print("��");
				else System.out.print("��");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		//A
		//BC
		//DEF
		//GHIJ
		char mun='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(mun);
				mun++;
			}	
			System.out.println();
		}
		System.out.println("============================================");
	}
}