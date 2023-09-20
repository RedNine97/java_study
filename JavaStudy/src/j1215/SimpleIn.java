package j1215;
// 키보드를 통해서 값을 입력 받아서 그대로 출력(콘솔)

import java.io.*;

public class SimpleIn {
//	메서드명 뒤에 throws 예외처리 클래스명, 예외처리 클래스명2,,,
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		키보드로 부터 값을 입력(문자, 특수기호, 숫자) -> 제출력
		int charRead; // System.in.read() => 아스키코드 값으로 저장
//							      더 이상 읽어들이지 않으면 -1을 리턴(= ctrl+z 입력)
//		char -> 0 ~ 65535
		System.out.println("입력하고자 하는 문자열을 아무거나 입력?");
//		제어문일 경우 -> for (X) -> while구문을 사용
//		어떠한 글자라도 계속해서 입력 중이라면
		while ((charRead=System.in.read()) >= 0)
			System.out.write(charRead);
//			System.out.print(charRead);
		
	}// main

}// SimpleIn
