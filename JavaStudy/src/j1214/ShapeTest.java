package j1214;

public class ShapeTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("객체 자동형변환 연습");
		Shape s = new Shape();
		Point p = new Point();
		Line l = new Line();
		Square sq = new Square();
		
//		각자 자신의 메서드를 호출
		s.shapeDraw();
		p.pointDraw();
		l.lineDraw();
		sq.squareDraw();
		
//		객체형변환
		System.out.println("==== 객체 자동형 변환 ====");
		Shape sh[] = new Shape[4]; //Shape형(자료형)의 객체만 저장
		sh[0] = s;
		sh[1] = new Point(); // 자식클래스 객체를 익명객체로 저장이 가능하다. (=  sh[1]=p;)
//		sh[1] = p;   // 자식클래스 객체는 -> 자동으로 부모형으로 변환되어 저장
		sh[2] = l;    // 부모형 < 자식형 (부모의 멤버변수, 메서드를 모두 가지고 있다.)
		sh[3] = sq; // ex) 직원(부모클래스) = 팀장(자식클래스)(직원의 기능(부모) + 팀장의 기능(자식))
		
		for (int i = 0; i < sh.length; i++) {
			sh[i].draw(); // 메서드명은 같지만 객체가 다르기에 다른 기능을 구현한다.
			whoAreYou(sh[i]);
		}//for
	}//main
	
//	혈연관계(부모 클래스, 자식 클래스) 확인 => 객체형변환이 가능한지 아닌지를 확인할 수 있다.
//	형식) 객체명 instanceof 부모클래스명 => true(자식 OK), false(자식 X)
	static void whoAreYou(Shape sh) {
//		Shape
		if (sh instanceof Shape)
			System.out.println("I am Shape");
		else
			System.out.println("I am not Shape");
//		Point
		if (sh instanceof Point)
			System.out.println("I am Point");
		else 
			System.out.println("I am not Point");
//		Line
		if (sh instanceof Line)
			System.out.println("I am Line");
		else 
			System.out.println("I am not Line");
//		Square
		if (sh instanceof Square)
			System.out.println("I am Square");
		else 
			System.out.println("I am not Square");
		System.out.println("---------------------------------");
	}
	
}//ShapeTest

//상속관계(Shape -> Point -> Line -> Square
class Shape {
//	모든 도형에 공통으로 사용하는 메서드
	void draw() {
		System.out.println("Shape");
	}
//	Shape에서만 사용하는 메서드
	void shapeDraw() {
		System.out.println("shapeDraw()");
	}
} //class Shape

//Point(참) ---> is a 관계 성립(draw, shpeDraw  + pointDraw = 3개
class Point extends Shape {
	void pointDraw() {// +1개
		System.out.println("pointDraw()");
	}
	
	void draw() { //오버로딩 draw => "Shape"
		System.out.println("Point");
	}
}//class Point

//Line => Point(3개) + 1개 = 4개
class Line extends Point {
	void lineDraw() {// +1개
		System.out.println("lineDraw()");
	}
	
	void draw() { //오버로딩 draw => "Point"
		System.out.println("Line");
	}
}//class Line

//Square => Line(4개) + 1개 = 5개
//다향성 : 같은 메서드를 호출 하지만 => 처리 결과가 다르다.
class Square extends Line {
	void squareDraw() {// +1개
		System.out.println("squareDraw()");
	}
	
	void draw() { //오버로딩 draw => "Line"
		System.out.println("Square");
	}
}//class Square
