package j1201;

public class StarTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a(행의 수), b(행이 증가할때마다 별도 같이 증가)
		for (int a = 1; a <= 5; a++) {
			//System.out.println("*");
			for (int b=1; b <=a; b++) {
				System.out.print("*"); 
			} //inner for
			System.out.println();//줄바꿈
		} //outer for	
	}//main
}
