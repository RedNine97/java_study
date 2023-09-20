package j1216.sub;

import java.util.*;
//회원가입 -> 회원로그인 -> 관리자만 회원리스트 목록을 볼 수 있도록 구성
import java.io.Serializable;

//class Person implements Serializable {
class Person { // DTO(Data Transfer Object) 데이터 전송객체
	
	private String name;
	private int age;
	
	public Person() {}
	
	public Person(String name, int age) {
		this.name=name;
		this.age =age;
	}
//	---------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}//class Person

public class ArrayListTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("회원명?");
		String name = sc.next(); //단어
		
		System.out.println("나이는?");
		int age = sc.nextInt();
		
		Person p = new Person(); //new Person(name,age);
		p.setName(name); // input box
		p.setAge(age); //수정
		
		Person p2 = new Person(); 
		p2.setName("임시2"); 
		p2.setAge(32);
		
		Person p3 = new Person(); 
		p3.setName("테스트김"); 
		p3.setAge(25);
//		ArrayList을 이용해서 저장
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(p); list.add(p2); list.add(p3);
		
//		출력
		ArrayListTest2 alt = new ArrayListTest2();
		alt.setPersonList(list);
//		getPersonList() => ArrayList => setPersonList()의 매개변수로 전달
		System.out.println("==============================");
		/*ArrayList<Person> list33 = alt.getPersonList();
		 * alt.setPersonList(list33);
		 */
		alt.setPersonList(alt.getPersonList());
		
	}//main
//	ArrayList<Person>매개변수로 전달받아서 출력 -> html  (X)
//	콘솔에 출력
	public void setPersonList(ArrayList<Person> list) {
		/*
		for (int i=0; i< list.size(); i++) {
			Person st =list.get(i); // <td> <%=st.getName()%></td>
			System.out.println("이름은 => " + st.getName());
			System.out.println("나이는 => " + st.getAge());
		}
		*/
		for(Person st:list) { //저장된 갯수만큼 꺼내서 출력
			System.out.println("이름은 => " + st.getName());
			System.out.println("나이는 => " + st.getAge());
		}
		
	}
	
//	웹에 출력시켜주는 메서드를 작성(DB에 저장된 데이터를 찾아서 담아서 출력)
	public ArrayList<Person> getPersonList() {
//		DB에 접속해서 데이터를 가져온다는 전체
		ArrayList<Person> list2 = new ArrayList<Person>();
		list2.add(new Person("hong",23)); //익명객체형태
		list2.add(new Person("kim",43));
		return list2;
	}
	
}//ArrayListTest2
