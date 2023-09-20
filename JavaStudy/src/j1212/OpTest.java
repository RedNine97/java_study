package j1212;

import java.util.Scanner;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(1) next() - 문자열로 받음
		int x; int y; int sum;
		String z; //<--"+"    
		char t;   //char z <-- '+'
//		next() => 단어중심, enter키 인식 (X)
//		nextLine() => 한라인의 문장을 입력받을때 사용, 띄어쓰기, enter키 인식 (O)
		
		Scanner s1 = new Scanner(System.in);
//		(1)next()
		
//		System.out.println("첫 수를 입력?"); //nextInt() 정수, nextDouble() 실수, next() 문자
//		x=s1.nextInt();
//		System.out.println("연산자[+,-,*,/]? ");
//		t=s1.next().charAt(0); //"abc" -> charAt(2)= c
//		System.out.println("두 번째 수를 입력?");
//		y=s1.nextInt();
//		
//		switch(t) { //"+" -> '+' => 아스키코드 값을 이용 (숫자)
//			case ('+'):
//				System.out.println(x+" + "+y+" = "+(x+y));
//				break;
//			case ('-'):
//				System.out.println(x+" - "+y+" = "+(x-y));
//				break;
//			case ('*') :
//				System.out.println(x+" * "+y+" = "+(x*y));
//				break;
//			case ('/'):
//				System.out.println(x+" / "+y+" = "+(x/y));
//				break;
//		}
		
//		(2) nextLine()
/*		첫 수를 입력?    10 enter => enter 키값도 받음 -> nextLine()
    						       			  키보드버퍼(키보드를 통해서 입력받은 문자열을 임시로 보관
											  하는 장소)에 enter값이 들어가서 다음번 두 번째 
								              입력받을 값 +, -, *, / 값을 받을 수 없어서 에러발생
								              
		nextLine()을 사용하는 방법은?
		전부 nextLine()을 적용시키기
*/									
		System.out.println("첫 수를 입력?");
		x=Integer.parseInt(s1.nextLine()); 
		
		System.out.println("연산자[+,-,*,/]?");
		t=s1.nextLine().charAt(0);
		
		System.out.println("두 번째 수를 입력?");
		y=Integer.parseInt(s1.nextLine()); 
		
		switch(t) { //"+" -> '+' => 아스키코드 값을 이용 (숫자)
		case ('+'):
			System.out.println(x+" + "+y+" = "+(x+y));
			break;
		case ('-'):
			System.out.println(x+" - "+y+" = "+(x-y));
			break;
		case ('*') :
			System.out.println(x+" * "+y+" = "+(x*y));
			break;
		case ('/'):
			System.out.println(x+" / "+y+" = "+(x/y));
			break;
		}
		
		/*//   문자열로 코드 설계
		System.out.println("첫 수를 입력?");
		x=Integer.parseInt(s1.nextLine()); //정수
		
		System.out.println("연산자[+,-,*,/]? ");
		z=s1.nextLine();								//문자열
		
		System.out.println("두 번째 수를 입력?");
		y=Integer.parseInt(s1.nextLine());  //정수
		
		if(z.equals("+")) {
			System.out.println(x+" + "+y+" = "+(x+y));
		}else if (z.equals("-")){
			System.out.println(x+" - "+y+" = "+(x-y));
		}else if (z.equals("*")) {
			System.out.println(x+" * "+y+" = "+(x*y));
		}else if (z.equals("/")) {
			System.out.println(x+" / "+y+" = "+(x/y));
		}
		 */
		
	}
}
