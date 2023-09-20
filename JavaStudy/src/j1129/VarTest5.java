package j1129;
/*
 *변수의 종류 => 지역변수(정해진 범위내에서만 사용이 가능한 변수)(메서드 내부)
 *					   멤버변수(클래스 내부에 선언된 변수) => 5장에서 자세히
 */
 public class VarTest5 {
	 int su3; //멤버변수 -> 자바스크립트에 전역변수처럼 모든 메서드에서 
//	 			  (=인스턴스변수)			                        불러다 사용이 가능
	 
	public static void main(String[] args) {
		System.out.println("변수의 사용범위(scope)");
//		지역변수   1. 특징 범위내에서만 사용   2. 반드시 초기값을 넣어줘야된다.
		int su1=10;//메소드 내부선언(지역변수)
		{ //블럭처리(어디부터 어디까지 사용한다.(범위지정))
			int su2=20;
			System.out.print("su2=>"+su2+'\n');//'\n' 줄바꿈(enter)
		}
//		System.out.println("su2=>"+su2); 범위 밖에서는 사용X
		
		System.out.println("su1=>"+su1);
	}
//	System.out.println("su1=>"+su1); 범위를 벗어나면 X
}