package j1215;
/*
 *  키보드로 값을 입력 => 한글데이터 출력
 *  이름은? 국어점수? 영어 점수? => 이름:홍길동, 총점:180
 */
import java.io.*;

public class Sawon {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String mem_name = null; //이름
		String mem_id = null; 		 // 사번
		String mem_pwd = null; 	 // 암호
		String mem_gender = null; // 성별
		String mem_age = null;    // int mem_age=23; 파일은 문자로 저장되기 때문에
		String mem_phone=null;   // 전화번호
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		File f =new File("C:\\webtest\\3.java\\sawon.txt");
		FileWriter fw = new FileWriter(f,true); // true => append(이어서 추가한다.)
		
		System.out.println("==== 회원정보 입력하기 ====");
//		이름
		System.out.println("이름은?");
		mem_name = br.readLine();
//		사번
		System.out.println("ID ?");
		mem_id = br.readLine(); 
//		암호
		System.out.println("PWD ?");
		mem_pwd = br.readLine();
//		성별
		System.out.println("성별은 ?");
		mem_gender = br.readLine();
//		나이
		System.out.println("나이는 ?");
		mem_age = br.readLine();
//		전화번호
		System.out.println("전화번호는 ?");
		mem_phone = br.readLine();
		
//		파일저장
		fw.write(mem_name); fw.write("\r\n"); //1310 줄바꿈
		fw.write(mem_id); fw.write("\r\n");
		fw.write(mem_pwd); fw.write("\r\n");
		fw.write(mem_gender); fw.write("\r\n");
		fw.write(mem_age); fw.write("\r\n");
		fw.write(mem_phone); fw.write("\r\n");
		fw.write("\r\n");
		
//		메모리에 저장된 부분을 최종적으로 파일에 저장하고 종료
		fw.close(); // 메모리 해제
		br.close(); // 버퍼 해제
		
	}//main
	
}//FilterTest
