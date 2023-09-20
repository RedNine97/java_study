package j1206;

//1. 메서드(=생성자 포함)를 작성할 때 멤버변수와 매개변수가 서로 같으면 어떻게 구분하는가?

public class ThisTest {
	private int a =100; // -> 200 -> 400
	
	ThisTest(int a){
		this.a=a;		//this.멤버변수=매개변수                (a=a; 사람만 구분가능하다.)
	}
	public void setA(int a) {
		this.a=a; //a=400
	}
	public int getA() { return a; }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ThisTest tt 객체생성 하면서 정수형 인수 1개짜리 생성자를 호출한다.
		ThisTest tt =new ThisTest(200);
		System.out.println("tt.getA() => "+ tt.getA()); // 200
		tt.setA(400);
		System.out.println("tt.getA() => "+ tt.getA()); // 400
		
	}// main
}// ThisTest
