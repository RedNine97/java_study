package j1219.super2;

import java.util.*;// List, ArrayList

//메서드의 매개변수로써 전달받았을때 사용가능한 제너릭 패턴
/* 3. < ? super T > => T(자식클래스)를 고정으로 지정해주고 자식클래스와 연관이 있는 
 * 									부모클래스는 누구나 적용이 되게 하겠다.
 * 									(매개변수로 전달 받았을때)
 */

class Person { //부모클래스
	String name;
//	생성자 오버로딩
	Person () {}
	Person (String name) {
		this.name=name;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return this.name;
		}
}

// Man
class Man extends Person {
	Man(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

// Woman
class Woman extends Person {
	Woman(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

public class WildSuper {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Man
		List<Man> list = new ArrayList();
		/*
		Man m = new Man("임시");
		list.add(m);
		*/
		list.add(new Man("임시")); //익명객체
		list.add(new Man("테스트"));
		printData(list);
		
//		2. Women
		List<Woman> list2 = new ArrayList();
		list2.add(new Woman("임시2"));
		list2.add(new Woman("테스트2"));
		printData(list2);
		
//		3. Person
		List<Person> list3 = new ArrayList();
		list3.add(new Person("사장넴"));
		list3.add(new Person("이사넴"));
		printData(list3);
		
//		4. Double
		List<Double> list4 = new ArrayList();
		list4.add(12.5); list4.add(27.5);
		printData(list4);
	}//main
	
//	<?> => 매개변수를 전달받을때 그때 그때마다 자료형을 바꿔서 전달받겠다.
//	상속관계와 상관없이 부모, 자식클래스 다 적용이 된다.
	public static void printData(List<?> list) { //모든 클래스 OK
//	<? extends T>
//	public static void printData(List<? extends Person> list) {
//											Person (O), Men,Woman (O)
//	public static void printData(List<? extends Test> list) {
//											Test (O), Men,Woman (O) Person (X)
//	<? super T>
//	public static void printData(List<? super Man> list) {
//										     Man (O), Person (O)
//	public static void printData(List<? super Woman> list) {
//	                                         Woman (O), Person (O)
//	public static void printData(List<? super Person> list) {
		for(Object obj:list) {     //  Person (O)
			System.out.println(obj);
		}
	}
}//WildTest
