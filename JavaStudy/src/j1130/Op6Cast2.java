package j1130;
//형변환2 +printf() 메서드
public class Op6Cast2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=20,num2=30;
//		printf(출력양식,,, 출력할 대상자)
		/*
		 * decimal          char         string         float
		 * %d(정수값)   %c(문자)   %s(문자열)   %f(소수점)
		*/
		System.out.printf("첫번째 숫자는=%d",num1);  //첫번째 숫자=20
		System.out.println(); //출력할 값(x)이 없다면 그냥 줄바꿈만 일어난다.
		System.out.print('\n'); //특수기호에 맞게 실행(\n 줄바꿈)
		System.out.printf("첫 번째 숫자는=%d, 두 번째 숫자는=%d",num1,num2);
		
//		형변환
		char ch='A'; //65 -> char -> int
//		byte, short, int, long(음수를 포함) -128~127
//		char(0~65535) -> int(4byte)으로 자동형변환 예외 조항(printf)
		System.out.println();
		System.out.printf("문자 %c의 유니코드값 %d\n",ch,(int)ch);
		int ch2=ch;  //char -> int
		System.out.println("ch2 =>"+ch2);
		
//		종합문제 -> 총점
//		변수가 필요할 때는? 1. 계산할 때 2. 입출력 프로그램 작성시 3. 현재 프로그램의 상태 저장시
		int java=90,jsp=85,oracle=90;
		int sum=java+jsp+oracle;
		System.out.printf("sum= %d입니다.\n",sum);
		
//		평균
		int avg=sum/3;  //소수점이 있어도 버리고 정수만 계산(int)
//		sum/3 => +, -, *, / -> int(소수점을 계산을 못한다.)
		double avg2=sum/3; //88 -> 88.0
		double avg3=(double)sum/3;  //소수점 이하 정밀한 값
//		/후에 (double)형으로 줄 것(핵심포인트)
		
		System.out.println("avg=>"+avg+", avg2 =>"+avg2);
		System.out.println("avg3 =>"+avg3);
//		형식) ->%f -> %전체자리수, 소수점 자리수f => %.2f(소수점 두 번째자리 까지)
//		전체자리수는 써도 되고 안써도 되는데 쓴 경우에는 출력이X 같은 공백으로 채워짐
		System.out.printf("평균(avg3):%5.2f\n",avg3);
//		전체 자릿수 5자리중에서 소수점 2째자리까지
		System.out.println("abc\t123\b456"); //\t 탭키만큼 거리를 둬라
//		\b backspace
		System.out.println("\"HelloTest\""); //문자열 앞뒤에 " " 표시\"
	
	}
}
