package j1207;

//다른 패키지 안에 들어있는 메서드를 사용 -> 클래스를 불러오기
//import 최상위 패키지명.하위패키지명....불러올 클래스명,*
import java.lang.Math;

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
//////추가 ///////////////////////////////////////////////////////////////////////
		System.out.println("=외부의 다른 클래스의 정적 메서드 불러오기=");
//		단순, 보편적인 기능 -> 절대값, 최대값, 최소값,,,정적 메서드(java.leng.Math;)
		int abs=-500;
		
		abs=(abs<0)? -abs:abs;
		System.out.println("절대값 abs => "+abs);
		
		abs=Math.abs(-2500);// 클래스명.정적메서드명(~)
		System.out.println("절대값 abs => "+abs);
		
//		최대값 java.lang.max(int a, int b)
		int max= Math.max(34, 98);
		System.out.println("최대값 abs => "+max);
//		최솟값 
		int min=Math.min(34, 98);
		System.out.println("최소값 abs => "+min);
//		가장 기본적인 기능, 자주사용되는 정적메서드 => 불러다 사용
//		업무에 필요 -> 일반메서드 작성
	}//main
}
