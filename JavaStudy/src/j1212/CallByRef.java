package j1212;
/* 
 *  callByReference(주소에 의한 전달방법) => 매개변수를 전달(객체(=주소))
 *  												전달해서 메서드를 호출하는 방법(원본의 값을 전달)
 *  												내용을 변경 O -> 원본의 내용은 변경 O
 *  												객체를 전달 -> 객체의 주소값을 전달
 *  												주소(저장할 위치) = 포인터(pointer)
 */
class RGBColor extends Object {
	int r, g, b; //멤버변수

	public RGBColor(int r, int g, int b) {
		this.r = r; //color.r = -1;
		this.g = g; // color.g = -1;
		this.b = b;
	}
}

public class CallByRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int r=-1, g=-1, b=-1; // css(rgb(0~255))->255*255*255
		RGBColor color = new RGBColor(-1,-1,-1);
		System.out.println("color =>"+ color);
		System.out.println();
		
		System.out.println("before r=> "+color.r+", g=> "+color.g+", b=> "+color.b);
//		중간에 메서드를 이용하여 => 색깔을 변경
		change_color(color); //컬러 객체의 주소값
		System.out.println("after r=> "+color.r+", g=> "+color.g+", b=> "+color.b);
		
	}//main
	
//	색깔을 변경 => 입력을 받아서(O) -> 변경(수정)
	static void change_color(RGBColor color2) {
		System.out.println("color2 => "+color2);  //주소를 공유
		color2.r +=10; //r=r+10 -> r=9
		color2.g +=50; //g=g+50 -> g=49
		color2.b+=100; //b=b+100 -> b=99
		System.out.println("메서드내부 r="+color2.r+", g= "+color2.g+", b= "+color2.b);
	}
	
}//CallByValue
