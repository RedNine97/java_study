package j1201;

// 제어문에 또 다른 제어문 ==> 중첩 for문(=이중for문)
public class BreakTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("레이블이 있는 Break문(레이블과 가장 가까운 루프탈출)");
//		         1)         2)14)   13)
		A://레이블명:    <--- 탈출하고 싶은 for문 위에 작성
		for (int a = 0; a < 5; a++) {
//			      3)         4)7)10)  6)9)
			for (int b=0; b <5; b++) { 
			//추가
				if (b == 2)	break A;//11)   형식) 조건식 break 레이블명;
				System.out.println("a="+a+"b="+b); //5)8)
			} //inner for
			System.out.println("===========");//12)
		} //outer for
		//A:  <-- 컴퓨터가 인식할 수 없다. 밑에 사용하면 X
		System.out.println("레이블 프로그램 종료");
	}//main
}//class
