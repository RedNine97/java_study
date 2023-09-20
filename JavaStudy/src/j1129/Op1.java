package j1129;

public class Op1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("산술, 증감연산자");
//		int a=3,b=4;
//		int c=a+b; // 연산의 기본단위 int
//		System.out.println("c=>"+c);
//		원의 면적 -> r*r*3.141592~=>int X double형으로 저장
//		+, -, *, / 계산결과 값이 int 범위를 벗어나지 않는한 기본 자료형은 int
		double area=5*5*3.141592;
		System.out.println("area->"+area);
		
		int a=4; 
		int b=a++;
		/*
		 * int b=a;
		 * a=a+1 -> a+ =1    a=4+1
		*/
		System.out.println("중간 값 a=>"+a+", b=>"+b);
		int c=++a;
		/*
		 * a=a+1
		 * int c=a;
		*/
		System.out.println("a=>"+a+", b=>"+b+", c=>"+c);
	}

}
