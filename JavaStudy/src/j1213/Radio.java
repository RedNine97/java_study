package j1213;
/*
 * 인터페이스 상속은 => 자식인터페이스 extends 부모인터페이스
 * 클래스에서 상속은 -> 자식클래스 extends 부모클래스
 * 
 * 클래스에서 인터페이스를 상속받을땐 
 * => 자식클래스 implements 부모인터페이스, 부모인터페이스2,,,(다중상속)
 */
public class Radio implements AdvanceVolume {
	
	private int VolLevel;	//볼륨의 크기
		
//	다향성 => 메서드명은 같지만 실제 내용은 다르다. -> 기능이 다 다르다.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악프로그램을 turn On!!");
	}
	
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Radio 음악프로그램을 turn Off!!");
	}
	
	@Override
	public void volumeUp(int level) {
		// TODO Auto-generated method stub
		VolLevel += level;
		System.out.println("Radio 음악프로그램의 볼륨을 "+level+"만큼 올림");
	}
	
	@Override
	public void volumeDown(int level) {
		// TODO Auto-generated method stub
		VolLevel -= level;
		if(VolLevel<0) //캡슐화
			VolLevel=0;
		System.out.println("Radio 음악프로그램의 볼륨을 "+level+"만큼 내림");
	}
	
//	Radio에만 있는 다른 기능은 각자 개발자에게 맡김.
//							,,,

}//class Radio
