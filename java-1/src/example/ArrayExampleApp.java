package example;

public class ArrayExampleApp {
	public static void main(String[] args) {
		//����鿡 ���� ���̸� �����ϰ� �ִ� �迭 ����
		int[] age={27,16,22,36,57,60,43,23,14,29,44,52,69,51,39,33,11};
		
		//�迭�� ����� ������� ��� ���̸� ����Ͽ� ����ϼ���.
		//ex) ��� ���� = 36��
		int tot=0;
		for(int nai:age) {
			tot+=nai;
		}
		System.out.println("��� ���� = "+(tot/age.length)+"��");
		System.out.println("============================================");
		
		//�迭�� ����� ������� ���̸� �̿��Ͽ� ���ɺ� �ο����� ����Ͽ� ����ϼ���.
		//ex) 10�� = 3��
		//    20�� = 4��
		//    ..
		//    60�� = 2��
		//int cnt10=0,cnt20=0,cnt30=0,cnt40=0,cnt50=0,cnt60=0;
		int[] cnt=new int[6];
		
		for(int nai:age) {
			/*
			if(nai>=10 && nai<=19) cnt[0]++;//cnt[0] : 10�� �ο���
			else if(nai>=20 && nai<=29) cnt[1]++;//cnt[1] : 20�� �ο���
			else if(nai>=30 && nai<=39) cnt[2]++;//cnt[2] : 30�� �ο���
			else if(nai>=40 && nai<=49) cnt[3]++;//cnt[3] : 40�� �ο���
			else if(nai>=50 && nai<=59) cnt[4]++;//cnt[4] : 50�� �ο���
			else if(nai>=60 && nai<=69) cnt[5]++;//cnt[5] : 60�� �ο���
			*/
			
			/*
			switch(nai/10) {
			case 1: cnt[0]++; break;
			case 2: cnt[1]++; break;
			case 3: cnt[2]++; break;
			case 4: cnt[3]++; break;
			case 5: cnt[4]++; break;
			case 6: cnt[5]++; break;
			}
			*/
			
			cnt[nai/10-1]++;
		}
		
		/*
		System.out.println("10�� = "+cnt[0]+"��");
		System.out.println("20�� = "+cnt[1]+"��");
		System.out.println("30�� = "+cnt[2]+"��");
		System.out.println("40�� = "+cnt[3]+"��");
		System.out.println("50�� = "+cnt[4]+"��");
		System.out.println("60�� = "+cnt[5]+"��");
		*/
		
		for(int i=0;i<cnt.length;i++) {
			System.out.println((i+1)+"0�� = "+cnt[i]+"��");
		}
		System.out.println("============================================");
	}
}