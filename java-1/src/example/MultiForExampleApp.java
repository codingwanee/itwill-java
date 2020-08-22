package example;

public class MultiForExampleApp {
	public static void main(String[] args) {
		//★★★★★   i=1   별=5   
		//★★★★     i=2   별=4 
		//★★★       i=3   별=3
		//★★         i=4   별=2
		//★           i=5   별=1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("============================================");

		//★★★★★   i=5   별=5   
		//★★★★     i=4   별=4 
		//★★★       i=3   별=3
		//★★         i=2   별=2
		//★           i=1   별=1
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		//★★★★★   i=1   하얀별=0   검은별=5   
		//☆★★★★   i=2   하얀별=1   검은별=4
		//☆☆★★★   i=3   하얀별=2   검은별=3
		//☆☆☆★★   i=4   하얀별=3   검은별=2
		//☆☆☆☆★   i=5   하얀별=4   검은별=1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print("☆");
			}
			for(int j=1;j<=6-i;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("============================================");

		// 1 2 3 4 5 >> j
		//★★★★★   i=1   
		//☆★★★★   i=2
		//☆☆★★★   i=3
		//☆☆☆★★   i=4
		//☆☆☆☆★   i=5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) System.out.print("★");
				else System.out.print("☆");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		//☆☆☆☆★           i=1   하얀별=4   검은별=1
		//☆☆☆★★★         i=2   하얀별=3   검은별=3
		//☆☆★★★★★       i=3   하얀별=2   검은별=5
		//☆★★★★★★★     i=4   하얀별=1   검은별=7
		//★★★★★★★★★   i=5   하얀별=0   검은별=9
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("☆");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("★");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		// 1 2 3 4 5 >> j
		//★☆☆☆★   i=1
		//☆★☆★☆   i=2
		//☆☆★☆☆   i=3
		//☆★☆★☆   i=4
		//★☆☆☆★   i=5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==6) System.out.print("★");
				else System.out.print("☆");
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