package j1206;

// 2. this => 현재 생성된 객체를 가리키는 예약어(=키워드)로 사용
// ex) 음식점 -> 물은 self 
// 추상화(클래스를 설계도 -> 이름이 확정 X --> 어떤 이름으로 불릴지 알 수 없기에 this로 구분한다.
public class ThisTest2 {

	ThisTest2(){
//		생성자 내부에서는 자기 클래스의 객체명을 사용 못함 X
		System.out.println("현재 생성된 객체이름(this)(생성자 내부) => "+ this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ThisTest tt 객체생성 하면서 정수형 인수 1개짜리 생성자를 호출한다.
		ThisTest2 aa =new ThisTest2();  //현재 생성된 객체이름은 aa
		System.out.println("현재 생성된 객체 이름 aa => "+ aa);
		System.out.println("=============================");
		
		ThisTest2 aa2 = new ThisTest2();
		System.out.println("현재 생성된 객체 이름 aa2 => "+ aa2);
		
	}// main
}// ThisTest
