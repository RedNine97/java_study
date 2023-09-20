package j1206;

public class Rect {
//	1. 공통의 멤버변수(=인스턴스 변수)
	private String name;  //면적을 구하고자 하는 이름
	private int x,y=10;         //가로(넓이), 세로(높이) 
	private int area;		//면적 
	
//	setter Method(저장) <- 입력 받아서 저장하기 때문에 반환값이 없다.
	public void setName(String n) {
		name = n;
	}
	public void setX(int a) {
		if (a < 0) {
			System.out.println("x의 값은 음수를 받을 수 없습니다.");
			x=10;    //default
			return; //탈출문 역할(break대신에 사용)
		}
		x = a; //멤버변수=매개변수(전달받은 값)
	}
//	public void setXXXX(매개변수_자료형 변수명){멤버변수=매개변수}    <- **공식(형식)
	public void setY(int b) {
		if (b < 0) {
			System.out.println("y의 값은 음수를 받을 수 없습니다.");
		} else {
			y = b;
		}
	}
	public void setArea(int a) {
		area = a;
	}
//	getter Method(불러와서 출력) 작성
//	public 자료형_반환형 getXXXXX() { return 멤버변수 }                <- **공식(형식)
	public String getName( ) { return name; }
	public int getX() { return x; }
	public int getY() { return y;}
	public int getArea() { return area; }
//	================================================
	
//	2. 공통의 기능(=메서드) 
//	1) 매개변수 X 반환값 X 
	void print() {
		System.out.println("x의 값 => " + x + ", 이고 y 값은 " + y);
		System.out.println("x*y => " + x * y + "입니다.");
	}
}
