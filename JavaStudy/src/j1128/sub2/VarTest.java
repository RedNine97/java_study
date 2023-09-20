package j1128.sub2;

public class VarTest {//숫자

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("변수의 개요 및 선언, 작성법");
		/*
		 * 변수(Variable) => 메모리(RAM) 상에 문자, 숫자, 논리적인 값을 
		 * 							저장할 공간을 만들어준다.(ex box,그릇)
		 * 형식)var 변수명=값(자료형을 표시X)
		 *        <->자료형(=데이터형) 변수명=값
		 */
		int age;//var age; 정수값 변수선언(공간은 만들어졌으나 아직 저장X)
		age=25;
		//int age=25; 변수를 선언하면서 동시에 값을 25 저장
		System.out.println("올해 제 나이는 "+age+"살 입니다.");
	}
}
