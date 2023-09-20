package j1206;

// 직사각형 (면적=가로*세로)
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체생성 -> x, y 값을 저장할 공간을 생성하시오.
		Rect r = new Rect();     //직사각형 객체 생성
		System.out.println("r => "+r);     //객체 => 위치가 저장된 변수
		
//		2. 객체명.멤버변수 = 값;
		r.setName("직사각형");
		r.setX(10); r.setY(20);

//		3. 객체명.메서명() or (~,~,,,)
		r.print();
	}
}
