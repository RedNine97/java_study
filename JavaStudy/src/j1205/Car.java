package j1205;
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
	private String name;       // 명사이름
	private int output;         //배기량
	private int year;            //출시연도
	private String color;       //차의 색깔
//	현재 상태
	private int current_speed=100;   //차의 속도
//	int sidong=0;    //1 시동걸린 유무
	private boolean sidong=false;    //차의 시동 유무
	
//	1 - 1 Setter Method  (저장) 
	public void setName(String n) {
		if(n!=null)		    //값을 입력했다면
			name = n;		//멤버변수 = 매개변수
		  else			    //n==null 전달X
			  System.out.println("name값은 반드시 저장해야 합니다.");
	}
//	외부로부터 값을 입력 -> 검증 -> 엉터리 값 -> 저장 x
//	음수 x, 양수도 어느정도 범위안 허락
	public void setOutput(int ou) {
		if (ou < 0 || ou > 5000) {
			System.out.println("입력받은 값은 음수를 입력하거나 5,000cc이상 저장 불가능");
			output=1000;    //정상적으로 입력 X -> 기본값 설정
			return;       //탈출문 return 변수 or 수식 or 객체
		}
		output = ou;	 //output=1,000
	}
//	음수 입력이거나 양수 (2022이상 크면 저장이 안되게 메소드 작성하시오.)
//	음수 X 양수도 어느정도 범위만 허락해라.
	public void setYear(int y) {
		if (y<0 || y > 2022) {
			System.out.println("년도는 음수이거나 2022 올해보다 클 수 없다.");
			year = 2022;  //default 
		}else {
			year = y;
		}

	}
	public void setColor(String c) {
		color = c;
	}
	public void setCurrent_speed(int cu) {
		current_speed = cu;
	}
	public void setSidong(boolean s) {
		sidong = s;
	}
//	1 - 2 Getter Method ( 저장된 데이터를 불러와서 출력 )
	public String getName() { return name; }
	public int getOutput() { return output; }
	public int getYear() { return year; }
	public String getColor() { return color; }
	public int getCurrent_speed() {return current_speed; }
	public boolean getSidong() {return sidong; }

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
//	데이터 입력 => 저장, 계산, 출력
//	음수이거나 양수 -> 170km이상 속도증가 X 
	void speedUp(int speed) {    // 자바스크립트 -> function speedUp(speed) {}
		if (sidong) {     // if (sidong == true) { true인 경우 생략이 가능하다.
//			 시동이 걸린 상태
			if ((speed < 0) || (current_speed + speed >= 170)) {
				System.out.println("속도는 음수이거나 170km은 속도 불가양");
				current_speed = 120;        // 기본값 (default)
			} else {
				current_speed += speed;   // 0 + 150 = 150
//				 current_speed = current_speed + speed
				System.out.println(speed + "km만큼 속도가 증가됨!!!");
			}
		} else {
			System.out.println("먼저 시동을 걸어야 속도를 증가시킬 수 있음!!");
		}
	}
	
//	4)속도를 감소(음수이거나 양수(current_speed-speed <= 0))
	void speedDown(int speed) {
		if (sidong) {
			if ((speed < 0) || (current_speed-speed <= 0)) {
				System.out.println("속도는 음수이거나 170km은 속도 불가양");
				current_speed = 120;        // 기본값 (default)
			} else {
				current_speed += speed;   // 0 + 150 = 150
//				 current_speed = current_speed + speed
				System.out.println(speed + "km만큼 속도가 감소됨!!!");
			}
		} else {
			System.out.println("먼저 시동을 걸어야 속도를 증가시킬 수 있음!!");
		}
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

