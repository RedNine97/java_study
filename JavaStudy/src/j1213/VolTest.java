package j1213;

public class VolTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("설계한 대로 실행체크"); //단위 테스트
		TV t = new TV();
		Radio ra = new Radio();
//		다향성의 한해
//		객체는 다르지만(장비) 공통으로 사용하는 메서드 통일성 부여
		t.turnOn();
		ra.turnOn();
		
		t.volumeUp(12);
		ra.volumeUp(7);
//		비슷한 기능을 가진 메서드를 작성 => 메서드명을 통일(=오버로딩)
//		오버로딩의 확장판(모든 클래스 단위로 설계)
		
	}//main

}//VolTest
