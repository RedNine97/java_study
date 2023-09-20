package j1221;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		외부에서 접근이 불가 => 객체생성 X -> 생성자 호출 X 
//		Singleton ob1 = new Singleton();
		Singleton ob1 = Singleton.getInstance();
		Singleton ob2 = Singleton.getInstance();
		Singleton ob3 = Singleton.getInstance();
//		객체명은 3개지만 실제 객체는 한 개이다 -> 주소값을 확인
//		Test t1 = Test.getInstance();
//		Test t2 = Test.getInstance();
//		CardCompany cc1 = CardCompany.getInstance();
//		CardCompany cc2 = CardCompany.getInstance();
		
		System.out.println("ob1 => "+ ob1);
		System.out.println("ob2 => "+ ob2);
		System.out.println("ob3 => "+ ob3);
//		System.out.println("t1 => "+ t1);
//		System.out.println("t2 => "+ t2);
//		System.out.println("cc1 => "+ cc1);
//		System.out.println("cc2 => "+ cc2);
		
		if(ob1==ob2) 
			System.out.println("ob1과 ob2는 같은 객체(=주소가 같다)");
		else 
			System.out.println("ob1과 ob2는 다른 객체(=주소가 다르다)");
		
//		if(t1==t2) 
//			System.out.println("ob1과 ob2는 같은 객체(=주소가 같다)");
//		else 
//			System.out.println("ob1과 ob2는 다른 객체(=주소가 다르다)");
		
	}//main

}//class MainTest
