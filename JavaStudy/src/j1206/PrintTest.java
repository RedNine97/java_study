package j1206;

// 생성자 오버로딩 + 메서드 오버로딩
// 클래스를 작성하는 목적 -> 객체를 생성 -> 1. 데이터 저장 목적 2. 메서드 호출
class Test2 {
	void test() {
		System.out.println("다른 클래스의 객체명은 사용이 가능하다.");
	}
}

public class PrintTest {
//	멤버변수 없으면 데이터 저장이 안됨
//	3) 생성자 오버로딩
	PrintTest(){}
	PrintTest(char a){  // a='v'
//		생성자 내부에서는 자기 클래스의 객체명을 사용할 수 없다. ( X )  ---> this를 대신 쓴다.
//		ex) pt.print(a); 
//		생성자 내부에서는 다른 클래스의 객체명은 사용할 수 있다. ( O )  
//		ex) Test2 t2 = new Test2();     t2.test();
		this.print(a);  //print('v');  //(2)
		Test2 t2 = new Test2();
		t2.test();
		System.out.println("char 매개변수를 받아서 처리함");  //(4)
	}
	PrintTest(int a){
		print(a);  // 2022
	}
	PrintTest(boolean a){
		print(a);  // 3>2 -> print(true)
	}
	
//	2) 메서드 오버로딩
	
	void print(char a) {  // 메서드 이름을 같게(필수) 해줌 print & 자료형이 다름
		System.out.println("a => "+ a); //(3)
	}// charPrint
	
	void print(int a) {
		System.out.println("a => "+ a);
	}// intPrint
	
	void print(boolean a) {
		System.out.println("a => "+ a);
	}// booleanPrint
	
	
	
//	1) 
	/* 메서드 오버로딩 X
	void charPrint(char a) {  // 입력을 받아서 그대로 출력
		System.out.println("a => "+ a);
	}// charPrint
	
	void intPrint(int a) {
		System.out.println("a => "+ a);
	}// intPrint
	
	void booleanPrint(boolean a) {
		System.out.println("a => "+ a);
	}// booleanPrint
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1)
		/*
		PrintTest pt = new PrintTest();
		pt.charPrint('Y');
		pt.intPrint(2022);
		pt.booleanPrint(3 > 2);
		*/
//		2)
		/*
		PrintTest pt = new PrintTest();
		pt.print('Y');
		pt.print(2022);
		pt.print(3 > 2);
//		System.out.print();  <-- 오버로딩된 메서드임을 알 수 있다.
		*/
//		3)생성자 오버로딩
//		PrintTest pt 객체를 생성하면서 인수 1개짜리 문자열처리 생성자를 호출하라.
		PrintTest pt = new PrintTest('v'); //-> 생성자 -> Print('v')(1)
		PrintTest pt2 = new PrintTest(2022);
		PrintTest pt3 = new PrintTest(3>2);
		
		
	}//main
}
