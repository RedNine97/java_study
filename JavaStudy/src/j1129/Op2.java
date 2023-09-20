package j1129;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b1=5;
		short s=-4;
		int i=8;
		
		System.out.println("b1+>"+b1);  //5
		System.out.println("-s=>"+(-s));  //연산자 우선순위에 구분 ->()
		System.out.println("i=>"+i);  //8
		
		System.out.println("++i=>"+(++i));  //9
		/*
		 * i=i+1 -> i=8+1
		 * System.out.println(i)
		*/
		System.out.println("i++=>"+(i++));  //9
		/*
		 * System.out.println(i) //9
		 * i=i+1 -> i=9+1
		*/
		
		System.out.println("중간 값 i=>"+i);  //10
		System.out.println("--i=>"+(--i));  //9
		/*
		 * i=i-1 -> i=10-1
		 * System.out.println(i)
		*/
		System.out.println("i--=>"+(i--));  //9
		/*
		 * System.out.println(i)
		 * i=i-1 -> i=9-1
		*/
		System.out.println("최종 값 i=>"+i);  //8
		
	}
}
