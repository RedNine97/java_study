package j1130;

public class SwitchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Switch구문(범위지정)"); // 순차문

		int su = 7;
		switch (su) {// 0~10까지의 값만 입력을 받는 경우
			case 0:case 2:case 4:
			case 6:
			case 8: // case 1 To 10 (X)
			case 10:// case의 범위를 지정할 때 사용한다.
				System.out.println(su + "은 짝수");// 수행할 문장
				break;
			case 1:case 3:case 5:case 7:	case 9:
				System.out.println(su + "은 홀수");
				break;
			// 추가
			default:// if문의 else if구문의 마지막 else구문
				System.out.println("입력받을 수 있는 값은 0~10까지만");
				break;
		}
		System.out.println("switch구문 연습종료"); // 순차문
	}// main
}
