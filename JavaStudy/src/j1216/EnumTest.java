package j1216;
// Set,Map => 공통으로 사용하는 검색
import java.util.*;

public class EnumTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Set(중복을 허용 X, 데이터 저장 순서 X)");
		HashSet hs = new HashSet();
		hs.add("abc");
		hs.add("abc2");
		hs.add("abc3");
		System.out.println(hs); //[abc, abc2]
		hs.remove("abc"); //remove("삭제할 데이터명");
		hs.clear(); //전부삭제 => 삭제할 데이터가 한 개 이상일때 (한꺼번에)
		System.out.println(hs);
		System.out.println("hs의 갯수="+hs.size());//0
	    System.out.println("저장유무확인=>"+hs.isEmpty());//size=0와 동일한기능
	    System.out.println("=====================");
	       
	    Vector<String> v=new Vector<String>();
	    v.add("test1");  v.add("test2"); v.add("test3");
		
//	    Map <E>, <K, V> 표형태로 저장 => 세션처리 ( 회원로그인할 때 사용)
	    Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(1, "홍길동"); //h.put("1","홍길동");
		h.put(2, "테스트");h.put(3, "010-1234-1234");
		h.put(4, "23"); //나이
		h.put(5, "서울시 강남구");
		
//		형식) get(키명) => 키를 알고 있으면 검색속도 제일 빠름
		String tel = h.get(3);
		System.out.println("tel => "+tel);
//		검색에 대한 인터페이스 -> Enumeration, Iterator
//		1. Enumeration 저장된 순서 그대로 가져오길 원할때
		Enumeration<String> eu = v.elements();
		
		while(eu.hasMoreElements()) {// 검색할 데이터가 존재한다면
			System.out.println(eu.nextElement()); //데이터를 꺼내와라
		}
//		2. Iterator => 도서관의 책꽂이에 들어가 있는 여러권의 책
//							   책을 꺼내올때 순서가 중요하다.
		Collection<String> c = h.values();
		Iterator<String> ih = c.iterator();
		
		while(ih.hasNext()==true) {//검색할 데이터가 있다면
			System.out.println(ih.next());// 있으면 꺼내와라(=nextElement())
		}//while
	}//main
}//EnumTest
