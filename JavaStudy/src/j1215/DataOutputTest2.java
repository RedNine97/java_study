package j1215;

import java.io.*;

// 메모리에 각각의 자료형에 맞는 데이터를 변수에 저장
// => 자료형에 맞게 파일에 저장시키고 싶다.

public class DataOutputTest2 {

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
		
//		추가
//		만들어진 파일의 내용을 다시 읽어들여서 확인후 출력
		DataInputStream dis = 
				new DataInputStream(
						new FileInputStream("C:\\webtest\\3.java\\data.txt"));
//		변수 = dis.read자료형() <-> dos.write자료형(저장할 값)
		
		char c = dis.readChar();
		byte b1 = dis.readByte(); //21
		String s = dis.readLine(); //readString (X) 앞으로 쓰지마시오(경고 : dis.readLine())
		byte bb[] = new byte[3]; //65,66,67
//		byte bb[] = {65, 66, 67} => String(A, B, C)로 출력시켜주는 메서드
//		String에서
		dis.read(bb);		
		dis.close();
		
		System.out.println("c =>"+ c);      // 한
		System.out.println("b1 =>"+ b1); // 21
		System.out.println("s =>"+ s);     // bg
		System.out.println("bb =>"+ bb);//  배열의 저장 위치값(주소값)
		
		for (byte b2:bb) {
			System.out.print((char)b2+"\t");
		}
//		메서드를 사용?
		System.out.println("=================");
		String str2 = new String(bb);
		System.out.println("str2 => "+ str2);
//		byte[] --> String 생성자를 사용
//		String -> byte[]로 변환 -> getBytes()
		byte t[] = str2.getBytes(); //t[]={65, 66, 67};
		
		for (byte b3:bb) {
		System.out.print((char)b3+"\t");
		}
	}//main

}//DataOutputTest
