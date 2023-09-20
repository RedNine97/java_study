package j1212;
/* 
 *  callByValue(값에 의한 전달방법) => 매개변수를 전달(기본 자료형 8가지)
 *  												전달해서 메서드를 호출하는 방법(원본의 값을 복사해서 전달)
 *  												내용을 변경 O -> 원본의 내용은 변경 X
 */
public class CallByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=-1, g=-1, b=-1; // css(rgb(0~255))->255*255*255
		System.out.println("before r=> "+r+", g=> "+g+", b=> "+b);
//		중간에 메서드를 이용하여 => 색깔을 변경
		change_color(r,g,b);
		System.out.println("after r=> "+r+", g=> "+g+", b=> "+b);
		
	}//main
	
//	색깔을 변경 => 입력을 받아서(O) -> 변경(수정)
	static void change_color(int r, int g, int b) {
		r +=10; //r=r+10 -> r=9
		g +=50; //g=g+50 -> g=49
		b+=100; //b=b+100 -> b=99
		System.out.println("메서드내부 r="+r+", g= "+g+", b= "+b);
	}
	
}//CallByValue
