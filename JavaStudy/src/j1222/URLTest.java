package j1222;

//특정 사이트에 접속 => 정보를 가져오는 클래스 URL, URLConnection

import java.io.*;
import java.net.URL;
import java.util.Scanner; //키보드로 특정 사이트 직접 입력

public class URLTest {
	
	public URLTest(String s) throws Exception {
		URL url = new URL(s);
		System.out.println("url => "+ url);
//		직접 사이트에서 데이터를 가져오기(원격 : 출력 -> 로컬 : 입력)
		InputStream in = url.openStream(); //메서드의 반환형
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		//추가 -------------------------------------------------
		BufferedWriter bw = new BufferedWriter(new FileWriter
				("C:\\webtest\\3.java\\web.txt"));
		
		String ss; //읽어들여서 임의로 저장할 변수 선언
		while((ss=br.readLine())!=null) { //불러올 데이터가 존재하는 한
			bw.write(ss); // 값을 저장
			System.out.println(ss);
		}
		in.close();  br.close(); 
		bw.close(); //닫기
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		System.out.println("접속할 사이트 도메인 이름?(https://도메인 이름)");
		String domain= sc.next();
		new URLTest(domain); //https://www.naver.com
	
	}//main
	
}//class URLTest
