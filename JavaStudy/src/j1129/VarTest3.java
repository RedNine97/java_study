package j1129;
//논리형(=boolean, 불린) 문자형(char)-한글자 저장  String(한글자 이상)
public class VarTest3 {

	public static void main(String[] args) {
		System.out.println("논리적인 값 저장");
		boolean b=true; //소문자만 입력이 가능 => True,TRUE (X)
		boolean b2=2>3;//false => 관계 연산자를 통해서 값을 저장가능
		System.out.println("b=>"+b+", b2=>"+b2);
		System.out.println("문자형"); //char, String
		char c1='A'; //내부적으로 'A' ->65로 저장
		char c2=65;//아스키코드 값 65 -> 'A';
		//int c2=65; (연산가능한 숫자로 인식)
		
		//문자형태의 16진수 형태로 입력을 받아서 문자로 저장
		//('\u0000~\uFFFF')
		//1~9 10(A),11(B),12(C)~15(F)
		/*\u0041=> 4자리중 뒤에서부터 자리수를 계산(16진수형 문자)*/
		//0x~ 숫자의 16진수
		char c3='\u0041';
		System.out.println("c1=>"+c1+", c2=>"+c2+", c3=>"+c3);
		//문자열 + 문자열 => 문자열, 문자 + 문자 => 문자열
		//숫자 + 문자열 => 문자열
		String s1="자바 기초 문법";
		String s2="연산자";
		String s3=s1+" "+s2;//문자열 결합 || ' ' ||
		//반문자열=>문자열 내부에 공백이 들어간 문자열
		System.out.println("s3=>"+s3);
		
		
		
		

	}

}
