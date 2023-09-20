package j1202;  // 같은 패키지에 불러올 클래스가 존재하면 자동으로 불러온다.

public class TVHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. TV -> 객체(같은 구조 => 모델이 다름(size)
		TV smartTV = new TV();  // 객체 생성 => 공간을 만들어 달라
//		2. 객체 => 어떤 값이 저장(주소값이 저장된 변수) 객체명.멤버변수 = 값
		System.out.println("smartTV =>"+smartTV);
		smartTV.name = "삼성 smartTV";
		smartTV.maker="삼성";
		smartTV.color="blue";
		smartTV.size=50;
		
//		3. 주문 -> 배송 -> 설치 => 객체명.호출할 메서드명() or (~,,,)
		System.out.println();
		smartTV.channelUP(45);
		smartTV.channelDown(15);   //45-15=30
		smartTV.speakChannel("sports");
		
//		전체 채널 편성표
		smartTV.tvDisplay();
		
		smartTV.turnOff();
		
	}

}
