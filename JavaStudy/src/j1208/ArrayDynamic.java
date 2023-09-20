package j1208;
/*  배열
 *       1. 고정배열 (처음부터 배열의 크기가 정해져 있는 배열)
 * 			  => 중간의 크기 변경 X ex) int su[]=new int[4]; //5 ( X )
 * 
 * 		  2. 동적배열 => 배열의 값을 저장시키면 자동으로 크기가 증가, 감소
 * 			 			      되는 배열 ex)컬렉션 객체(ex ArrayList)
 * 			ex) String x[]: x[0] = "ab", x[1]="bc" => 2개
 */
public class ArrayDynamic {

	public static void main(String[] x) {
		// TODO Auto-generated method stub
		int sum=0;
		/*
		String str = x[0];  // "10"
		String str2 = x[1];// "20"
		String str3 = x[2];// "30"
		*/
//		API 참조 => 메서드 찾는 수 밖에 없다.
//		문자열 => 숫자(Integer.parseInt(문자열 상수)
//     숫자 => 문자열로 변환 10 -> "10"
//		문자열 => 소수점으로 변환 Double.parseDouble("23.5") =23.5
		
		int str = Integer.parseInt(x[0]);  
		int str2 = Integer.parseInt(x[1]);
		int str3 = Integer.parseInt(x[2]);
		
//		String(참조형)과 int(기본형)은 서로 관련이 없다.( 자료형이 틀리다)
//		sum = (int)str + (int)str2 + (int)str3;
		sum = str + str2 + str3;
//		추가
		String str4 = String.valueOf(str2);
		double str5 = Double.parseDouble("10.5");
		
		System.out.println("str => "+str);
		System.out.println("str2 => "+str2);
		System.out.println("str3 => "+str3);
//		추가
		System.out.println("sum => "+sum);
		
		System.out.println(str4);
		System.out.println(str5);
		
	}
}
