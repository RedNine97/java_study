package j1207;

// 1차원 배열
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int su, su2, su3; // 메모리 저장위치 다 다름, 변수 갯수
//		형식) 자료형 배열명[]=new 자료형[갯수];
//		int -> 0, double -> 0.0, boolean -> false로 자동 초기화
		int su[]=new int[3]; //0, 1, 2
//		boolean su[]=new boolean[3];
		
		System.out.println("su =>" + su); // 객체형=참조형=클래스명
		
//		su[0]=10; su[1]=20;// su[2]=30;
		System.out.println("su[1] => " + su[1]); // 20
		System.out.println("su[2] => " + su[2]); // 30
		
		int su4=23; // 지역변수는 반드시 선언해야함 -> 값을 저장시켜야 한다.
		System.out.println(su4);  // 0 => 자동으로 초기값 X
		
//		형식2) 자료형 배열명[]={값1,값2,값3,,,} //생성과 초기화를 동시에
		int[] c = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // 0~9
		/*				배열첨자, 요소
		 * int c[]=new int[10]
		 * c[0]=10,c[1]=20...c[9]=100
		 * 
		 * 배열.length => 배열의 길이를 자동으로 계산해준다.
		 * 배열의 인덱스를 이용 => 다양한 값을 출력이 가능하다.
		 * 단점) 첨자 계산을 잘못 계산하면 에러유발
		 */
		for(int i=2; i<c.length-1; i++) {
			System.out.println("c["+i+"]= "+c[i]);
		}
		
//		확장 for문(=향상된 for문) => 단순히 배열, 객체의 값을 꺼내와서 출력할때 사용
//		형식) for (배열의 자료형  출력할 변수명;출력대상자(배열 or 컬렉션객체)
		for(int num:c)
			System.out.print("num = "+num+'\t'); //탭키만큼 거리 유지하는 방법\t
//		첨자는 어떻게 쓰나요? 첨자계산하고와 상관없이 단지 배열의 값만 확인하기 위해서이다.
		
	}//main
}//ArrayTest
