package j1205;
/*
 * 1. 사용자로부터 값을 입력받아서(2개) 큰 값을 구하시오. <-> 적은 값을 구하시오.
 * 2. 최대값을 구해주는 메서드 (max)을 이용해서 최댓값을 구하시오.
 * 2. 최대값을 구해주는 메서드 (min)을 이용해서 최솟값을 구하시오.
*/
public class TwoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* (1) 비효율적인 코딩 방식 ( 단순, 반복적인 문장 )
		int x=12;
		int y=67;
		if(x > y) {    //12 > 67
			System.out.println("큰 값은 "+ x + "입니다.");
		}else {
			System.out.println("큰 값은 "+ y + "입니다.");
		}
		
		
		int x=56;
		int y=97;
		
		if (x > y) {   // 56 > 97
			System.out.println("큰 값은 " + x + "입니다.");
		} else {   
			System.out.println("큰 값은 " + y + "입니다.");
		}
	}
		*/
		
		TwoTest tt=new TwoTest();
		
		tt.max(12, 67);	//  12, 67
		tt.max(32, 12);	//		32	
		tt.max(34, 99);	//		99
		System.out.println("=================");
		tt.min(34, 14);	//		14
	}
	
//	부하직원 max -> 매개변수 X 반환값 X  -> 매개변수 작성
	void max(int x, int y) {
		if (x > y) {
			System.out.println("큰 값은 " + x + "입니다.");
		} else {
			System.out.println("큰 값은 " + y + "입니다.");
		}
	}
	
//	 부하직원 min(최소값)
	void min(int x, int y) {
		if (x > y) {
			System.out.println("작은 값은 " + y + "입니다.");
		} else {
			System.out.println("작은 값은 " + x + "입니다.");
		}
	}

}
