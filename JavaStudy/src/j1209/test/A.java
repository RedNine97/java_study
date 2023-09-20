package j1209.test;

public class A {
//	class A {
	
	private int i=10; //1. 멤버변수 앞에 부여 => 객체명.멤버변수 = 값 ( X )
								//public void setI(int i) {this.i=i;} => O
	int j; //접근지정자가 없으면 default 접근지정자를 부여한다. O
	
	protected int k;
	
	public int m;
	
//	private 권한
//	2. 메서드 앞에 부여 => 외부(같은 패키지 또는 다른 패키지)에서 접근 X
	private void print() {/*         A클래스 내부에서만 사용목적              */
		System.out.println("private i => "+ i);
	}
//	추가 default 권한
	void print2() { //메서드 앞에 default 접근지정자가 부여된 상태
		System.out.println("j(default) => "+ j);
	}
//	추가2 protected 권한
	protected void print3() {
		System.out.println("k(protected) => "+ k);
	}
//	추가3 public 권한 -> 다른 패키지에서도 접근이 가능하게 만들기 위해서
	public void print4() {
		System.out.println("m(public) => "+ m);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new A();
		System.out.println("===== private 권한 =====");
		a.i=20;
		a.print();
		
		System.out.println("===== default 권한 =====");
		a.j=200;
		a.print2(); //200
		
		System.out.println("===== protected 권한 =====");
		a.k=300;
		a.print3(); //300
		
		System.out.println("===== public 권한 =====");
		a.m=400;
		a.print4();
		
	}//main
}//A
