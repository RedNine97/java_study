package j1221;

// 클래스 내부에서 특정객체를 한개만 생성 => 대여 => 반납(메모리 절약 목적)
// -> 스프링 내부에서도 같이 처리

public class Test {
	
//	1. 객체를 생성할때 한 개만 생성 -> 공유해서 사용할 수 있도록 -> 정적멤버 변수 선언
	private static Test instance=null; //공유객체
//						   Singleton instance = new Singleton();
//	2. 객체를 생성 -> 자동으로 호출되는 메서드(=생성자)
//	형식) private 생성자() {} => 외부에서 객체를 생성할 수 없다.(X)
	private Test() {
		System.out.println("인스턴스(=객체) 생성");
	}
//	3. 공유객체를 다른 모든 사람들에게 공유 => 정적메서드
	public static Test getInstance() {
//		안만들어져 있다면 하나 생성해서 -> 요구하는 쪽에 만들어진 객체를 대여
//		if(instance==null) { 
//			만들고자 하는 객체를 공유객체로 등록
//			형식) synchronized(클래스명.class){}
			synchronized(Test.class) {
				if(instance==null) {
					instance = new Test();
				}//if inner
			}//synchronized
//		}//if outer
		return instance;
	}
}//class Singleton
