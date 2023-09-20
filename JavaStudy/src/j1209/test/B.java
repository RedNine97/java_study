package j1209.test;

//같은 패키지에 존재할지라도 접근 불가 X
//같은 패키지 안에 들어가 있는 다른 클래스는 import 사용 안함 (X) 
//                                                  --> 자동으로 인식하기 때문
public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A();
/*		private는 자기 클래스만 가능하다.
		a.i=20;
		a.print();
*/
//		(default) -> 같은 패키지 임으로 가능하다.	
		System.out.println("===== default권한 ====");
		a.j=200;
		a.print2(); //200
		
//		protected -> 같은 패키지 임으로 가능하다.	
		System.out.println("===== protected(같은 패키지 가능) 권한 =====");
		a.k=300;
		a.print3(); //300
		
//		public -> 같은 패키지 임으로 가능하다.	
		System.out.println("===== public 권한 =====");
		a.m=400;
		a.print4(); //400
		
	}
}
