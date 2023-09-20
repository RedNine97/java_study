package j1130;

public class Op5Cast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("자동형변환"); //묵시적인 형변환
//		1. 적은 데이터 값 -> 큰 데이터 공간 -> 자료형의 크기에 맞춰서 형변환 O
//		저장되는 것은 문제가 없지만 메모리 낭비가 발생이 될 수 있다.
//		byte s=12;  // (8bit=1byte)   00001100 => 8421 맨 앞 부호비트 0(양수) 1(음수)
		short s=12;  // (16bit)   00000000 00001100 
		int n=s; //(32bit)  00000000 00000000 00000000 00001100
		
//		2. 계산 중간에 자료형이 변환 -> 적은 데이터가 큰 데이터로 변환
		char c='A';  //65
		int n2=c+1; //char(2byte)+int(4byte) -> 소+대 -> 대+대(int+int=int)
		System.out.println("n2=>"+n2); //65+1=66(int)
		System.out.println("(char)n2=>"+(char)n2); //명시적인 형변환 66->B(char)
//		명시적인 형변환(=>강제형변환)의 단점은 데이터 손실이 일어날 수 있다.
		int su=(int)3.5; //double(8byte)  0.5 저장X 손실된다.
		System.out.println("su=>"+su);
		
		int x=123;
//		int+float -> float+float=float  => 123.0f+12.3f=135.3f
		float y=x+12.3f;
		System.out.println("y=>"+y);
		System.out.println("강제형변환 주의할점");
		byte s2=12;  short s3=45;
//		byte+short=short+short=short(X)
//		byte+short=int+int=int(자바의 기본연산 자료형 -> int)
		int re=s2+s3;
		System.out.println("re=>"+re);
		short re2=(short)(s2+s3); //int -> short(명시적인 형변환)
//		주의할점) 수식값을 형변환 할 때에는 수식을 ()로 묶어줘야 된다.
		System.out.println("re2=>"+re2); //57
		
	}
}
