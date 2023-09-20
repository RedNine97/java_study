package j1205;
/*
 * 2개의 값을 입력을 받아서 사칙연산(+, -, *, /)을 해주는 프로그램을 작성하시오.
*/
public class SumTest {	// 프로그램 -> 회사
//	객체를 왜 생성해야 하는가?   1. 데이터 저장 목적 **2. 메서드 호출 목적 
//	데이터 저장 목적 X => 맴버변수가 없기 때문이다.
	public static void main(String[] args) {
		int a = 100;
		int b = 50;
		
		/* (1) 단순, 반복적인 구문 => 메서드를 작성해야한다.
			System.out.println("(a+b) => " + (a + b));
			System.out.println("(a-b) => " + (a - b));
			System.out.println("(a*b) => " + (a * b));
			System.out.println("(a/b) => " + (a / b));
		 */
		
//		객체명.호출할 메서드명() or (~) 호출시
		SumTest st = new SumTest(); //메서드 호출 목적
		st.calculate(a, b);		//100, 50
		st.calculate(78, 90);
		st.calculate(23, 45);
		st.calculate(12, 78);
		
		for(int i =1; i <= 10; i++) {
			st.calculate(90, 9);
		}

	}//main
//	유능한 부하직원 메서드 (work method) => calculate메서드 (매개변수 X 반환값 X)
	void calculate(int a, int b) {	//매개변수 O  반환값 X
		System.out.println("(a+b) => " + (a + b));
		System.out.println("(a-b) => " + (a - b));
		System.out.println("(a*b) => " + (a * b));
		System.out.println("(a/b) => " + (a / b));
		System.out.println("=============");
	}//calculate
}//SumTest
