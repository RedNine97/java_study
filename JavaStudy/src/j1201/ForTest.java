package j1201;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. for문의 유형1(C++)");
//		형식)for(초기식;조건식;증감식)
//		        1)          2)5)     4)
		for (int i = 1; i <= 5; i++) { // 조건식에 따라서 실행할 구문이 한 문장 이상
			System.out.println("반복할 for문 연습" + i);// 3)
		}
		System.out.println("===================");
		System.out.println("2. for문의 유형2(C언어 유형)");
		/*
		int k; // 초기식의 변수를 for문 밖에 선언 -> C언어
//		      1)		 2)5)		  4)
		for (k = 10; k > 5; k--)
			System.out.println(k + "테스트"); // 3)
		*/
		
		System.out.println("3. 초기식이 생략된 for문 유형");
		int k = 10;
		for (; k > 5; k--) {
			System.out.println(k + "테스트");
		}
		
		System.out.println("4. 최소한의 for문 구성(증감식도 생략 가능)");
		int c=1; //초기식은 for문 밖에 선언이 가능하다.
//		c++; //2, 증감식은 for문 밖에 선언할 수가 없다.
		for (; c <= 20;) {
			System.out.println("20번 반복" + c);
			c++; // for문이 증감식은 생략이 가능하지만 for문 내부에 작성해야 한다.
		}
		
		System.out.println("for문의 전부 생략");
//		while (true) { // for(;;)
//			System.out.println("무한 루프");
//		}
		System.out.println("5. 합계, 곱을 동시에 구하기");
//		1~100까지의 합을 구하기 -> 1+2+3,,,100=5050
//		어떤 변수가 필요한가? 몇개가 필요한가?
		int sum = 0; // 1+2+3+,,,100
		int gap = 1; // 곱 -> 0(X)
		
		for (int i = 1; i <= 5; i++) {
			sum += i; // sum=sum+i
			gap *= i; // gap=gap*i;
			System.out.println("중간합계(sum) =>" + sum);
			System.out.println("중간곱(gap) =>" + gap);
			System.out.println("=================");
		}//for
		System.out.println("최종합계(sum) =>" + sum);
		System.out.println("최종곱(gap) =>" + gap);
		
		// 1~100까지의 합 => 짝수의 합(2,4,6,8,10,,,),홀수의 합
		int total = 0;
		for (int i=1; i <= 100; i += 2) {//1+2+3+(x)   2,4,6~
//			if (i%2==0) //짝수의 합(홀수의 합은 i%2==1)
				total += i;
		}
		System.out.println("total =>"+total);

	}//main

}
