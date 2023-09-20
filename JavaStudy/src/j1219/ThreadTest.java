package j1219;

//import java.lang.Thread;

public class ThreadTest {
	
//	메인쓰레드 -> 메인 메서드를 실행시켜주는 내부적인 쓰레드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		현재 작동중인 쓰레드 객체 Thread.currentThread()
		System.out.println(Thread.currentThread().getName()); //main
		System.out.println(Thread.currentThread().getId()); // 1
//		쓰레드 -> 실시간 데이터전송, 온라인 게임
		while (true) {//무한루프 -> 쓰레드의 한 부분이다.
			System.out.println("main Thread 실행중...");
		}
	}//main
}//class ThreadTest