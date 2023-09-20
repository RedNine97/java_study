package j1208;

import java.util.Scanner; /* 모든 클래스 메모리에 로딩 */
//추가 (불러올 클래스의 위치를 import로 불러오기)
import j1208.sub.PrintTest;
//---------------------------------------------------------------
public class RepeatChar {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;  //문자열 찾기
		int su;		 // 반복할 횟수
		
		Scanner sc = new Scanner(System.in); //System.in 키보드
		System.out.println("반복할 문자를 입력하세요?");
		ch=sc.next();
//		System.out.println("ch => "+ ch);    <---- 학인 용도
		
		System.out.println("반복할 횟수를 입력하세요?");
		su=sc.nextInt();

//		(1)메인에서 먼저 구현
//		for(int i=1;i<=su;i++) {
//			System.out.print(ch);
//		}
		
//		(2)일반 메서드
//		RepeatChar rc = new RepeatChar();
//		rc.charPrint1(ch,su);
		
//		(3) 클래스명.정적메서드명(~)
/*     RepeatChar.charPrint1(ch,su); */
//		charPrint1(ch,su);     // 자기 클래스 소속이라면 클래스명 생략 가능하다.
		
//		(4)정적 메서드 sub에서 호출
/*     PrintTest.charPrint(ch,su);   */
		PrintTest pt = new PrintTest();   
		pt.charPrint(ch,su);
		
	}//main
//  매개변수 o 반환값 x
	/*
 	static void charPrint1(String ch, int su) {
		for(int i=1;i<=su;i++) {
			System.out.print(ch);
		}
	}
	*/
	
	
	
	
	
	
	
	
	
}
