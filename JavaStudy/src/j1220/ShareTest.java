package j1220;

import java.io.*;

//입출력(RandomAccessFile) + Thread
//RandomAccessFile => 특정위치에 접근해서 정해진 파일을 생성

public class ShareTest implements Runnable {
	
	RandomAccessFile raf = null;
	
//	Thread 두 개 생성 -> 파일에 특정값을 저장
	public ShareTest() {
		try {
//			1. 경로포함해서 생성할 파일명 2. 모드(r, w, rw)
//			rw -> 없으면 생성, 동일한 파일존재시 -> 덮어쓰기가 가능
			raf=new RandomAccessFile("C:\\webtest\\3.java\\result.txt","rw");
			
//			2. 쓰레드 객체생성(1.Runnable 객체 2. 쓰레드 이름)
			Thread t1 = new Thread(this,"khg");
			Thread t2 = new Thread(this,"test");
			
//			3. Thread 가동
			t1.start();  t2.start();
		}catch(IOException e) {
			System.out.println("파일생성에서 오류가 발생 => "+ e); //e.toString()
		}
	}
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 1000; i++) {
//				쓰레드 이름 + 라인 번호 + 파일포인터의 갯수(=커서 이동 갯수) 글자수
				raf.writeBytes(Thread.currentThread().getName()
						+"["+i+"]"+raf.getFilePointer()+"\n");
			}
		}catch(Exception e) {
			System.out.println("파일에 데이터 출력오류 => "+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Runnable 객체생성
		ShareTest st = new ShareTest();
//		데이터값 저장 or 메서드 호출
		new ShareTest(); //익명객체 -> 객체명만 모름
		
	}//main
}//ShareTest
