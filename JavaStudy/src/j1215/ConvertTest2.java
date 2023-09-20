package j1215;
//사용자로부터 값을 입력 ->   대문자 <->소문자
import java.util.Scanner;

public class ConvertTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.계속입력을 받을 수 있도록 기존의 프로그램에 추가 코드할것.->무한루프     for(;;) or while(true)
		for(;;) {  //while(true), for(;;) 무한 반복하는법
			Scanner sc = new Scanner(System.in); 
			System.out.println("문자열을 입력?");
			String input = sc.nextLine();
			
//		3.입력받은값이 e or E를 입력받으면 프로그램 종료하도록 소스코드 추가할것.
			if(input.equals("e") || input.contentEquals("E")) {//equals() or contentEquals()
	            System.out.println("프로그램이 정상종료됨!");
	            System.exit(0); //정상종료,   비정상 종료 => System.exit(-1)
			}
			
			char ch; //문자열에서 뽑아낸 문자를 저장
			
			for (int i = 0; i < input.length(); i++) {
				ch = input.charAt(i);
//		2.입력받은값이 숫자가 포함되면 중간에 영문자만 입력이 가능하다는 에러메세지 나오고 
//			  프로그램 종료 ->입력한값이 숫자가 포함되는지를 알수있는 메서드를 찾기  System.exit(0);
				if (Character.isDigit(ch)) { // 문자를 받아서 숫자라면 -> true
					System.out.println();
					System.out.println("영문자만 입력이 가능!!");
					System.out.println("프로그램 자동종료");
					System.exit(0);
				} else { //숫자가 아닌 경우
					if (Character.isLowerCase(ch))// 소문자라면
						System.out.print(Character.toUpperCase(ch)); // 대문자로 변환
					else // 대문자라면
						System.out.print(Character.toLowerCase(ch)); // 소문자로 변환
				} // else
			} // for
			System.out.println();
		}//for(;;)
	}//main		
}//ConvertTest2			
			