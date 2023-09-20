package j1223;

import java.io.*;

public class FileInputTest {

	public static void main(String[] args) throws Exception {
		// 추가
		FileInputStream fis = new FileInputStream("c:\\webtest\\3.java\\Readme.txt");
		
		int read = 0;// 파일의 내용을 저장할 임시변수

		while (true) {
			read = fis.read();
			if (read == -1)
				break;// 파일의 끝에 도달하면 더이상 출력X
			System.out.write(read);
		}
	}
}
