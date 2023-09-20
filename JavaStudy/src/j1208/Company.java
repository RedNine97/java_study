package j1208;

//부서의 팀장정보 저장 = 중복코딩이 필요(업무상)
// 형식) class 자식클래스명 extends 부모클래스명
class Manager extends Employee {
	/*
	 * 부모한테 물려받은 멤버변수(중복된 코드 ex Employee) String name; int age; String sung; String
	 * addr; long salary;
	 */

	String departmaent; // 부서명 => 영업부 3명,,,
//	객체배열 => 객체만 저장이 되는 배열(직원의 정보)
	Employee sub[]; // new Employee[3] // Employee 객체만 저장
//	int sub[];

	public Manager() {
	}

	public Manager(String name, int age, String sung, String addr, long salary, String departmaent) {
//		부모한테 물려받은 멤버변수
		this.name = name;
		this.age = age;
		this.sung = sung;
		this.addr = addr;
		this.salary = salary;
//----------------------------------------------		
		this.departmaent = departmaent;
		this.sub = sub;
	}
//	자식의 입장에 맞게 내용을 다시 써주는 행위 => 오버라이딩
	double bonus() { // 일반메서드 -> 객체명.일반메서드명 (~)
		return salary*3.0;
	}
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 신입사원 3명 배정
		Employee e1 = new Employee("박춘길", 24, "남", "서울시 논현구", 1500);
		Employee e2 = new Employee("권오수", 32, "남", "대전시 중구", 1700);
		Employee e3 = new Employee("박춘자", 43, "여", "부산시 ~", 1800);

//		2.부서배치(=개발부)
		Manager m1 = new Manager("이미자", 30, "여", "서울시 강남구", 3500, "개발1과");

		m1.sub = new Employee[3]; // Employee 데이터 저장공간 3개 생성
		m1.sub[0] = e1; // 박춘길
		m1.sub[1] = e2;// 권오수
		m1.sub[2] = e3;
//		부하직원의 정보 출력, 팀장출력
		for (int i = 0; i < m1.sub.length; i++) { //e1.name="박춘길"
//			System.out.println("직원명 => "+ m1.sub[i].name);
//			System.out.println("직원나이 => "+ m1.sub[i].getAge());
//			System.out.println("=========================");
			m1.sub[i].display(); //멤버변수 출력 구문
		}
//		팀장 1명 정보
		m1.display();
	}//main
}//Company
