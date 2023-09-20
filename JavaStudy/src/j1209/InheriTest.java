package j1209;
/*
 * 상속과 생성자와의 관계
 * 
 * 1. 모든 클래스는 java.lang.Object로부터 상속 받는다.
 * 2. 자식클래스 -> 객체를 생성 -> 부모클래스의 생성자를 먼처 호출하여 자식 생성자를 호출한다.
 */
//import java.lang.*; 외에 다른 패키지의 클래스는 반드시 import를 써야한다.

class Parent extends Object{ //(4) Object 생성자 호출
	public Parent() {
		super(); //(3)
		System.out.println("난 Parent 기본생성자 호출됨!!"); //(5)
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "내용을 변경하고 싶다.";
		}
}
//class Child extends Object 순차적 상속 받는다.
class Child extends Parent{
	public Child() {
		super(); //(2)
		System.out.println("난 Child 기본생성자 호출됨!!"); //(6)
	}
}
public class InheriTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println("p => "+p);
		System.out.println("p.toString() => "+p.toString());
		Child c = new Child(); //(1)
		System.out.println("c => "+c); //(7)
		System.out.println("c.toString() => "+c.toString());
		
	}

}
