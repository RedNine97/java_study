package j1201;

public class StarTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int a = 1; a <= 5; a++) {
			for (int b = 5; b >= a; b--) {
				System.out.print("*");
			} // inner for
			System.out.println();// 줄바꿈
			for (int c = 0; c < a; c++) {
				System.out.print(" ");
			}
		} //outer for
			
	}//main
}
