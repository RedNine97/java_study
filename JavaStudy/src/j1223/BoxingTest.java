package j1223;

public class BoxingTest {

	public static void main(String[] args) {

		System.out.println("자동 unboxing");
//     추가 --------------------------------------
		Integer obj =new Integer(10);
//		------------------------------------------
		int sum = obj + 20;
		System.out.println("sum=>" + sum);
	}
}
