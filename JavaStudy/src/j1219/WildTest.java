package j1219;

import java.util.*;// List, ArrayList

//1. <?> 와일드 카드를 이용한 제너릭 방법 => 메서드 호출시 매개변수를 전달할때

public class WildTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. 문자열 
		List<String> list = new ArrayList();
		list.add("테스트1"); list.add("테스트2"); list.add("테스트3");
		printData(list);
		
//		2. 정수형
		List<Integer> list2 = new ArrayList();
		list2.add(new Integer(100)); list2.add(200); list2.add(300);
		printData(list2);
		
//		3. 소수점
		List<Double> list3 = new ArrayList();
		list3.add(new Double(12.5)); list3.add(45.6); list3.add(78.9);
		printData(list3);
		
		
	}//main
	
//	오버로딩 => 메서드의 객수를 줄이지 못한다. => 한개의 메서드로 통합
//											소스코드 정의 -> 개발시간 단축	
//	<?> => 매개변수를 전달받을때 그때 그때마다 자료형을 바꿔서 전달받겠다.
	public static void printData(List<?> list) {
		for(Object obj:list) {
			System.out.println(obj);
		}
	}
	/*
	public static void printData(List<String> list) {
		for(String obj:list) {
			System.out.println(obj);
		}
	}
	public static void printData2(List<Integer> list) {
		for(Integer obj:list) {
			System.out.println(obj);
		}
	}
	public static void printData3(List<Double> list) {
		for(Double obj:list) {
			System.out.println(obj);
		}
	}
	*/
}//WildTest
