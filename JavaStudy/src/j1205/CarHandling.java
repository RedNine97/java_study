package j1205;

//기존의 자료형X -> 새로운 자료형을 불러와서 데이터 저장, 수정, 조회, 삭제
public class CarHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체생성 -> 객체(저장할 대상자)을 저장할 수 있는 공간을 만들어라
//		형식) 설계도 이름(=클래스 이름) 객체명(=변수) = new 클래스명()
		int age;           //4byte 기억 공간이 생성(O)된다.
//		Car morning;    //객체 선언 -> 기억공간이 생성X (예약된 상태)
		Car morning = new Car();       //공간이 생성
		Car sonata = new Car();
//		morning 정보를 저장 할 공간하나를 생성하라 4byte
//		j1202(패키지명).Car(클래스명)@6f2b958e(데이터가 저장된 주소값)
		System.out.println("morning => "+morning);
		System.out.println("sonata => "+sonata);
//		2. 객체명(저장된 위치).멤버변수명=값(저장)
		/*
		  (1) 엉터리 값과 올바른 값을 구분해서 저장할 수 가 없다.
		
		morning.name="모닝";
		morning.output=1000;
		morning.color="blue";
		morning.year=2022;
		
		sonata.name="소나타";
		*/
//		(2)Setter Method를 통해서 값을 저장
		morning.setName("모닝");
		morning.setOutput(-1000);
		morning.setColor("blue");
		morning.setYear(2018);
		
		sonata.setName("소나타");
		sonata.setOutput(2000);
		sonata.setColor("red");
		sonata.setYear(2032);
		
//		3. 운전 -> 메서드 호출 -> 기능 작동 (리모콘 버튼 클릭)
//		morning.startEnginee();    //객체명.메서드명() or (~)
		morning.speedUp(15000); 	 //speedUp 메서드를 호출하면서 150값 전달
		morning.speedDown(30);
//		객체명(저장된 위치명).멤버변수
		System.out.println("차의 이름 => "+morning.getName());
		System.out.println("차의 배기량 => "+morning.getOutput());
//		자주 사용된고 반복적인 코드 => 메서드를 만들어서 호출
//		-> 코드의 재사용성, 코딩양이 줄어든다.(개발시간이 단축된다.) => 프로그램 안정화
		
		morning.carInfoPrint();
		sonata.carInfoPrint();   //같은 메서드라도 저장되는 위치가 다르다.
		
	}//main
}
