package j1215;

import java.io.*; //1. 입출력에 대한 클래스 불러오기
						    //2. 예외처리 반드시 해야된다.(필수)
							//3. flush()를 호출 -> 버퍼에 저장된 내용이 바로 출력 O
public class WriteHello {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte hello[] = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100, 33, 10};
		byte a = 72; //H(아스키코드 값) => 입출력 단위 char -> byte -> char
		
		try {
			System.out.println((char)a); //72  (char)a-> H
			System.out.println(hello); //주소
			System.out.write(a); //H     문자한개 -> 출력할 데이터 X 
			System.out.flush(); //버퍼에 쌓아놓지말고 데이터를 바로바로 출력시켜달라는 메서드
			System.out.write(hello); //출력버퍼(배열 -> 데이터가 많다고 간주)   Hello World!
		} catch (IOException e) {
			System.out.println(e); //e.toString()
			System.out.println("입출력시 에러유발!"); // 출력 구문
		}

	}//main
	
}//WriteHello
