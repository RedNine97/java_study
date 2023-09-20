package j1212;
/*
 * static(정적의) -> 1. 정적변수 2. 정적메서드 3. 초기화 블럭(static { })
 * 
 * 멤버변수(=인스터스변수) => 클래스 내부에서 선언된 변수 => 공유 X (독립적 저장)
 * 정적변수(=클래스변수) => 모든 객체가 공유할 수 있도록 만들어진 변수
 * 								=> 클래스명.정적변수 or 객체명.정적변수
 * 									ex) 아파트 관리비(반장) 엘리베이터 수리, 회식,,
 */
class Car {
	String color;    //색깔
	String model;  //모델
	String owner; //주문자
//	차의 종류의 상관없이 차의 생산량의 합을 계산
	static int serialNumber; //공유값(ex 프린터 1대)

	public Car(String color, String model, String owner) {
		this.color = color; //c1.color = "Red"
		this.model = model; //c1.model = "SM5"
		this.owner = owner; //c1.owner = "테스트"
		serialNumber++; //공통으로 모든 객체가 불러다 사용하고 싶다.(공유)
	}
	
//	일반메서드 -> 정적메서드?
	public static int getNumber() {
		return serialNumber; //정적메서드 내부에서는 일반멤버변수 사용 X
										  //this를 정적메서드 내부에서는 사용할 수 없기 때문에
	}
	
//	main보다 먼저 실행시킬 구문이 필요하다면 여기에다 코딩
//	환경설정 -> DB연동
	static {
		System.out.println("제일 먼저 main()보다 실행할 구문이 있을때 사용");
		System.out.println("DB접속을 먼저 가능하도록 설정할때");
		System.out.println("1. static 정적변수 2. main() 호출");
		System.out.println("3. 정적메서드 4. 클래스순으로 메모리에 로딩");
	}
	
}//Car
public class CarFactory {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Red","SM5","테스트");
		Car c2 = new Car("Blue","Sonata","임시");
		Car c3 = new Car("Blue","Matiz","임시2");
		
		System.out.println("차의 생산량(객체명.정적변수) => "+c1.serialNumber);
		System.out.println("차의 생산량(객체명.정적변수) => "+c2.serialNumber);
		System.out.println("차의 생산량(클래스명.정적변수) => "+Car.serialNumber);
		System.out.println("차의 생산량(클래스명.정적메서드) => "+Car.getNumber());
		System.out.println("차의 생산량(객체명.정적메서드) => "+c1.getNumber());
		
	}//main
	
}//CarFactory
