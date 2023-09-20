package j1219;

import java.util.*;// List, ArrayList

/* 2. < ? extends T > => 상속관계로 이루어진 클래스만 자료형을 받겠다는 표시
 *  							        ? 자식클래스(Man,Woman), T(부모, Person, Test)
 *  								    부모클래스 뿐만 아니라 자식클래스만 임의의 자료형으로
 *  								    매개변수 전달받겠다는 표시
 */

class Test { //부모클래스
	String name;
}
class Person { //부모클래스
	String name;
}

// Man
class Man extends Test {
	Man(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

// Woman
class Woman extends Test {
	Woman(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		return this.name;
	}
}

public class WildExtend {
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
		/*\
		List<Person> list3 = new ArrayList();
		list3.add(new Person());
		printData(list3);
		*/
//		4. Test
		
		List<Test> list4 = new ArrayList();
		list4.add(new Test());
		printData(list4);
		
	}//main
	
//	<?> => 매개변수를 전달받을때 그때 그때마다 자료형을 바꿔서 전달받겠다.
//	상속관계와 상관없이 부모, 자식클래스 다 적용이 된다.
//	public static void printData(List<?> list) { //모든 클래스 OK
//	<? extends T>
//	public static void printData(List<? extends Person> list) {
//											Person (O), Men,Woman (O)
	public static void printData(List<? extends Test> list) {
		for(Object obj:list) { //Test (O), Men,Woman (O) Person (X)
			System.out.println(obj);
		}
	}

}//WildTest
