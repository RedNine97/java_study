package j1201;
/*
 * 반복문 => 특정조건에 따라서 반복해서 실행이 되는 문장 => 반복해서 사용문장
 * 
 * 1. 반복할 횟수가 정해져 있는 경우 --> for, while
 * 2. 반복할 횟수가 정해져 있지 않은 경우 --> for (X), while(입출력 프로그램)
*/
public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		단순하고 반복적인 문장 1)반복할 횟수  2)반복해서 수행할 문장
		System.out.println("while구문 연습 1"); //1 -> start(시작값)
		System.out.println("while구문 연습 1");
		System.out.println("while구문 연습 1");
		System.out.println("while구문 연습 1");
		System.out.println("while구문 연습 1");//5 -> end(종료값)
		*/
//		무한루프 -> 끝도 계속 수행이 되는 문장들
		int i = 1; // 반복할 횟수
		/*(2) while구문을 사용한 경우
		while (i <= 5) {
			System.out.println("while구문 연습1 " + i);
			i++; // i=i+1 or i+=1
		} // while 구문
		*/	
		do {
			System.out.println("while구문 연습1 " + i);
			i++;
		} while (i <= 5);
		System.out.println("while구문 종료!!!");

	}

}
