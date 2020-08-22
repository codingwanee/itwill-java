package basic;

//1~45 ������ �ߺ����� �ʴ� ������ 6�� �����޾� �������� �����Ͽ� ����ϴ�
//���α׷��� �ۼ��ϼ���. >> �ζ� ��ȣ �ڵ� ���� ���α׷�
public class LottoApp {
	public static void main(String[] args) {
		int[] lotto=new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			while(true) {
				lotto[i]=(int)(Math.random()*100)%45+1;
				
				boolean result=false;
				for(int j=0;j<i;j++) {
					if(lotto[i]==lotto[j]) {
						result=true;
						break;
					}
				}
				
				if(!result) break;
			}
		}
		
		for(int i=0;i<lotto.length-1;i++) {
			for(int j=i+1;j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					int temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
		
		System.out.print("����� ���� >> ");
		for(int num:lotto) System.out.print(num+" ");
		System.out.println();
	}
}
