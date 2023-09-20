package j1206;

// 아파트, 빌라에 거주하는 사람들의 정보를 저장(추상화, 캡슐화, 생성자오버로딩 + this)

class Person {   // 기본 생성자 --> Person() { }
	
//	1). 멤버변수(공통적인 특징, 특성)
	private String name;
	private int age; 
//	(내용X), (name), (age), (name, age) --> 2^n(n승)
//	String address, job, tell,,,
	
//	2. 기본생성자(=디폴트 생성자)  --> 없으면 자동으로 호출(생성)된다.
	Person() { 
		this.name = "길동구"; //  setName("길동구")
		this.age = 47;			 //  setAge(47)
		System.out.println("난 Person 클래스의 기본생성자 호출됨");
	}
//	Person p2 = new Person("테스트");
	Person(String n) { // 매개변수 1개라도 자료형이 다르기에 구분해서 호출된다.
		this.name = n;      // p2.name = "테스트"
		this.age = 24;			 
		System.out.println("난 매개변수 1개짜리 문자열 처리 생성자 호출됨");
	}
	Person(int age) {
		this.age = age;  //p3.age
		this.name = "테스트 김";
		System.out.println("난 매개변수 1개짜리 정수형 처리 생성자 호출됨");
	}
	Person(String n, int a) {
		this.name = n; 
		this.age = a;      //p4.age
		System.out.println("난 매개변수 2개짜리 생성자 호출됨");
	}

//		2). Setter Method
	public void setName(String n) {
		this.name=n;
	}
	public void setAge(int age) { //p1.age
		if (age < 0) {
			System.out.println("나이는 음수를 입력 불가하다.");
			this.age = 23; //default 기본값
		} else {
			this.age = age; 
		}
	}
	
//	3). getter Method
	public String getName() { return name; }
	public int getAge() { return age; }
	
//	단순, 반복
	void print() {// p1.print()
		System.out.println("이름 => "+ this.name); //p1.name
		System.out.println("나이 => "+ this.age); // p1.age
		System.out.println("==============");
	}
	
}// class Person

public class PersonHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*		( 수동으로 호출하는 방법 )
		 * Person per = new Person(); 
		 * per.setName("뽈롤로"); 
		 * per.setAge(87); per.print();
		 */
		
//		클래스명 객체명 = new 생성자()
		Person p1 = new Person();   //기본 생성자를 호출하라는 문장
		System.out.println("p1 => "+ p1);
//		수정 목적으로 사용하는 것이 Setter Method
		p1.setAge(24); // 47 -> 24로 수정
		p1.print();
//		Person 클래스 p2 객체생성 하면서 인수 1개짜리 문자열 처리 생성자 호출
		Person p2 = new Person("테스트");
		p2.print();
//		p3객체를 생성하면서 인수 2개짜리 생성자를 호출하라
		Person p3 = new Person(38);
		p3.print();
//		p4
		Person p4 = new Person("돌김", 99);
		p4.print();

		
		
	}//main
}//PersonHandling
