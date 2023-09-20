package j1220;

import java.net.*; //InetAddress, Socket, ServerSoket
//checked Exception 계열 -> 반드시 예외처리해야 한다.
//입출력, DB 연동, 네트워크 통신, 쓰레드

public class NetworkTest {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InetAddress ia = null; 	// ip주소에 대한 정보
		InetAddress ia2[]; 		//컴퓨터가 한 대 이상
//		원격컴퓨터에 접속 -> 도메인 이름
		ia=InetAddress.getByName("www.naver.com"); 	//도메인 이름
		System.out.println("서버주소 => "+ia.getHostAddress());	//도메인에 해당하는 IP주소 호출
//		서버가 한 대 이상 -> getAllByName
		System.out.println("===================");
		ia2=InetAddress.getAllByName("www.naver.com");
//		확장 for문
		for(InetAddress aa:ia2) {
			System.out.println("서버들 주소 => "+aa.getHostAddress());
		}
		System.out.println("=== 자기 컴퓨터의 정보 ===");
		InetAddress host = InetAddress.getLocalHost(); 	//개인 컴퓨터 정보
		System.out.println("컴퓨터명 =>"+host.getHostName());
		System.out.println("ip주소 =>"+host.getHostAddress());
	}//main
}//NetworkTest
