package j1130;
//삼항연산자, 대입연산자(=배정연산자)
public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("대입,삼항연산자");
//		byte, short, int, long => 정수값 (int)
//		삼항연산자 -> 조건식에 따라서 변수에 저장된 값을 선택해서 저장시키는 연산자
		
		int a=5,b=7,x=10,y=-10;  
//		형식) 자료형 변수명=(조건식)? 참인값:거짓인 값;
		int absX=(x>=0)? x:-x;  //절대값 10 -> 10, -(-10)
		int absY=(y>=0)? y:-y;
		System.out.println("x=10일때 x의 절대값=>"+absX);
		System.out.println("x=-10일때 y의 절대값=>"+absY);
		/*
		 * int c=a+b  a=a+1, a=a-1, a=a*1, a=a/1, a=a%1
		 * 					자기변수에 값을 계산을 한 후 자기 변수에 대입(저장)
		 * 산술, 대입(연산자 2개(a)) => 연산자 1개(a) -> 속도향상에 더 좋다.
		 * a=a+1 => a+=1 =>( a++; )
		 * a=a+2 =>( a+=2 ) -> a++2(x)
		 * a=a+3 =>( a+=3 )
		 * a=a-1 => a-=1 =>( a--; )
		 * a=a-2 =>( a-=2 )
		 * a=a*2 =>( a*=2; )
		 * a=a/2 =>( a/=2; )
		*/
		a+=b; //a=a+b;
		System.out.println("a=>"+a);  //a=5+7=12
		
		a-=b;  //a=a-b;  a=12-7 -> 5
		System.out.println("a=>"+a);
		
		a*=b; //a=a*b; a=5*7 -> 35
		System.out.println("a=>"+a);
		
		a/=b;  //a=a/b; a=35/7
		System.out.println("a=>"+a);  //5

	}

}
