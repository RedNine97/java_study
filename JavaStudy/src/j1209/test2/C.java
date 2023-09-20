package j1209.test2;

import j1209.test.A;
import j1209.test.*; //*인 경우 => A, B 도 모두 포함

//다른 패키지에 있으면 import로 어디에 있는지 알려줘야 된다.(접근클래스)

//    public class C {
	public class C extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
/*		private 때문에 다른 패키지도 안된다.
		a.i=20;     //a.setI(20); 메서드가 있다면 가능( O )
		a.print();
*/		
/*		
//		(default) -> 다른 패키지 임으로 안된다.
		System.out.println("===== default권한(다른 패키지 기능 X) ====");
		a.j=200;
		a.print2(); //200
		// 상속받은 자식클래스도 다른 패키지 이기에 접근이 불가능하다. (public class C extends A)
		System.out.println("=== 상속을 받은 자식클래스의 객체도 접근 X ===");
		C c = new C(); 
		c.j=300;			 
		c.print2();
		
//		protected -> 다른 패키지 임으로 안된다.
		System.out.println("===== protected(다른 패키지 불가능) 권한 =====");
		a.k=400;
		a.print3(); //400
*/		
//		외부 패키지이지만 상속받은 자식클래스는 가능하다. (public class C extends A)
		System.out.println("=== 상속을 받은 자식클래스의 객체면 접근 O ===");
		C c = new C(); // 단, 부모클래스의 객체가 아닌 자식클래스의 객체를 통해서 접근해야한다.
		c.k=300;			 
		c.print3();
		
//		public -> 다른 패키지, 상속받던지 간에 다 가능하다.	
		System.out.println("===== public 권한 =====");
		a.m=400;
		a.print4(); //400
		
	}
}
