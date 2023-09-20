package j1130;

public class IFtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입출력 => 사용자로부터 값을 입력 -> Scanner객체를 이용
//		짝수, 홀수 판별(어떤수/2==0(2의 배수) /3==0(3의 배수))
		int su=31;
		/*
		if(su%2==0) //조건식(변수, 연산자(관계, 논리))
			System.out.println(su+"은 짝수입니다.");
		*/
		if (su%2==0) { //하나의 조건식에 처리해야할 문장이 하나이상일경우 {}
			System.out.println(su+"은 짝수입니다.");
			System.out.println("블럭처리 연습1");
		}else {
			 System.out.println(su+"은 홀수입니다.");
			 System.out.println("블럭처리 연습2");
		}//else
		System.out.println("==삼항연산자로 변경==");
		String su2=(su%2==0)? "짝수입니다":"홀수입니다";
		System.out.println("입력받은 값(su2)"+su2);
		System.out.println("if문 연습"); //순차문
	}//main
}
