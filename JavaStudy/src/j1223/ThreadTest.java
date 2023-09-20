package j1223;

public class ThreadTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		추가 -----------------------------------------------
		
		System.out.println(Thread.currentThread().getName());
//		-------------------------------------------------------
		System.out.println(Thread.currentThread().getId());

		while (true) {// 무한루프=>쓰레드의 한 부분
			System.out.println("main Thread 실행중...");
		}
	}

}