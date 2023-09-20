package Check;

public class SumTest {	

	public static void main(String[] args) {
		int sum=0;
		for (int i=1; i<=100; i++) {
//			추가
			if((i%3==0)||(i%5==0)) {
			sum += i;
			}
		}
		System.out.println("3의배수 또는 5의배수 => "+ sum);

	}//main
}//SumTest
