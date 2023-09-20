package j1215;

// 외부의 파일(txt, image, 동영상, 실행파일(~exe) -> FileInputStream)
// <-> FileReader(한글문서)

import java.io.*;

public class FileInputTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		자바파일 -> \ (X) -> \\ or /로 변경
		FileInputStream fis = new FileInputStream("C:\\webtest\\3.java\\readme.txt");
		int read = 0; // 파일의 내용을 저장할 임시변수
//		추가 (shift + F2) => 텝이 하나 추가되면서 보여준다.
		/* (1)
		FileOutputStream fos = new FileOutputStream("C:\\webtest\\3.java\\a.txt");
		*/
		/* (2)
		File f = new File("C:/webtest/3.java/a.txt");
		FileOutputStream fos = new FileOutputStream(f); //다단계 결합
		*/
//		 (3)
		FileOutputStream fos = new FileOutputStream(new File("C:/webtest/3.java/aaa22.txt"));
		
		while(true) { 
			read = fis.read(); 
			if(read==-1) break; // 파일의 끝에 도달하면 더 이상 출력 X
//			System.out.write(read);
			fos.write(read);
		}

	}// main

}// FileInputTest
