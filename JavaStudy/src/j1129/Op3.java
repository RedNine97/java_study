package j1129;
/*
 *  관계(=대소비교 연산자) -> >, >=, <, <=, !=(같지않다.). ==(컴퓨터 언어 2개)
 *  논리연산자 -> 참, 거짓을 판별할 수 있는 연산자(boolean) &&, ||, ^(XOR)
*/
public class Op3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("관계, 논리 연산자");  //제어문 => 조건식 
		int t1=3, t2=5, t3=7;
		int t4;
		boolean b1, b2, b3;  //변수는 선언되어 있지만 아직 값이 저장X
		boolean b4=true;
//		(3>5)
		System.out.println("t1>t2 =>"+(t1>t2));  //false
//		(5<7)
		System.out.println("(t2<t3 =>"+(t2<t3));  //true
		
//		관계, 논리 연산자 혼합
		b1=(t1>t2) && (t2<t3); //(3>5) && (5<7) 조건평가  false
		System.out.println("(t1>t2) && (t2<t3) "+b1);
		
//		||
		b2=(t1>t2) || (t2<t3); //(3>5) || (5<7) 조건평가  true
		System.out.println("(t1>t2) || (t2<t3) "+b2);

//		변수 앞에 ! (=NOT)
		b3=!b4;  //           T -> F    
//				T				   F -> T
		System.out.println("!b4"+b3);  //false
		
//		|
		b2=(t1>t2) | (t2<t3); //(3>5) | (5<7) 조건평가  true
		System.out.println("(t1>t2) | (t2<t3) "+b2);
		
//		^(XOR)
		b3=(t1>t2) ^ (t2<t3);     //T,T   F,F  -> F (서로 값이 같으면 거짓)
//				  F				 T             T,F   F,T  -> 서로 값이 다르면 참
		System.out.println("(t1>t2) ^ (t2<t3) "+b3);  //true
	}
}
