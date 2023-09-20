package j1213;

// 문자열 객체를 만드는 방법 2가지

public class StringTest2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1) String 문자열객체명 = "저장할 문자열";
		String str1 = "abc";
//		저장할 문자열 존재를 확인 O -> 새로운 공간을 만들지 X => 서로 연결한다.(주소값이 같다.)
		String str2 = "abc"; //str1의 "abc"를 공유중
//		존재하지 않는다면 X -> 새로운 공간 O
		
		System.out.println(System.identityHashCode(str1)); //<-- 문자열이 저장된 주소값 출력
		System.out.println(System.identityHashCode(str2)); //<--같다링
		
//		2) new String("저장할 문자열")   <-- 잘 사용안함
		String str3 = new String("abc"); //무조건 새로운 공간을 만듬 O 
		String str4 = new String("abc"); //주소는 다르지만 내용은 같다 <- 공간 낭비 5짐
		
		System.out.println(System.identityHashCode(str3)); //<-- 문자열이 저장된 주소값 출력
		System.out.println(System.identityHashCode(str4)); //<-- 주소값 다르다잉
		
/*		String str ="abc" + "def" + "sss" + "ass"          <--- 안좋은 코딩 방법
		String str = new StringBuffer("abc").append("def")    <-- 이렇게 코딩하셈
									        .append("sss").append("ass").toString();     */
//		주소(=저장된 위치)가 같은지 확인해보자
//		객체==객체2(주소를 비교할때)    ,    변수==변수2(내용을 비교할때)
		if(str1==str2)
			System.out.println("str1과 str2는 주소가 서로 같다.");
		else
			System.out.println("str1과 str2는 주소가 서로 다르다.");
		System.out.println("===========================");
		
		if(str3==str4)
			System.out.println("str3과 str4는 주소가 서로 같다.");
		else
			System.out.println("str3과 str4는 주소가 서로 다르다.");
//		객체의 내용끼리 비교하는 법은? => equals => contentEquals()(요즘 많이 사용됨)
//		내용이 같은지 확인하는 방법 -> equals() 대, 소문자로 구분해서 사용 O
//									   -> contentEquals()도 가능
		
		if(str1.contentEquals(str2)) // "abc"
			System.out.println("str1과 str2는 내용이 서로 같다.");
		else
			System.out.println("str1과 str2는 내용이 서로 다르다.");
		
		
	}//main
	
}//StringTest2
