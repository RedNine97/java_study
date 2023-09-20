package j1212;

import java.util.Date;//오늘 날짜 java.sql.Date(테이블의 날짜필드설정)
//추가
import java.text.SimpleDateFormat;//날짜형식을 변경할때 필요
//오늘 날짜를  출력->Date,Calendar(정적메서드)
public class SimpleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Date d=new Date();
	   SimpleTest2 st=new SimpleTest2();
	   Date d=st.getDate();
	   st.setDate(d);
       //System.out.println("d=>"+d);
       //d.toString()->오늘날짜->문자열
	   /* getSimple()
	   SimpleDateFormat sdf=new 
			   SimpleDateFormat("yyyy-MM-dd HH:mm:ss");*/
	   SimpleDateFormat sdf=st.getSimple();
	   st.setSimple(sdf, d);
	   //System.out.println("오늘날짜=>"+sdf.format(d));
	}
	//1.객체를 생성=>반환형을 통해서 객체를  얻어오기->getXXX()
	//형식) 접근지정자 반환형 getXXX() {return 생성한 객체명;}
	public Date getDate() {
		Date d=new Date();
		return d;
	}
	public SimpleDateFormat getSimple() {
		SimpleDateFormat sdf=new 
				   SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf;
	}
	//2.만들어진 객체를 전달해서 대신 처리해주는 메서드
	//형식)public void setXXX(전달받을 클래스명 객체명(임의)){처리구문;}
	public void setDate(Date d1) {
		System.out.println("d1=>"+d1);
	}
	//setSimple(2개를 받을수 밖에 없는 이유->날짜객체때문에)
	public void setSimple(SimpleDateFormat sdf2,Date d2) {
		//Date d2=new Date();
		System.out.println("오늘날짜=>"+sdf2.format(d2));
	}
}
