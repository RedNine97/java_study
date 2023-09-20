package j1213;

import java.util.Scanner;

public class ShapeTest extends Shape implements Drawable {
	//public double res =0.0, printArea()
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원의 면적을 이용해서 원을 그린다.");
	}

	@Override
	public double area(int r) {
		// TODO Auto-generated method stub
//		java.lang.Math.PI
		return (r*r*Math.PI); //Math.PI(static final) 정적 상수
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("원의 반지름을 입력?");
		int r=sc.nextInt();  //nextDouble() (소수점)
		
		ShapeTest st =new ShapeTest();
		st.res=st.area(r);
		st.printArea();
	}

}
