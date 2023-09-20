package j1129;
//변수 => 자료형(종류, 크기를 지정해주는 것) => 변수, 상수의 특성
public class VarTest4 {

	public static void main(String[] args) {
		//변수 선언 -> 같은 자료형의 변수를 여러개 동시에 선언하고 싶다.,로 나열
		//int num; int num2; int num3;    A(B+C+D)
		int num,num2=3,num3=4;//선언하면서 값을 저장
		num=23; //변수는 값이 변경되면 맨 마지막 값만 기억(저장)
		//상수(constant) => 값이 정해지면 중간에 값이 변경되지 않은 숫자
		
		int num4=5,num5=6;
		//상수화된 변수 => 일단 값이 저장 => 중간에 값이 변경x이 안되는 변수
		//변수앞에 예약어 final을 붙이면 상수화된 변수가 된다.
		final int NUM6=40;//선언하면서 바로 값을 저장 (final은 전부 대문자로 쓴다.(관례))
		//NUM6=90;
		//서로 다른 변수에 똑같은 값을 반복해서 넣어주는 경우
		/*
		 *  가로로 정렬
		 * 주석을 주는 방법 -> 범위 지정 -> ctrl+shift+/
		 * 주석을 푸는 방법 -> 범위 지정 -> ctrl+shift+\(역슬러쉬)
		 * 
		 * 라인수가 안바뀌는 주석 => 범위 지정 -> ctrl+/을 반복(해제도 가능)
		*/
		/*
		num2=50; 
		num3=50; 
		num4=50; 
		num5=50;
		 */
		
		num2=NUM6;
		num3=NUM6;
		num4=NUM6;
		num5=NUM6;
		System.out.println("num=>"+num+", num6=>"+NUM6);

	}

}
