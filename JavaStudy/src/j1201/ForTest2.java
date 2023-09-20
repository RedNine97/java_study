package j1201;

// 제어문에 또 다른 제어문 ==> 중첩 for문(=이중for문)
public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("중첩 for문(=이중 for문)");
//		       1)           2)14)   13)
		for (int a = 0; a < 5; a++) {
//			      3)        4)7)10)  6)9)
			for (int b=0; b <5; b++) { //b는 싸이클 돌때마다 초기화되어 0부터 다시 시작
				System.out.println("a="+a+"b="+b); //5)8)11)
			} //inner for
			System.out.println("===========");//12)
		} //outer for
		
//		구구단 (3단~7단)
		for (int dan=3;dan <=7; dan++) {
			for (int times=1; times <=9; times++) {
				System.out.println(dan+"X"+times+"="+dan*times);
			}
			System.out.println("===========");
		}
			
	}

}
