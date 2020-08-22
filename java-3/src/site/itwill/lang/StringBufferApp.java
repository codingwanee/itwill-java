package site.itwill.lang;

public class StringBufferApp {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		
		//StringBuffer.append(Object o) : StringBuffer �ν��Ͻ��� ����� 
		//���ڿ� ����� �Ķ���ͷ� ����� ���޹޾� �߰� ��Ű�� �޼ҵ�
		sb.append("ABCDEFG");
		
		//StringBuffer.toString() : StringBuffer �ν��Ͻ��� ����� ���ڿ� 
		//����� String �ν��Ͻ��� �����Ͽ� ��ȯ�ϴ� �޼ҵ�
		String str=sb.toString();
		System.out.println("str = "+str);
		System.out.println("============================================");

		//StringBuffer �ν��Ͻ��� ����� ���ڿ� ����� ��ȯ�޾� ����� ��� toString() �޼ҵ� ȣ�� ���� ����
		System.out.println("sb = "+sb);
		System.out.println("============================================");

		//StringBuffer.insert(int offset, Object o) : StringBuffer �ν��Ͻ���
		//����� ���ڿ� ����� �Ķ���ͷ� ���޵� ����� ���ϴ� ��ġ�� �����ϴ� �޼ҵ�
		sb.insert(4, "X");
		System.out.println("sb = "+sb);
		System.out.println("============================================");
		
		//StringBuffer.deleteCharAt(int index) : StringBuffer �ν��Ͻ���
		//����� ���ڿ� ����� �Ķ���ͷ� ���޵� ��ġ�� ���ڸ� �����ϴ� �޼ҵ�
		sb.deleteCharAt(2);
		System.out.println("sb = "+sb);
		System.out.println("============================================");
		
		//StringBuffer.delete(int start, int end) : StringBuffer �ν��Ͻ���
		//����� ���ڿ� ����� ù��° �Ķ���ͷ� ���޵� ��ġ���� �ι�° �Ķ���ͷ�
		//���޵� ��ġ �������� ���ڵ��� �����ϴ� �޼ҵ�
		sb.delete(4, 6);
		System.out.println("sb = "+sb);
		System.out.println("============================================");
			
		//StringBuffer.reverse() : StringBuffer �ν��Ͻ��� ����� ���ڿ� �����
		//���ڵ��� �ݴ�� �����Ͽ� ���ġ�ϴ� �޼ҵ�
		sb.reverse();
		System.out.println("sb = "+sb);
		System.out.println("============================================");
	}
}






