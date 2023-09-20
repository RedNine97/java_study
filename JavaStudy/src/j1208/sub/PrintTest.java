package j1208.sub;

//다른 패키지의 PrintTest 클래스가 가지고 있는 charPrint
public class PrintTest {
//	(4)정적 메서드 sub호출

//	public : 자기클래스도 사용가능하게 외부의 클래스도 사용을 허락한다는 의미이다.(접근지정자)
	public static void charPrint(String ch, int su) {
		for (int i=0; i<su; i++) {
			System.out.print(ch);
		}	
	}	
}
