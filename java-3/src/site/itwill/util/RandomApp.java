package site.itwill.util;

import java.util.Random;

//Random Ŭ���� : ���� �߻� ���� ����� �����ϴ� Ŭ����
public class RandomApp {
	public static void main(String[] args) {
		//Random(int seed) : �Ķ���Ϳ� �õ尪�� �����Ͽ� �ν��Ͻ� �����ϴ� ������
		// => Seed : ���α׷� ���� �� �ٸ� ������ �߻��ǵ��� �����ϴ� long Ÿ���� ������
		//System.currentTimeMillis() : ���� �ý����� Ÿ�ӽ��������� ��ȯ�ϴ� �޼ҵ�
		// => Timestamp : 1970�� 1�� 1�� �������� �и��ʴ� 1�� �����Ǵ� long Ÿ���� ������
		//Random random=new Random(System.currentTimeMillis());
		
		//Random Ŭ������ �⺻ �����ڴ� �õ尪�� �ڵ����� ���� >> System.currentTimeMillis() �޼ҵ� ȣ��
		Random random=new Random();
		
		for(int i=1;i<=5;i++) {
			//Random.nextInt(int bound) : 0~bound-1 ������ ���������� �߻��Ͽ� ��ȯ�ϴ� �޼ҵ�
			System.out.println(i+"��° ���� >> "+random.nextInt(100));//0~99
		}
	}
}



