package j1208;

//동적배열 + 오버로딩 => 새로 추가된 문법
public class VarArgTest {
//	오버로딩 -> 매개변수가 다르거나 자료형이 다음에 사용
//					매개변수의 갯수인 달라지는 경우 ( 자료형은 같다)
	/*
	public void print(String a) {
		System.out.println("a =>" + a);
	}
	public void print(String a, String b) {
		System.out.println("a =>" + a+ "b =>" + b);
	}
	public void print(String a, String b, String c) {
		System.out.println("a =>" + a+ "b =>" + b+ "c =>" + c);
	}
	*/
	
	public void print(String ...names) { //동적배열(배열의 갯수가 다르다)
		/* 전달되는 매개변수의 갯수의 해당되는 배열로 저장
		 * String names[]={"시장에가면"}
		 * String names[]={"시장에가면","파인애플도 있고"}
		 * 					,,,
		 */          
		for (String str:names)
			System.out.print(str+"\t");
		System.out.println();
	}
	
	
//	배열 -> 매개변수로 전달받은 메서드 작성
//	배열을 전달 => 데이터가 저장된 위치를 가지고 있는 주소값을 전달한다.
	public void print2(String names[]) { //고정배열(3개)
		for (String str:names)
			System.out.print(str+"\t");
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"배열의 활용", "동적배열", "API문서 참조한는법"};
		VarArgTest vat = new VarArgTest();
		System.out.println("str => "+ str);
		vat.print2(str);
		//-------------------------------------------------------------------
		vat.print("시장에가면");
		vat.print("시장에가면","파인애플");
		vat.print("시장에가면","파인애플도 있고","복숭아");
		vat.print("시장에가면","파인애플도 있고","복숭아도 있고","사과");
		vat.print("시장에가면","파인애플도 있고","복숭아도 있고","사과도 있고","바나나");
		vat.print("시장에가면","파인애플도 있고","복숭아도 있고","사과도 있고","바나나도 있고","무하과");
		vat.print("시장에가면","파인애플도 있고","복숭아도 있고","사과도 있고","바나나도 있고","무하과도 있고","귤");
	}

}
