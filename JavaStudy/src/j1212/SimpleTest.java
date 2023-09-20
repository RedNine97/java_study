package j1212;

import java.util.Date; //오늘 날짜 사용시 java.sql.Date(테이블의 날짜 필드 설정시)

//오늘 날짜를 출력 -> Date(일반메서드), Calendar(정적메서드)

public class SimpleTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date d = new Date();
		SimpleTest st = new SimpleTest();
		Date d=st.getData();
		st.setDate(d);
//		System.out.println("d => "+d);
//		d.toString() -> 오늘날짜 -> 문자
	}//main
	
//	1. 객체를 생성시 => 반환형을 통해서 객체를 얻어오기 -> getterXXX()
//	형식) 접근지정자 반환형 getXXX() {return 생성할 객체명}
	public Date getData() {
		Date d = new Date();
		return d;
	}
	
//	2. 만들어진 객체를 전달해서 대신 처리해주는 메서드
//	형식) public void setXXX(전달받을 클래스명 객체명(임의)) { 처리구문; }
	public void setDate(Date d1) {
		System.out.println("d1 => "+d1);
	}
	
}//SimpleTest
