package j1214;
/* 
 * 객에형변환(자동, 명식적인 형변환)
 * 
 *  단점 : 1. 업무별로 세금율이 다 다르기에 직원의 수가 많고 업무가 복잡하다.
 *  		 2. 중복된 코딩이 반복적으로 사용된다.
 *  장점 : 메서드의 갯수를 줄일 수 있고, 오버라이딩 갯수를 줄일 수 있다.
 *  	 -> 코딩을 줄일 수 있다. -> 개발시간이 단축되고 -> 프로그램의 효율성 극대화
 */
class Employee { // 일반직원 클래스
//	세금율 -> 내부적으로 구분 ->  Employee or Manager or Engineer
//	매개변수의 자료형(Employee)이 부모형인 이유 -> 부모 + 자식까지 다 처리해주기 때문이다.
	public void taxRate(Employee e) { //0.1 // 객체자동형변환
//		내부에서 부모, 자식을 구분해서  -> 각각 처리
		if(e instanceof Manager/*생략 ==true*/) { //man.taxRate(man);
			Manager m = (Manager)e; //자식형으로 객체 명시적인 형변환 
			System.out.println("Manager에 맞게 세금계산(1.0) => "+m);
		}else if (e instanceof Engineer) {
			Engineer en = (Engineer)e;
			System.out.println("Engineer에 맞게 세금계산(0.7) => "+en);
		}else if(e instanceof Employee) {
			System.out.println("Employee에 맞게 세금계산(0.1) => "+e);
		}
			
	}
//	public void taxRate(Manager e) {} //1.0   <--- 오버라이딩
//	public void taxRate(Engineer e) {} //0.7   <--- 오버라이딩
}

//팀장 -> 팀장의 역할 + 직원의 역할
class Manager extends Employee {
//	public void taxRate(Manager e) {}            <--- 오버라이딩
}

//엔지니어 - > 엔지니어 역할 + 일반직원의 역할
class Engineer extends Employee {
//	public void taxRate(Engineer e) {}            <--- 오버라이딩
}

public class CastTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		Manager man = new Manager();
		Engineer eng = new Engineer();
//		세금율 -> taxRate() -> 자식들도 부모의 메서드를 사용할 수 있다. (객체자동형변환 때문이다.)
		emp.taxRate(emp); //부모 
		man.taxRate(man); //자식
		eng.taxRate(eng);   //자식
		
	}// main
	
}// class CastTest
