package site.itwill.exception;

public class TryCatchApp {
	public static void main(String[] args) {
		int[] array={10,20,30,40,50};

		//�迭 ����� ÷�ڰ� ������ ��� ��� ArrayIndexOutOfBoundsException ���� �߻�
		// => ����� ���ܰ� �߻��Ǹ� JVM�� ���� �ڵ� ����ó��
		// => ���α׷� ����� �Ǵ� �����ڸ� ���� ����ó�� �ϴ� ���� ����
		//try ������ �ۼ��� ��ɿ��� ���ܰ� �߻��� ��츦 ����
		// => ���ܰ� �߻��� ��� ���� ���� Ŭ������ �ν��Ͻ� ����
		try {
			//���ܰ� �߻��� ��� ���� �߻� ����� �ϴܿ� �ۼ��� ��� �̽���
			// => catch �������� ������(���α׷� �帧) �̵�
			for(int i=0;i<=array.length;i++) {
				System.out.println("array["+i+"] = "+array[i]);
			}
			
			//��� ��ɿ��� ���ܰ� �߻��� ��� �̽��� ��� 
			System.out.println("# �������� ���� ��� #");
		} catch (ArrayIndexOutOfBoundsException e) {
			//try �������� �߻��� �ش� ���� �ν��Ͻ��� ���޹޾� ������ �� ����ó��	
			// => ���α׷� ����ڿ��� �����޼��� �����ϰų� �����ڿ��� �����α� ����
			System.out.println("[����]���α׷� ���࿡ ����ġ ���� ������ �߻� �Ǿ����ϴ�.");
			
			//Exception.getMessage() : ���� �ν��Ͻ��� ���ܸ޼����� ��ȯ�ϴ� �޼ҵ�  
			//System.out.println("[�����α�]�����޼��� = "+e.getMessage());
			
			//Exception.printStackTrace() : ���� �߻� ��θ� �����Ͽ� ����ϴ� �޼ҵ�
			//e.printStackTrace();
		} finally {
			//���ܿ� ������� ������ ����� ��� �ۼ��ϴ� ���� : �ڿ� ���� ���
			System.out.println("# ������ ����� ��� #");
		}
	}
}