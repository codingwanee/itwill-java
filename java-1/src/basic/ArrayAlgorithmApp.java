package basic;

public class ArrayAlgorithmApp {
	public static void main(String[] args) {
		//������� 5���� ������ �� �ִ� �迭 ����
		int[] num=new int[5];
		
		//�迭 ��ҿ� 0~99 ������ ���������� �����޾� ���� >> �Է�
		// => �迭 ��ҿ� ����Ǵ� ����� �ߺ����� �ʵ��� �ۼ�
		for(int i=0;i<num.length;i++) {
			//������ �����޾� ��Ұ����� ����Ǵ� ��� - �ݺ�
			// => ������ �������� ���� �迭 ��Ұ��� �ٸ� ��� �ݺ��� ����
			while(true) {
				num[i]=(int)(Math.random()*100);

				//�ߺ� ���� ���¸� �����ϱ� ���� ����
				// => false : ���ߺ�, true : �ߺ�
				boolean result=false;
		
				//�������� ���� �迭 ��Ұ��� �� - �ݺ�
				// => ���� �迭 ��Ұ��� ������ �������� ������ ��� �ߺ� �������� ����
				for(int j=0;j<i;j++) {
					//num[i] : ������, num[j] : �迭 ��Ұ�
					if(num[i]==num[j]) {
						result=true;//�ߺ� ���·� ����
						break;
					}
				}
				
				//�������� ������ �迭 ��Ұ��� �������� ���� ��� �ݺ��� ����
				if(!result) break;
			}
		}
		
		//�迭 ��Ұ� ���
		System.out.print("�迭 ��Ұ� >> ");
		for(int su:num) {
			System.out.print(su+"  ");
		}
		System.out.println();
		System.out.println("============================================");
		
		//�迭 ��Ұ� �� �ּҰ��� �ִ밪�� ����Ͽ� ����ϼ���.
		int min,max;
		
		min=max=num[0];
		
		for(int i=1;i<num.length;i++) {
			if(num[i]<min) min=num[i];
			if(num[i]>max) max=num[i];
		}
		
		System.out.println("�迭 ����� �ּҰ� = "+min);
		System.out.println("�迭 ����� �ִ밪 = "+max);
		System.out.println("============================================");
		
		//�迭 ��Ұ��� ���Ͽ� ������ ����Ͽ� ����ϼ���.
		int[] rank={1,1,1,1,1};//������ �����ϱ� ���� �迭 ����
		
		for(int i=0;i<num.length;i++) {//�񱳿���� ÷��
			for(int j=0;j<num.length;j++) {//�Ǻ񱳿���� ÷��
				if(i!=j) {//÷�ڸ� �̿��� �迭��� ���� ���� ���
					//�񱳿�Ұ��� �Ǻ񱳿�Ұ��� ���Ͽ� �Ǻ񱳿�Ұ��� ū ���
					if(num[i]<num[j]) {
						rank[i]++;//�񱳿�ҿ� ���� ���� ����
					}
				}
			}
		}
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" = "+rank[i]+"��");
		}
		System.out.println("============================================");
		
		//�Էµ� ��������� �迭��ҿ��� �˻��Ͽ� ��ġ��(index)�� ����ϼ���.
		// => �Էµ� ��������� �迭 ��ҿ� ����Ǿ� ���� ���� ��쿡 ���� �޼��� ���
		int searchNum=50;
		
		//�迭 ����� ��ġ���� �����ϱ� ���� ����(�˻����� ���� ���� �Ǵ�)
		int index=-1;
		
		//�迭 ��Ұ��� ���ʴ�� ���Ͽ� �˻� - �����˻�(Sequence Search)
		for(int i=0;i<num.length;i++) {
			if(searchNum==num[i]) {
				index=i;
				break;
			}
		}
		
		if(index!=-1) {//�˻����� �迭 ��ҿ� ����Ǿ� �ִ� ���
			System.out.println(searchNum+"��(��) "+index+"��° ��Ұ����� ����Ǿ� �ֽ��ϴ�.");
		} else {//�˻����� �迭 ��ҿ� ����Ǿ� ���� ���� ���
			System.out.println(searchNum+"��(��) ��Ұ����� ����Ǿ� ���� �ʽ��ϴ�.");
		}
		System.out.println("============================================");
		
		//�迭 ��Ұ��� ���Ͽ� ���������� ������ �� ����ϼ���.
		//����(Sort) : �������� ����(Ascending Sort), �������� ����(Descending Sort)
		
		System.out.print("���� �� �迭 ��Ұ� >> ");
		for(int su:num) {
			System.out.print(su+"  ");
		}
		System.out.println();

		//�迭 ��Ұ��� ���Ͽ� �������� ���� >> ���� ����(Selection Sort)
		for(int i=0;i<num.length-1;i++) {//�񱳿�� ÷�� : ó��~��-1
			for(int j=i+1;j<num.length;j++) { //�Ǻ񱳿�� ÷�� : ��+1~��
				//�񱳿�Ұ��� �Ǻ񱳿�Ұ����� ū ��� ��Ұ� ġȯ
				if(num[i]>num[j]) {//�������� ����
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.print("���� �� �迭 ��Ұ� >> ");
		for(int su:num) {
			System.out.print(su+"  ");
		}
		System.out.println();
		System.out.println("============================================");
	}
}