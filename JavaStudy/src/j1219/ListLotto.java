package j1219;

import java.util.*;// List -> ArrayList, Vector, Random

public class ListLotto {
	Integer bonus; // 숫자객체 int (X)
	List<Integer> lotto = new ArrayList<Integer>();
//	자식클래스의 객체를 통해서 인터페이스 객체를 얻어올 수 있다.
//	부모자료형 = new 자식클래스명(~)
//	ArrayList<Integer> lotto = new ArrayList<Integer>(); (가능)
	
//	6개의 숫자를 랜덤으로 출력
	public void setup() { // 0~0.99999999999999999
		/*1. Math.random() -> 난수(=임의의 수)를 만들어주는 메서드
		 * 									중복된 숫자가 자주 나온다.
		 * 									seed값(섞어주는 값 고정) -> 중복이 높다.
		 */
		Random random = new Random(); // seed값이 변경(중복 X)
		while (bonus==null) { //bonus번호가 설정이 안되있다면
//			nextInt(숫자범위) => 숫자범위내의 임의의 수를 출력
			int num = random.nextInt(45)+1; // 1이 안되기 때문에 +1해줌
//			System.out.println("num => "+num);
//			번호를 하나 뽑아낼 때마다 lotto배열의 내용을 비교
			if(!lotto.contains(num)) { //중복된 숫자가 아니라면
				if(lotto.size()<6) {
					lotto.add(num); // 뽑은 숫자를 lotto배열에 저장
				}else { //lotto.size() >=6
					bonus = num; //6개가 다 차고 중복되지 않으면 나머지 보너스
				}// inner if
			}//outer if
		}//while
		Collections.sort(lotto); // 랜덤으로 뽑은 숫자를 오름차순으로 정렬
		System.out.println(lotto.size());
	}//setup()
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "당첨번호"+lotto+"보너스 번호는"+bonus;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListLotto lotto = new ListLotto();
		lotto.setup(); //6개의 번호 구함
		System.out.println(lotto); // lotto.toString() 번호출력
	}//main
}//class ListLotto
