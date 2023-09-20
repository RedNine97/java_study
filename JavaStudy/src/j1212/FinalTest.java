package j1212;

// 3. final class명 => 상속금지(내용을 변경하면 안되는 클래스에 부여)
final class parent {
//	1. final +멤버변수 or 지역변수 => 상수화(변수의 값 고정)
	final int COUNT =1;
//	parent() {}
//	2. final +메서드명 => 상속은 허용해주지만 오버라이딩 금지 X
//	메서드의 성격과 전혀 다른 내용으로 변경하고 싶지 않을때 사용
//	기법
	public final void sum(int a, int b) {
		System.out.println("a+b => "+(a+b));
	}
}//parent

public class FinalTest /*extends parent */{
//	오버라이딩 금지
	/*
	public void sum(int a, int b) {
		System.out.println("데이터 연습중");
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p = new parent();
//		p.count=5; //1 ->5 값 변경 금지
		System.out.println("p.COUNT => "+p.COUNT); //5
		p.sum(10, 5); //15
		
	}//main

}//FinalTest
