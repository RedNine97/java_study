package j1220;
//서버역할 -> 1. 클라이언트와의 접속 -> 접속 정보 -> 아이디로 구분

import java.net.*; 			//ServerSocket, Socket
import java.io.*; 			//입출력 -> BufferedReader, Input ~
import java.util.Vector; 	//List계열(배열) -> 실시간으로 접속한 클라이언트 수

public class ChatGUIServer {
	
	ServerSocket ss; 			//클라이언트와 접속할 때만 필요하다.
	Socket s; 						//클라이언트와의 통신(문자열 전송)
	Vector v;					 // 실시간으로 접속할 클라이언트 정보를 저장
	//Thread객체가 필요 -> 멤버변수에 선언한다. (1)has a 관계로 연결
	ServerThread st; 			//먼저 멤버변수로 선언 (1)has a 관계로 연결
	
//	-------------------생성자 (초기화)----------------
	public ChatGUIServer() {
//		서버를 가동 -> 클라이언트가 접속할 때까지 대기한다.(무한 대기)
		v= new Vector(); 			//생성자에서는 다른 클래스에서 객체명 사용 가능하다.
		try {
			ss=new ServerSocket(5432); 			//socket 겍체생성하면서 포트 5432 open
			System.out.println("ss => "+ ss);	 //null -> 객체생성 실패
			System.out.println("채팅서버 가동중....");
//			무한대기
			while(true) {
				s=ss.accept();
				System.out.println("Accepted from => "+ s);
//				생성자 -> ServerThread객체를 생성 -> 매개변수로 객체를 전달
				st=new ServerThread(this, s); 	//서버객체 전달, 클라이언트 정보 (this->ChatGUIServer)
				this.addThread(st); 						//백터에 클라이언트에 추가
//				Thread를 가동
				st.start(); // -> run()
//				-------------------------------------------------------
			}
		}catch(Exception e) {
			System.out.println("서버접속 실패~! => "+e);
		}
	}
//	1. 접속한 클라이언트의 정보를 백터에 저장
	public void addThread(ServerThread st) {
		v.add(st); 		//cg.s (접속한 클라이언트의 정보)
	}
//	2. 퇴장한 클라이언트 정보를 백터에 삭제
	public void removeThread(ServerThread st) {
		v.remove(st);
	}
//	3. 각 클라이언트에게 실시간으로 메세지를 전달시켜주는 메서드
	public void broadCast(String str) { 		//입장~, 퇴장하셨~
		for(int i=0; i<v.size();i++) { 			//Object -> ServerThread
			ServerThread st = (ServerThread)v.elementAt(i);
//			Thread가 send호출
			st.send(str);		 //실질적으로 각 클라이언트에게 전송해주는 역할
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChatGUIServer();
	}//main
}//ChatGUIServer

//실시간으로 데이터를 전송 => 쓰레드 기능
class ServerThread extends Thread{
	
	Socket s; //클라이언트와 통신 객체
//	추가
	ChatGUIServer cg; 	//broadCast()를 호출하기위해서 필요
//	------------------------------
//	입출력
	BufferedReader br; 	//입력용
	PrintWriter pw;			 //출력용
	String str;					//전달할 문자열
	String name;				//대화명(id) -> 친구 찾기
	
	public ServerThread(ChatGUIServer cg, Socket s) {
//		ChatGUIServer cg = new ChatGUIServer();//포트충돌(X)
		this.cg=cg;
		this.s=s; //접속한 클라이언트의 정보
//		데이터를 실시간으로 전송 -> 입출력 스트림을 생성
		try {
			br=new BufferedReader(				 //System.in대신에 상대방 정보
					new InputStreamReader(s.getInputStream()));
//			autoflush 버퍼에 쌓아놓지 말고 바로바로 출력하라
			pw=new PrintWriter(s.getOutputStream(),true);
		}catch(Exception e) {
			System.out.println("연결실패(e) => "+e);	 //e.toString()
		}
	}
//	데이터를 전송해주는 메서드(클라이언트)
	public void send(String str) {
		pw.println(str);
		pw.flush();
	}
//	실시간으로 데이터를 전송, 받는 코딩 => 클라이언트 프로그램을 종료 -> 퇴장
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
//			그룹채팅
			pw.println("먼저 대화명을 입력하세요?");
			name=br.readLine();		 	//상대방이 보내준 id
//			각 클라이언트에게 특정 계정이 입장했다는 메세지를 전달
			cg.broadCast("["+name+"]"+"님이 입장하셨습니다.");
			while ((str = br.readLine()) != null) {
				cg.broadCast("["+name+"]"+str); 	//대화명: 전달할 말
			}
		}catch(Exception e) { 			//종료시 연결해제 => 퇴장으로 간주
//			접속자가 퇴장 -> 접속한 사람들에게 실시간으로 전송
			cg.removeThread(this); 	//빠져나간 사람
			cg.broadCast("["+name+"]"+"님이 퇴장하셨습니다.");
//			s.getInetAddress() -> 상대방의 접속 ip 주소
			System.out.println(s.getInetAddress()+"연결이 종료됨!");
		}
	}//run()
}//ServerThread
