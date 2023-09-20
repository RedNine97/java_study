package j1215;

import java.io.*;

// 메모리에 각각의 자료형에 맞는 데이터를 변수에 저장
// => 자료형에 맞게 파일에 저장시키고 싶다.

public class DataOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		1. 파일로 저장
		FileOutputStream fos = new FileOutputStream("C:\\webtest\\3.java\\data.txt");
		
//		2. 자바의 자료형에 맞게 포장 -> DataOutputStream
		DataOutputStream dos = new DataOutputStream(fos);
		
//		3. 메모리 자료형에 맞게 저장
		char han = '한'; //0~65535   (54620='한')
		System.out.println((int)han);
		byte b =21;
		String str = "bg\n";
		byte ba[] = {65, 66, 67}; //A, B, C
		
//		파일로 저장 => 형식) write 자료형(저장할 값)
		dos.writeChar(han);
		dos.writeByte(b); //21
		dos.writeChars(str); //writeString (X)
		dos.write(ba); // 배열의 값을 매개변수로 저장 -> ABC
		
		dos.close();
		
	}//main

}//DataOutputTest
