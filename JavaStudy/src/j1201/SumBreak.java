package j1201;
/*
 * <문제1> 1부터 100까지의 합을 구하시오.
 * <문제2> 1부터 100까지의 합 중에서 3의 배수 또는 5의 배수의 합
 * 												i%2==0(2의 배수) i%3==0, i%5==0
 * 
 * 1 부터 100까지의 합 중에서 3의 배수 또는 5의 배수의 합을 구한 값 중에서
 * 합계가 200을 넘어가는 최소의 값을 구하시오.
 * -> 200이 넘어갔을때 적용되는 가장 첫 번째 숫자가 무엇인가?
*/
public class SumBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				System.out.print(i+"\t");
			}//if
//			200이 넘어가는 순간 더 이상  for문을 실행하지 말아라  
			if (sum>200) break;
		}//for
		System.out.println("sum => " + sum);
	}//main
}
