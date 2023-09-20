package j1201;

// 제어문에 또 다른 제어문 ==> 중첩 for문(=이중for문)
public class ConTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("레이블이 없는 Continue문");
//		A:
		for (int a = 0; a < 5; a++) {
			for (int b=0; b <5; b++) { 
			//추가
				if (b == 2)	continue;
				System.out.println("a="+a+"b="+b); 
			} //inner for
			System.out.println("===========");
		} //outer for
		
	}//main
}//class
