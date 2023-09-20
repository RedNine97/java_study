package j1219;

import java.lang.Thread;

//1. Thread를 만드는 방법(Thread클래스를 상속 받아서 작성) -> run()
public class MultiThread extends Thread{
	
	MultiThread(String s) {
		super(s); //부모의 쓰레드 이름을 처리해주는 생성자 호출
//		this.setName(s);
	}
//	Thread의 기능을 제공
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		A~Z
		for(char i='A';i<='Z'; i++) {
		  try {
			Thread.sleep(500); //1000 -> 1초 동안 멈췄다가 다시 실행
			System.out.println(i);
			System.out.println("쓰레드 이름 =>"+getName());
		  }catch(Exception e) {
				e.printStackTrace();
			}
		}//for
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) 상속 -> 2)run() 재정의 3) Thread객체생성 => 4)가동
		MultiThread mt = new MultiThread("임시"); //이름부여
//		1. callback method => 운영체제가 내부적으로 불러서 처리해주는 메서드
//		2. run() -> 안정성을 보장할 수 없다. -> main() 실행 X
//		mt.start(); //mt.run() 직접 부르지는 않는다. (X)
		System.out.println("main쓰레드를 계속 사용할 수 있는지 없는지 판단");
		mt.run();
	}
}
