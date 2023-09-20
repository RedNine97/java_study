package j1205;
//직사각형 (면적=가로*세로)
public class Rect {
//	1. 공통의 멤버변수(=인스턴스 변수)
	String name;  //면적을 구하고자 하는 이름
	int x,y;         //가로(넓이), 세로(높이) ->x*y -> 삼각형의 면적 -> x*y*0.5
	int area;		//면적 double area = 원의 면적
	
//	2. 공통의 기능(=메서드) => 면적을 구하기
//	1) 매개변수 X 반환값 X => 단순하고 반복적 (똑같은 문장을 계속 반복)
	void print() {
		System.out.println("x의 값 => "+x+", 이고 y 값은 "+ y);
		System.out.println("x*y => "+x*y+"입니다.");
	}
//	2) 매개변수 O 반환값 X => 입력을 받아서 출력, 계산, 저장
	void area(int a, int b) {
		x=a;  // 멤버 변수 = 매개 변수 x=20
		y=b;  // y=40;
		System.out.println("x*y => "+x*y+"입니다.");
	}
//	3) 매개변수 O 반환값 O => 계산목적, 웹 프로그래밍에서 많이 활용
//	반환값 => 그 메서드가 처리해서 얻은 결과값 (메서드 자체에서 처리 X)
//				  호출하는 caller에게 처리한 계산값 (보고 O 반환값 O)
	
	int area2(int a, int b) {
		int result = a * b;   //60*40
//		메서드 맨 마지막에 형식) return 계산값(변수) or 수식 or 객체
		return result; //return a*b;
	}
}
