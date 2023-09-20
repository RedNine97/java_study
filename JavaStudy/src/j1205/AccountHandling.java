package j1205;

// 파일명(~.java)
// 클래스 -> main(X) 설계목적 main() (O) 실행목적
// 추상화 -> 설계도(새로운 자료형을 만드는 것) => 객체(저장할 대상자)
// 은행계좌
class Account {
	String name;           //소유자
	String no;               //계좌번호 => 계산 목적이 아닌 X (문자열로 저장)
	long price = 1000;  //예금잔액
	
//	1. 기본 -> 잔액조회 -> 단순, 반복 => 매개변수 X 반환값 X
	void searchPrint( ) {
		System.out.println(name + "님의 전체 잔액은 " + price + "입니다.");
	}
//	2. 입금 => 저장 => 매개변수 O 반환값 X 
	void input(long k) {	//price = 1,000 + 5,000 => 6,000
		price += k;
		System.out.println(k + "입금이 완료되었습니다.");
	}
//	3. 출금  => 입력 -> 매개변수 O 반환값 X
	void outPut(long k) {
//		잔액을 확인 -> 잔액이 0 양수인지 확인 -> if
		if (k <0 || (price -k)<=0) {
			System.out.println("잔액이 부족합니다.");
		}else { // (price-k) > 0
		price -= k;
		System.out.println(k + "만큼 출금이 완료되었습니다.");
		}
	}
//	4. 계좌정보 출력 -> 명세서 출력 -> 단순, 반복
	void print() {
		System.out.println("== 계좌 정보 확인 ==");
		System.out.println("소유자 => " + name);
		System.out.println("계좌번호 => " + no);
		System.out.println("예금잔액 => " + price);
	}
}//Account

public class AccountHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account t = new Account(); //내 계좌 정보만 저장 가능한 공간 생성
		t.name = "앙드레곤";
		t.no = "46-123-0987";
//		입금
		t.input(5000); //1,000 + 5,000 = 6,000
		t.outPut(8000); //잔액 부족
		t.outPut(4000);
		t.print();
		
	}//main
}//AccountHandling