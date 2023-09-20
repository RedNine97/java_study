package j1202;

public class StarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 1; a <= 5; a++) {//행이 증가
//			공백을 증가시키면서 출력 0, 1, 2, 3, 4
//			첫 행만 공백을 안찍어주고 나머지 행은 행마다 공백증가
			for (int c = 1; c < a; c++) {
				System.out.print(" ");
			}
			for (int b = 5; b >= a; b--) {
				System.out.print("*");
			} // inner for
			System.out.println();// 줄바꿈
		} //outer for	

	}//main
}
