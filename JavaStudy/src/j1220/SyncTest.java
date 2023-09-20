package j1220;

//급여통장(공유데이터) -> ATM(쓰레드) -> 공과금, 보험금,,,
class ATM implements Runnable{
	
	private long money=10000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		형식) synchronized(공유할 데이터){ 처리해야할 구문,,,} DB연동
		synchronized(this) { //this -> atm객체
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000); //1초 간격
				}catch(Exception e) {}
					if(getMoney()<=0) {
						System.out.println("잔액이 부족해서 더 이상 출금X");
						break; //0원 잔액이 없기 떄문이다.
					}
				withDraw(1000);
			}//for
		}//synchronized
	}//run()
//	돈을 인출 -> 수정
	public void withDraw(long howmuch) {
//		양수인 경우만 돈을 인출
		if(getMoney()>0) { //if(money>0)
			money -= howmuch; // money = money - howmuch
			System.out.println
			(Thread.currentThread().getName()+","+getMoney());
		}else { //<=0
			System.out.println("잔액이 부족합니다.");
		}
	}
//	잔액을 조회 -> 저장된 데이터를 꺼내와서 출력 -> getXXX
	public long getMoney() {
		return this.money;
	}
	
}//ATM

public class SyncTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread t1 =new Thread(atm,"보험금"); //쓰레드 이름
		Thread t2 =new Thread(atm,"공과금");
		t1.start();  t2.start(); // run() -> withDraw() 호출
		
	}//main
}//class SyncTest
