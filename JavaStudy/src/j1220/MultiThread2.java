package j1220;

//Thread의 작성방법 정리(멀티쓰레드 -> 한개 이상의 쓰레드가 실행되는 것)
import java.io.*;

public class MultiThread2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("실행시킬 단을 입력?");
		BufferedReader br=
			new BufferedReader
			    (new InputStreamReader(System.in));
		int dan=Integer.parseInt(br.readLine());
//        1.Runnable객체 생성
		GooGoo go=new GooGoo(dan);
//		2.Thread객체생성->생성자 인수로 go전달
		Thread t=new Thread(go);
//		3.Thread실행->strat()
//		추가
//		한 개 이상의 쓰레드를 실행 -> 서로 경쟁적으로 실행 (둘의 실행결과가 섞여서 출력)
//		우선 순위가 높을수록 할당된 시간이 많기 때문에 빨리 일처리를 한다.
		PrintThread pt = new PrintThread();
//		우선순위 10 > 5 > 1
		t.setPriority(10); //Thread.MAX_PRIORITY
		pt.setPriority(Thread.MIN_PRIORITY); //1
		t.start(); pt.start();
//		t.start();
	}
}
//2.구구단을 출력=>Runnable 인터페이스를 상속
class GooGoo implements Runnable{
	private int dan;//단을 저장 ex)2단
	
	public GooGoo(int dan) {
		this.dan=dan;//go.dan=5;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
			try {
				Thread.sleep(1000);//1초
	 System.out.println(dan+"단:"+dan+"*"+i+"="+(dan*i));
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}//for
	}//run
}
//1.Thread를 직접 상속받아서 작성
class PrintThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {
		  try {
//			long sleeptime=(int)(Math.random()*1000+1);//0~0.999
//			System.out.println("sleeptime=>"+sleeptime);
			Thread.sleep(1000);
			System.out.println(i);
		  }catch(Exception  e) {e.printStackTrace();}
		}//for
	}//run
}
