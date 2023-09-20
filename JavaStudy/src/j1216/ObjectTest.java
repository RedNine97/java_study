package j1216;
/*
 * 조건) 객체를 파일로 저장? -> USB or 메일로 전송(파일 첨부 가능)
 * 직렬화 -> 메모리(객체) -> FileOutputStream(객체포장) -> 파일저장
 * 									ex) 냉동고에 저장(냉동) <-> 역직렬화
 * 모든 클래스의 객체가 전부 파일로 저장 X => 객체직렬화가 가능한 클래스로 만들어줘야 된다.(일반클래스 X)
 *      형식) class 클래스명 implements Serializable;
 */
import java.io.*;

//표시 역할
class Person implements Serializable { //객체직렬화가 되는 기능을 부여
	String name;
	transient int age;
	transient String addr; // transient : 직렬화 대상에서 배제됨
}

public class ObjectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Person p = new Person();
		System.out.println("Person => "+p);
		p.name="박완득";
		p.age = 23;
		p.addr = "경기도 광명시";
		
//		1. 파일로 저장
		FileOutputStream fos = 
				new FileOutputStream("C:\\webtest\\3.java\\object.txt");
		
//		2. 객체로 저장
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
//		3. 저장시키는 형식)writeObject(저장할 객체명) <-- (직렬화)
//							  <->(원래의 형)readObject() <-- (역직렬화)
		
		oos.writeObject(p);
		oos.close();
		fos.close();
		
//		4. 역직렬화 -> 만들어진 파일의 내용 -> 다시 메모리상으로 로딩
		ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\webtest\\3.java\\object.txt"));
//		Object (객체형변환) -> readObject -> Person으로 형변환
		Person p2 = (Person)ois.readObject();
		System.out.println("p2 => "+p2);
//		파일로 저장 => 다시 불러오기 => 주소가 다를 수 밖에 없다.
		System.out.println("p==p2 => "+(p==p2)); // false
		System.out.println("이름 => "+p2.name+" 나이 => "+p2.age+" 주소 => "+p2.addr);
	}

}
