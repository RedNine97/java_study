package j1214;
//사용자로부터 값을 입력 ->   대문자 <->소문자
import java.util.Scanner;
public class ConvertTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //키보드를 상징
		System.out.println("문자열을 입력하시오.");
		String input = sc.nextLine();
//		입력받은 갯수만큼 반복해서 변환 -> 반복문(for문)
//		System.out.println("input.length() => "+input.length());
		/* "abAG"
		 *  'a','b','A','G' 각 문자열 출력 -> 0부터 꺼내오는 메서드 -> charAt(번호)
		 *  대,소문자 판별 -> Character 클래스 -> isLowerCase('문자') -> 반환값이 true/false
		 *  isUpperCase() : 대문자인지 체크
		 *  isLowerCase() : 소문자인지 체크
		 *  toLowerCase(char) : 소문자로 변환
		 *  toUpperCase(char) : 대문자로 변환
		 *  isWhiteSpace(char) : 공백 포함 유무 확인
		 */
		char ch; //문자열에서 뽑아낸 문자를 저장
		
		for (int i = 0; i < input.length(); i++) {
			ch = input.charAt(i);
//			System.out.print("ch => "+ch+"\t");
			if (Character.isLowerCase(ch))// 소문자라면
				System.out.print(Character.toUpperCase(ch)); // 대문자로 변환
			else // 대문자라면
				System.out.print(Character.toLowerCase(ch)); // 소문자로 변환
		}
		
	}

}
