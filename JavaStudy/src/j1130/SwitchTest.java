package j1130;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Switch구문"); //순차문

			int su = 51;
			/*
			if (su % 2 == 0) {
				System.out.println(su + "은 짝수입니다.");
			} else {
				System.out.println(su + "은 홀수입니다.");
			} // else
			*/
			switch(su%2) {//(su%2)->조건식에 따라서 case값이 적게나올 수 있도록 하는 조건
				case 0:
					System.out.println(su+"은 짝수");//수행할 문장
					break;
				case 1:
					System.out.println(su+"은 홀수");
					break;
			}
		System.out.println("switch구문 연습종료"); // 순차문
			
			
			
			
			
			
			
			
			
	}// main
}
