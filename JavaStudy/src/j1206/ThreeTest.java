package j1206;
// 세개의 값을 입력을 받아서 최대값을 구하시오.
public class ThreeTest {

	public static void main(String[] args) {
		/*
		int x=12;
		int y=4;
		int z=19;
		
		if ((x > y) && (x > z)) {
			System.out.println("세 개의 값중 최댓값은 "+x+"입니다.");
		}else if((y>x) && (y>z)) {
			System.out.println("세 개의 값중 최댓값은 "+y+"입니다.");
		}else {
			System.out.println("세 개의 값중 최댓값은 "+z+"입니다.");
		}
		*/
//		지역변수
		int a=12;
		int b=4;
		int c =19;
		
		int max;    //최대값  12>4
		/*
		max=(a>b)? a:b;             //max =12(a > b)
		max=(max>c)? max:c;    //max =19( c > max(a))
		return max;					   //max값 반환
		 */

		ThreeTest tt = new ThreeTest();
		
		tt.getMaxPrint1(12, 4, 19);
		tt.getMaxPrint2(23, 14, 5);
		tt.getMaxPrint3(5, 13, 6);  //    <--이건 반환형이 없어서(main) 출력 X
		System.out.println
		("3. 최대값은 " + tt.getMaxPrint3(45, 14, 6));   // <----- 반환값이 있는 경우
	}//main
	
	void getMaxPrint1(int x, int y, int z) {
		if ((x > y) && (x > z)) {
			System.out.println("1. 최댓값은 " + x + "입니다.");
		} else if ((y > x) && (y > z)) {
			System.out.println("1. 최댓값은 " + y + "입니다.");
		} else {
			System.out.println("1. 최댓값은 " + z + "입니다.");
		}
	}
	void getMaxPrint2(int a, int b, int c) {
		int max=(a>b)? a:b;
		max=(max>c)? max:c;
		System.out.println("2. max => "+ max);
	}
	
	int getMaxPrint3(int a, int b, int c) {
		int max=(a>b)? a:b;
		max=(max>c)? max:c;
		return max;
	}
}
