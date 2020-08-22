package site.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressApp {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress Ŭ���� : IP ���� ��Ʈ��ũ ����(IP Address, HostName)�� ������ ������ Ŭ����
		//InetAddress.getLocalHost() : ���� ��ǻ��(localhost)�� ��Ʈ��ũ ������ ��ȯ�ϴ� �޼ҵ�
		// => UnknownHostException �߻� - ����ó�� : Host ������ ã�� �� ���� ��� �߻��Ǵ� ����
		InetAddress myComputer=InetAddress.getLocalHost();
		
		//InetAddress.toString() : ��Ʈ��ũ ������ ���ڿ��� ��ȯ�Ͽ� ��ȯ�ϴ� �޼ҵ�
		//System.out.println("myComputer = "+myComputer.toString());
		System.out.println("myComputer = "+myComputer);
		//InetAddress.getHostName() : ��Ʈ��ũ ������ ��ǻ�� �̸�(HostName)�� ��ȯ�ϴ� �޼ҵ�
		System.out.println("myComputer = "+myComputer.getHostName());
		//InetAddress.getHostAddress() : ��Ʈ��ũ ������ ��Ʈ��ũ �ּ�(IP Address)�� ��ȯ�ϴ� �޼ҵ�
		System.out.println("myComputer = "+myComputer.getHostAddress());
		System.out.println("============================================");
		
		//InetAddress.getByName(String host) : ��ǻ�� �̸��� �����Ͽ� �ش� ��ǻ���� ��Ʈ��ũ ������ ��ȯ�ϴ� �޼ҵ�
		// => �������� �̿��Ͽ� �ۼ��� ��ǻ�� �̸�(DomainHostName)
		InetAddress itwill=InetAddress.getByName("www.itwill.site");
		
		System.out.println("www.itwill.site IP Address = "+itwill.getHostAddress());
		System.out.println("============================================");
		
		//InetAddress.getAllByName(String host) : ��ǻ�� �̸��� �����Ͽ� �ش� ��ǻ���� ��� ��Ʈ��ũ ������ ��ȯ�ϴ� �޼ҵ�
		InetAddress[] daum=InetAddress.getAllByName("www.daum.net");
		
		for(InetAddress address:daum) {
			System.out.println("www.daum.net IP Address = "+address.getHostAddress());
		}
		System.out.println("============================================");
	}
}