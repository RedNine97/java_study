package j1212;
	
abstract class ImTest{
	public static int sum(int x, int y) {
		return (x+y);//(10+20)
	}
//	추상메서드 -> 메서드의 선언만 되어 있는 메서드이다. -> 형식)메서드명(~)
	public abstract void draw(); //추상메서드
	abstract public void go(); //추상메서드
	public void go2() {} //내용이 없는 일반메서드 (추상메서드 X)
}

public class Test extends ImTest {
	/* 상속
	  	public static int sum(int x, int y) {
		return (x+y);//(10+20)
	    }
	    
	    public void go2() {}
	 */
	public void draw() { //일반 -> 일반 (객체명을 생략 -> this써야된다.)
		int result=this.sum(10,20); //30
		System.out.println("result => "+ result);
	}
	public void go() {} //내용만 쓰지 않을뿐 일반메서드를 만든다.
	
	public static void main(String[] args) {//정적 -> 객체생성 -> 일반
		// TODO Auto-generated method stub
		Test t = new Test();
		t.draw();
		System.out.println(sum(30,40)); //70      t.sum(30,40)
//		클래스명을 생략 가능  정적메서드 직접 부를 수 있다.
	}//main
	
}//Test
