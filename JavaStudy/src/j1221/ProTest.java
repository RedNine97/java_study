package j1221;

import java.io.*;
import java.util.Properties;

/*
 * Properties => Hashtable 계열 (키, 값) => 파일로 저장된 내용을 
 * 																메모리에 불러다 사용(환경설정 파일)
 * 																접속 ip, 접속계정명, 암호(보안 때문에)
 * 																load() 때문에 사용
 * 																~.properties 파일 <--- 환경설정 파일
 */				
public class ProTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 파일을 읽어들이기
		Properties pro = new Properties();
		
		try {
			FileInputStream fis =new FileInputStream
					("C:\\webtest\\3.java\\sou\\JavaStudy\\src\\j1221\\ex1.properties");
			pro.load(fis); //파일의 내용을 메모리에 로딩한다.(load();)
		}catch(IOException e) {
			System.out.println("파일 불러오기 오류 => "+ e);
		}
//		2. 저장된 속성값을 불러오기 -> getProperties("키명");
//										<-> setProperties(키명,저장할 값)
		String value =pro.getProperty("a");
		System.out.println("a키 값의 속성값 => "+ value);
		
//		3. 저장된 속성명의 속성값을 변경
		pro.setProperty("b", "test id");//property test -> test id
		System.out.println("pro.getProperty(b) => "+ pro.getProperty("b"));//메모리에만 변경
		
//		4. 파일의 내용을 ===> 메모리에 로딩(b=test id) 메모리만 변경이 된 상태
//		<==파일에도 변경=> store() 동기화(파일의 내용=메모리 내용)         // Thread와 용어만 같음
		try {
			pro.store(new FileOutputStream
					("C:/webtest/3.java/sou/JavaStudy/src/j1221/ex1.properties"), "imsitest");
//			파일에 주석을 달 것인가 말 것인가 결정(null 주석 X)
		}catch(IOException e) {
			e.printStackTrace(); //관련된 에러를 다 찾아냄
		}
	}//main
	
}//class ProTest
