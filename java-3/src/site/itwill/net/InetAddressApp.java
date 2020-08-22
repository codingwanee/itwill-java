package site.itwill.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressApp {
	public static void main(String[] args) throws UnknownHostException {
		//InetAddress 클래스 : IP 관련 네트워크 정보(IP Address, HostName)를 저장할 목적의 클래스
		//InetAddress.getLocalHost() : 로컬 컴퓨터(localhost)의 네트워크 정보를 반환하는 메소드
		// => UnknownHostException 발생 - 예외처리 : Host 정보를 찾을 수 없을 경우 발생되는 예외
		InetAddress myComputer=InetAddress.getLocalHost();
		
		//InetAddress.toString() : 네트워크 정보를 문자열로 변환하여 반환하는 메소드
		//System.out.println("myComputer = "+myComputer.toString());
		System.out.println("myComputer = "+myComputer);
		//InetAddress.getHostName() : 네트워크 정보의 컴퓨터 이름(HostName)을 반환하는 메소드
		System.out.println("myComputer = "+myComputer.getHostName());
		//InetAddress.getHostAddress() : 네트워크 정보의 네트워크 주소(IP Address)을 반환하는 메소드
		System.out.println("myComputer = "+myComputer.getHostAddress());
		System.out.println("============================================");
		
		//InetAddress.getByName(String host) : 컴퓨터 이름을 전달하여 해당 컴퓨터의 네트워크 정보를 반환하는 메소드
		// => 도메인을 이용하여 작성된 컴퓨터 이름(DomainHostName)
		InetAddress itwill=InetAddress.getByName("www.itwill.site");
		
		System.out.println("www.itwill.site IP Address = "+itwill.getHostAddress());
		System.out.println("============================================");
		
		//InetAddress.getAllByName(String host) : 컴퓨터 이름을 전달하여 해당 컴퓨터의 모든 네트워크 정보를 반환하는 메소드
		InetAddress[] daum=InetAddress.getAllByName("www.daum.net");
		
		for(InetAddress address:daum) {
			System.out.println("www.daum.net IP Address = "+address.getHostAddress());
		}
		System.out.println("============================================");
	}
}