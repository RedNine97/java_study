package j1212;

//3.메서드의 반환형을 통해서 객체를 얻어오는 방법 -> 자바의 메모리 사용량 확인
public class GCCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		새로운 클래스 API 문서 찾아보기
//		new 사용못함 X =>메서드의 반환형을 통해서 얻어옴, 매개변수 전달
		Runtime r = Runtime.getRuntime(); // 생성자가 없다.
		System.out.println("r => "+r);
		
		byte test[] = new byte[1024]; //1024개의 정수값 저장공간 생성
		test[0] = 20; test[2] =34; //,,,test[1023] = 100;
//		참조형 -> 클래스, 배열, 인터페이스 
		System.out.println("test => "+test);// 참조형
		
//		전체사용량 - 남은사용량 = 현재 사용중인 메모리양 (100-40=60)
		System.out.println("before 사용량 => "+
		(r.totalMemory()-r.freeMemory())/1024+"K"); //1802K
//		USB 인식 X -> 외부손상시
//		자바의 특징 -> 불필요로하는 메모리가 발생 -> 자동으로 메모리를 해제
		test =null; //일부러 주소값을 지움 -> 데이터공간 낭비
		
//		자동으로 해제시켜주는 메서드 -> gc()
		System.gc(); // <- 수동으로 호출해주는 메서드
		System.out.println("after 사용량 => "+
		(r.totalMemory()-r.freeMemory())/1024+"K"); //637K
//		쓰잘데기 없는 메모리(null) 없애서 사용할 수 있는 메모리양이 늘어났다.
		
	} //main
}//GCCollector
