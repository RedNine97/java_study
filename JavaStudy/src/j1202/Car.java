package j1202;
/* 추상화 -> 새롭게 저장할 대상자(자동차, 학생, 건물, 마우스,,,)를 저장할 목적
으로 만들어진 설계도
*
*                ** 메서드의 종류 **
*    1. 매개변수 X  반환값 X => 단순하고, 반복적인 일
*    2. 매개변수 O  반환값 X => 데이터를 입력 받아서 데이터를 저장, 계산, 출력
*    3. 매개변수 O  반환값 O => 전통) 계산, 웹프로그래밍
*/

public class Car { //클래스명(=새로운 자료형 이름) ex) byte, int,,,
	
// Car(객체) => 기본적으로 가지고 있는 특징(=8가지 자료형)
//	1. 멤버변수 => 클래스 내부에서 선언된 변수 -> 초기값이 설정
	String name;       // 명사이름
	int output;         //배기량
	int year;            //출시연도
	String color;       //차의 색깔
//	현재 상태
	int current_speed;   //차의 속도
//	int sidong=0;    //1 시동걸린 유무
	boolean sidong=false;    //차의 시동 유무
	
/*	2. 공통기능(=움직임) => 메서드 구현(=함수)
	1)시동걸기(단순, 반복) => 자주 사용하는 반복적인 기능 -> 매게변수 X 반환형 X
	기본 기능은 멤버변수에 저장, 출력  */
	void startEnginee( ) {  //자바스크립트 -> function startEnginee() {}
		sidong=true;   //멤버변수에 값을 저장
		System.out.println("시동이 걸림!!!");
	}
	
//	2)차의 주차기능(단순, 반복)
	void stop( ) {  //자바스크립트 -> function stop() {}
		sidong=false;
		current_speed=0;   //현재 속도는 0
		System.out.println("정상적으로 주차 완료!!!");
	}
	
//	3)속도를 증가 -> 멤버변수의 값을 변경(=수정)        매개변수 X  반환값 X
	void speedUp(int speed) {   //자바스크립트 -> function speedUp(speed) {}
		current_speed += speed; 	 // 0 + 150 = 150
//		current_speed = current_speed + speed
		System.out.println(speed+"km만큼 속도가 증가됨!!!");
	}
	
//	4)속도를 감소
	void speedDown(int speed) {
		current_speed -= speed;
		System.out.println(speed+"km만큼 속도가 감소됨!!!");
	}
	
//	5)차의 정보를 출력(단순, 반복)
	void carInfoPrint( ) {
		System.out.println("=== 차의 정보 ===");
		System.out.println("차의 시동 유무 => "+sidong);
		System.out.println("차의 이름 => "+name);                        
		System.out.println("차의 배기량 => "+output);
		System.out.println("차의 출시 연도 => "+year);
		System.out.println("차의 색깔 => "+color);
		System.out.println("차의 속도 => "+current_speed);
	}
}

