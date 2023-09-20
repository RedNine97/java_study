package j1216;

import java.io.*;

public class ReverseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str; // 문자열 저장
		char ch; // 문자열에서 분리한 문자
		System.out.println("문자열을 입력?");
		str = br.readLine();
		// abcdef
		//int i = 0; i < str.length(); i++
		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		} // for
		*/
		
		/*
		 * "abcd" + "efg" = "abcdefg"
		 * String -> 불변문자열(문자열을 변경X)
		 * StringBuffer -> 가변문자열(문자열을 변경O)
		 * String -> StringBuffer(append) -> String(toString())
		 * new StringBuffer("abcd").append("efg")
		 * new StringBuffer("abcdefg").toString() => "abcdefg"
		 * new StringBuffer("abcdefg").reverse().toString() => "gfedcba"
		 */
		
		ReverseTest rt=new ReverseTest();
		BufferedReader br = rt.getBuffer();
		rt.setBuffer(br);
		
//		BufferedReader br= getBuffer();//        <--- static
//		ReverseTest.setBuffer(br);
		
	}//main
	
//	getBuffer()
	public static BufferedReader getBuffer() {
		/*
		BufferedReader br = 
				new BufferedReader(
						new InputStreamReader(System.in));
						*/
//		return br;
		return new BufferedReader(
				new InputStreamReader(System.in));
	}
	
//	setBuffer()
	public static void setBuffer(BufferedReader br) throws Exception {
		String str; // 문자열 저장
		char ch; // 문자열에서 분리한 문자
		System.out.println("문자열을 입력?");
		str = br.readLine();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			ch = str.charAt(i);
			System.out.print(ch);
		} // for
		
//		System.out.println("문자열을 입력?");
//		String ch = br.readLine();
//
//		StringBuffer bb=new StringBuffer(ch);
//		System.out.println(bb.reverse());
		}	
}//class ReverseTest
