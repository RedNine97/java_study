package j1213;

//import java.lang.*;   <--자동으로 적용됨
import java.util.Scanner;

//세개의 값을 입력받아서 최대값을 구하시오.<->최소값
public class ThreeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.getScan()
		//Scanner sc=new Scanner(System.in);
		Scanner sc=getScan();
		//2.setScan(Scanner 객체명)
		ThreeTest2.setScan(sc);
		/*
		System.out.println("1.첫번째수를 입력?");
		int a=sc.nextInt();//sc.nextDouble();
		
		System.out.println("2.두번째수를 입력?");
		int b=sc.nextInt();
		
		System.out.println("3.세번째수를 입력?");
		int c=sc.nextInt();
		
		int max;//최대값
		//       12>4
	
		ThreeTest2 tt=new ThreeTest2();
		tt.getMaxPrint(a, b, c);//12,4,19
		tt.getMaxPrint(23, 78, 83);
		tt.getMaxPrint(11, 34, 66);
		//형식)자료형 변수명=객체명.호출한 메서드명(~)
		int result=tt.getMaxPrint2(34, 12, 99);
		System.out.println("최대값(result)=>"+result);
		*/
	}
	//1.객체의 자료형(Scanner) getXXX(){ return 반환시킬객체명(=익명)}
	public static Scanner getScan() {//정적메서드
		/*
		Scanner sc=new Scanner(System.in);
		return sc;*/
		return new Scanner(System.in);//익명객체
	}
	//2.public void setXXXX(전달받을 객체자료형 객체명(=임시){처리구문}
	public static void setScan(Scanner sc) {
		System.out.println("1.첫번째수를 입력?");
		int a=sc.nextInt();//sc.nextDouble();
		
		System.out.println("2.두번째수를 입력?");
		int b=sc.nextInt();
		
		System.out.println("3.세번째수를 입력?");
		int c=sc.nextInt();
	
		ThreeTest2 tt=new ThreeTest2();
		tt.getMaxPrint(a, b, c);//12,4,19
		tt.getMaxPrint(23, 78, 83);
		tt.getMaxPrint(11, 34, 66);
		//형식)자료형 변수명=객체명.호출한 메서드명(~)
		int result=tt.getMaxPrint2(34, 12, 99);
		System.out.println("최대값(result)=>"+result);
	}
	//반환값이 있는 메서드->caller method 일을 처리
	int getMaxPrint2(int a,int b,int c) {
		int max=(a>b)?a:b; //max=12
		max=(max>c)?max:c;
		return max;//return 계산결과값(변수) or 수식 or 객체
	}
	//반환값이 없는 메서드->work method 일을 처리
	void getMaxPrint(int a,int b,int c) {
		int max=(a>b)?a:b; //max=12
		max=(max>c)?max:c;
		System.out.println("max=>"+max);
	}
}
