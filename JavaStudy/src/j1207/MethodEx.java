package j1207;

import java.util.Scanner; //import 최상위패키지명.하위패키지명,,,불러올클래스명;

// 성적처리 프로그램 => 국, 영, 수 -> 합계 -> 평균 -> 등급 -> 모든 정보 출력
public class MethodEx {
//	< 요구 분석에 따라서 필요로 하는 메서드를 생각 >
	/*
	 * 메서드를 작성하는데 매개변수를 주는 경우, 안주는 경우(구분하는 방법)
	 * 1. 멤버변수를 선언 -> 매개변수가 없는 메소드를 작성 (O)
	 * 2. 멤버변수가 존재 (X) -> main() 선언  지역변수로 선언
	 * 									매개변수가 있는 메서드를 작성 (O)
	 */
	/* < 매개변수 없이 작성할 시 main에 선언 X >
	  멤버변수는 객체를 생성할 때 공간이 같이 생성된다.
	int kor, eng, mat;
	double avg;
	char grade;
	*/
	
	/* 
	    정적 메서드(static)
	     가장 자주 사용이 되는 메서드는 따로 객체생성 없이 호출할 수 있도록 
	     맨 처음부터 메모리에 올린다.                                           */
	
//	1. 총점(=합계) -> 계산목적 -> 반환값(O)
	static int calcSum(int kor, int eng, int mat) {
		int sum=kor+eng+mat;
		return sum;
	}
	
//	2. 평균 -> 총점 / 과목수 -> 반환값(O)
	static double calcAvg(int tot) { //국, 영, 수 평균만 처리하는 메서드
		return (double)(tot/3);
	}
//	2-2) 평균2 과목수가 자주 변경이 되는 경우 => 메서드 오버로딩 
//	메서드 내부에서만 선언된 것은 지역변수, 매개변수도 지역변수이다.
//	메서드를 호출할 때 생성 => 자동적으로 메모리에서 사라진다.
	static double calcAvg(int tot, int su) { 
		return (double)(tot/su);
	}
//	3. 등급(=학점) -> 평균 -> 반환값(O)
	char calcGrade(double avg) {
//		90~100 A
		if (avg<=100 && avg>=90) return 'A';
			else if(avg<90 && avg>=80) return 'B';
			else if(avg<80 && avg>=70) return 'C';
			else if(avg<70 && avg>=60) return 'D';
			else return 'F';
	}
	
//	4. 총점, 평균, 등급을 모두 출력 => (단순, 반복) 매개변수 X, 반환값 X
	void display(int tot, double avg, char grade) {
		System.out.println("총점, 평균, 등급을 모두 출력");
		System.out.println("합계 (tot) => "+ tot);
		System.out.println("평균 (avg) => "+avg);
		System.out.println("등급 (grade) => "+ grade);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체생성
		MethodEx me = new MethodEx();
		
//		int kor=90;    //<---- 매개변수 있게 작성할 시 main에 선언
//		int eng=97;
//		int mat=98;
		/*
		 * 사용자로부터 값을 입력 받아서 처리해주는 클래스 ->Scanner
		 * nextInt() -> 정수, next() -> 문자, nextDouble() -> 소수점(실수)
		 */
//		키보드를 통해서 문자 또는 숫자를 받을 객체를 생성
		Scanner sc =new Scanner(System.in);
		System.out.println("1.국어점수는?");
		int kor = sc.nextInt();
		System.out.println("2.영어점수는?");
		int eng = sc.nextInt();
		System.out.println("3.수학점수는?");
		int mat = sc.nextInt();
/////////////////////////////////////////////////////////////////////
		
//		1) 총점 => 클래스명.정적메서드명
		int tot=MethodEx.calcSum(kor, eng, mat);
//		System.out.println("합계 (tot) => "+tot);
//		2) 평균 => 자기가 가진 정적메서드라면 클래스명이 생략 가능하다.
		double avg=calcAvg(tot); //215/3

//		3) 등급 => 일반메서드 : 객체명.일반메서드명() or (~)
		char grade=me.calcGrade(avg); //C

//		4)display
		me.display(tot, avg, grade);
	}//main

}//MethodEx
