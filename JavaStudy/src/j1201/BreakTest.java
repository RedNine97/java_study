package j1201;

// 제어문에 또 다른 제어문 ==> 중첩 for문(=이중for문)
public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("레이블이 없는 Break문(가장 가까운 루프탈출)");
//		         1)         2)14)   13)
		for (int a = 0; a < 5; a++) {
//			      3)         4)7)10)  6)9)
			for (int b=0; b <5; b++) { 
			//추가
				if (b == 2)	break;//11)
				System.out.println("a="+a+"b="+b); //5)8)
			} //inner for
			System.out.println("===========");//12)
		} //outer for
		
	}//main
}//class
