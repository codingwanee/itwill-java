package site.itwill.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

//1~45 ������ ���������� 6�� �Է¹޾� ����ϴ� ���α׷�
// => 6�� ���������� �ߺ��Ǿ�� �ȵǸ� �����Ͽ� ��µǵ��� �ۼ�
public class LottoSetApp {
	public static void main(String[] args) {
		Random random=new Random();
		Set<Integer> lottoSet=new HashSet<Integer>();
		
		while(true) {
			//�ߺ� ������ �ν��Ͻ� ���� �Ұ� >> 1~45 ������ ���� �ߺ� ������
			lottoSet.add(random.nextInt(45)+1);
			if(lottoSet.size()==6) break;
		}
		//System.out.println(lottoSet);
		
		//Set.toArray(Element[] a) : �Ķ���Ϳ� �迭�� �����Ͽ� �ݷ�����
		//��Ұ��� ����� �迭�� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		Integer[] lotto=lottoSet.toArray(new Integer[0]);
		
		Arrays.sort(lotto);
		System.out.println("����� ���� >> "+Arrays.toString(lotto));
	}
}





