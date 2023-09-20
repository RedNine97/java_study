package j1215;

// 외부의 파일(txt, image, 동영상, 실행파일(~exe) -> FileInputStream)
// <-> FileReader(한글문서)

import java.io.*;

public class FileInputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		자바파일 -> \ (X) -> \\ or /로 변경
		FileInputStream fis = new FileInputStream("C:\\webtest\\3.java\\WriteHello.java");
		int read = 0; // 파일의 내용을 저장할 임시변수
//		while(!eof) and of file -> C언어에서는 이렇게 사용함
		/*
		while(read!=-1) { // 파일이 계속해서 읽어들일 수 있는 상태라면
			read = fis.read(); // System.in.read(); 대신에 사용
			System.out.write(read); // 콘솔에 파일의 내용을 출력
		}
		*/
		while(true) { 
			read = fis.read(); 
			if(read==-1) break; // 파일의 끝에 도달하면 더 이상 출력 X
			System.out.write(read);
		}
		
	}// main

}// FileInputTest
