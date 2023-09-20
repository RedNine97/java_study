package j1129;

public class VarTest {//숫자(정수)

	public static void main(String[] args) {
		
		System.out.println("변수의 개요 및 선언, 작성법");
		/*
		 * 변수(Variable) => 메모리(RAM) 상에 문자, 숫자, 논리적인 값을 
		 * 							저장할 공간을 만들어준다.(ex box,그릇)
		 * 형식)var 변수명=값(자료형을 표시X)
		 *        <->자료형(=데이터형) 변수명=값
		 */
		int age;//var age; 정수값 변수선언(공간은 만들어졌으나 아직 저장X)
		age=25;
		//int age=25; 변수를 선언하면서 동시에 값을 25 저장
		System.out.println("올해 제 나이는 "+age+"살 입니다.");
		
		int $test;  //int #test (X)  $,_특수기호만 가능
		
		byte b=23;  //-128~127         에러 메세지 Type mismatch(자료형이 틀린 경우)
		short c=12; //-32768~32767
		int sum=b+c; //23+12=35  byte형으로 지정X (형변화 때문에)
		System.out.println("sum=>"+sum);
		//out of range(저장 범위를 벗어난 경우 나오는 에러 메세지)
		long no=1234567890000L;//long형으로 저장하기 위해서 숫자 뒤에 L자
		System.out.println("no=>"+no);
	}
}
