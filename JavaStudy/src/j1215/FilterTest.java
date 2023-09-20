package j1215;
/*
 *  키보드로 값을 입력 => 한글데이터 출력
 *  이름은? 국어점수? 영어 점수? => 이름:홍길동, 총점:180
 */
import java.io.*;

public class FilterTest {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.in => InputStream 객체				<--- 특이하게 멤버변수를 통해 얻어온 객체
//		System.out => PrintStream 객체(표준출력장치)
//		System.out.print()
		/*
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		*/
//		키보드로 데이터를 읽어들일때 한글이 깨지지 않도록 많은 양의 데이터를 읽어들여라
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
//		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, tot;

		System.out.println("이름은?");
		name = br.readLine(); // name=sc.next();

		System.out.println("국어 점수는?");
		kor = Integer.parseInt(br.readLine()); // kor=sc.nextInt();
//		kor = Double.parseDouble(br.readLine()); "56.9"=>56.9
		System.out.println("영어 점수는?");
		eng = Integer.parseInt(br.readLine()); // eng=sc.nextInt();

		tot = kor + eng;
		System.out.println("이름 = " + name + ", 총점 => " + tot);
		
	}//main
	
}//FilterTest
