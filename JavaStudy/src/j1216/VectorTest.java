package j1216;

import java.util.*; //Scanner, Vector, ArrayList,,,

public class VectorTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>(); // new Vector(1,1) <-- 생성갯수, 증가분
		v.add("테스트"); // 0 -> v.add(new String("테스트"));
		v.addElement("임시테스트2"); // 1
		v.add("테스트2");// 2
//		v.add(100); // v.add(new Integer(100));

		System.out.println("v의 크기 => " + v.size());
//		값 출력
		for (int i = 0; i < v.size() - 1; i++) { // elementAt 각각의 항목을 꺼내올때 쓰는 메서드
			//String temp = (String) v.elementAt(i);
			String temp = v.elementAt(i);
			System.out.println("temp => " + temp);
		}
//		다양한 값 저장
		Vector v2 = new Vector();
		/*
		 * Character c = new Character('a'); 
		 * v2.add(c);
		 */
		v2.add('a'); // v2.add(new Character('a')); //0
//		3.141592 -> 1
		v2.add(100); // 1 -> 2
//		insertElementAt(1. 저장할 객체명, 2. 삽입할 인덱스 번호)
		v2.insertElementAt(3.141592, 2);
		System.out.println("v2의 크기는 => " + v2.size());
//		수정하는 법 -> setElementAt(수정할 데이터명, 수정할 인덱스 번호)
		v2.setElementAt("set",2); // 100 -> "set"
		
		for (int i=0; i < v2.size(); i++) {//꺼내면서 내부적으로 자동형변환
			System.out.println("v2의 값 => " + v2.elementAt(i));
		}
		
	}//main
	
}//VectorTest
