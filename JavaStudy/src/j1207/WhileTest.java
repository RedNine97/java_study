package j1207;

public class WhileTest {

	//매개변수로 선언 => 매개변수가 없는 메서드를 작성O
	int start2=50;
	int end2=70;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int start = 40; 
		int end = 90;
		
		if (start < end) {
			while (start <= end) {
				System.out.println("while구문 연습 " + start);
				start++;
			} // while 구문
		} else { //start >= end
				System.out.println("start값은 end값보다 클 수가 없다.");
		}
		*/
		WhileTest wt = new WhileTest();
		wt.whilePrint(90,150);
		wt.whilePrint(100,200);
		wt.whilePrint();
	}
	
//	whilePrint -> 매개변수 O 반환값 X
	void whilePrint(int start, int end) {
		if (start < end) {
			while (start <= end) {
				System.out.println("while구문 연습 " + start);
				start++;
			} // while 구문
		} else { //start >= end
				System.out.println("start값은 end값보다 클 수가 없다.");
		}
			System.out.println("=====================");
	}//whilePrint
	
//	매개변수 X 반환값 X  =>  메서드 오버로딩(이름을 통합)
	void whilePrint() {
		if (start2 < end2) {
			while (start2 <= end2) {
				System.out.println("while구문 연습 " + start2);
				start2++;
			} // while 구문
		} else { //start >= end
				System.out.println("start값은 end값보다 클 수가 없다.");
		}
			System.out.println("=====================");
	}//whilePrint2
	
	
	
}
