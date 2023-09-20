package j1213;
/* 
 * 전체 프로그램의 사용되는 모든 공통적인 기능(=업무분석)을 가지고
 * 추상메서드를 선언
 * 누구나 접근이 가능하도록 public interface로 작성
 */
public interface Volume {
//	1. 볼륨을 올리기 -> 수정목적 -> 매개변수 O 반환값 X 
	public void volumeUp(int level); //선언 -> 내용이 X
	
//	2. 볼륨을 내리기 -> 수정목적 -> 매개변수 O 반환값 X 
	public void volumeDown(int level); //선언 -> 내용이 X
	
//	3,4.( tunOn, tunOff )
}
