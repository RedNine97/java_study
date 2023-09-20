package j1202;
// 클래스 -> main(X) 설계목적 main() (O) 실행목적
// 은행계좌
class Account {
	String name;   //소유자
	String no;       //계좌번호 => 계산 목적이 아닌 X (문자열로 저장)
	long price = 1000;    //예금잔액
	
//	1. 기본 -> 잔액조회 -> 단순, 반복 => 매개변수 X 반환값 X
	void searchPrint( ) {
		
	}
//	2. 입금 => 저장 => 매개변수 O 반환값 X 
	void input( long k) {
		
	}
//	3. 출금  => 입력 -> 매개변수 O 반환값 X
	void outPut(long k) {
		
	}
//	4. 계좌정보 출력 -> 명세서 출력 -> 단순, 반복
	void print() {
		
	}
}

public class AccountHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
	}//main

}
