package basic;

//1~45 범위의 중복되지 않는 난수를 6개 제공받아 오름차순 정렬하여 출력하는
//프로그램을 작성하세요. >> 로또 번호 자동 생성 프로그램
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
		
		System.out.print("행운의 숫자 >> ");
		for(int num:lotto) System.out.print(num+" ");
		System.out.println();
	}
}
