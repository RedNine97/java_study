package j1216;
/*
 * 컬렉션(Collection) => 데이터(객체)를 저장할 수 있는 구조(List, Set, Map)
 * 							  => 객체만 저장이 된다.
 * 기본자료형(8가지) -> 객체가 아니기 때문에 저장 (X) <-> 참조형(=객체형 =참조형 =클래스형)
 * 기본자료형을 컬렉션에 저장하고 싶다. => 기본자료형 => 객체형으로 만든 클래스
 * 																	  (=Wrapper 클래스)
 */
public class BoxingTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동 unboxing");
//		int obj =10;  Integer -> int + int => int(sum)
		Integer obj =new Integer(10);
//		unboxing => 자바의 객체형(Wrapper) => 기본자료형으로 변환
//		int sum = obj +20; -> int sum = obj.intValue()+20; //Integer + int -> int + int
		int sum = obj+20;
		System.out.println("sum => " + sum);
		
		System.out.println("자동 boxing"); //기본자료형 => Wrapper 객체
/*		Double d = new Double(123.45);
		printDouble(d);                                                                   */
		printDouble(new Double(123.45));
		printDouble(143.67); //double -> new Double(143.67)
	}//main
	// toString() : 문자열로 변환해주는 메서드
	static void printDouble(Double obj2) {
		System.out.println(obj2.toString()); //소수점을 문자열로 변환 
																//123.45 -> "123.45"
	}
	
}//BoxingTest
