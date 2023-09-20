package j1219;
/* 
 * 자주 사용이 되는 클래스도 import 형태로 등록
 * 형식) import static 자주 불러다 사용하는 클래스명(패키지명...클래스명)
 * 제너릭 클래스 -> 특정 자료형의 값만 입력받아서 저장, 조회, 검색, 계산, 출력
 * 						적용 ) 멤버변수, 메서드의 매개변수에도 제너릭을 부여 가능
 */
import static java.lang.System.out; //메모리에 로딩

//기능은 동일한데 자료형만 다른 경우 => 단순, 반복적인 구문을 작성
public class GenericEx<T> { // GenericEx 클래스의 객체를 생성하면서
 											  // Type에 대한 자료형만 받아서 처리하겠다.
//	Object v[]; == class명 뒤에 <T>
	T v[];
	/*
	String v[]; 
	Double v2[]; 
	Integer v3[]; 
	*/
	
//	1. 배열의 값을 저장(Setter)
	public void set(T n[]) {
		v=n;
	}
	/*
	public void set(String n[]) {
		v=n;
	}
	public void set(Double n[]) {
		v2=n;
	}
	public void set(Integer n[]) {
		v3=n;
	}*/
	
//	2. 배열의 값을 꺼내와서 출력(Getter)
	public void print() {
		for(T s:v) {
			out.println(s);
		}
	}
	/*
	public void print() {
		for(String s:v) {
			out.println(s);
		}
	}
	public void print2() {
		for(Double s:v2) {
			out.println(s);
		}
	}
	public void print3() {
		for(Integer s:v3) {
			out.println(s);
		}
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericEx<String> ge = new GenericEx<String>();
		GenericEx<Double> ge2 = new GenericEx<>();
		GenericEx<Integer> ge3 = new GenericEx();
		
		String ss[] = {"제너릭", "제너릭의 종류","제너릭 실습"};
		ge.set(ss);
		ge.print();
		
		Double ss2[] = {3.4, 5.6, 9.8};
		ge2.set(ss2);
		ge2.print();
		
		Integer ss3[] = {1, 2, 3, 4, 5};
		ge3.set(ss3);
		ge3.print();
		
	}//main
	
}//GenericEx
