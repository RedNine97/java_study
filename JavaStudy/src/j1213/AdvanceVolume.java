package j1213;

//자식 인터페이스명 extends 부모 인터페이스명
public interface AdvanceVolume extends Volume {
	/*
	 * 부모로부터 물려받은 추상메서드를 이미 가진 상태
	 * public void volumeUp(int level); //선언 -> 내용이 X
	 * public void volumeDown(int level); //선언 -> 내용이 X
	 */
	public void turnOn(); //프로그램 전원 on
	public void turnOff(); //프로그램 전원 off
		
	}
