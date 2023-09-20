package j1207;

class Rect {
//	1. 공통의 멤버변수(=인스턴스 변수)  
	private int x,y=10;   //가로(넓이), 세로(높이) 
	private int area;		//면적 
//추가//////// (), (x), (y), (x,y) ////////////////////////////////////////////////////////
//	기본생성자
	Rect() {
		this(90,100);  //다른 생성자를 호출할 땐 첫 번째로 써야한다.
		
//		this.x=90; // this -> 현재 생성된 객체의 주소값을 대신 받은 예약어
//		this.y=100;
//		System.out.println("기본생성자(멤버변수 초기화(x, y))");
		System.out.println("x의 값 => " + x + ", 이고 y 값은 " + y);
		System.out.println("x*y => " + x * y + "입니다.");
		//this(90,100); 
	}
	Rect (int x){
		if (x < 0) {
			System.out.println("음수를 받을 수 없습니다.");
		}else {
			this.x=x;
			this.y=40;
			System.out.println("1개짜리 생성자 호출(this.x) => "+this.x);
		}
	}
	Rect (double y){   //int -> double(자동형변환)
								 //int <- double(명시적인 형변환)
		this.y=(int)y;
	}
	Rect(int x, int y){
		this.x=x;          //p1.x=90
		this.y=y;			//p1.y=100
		System.out.println("2개짜리 생성자 호출");
	}
/////////////////////////////////////////////////////////////////////////////////////////
//	setter Method
	public void setX(int x) {
		if (x < 0) {
			System.out.println("x의 값은 음수를 받을 수 없습니다.");
			this.x=10;   //디폴트 
			return; 
		}
		this.x = x; 
	}
	public void setY(int y) {
		if (y < 0) {
			System.out.println("y의 값은 음수를 받을 수 없습니다.");
		} else {
			this.y = y;
		}
	}
	public void setArea(int area) {
		this.area = area;
	}
//	getter Method
	public int getX() { return this.x; }
	public int getY() { return this.y;}
	public int getArea() { return this.area; }

//	2. 공통의 기능(=메서드) 
//	1) 매개변수 X 반환값 X 
	void print() {
		System.out.println("x의 값 => " + this.x + ", 이고 y 값은 " + this.y);
		System.out.println("x*y => " + this.x * this.y + "입니다.");
		System.out.println("===========================");
	}

//2) 매개변수 O 반환값 X => 입력을 받아서 출력, 계산, 저장
void area(int a, int b) {
	this.x=a;  // 멤버 변수 = 매개 변수 x=20
	this.y=b;  // y=40;
	System.out.println("x*y => "+x*y+"입니다.");
}
//3) 매개변수 O 반환값 O => 계산목적, 웹 프로그래밍에서 많이 활용

int area2(int a, int b) {
	int result = a * b;  

	return result; 
 }
}
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		추가
//		Rect 클래스 객체r2 생성하면서 인수 1개짜리 정수형 생성자 호출
		Rect r2 = new Rect(30); //Rect(int x)
		r2.setY(40); //y=40
		r2.print();
		System.out.println("r2 => "+ r2);

		Rect p1 = new Rect(); //new Rect(90,100)

		p1.setX(50); p1.setY(60);
		p1.print(); //this() 첫 번째 호출
		p1.print(); // 수정된 set값 출력
		
//		멤버변수 3개 
		Rect p2 = new Rect(20, 10);
		p2.print();
		
		Rect p3 = new Rect(11,6);
		p3.print();
	}
}
