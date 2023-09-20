package j1213;

import java.util.Scanner;

//String 문자열 취급해주는 메서드
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력?"); //next()(단어), nextLine()(문자열)
		String input=sc.nextLine(); //hello
		System.out.println("input => "+input);//hello
		StringPrint(input);
		
	}//main 		
	
	public static void StringPrint(String s) { //hello
//		1. concat => 문자열과 결합
		System.out.println("1. s, concat(\"test\") =>" + s.concat("test"));
		
//		2. substring(시작 인덱스 (O), 종료인덱스-1(바로 앞번호까지)
		System.out.println("2. s, substring(1,4) =>" + s.substring(1,4));
		
//		3. 시작인덱스 번호부터 문자열끝까지 출력                                  //01234
		System.out.println("3. s, substring(1) =>" + s.substring(1));
		
//		4. toUpperCase(대문자로 변환) <-> toLowerCase(소문자로 변환)
		System.out.println("4. s, toUpperCase() =>" + s.toUpperCase());
		System.out.println("4. s, toLowerCase() =>" + s.toLowerCase());
		
//		5. 특정 문자열을 변경 -> replace('l','t')                      'l' => 't'로 바꿔라
		System.out.println("5. s, replace('l','t') =>" + s.replace('l','t'));
		
//		6. 문자열의 길이 -> length(),   배열의 길이는 -> 배열명.length(메서드 X)
//		    공백도 문자열의 길이에 포함된다.
		System.out.println("6. s.length() => " + s.length());
		
//		7. 문자열 중에서 특정 위치에 있는 문자 출력 -> charAt(인덱스번호)
		System.out.println("7. s.charAt(2) => " + s.charAt(2)); //012
		
//		8. 특정 문자가 몇 번째 인덱스 번호에 위치하는지? indexOf('문자') => 인덱스 번호
//			indexOf(), lastIndexOf()의 해당하는 문자를 못찾으면 -1을 호출
		System.out.println("8. s.indexOf('l') => " + s.indexOf('l',2)); //012 'l' 앞에서부터 찾음
																				//('l',2)하면 2번째 자리에서부터 앞에서 찾기
//		9. 뒤에서 찾아가는 방법(인덱스번호는 앞에서 0부터 계산) -> lastIndexOf
//		    파일의 확장자를 구하시오.(ex: aaaaadagadfgddd.txt)~,html
		System.out.println("8. s.lastIndexOf('l') => " + s.lastIndexOf('l'));
																					//hello      43 'l' 뒤에서부터 찾음
//		10. 공백제거 -> trim() => "abcd   " => "abcd"   (공백도 문자열 길이에 포함됨)
		System.out.println("s.trim().length() => " + s.trim().length());
//									  s.trim()=>공백이 제거된 문자열.length()
		
	}

}//class StringTest
