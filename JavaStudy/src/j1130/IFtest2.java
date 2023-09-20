package j1130;

public class IFtest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("if중첩문");
//		ctrl+A(전체블럭 지정) => ctrl+shift+f(자동정렬 기능)
		int su = 190;
//		조건1)su -> 1~100까지의 범위에 들어가 있는 경우에만 짝수, 홀수를 판별하기
//		조건2) 짝수, 홀수 판별하기
		if ((su >= 1) && (su <= 100)) {// 1~100까지의 범위에 들어간다면
			if (su % 2 == 0) {
				System.out.println(su + "은 짝수입니다.");
			} else {
				System.out.println(su + "은 홀수입니다.");
			} // else
		} else { // 1~100사이의 범위가 X
			System.out.println("su값은 1~100까지의 값만 입력이 가능합니다.");
		}
		System.out.println("if문 연습"); // 순차문
	}// main
}
