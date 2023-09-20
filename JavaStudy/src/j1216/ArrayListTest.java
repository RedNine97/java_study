package j1216;

import java.util.*;

//리스트 내부에 배열이 들어가 있는 구조 -> 동적배열(ArrayList 구조)
// Vector -> ArrayList, LinkedList
public class ArrayListTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
//		LinkedList<String> list = new LinkedList<String>();
		
		list.add("포도");//0 -> "오렌지"
		list.add("딸기");//1
//		키위 -> 2
		list.add("복숭아");//2 ->3
//		add(삽입할 위치, 저장할 위치)
		list.add(2,"키위");
//		수정 => set(수정할 위치, 수정할 값)
		list.set(0,"오렌지");
//		삭제 => remove(삭제할 데이터명) or
//				   remove(인덱스 번호) => 중복된 데이터를 구분해서 삭제할 때
		list.remove(2);// list.remove("키위");
//		조회 -> get(인덱스번호)
		
		System.out.println("list.size() => "+ list.size());
		
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); //vector -> elementAt(i);
		}//for
		System.out.println("=== 확장 for문 ===");
		
		for(String s:list) {// for(자료형 출력변수 : 배열 또는 컬렉션객체명)
			System.out.println(s);
//			Iterator이용
			System.out.println("==== Iterator 이용 ====");
			Iterator<String> ih = list.iterator();
			while(ih.hasNext()) {
				System.out.println(ih.next());
			}//while
		}//for

	}//main
}//ArrayListTest
