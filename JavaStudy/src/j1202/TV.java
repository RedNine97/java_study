package j1202;

// TV 
public class TV {
	
//	1.공통의 저장할 특성
	String maker;  	//제조사 -> null(default) 데이터 저장 X
	String name;		//모델명
	String color;		//색깔
	int size;				//인치 - > default : int = 0, boolean = false, double = 0.0
//	상태
	boolean power=false;		//전원상태 off
	int channel;						//0
	
//	2. TV기능
//	1) 리모컨으로 전원 on => 단순, 반복 ( 매개변수 X 반환값 X )
	void turnOn() {
		power = !power; 		  // power=true(!false);
		System.out.println("로딩중... TV전원 On!!");
	}

//	2) 리모컨으로 전원 off => 단순, 반복
	void turnOff() {
		power = !power;		     // power=false;
		System.out.println("TV전원 Off!!");
	}	
//	3) 채널 change => Up ( 매개변수 O 반환값 X )
	void channelUP(int ch) {
		channel = ch; 			// channel += ch;
		System.out.println("현재 변경된 채널은 " + channel);
	}

//	4) 채널 change => Down
	void channelDown(int ch) {
		channel -= ch;
		System.out.println("현재 변경된 채널은 "+channel);
	}
//	5) TV채널 정보 => 채널 편성표 => 단순, 반복
	void tvDisplay() {
		System.out.println("=== TV정보 출력 ===");
		System.out.println("모델명 => " + name);
		System.out.println("색상 => " + color);
		System.out.println("현재 채널 => " + channel);
		System.out.println("전원 상태 => " + power);
	}
//	6) 말하면 채널 변경 기능 ( 매개변수 O 반환값 X ) => 말(String)
	void speakChannel(String ch ) {	// "ocn"(35) "sport" (121),,,
//		String 객체 => 문자열을 비교(equals("비교형 문자열") 대소문자 구분 O
//											  equalslIgnoreCase => 대소문자 구분X
//		다양한 조건에 따라서 처리 되는 값이 다 다를때
		if (ch.equals("ocn")) {
			channel = 35;
		} else if (ch.contentEquals("sports")) {
			channel = 129;
		} else if (ch.contentEquals("tvn")) {
			channel = 3;
		}
		System.out.println("현재 채널은 " + channel + "로 이동중입니다.");
	}
}
