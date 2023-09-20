package j1205;

// 직사각형 (면적=가로*세로)
public class RectHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체생성 -> x, y 값을 저장할 공간을 생성하시오.
		Rect r = new Rect();     //직사각형 객체 생성
		System.out.println("r => "+r);     //객체 => 위치가 저장된 변수
		
//		2. 객체명.멤버변수 = 값;
		r.name="직사각형";
		r.x=10; r.y=20;

//		3. 객체명.메서명() or (~,~,,,)
		r.print();
		
//		4. 메서드를 호출해서 값을 저장
		r.area(20,40);        // area메서드 호출하면서 매개변수 20, 40 전달
		
//		5. 반환값이 있는 메서드 호출
//		형식) 반환받는 변수명 = 객체명.호출할 메서드명(~)
		int replay = r.area2(60,40);		//2400
		System.out.println("계산받은 결과값(replay) => "+replay);
		System.out.println("======================");
		System.out.println("r.area2(30,40) => " + r.area2(30,40));

	}
}
