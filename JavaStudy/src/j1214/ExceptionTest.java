package j1214;
/*
 * 예외처리 구문 => 제대로 작동이 되는지 어떻게 확인할 수 있을까요?
 * 가상으로 예외를 발생 => 구문이 제대로 작동되는지 확인이 가능
 * 형식) throw new 예외처리 해줄 클래스명(메세지 내용)
 */
public class ExceptionTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		a(); //(1)
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("가상으로 배열첨자 오류가 발생 연습2"); //(5)
		}
		System.out.println("예외처리 최종 종료!!");// (6)
		
	}//main
	
	static void a() {
		try {
//			String s="abc";
//			String s=null;
//			System.out.println("문자열의 길이는 => "+s.length()); //3			
			throw new NullPointerException("Null Point 에러연습");// (2)
		}catch(NullPointerException e) {
			System.out.println("객체생성 없이 메서드 호출 불가"+e);// (3)
		}
		throw new ArrayIndexOutOfBoundsException("배열 절차 오류");// (4)
	}//a()
}//ExceptionTest
