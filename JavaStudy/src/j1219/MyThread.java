package j1219;

//2. Runnable 인터페이스를 상속받아서 작성하는 방법
class Test2{
	String name;
}
public class MyThread extends Test2 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("is Running!!!");
			try {
				Thread.sleep(1000); //1초 간격
				System.out.println("쓰레드 이름 =>"+Thread.currentThread().getName());
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Runnable 인터페이스를 상속받은 자식클래스의 객체를 생성
		MyThread my = new MyThread();
//		2.Thread 객체를 생성 -> 생성자 내부에 매개변수로 자식클래스 객체 전달
		Thread t = new Thread(my,"테스트"); 
								//1) Runnable객체 2) Thread이름
//		3.start() -> run()호출
		t.start();
		
	}//main
	
}//class MyThread
