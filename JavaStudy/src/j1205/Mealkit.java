package j1205;

public class Mealkit {
	
	String maker; //제조사
	String name;  //제품명
	String type;   //제품 종류
	int size;       //제품 사이즈
	int price;	   //가격
	int exData;   //유통기한

	void mealkitMaker(String mk ) {
		if (mk.contentEquals("ful")) {
			System.out.println("풀무원");
		}else if (mk.contentEquals("farm")) {
			System.out.println("팜앤쿡");
		}else if (mk.contentEquals("iam")) {
			System.out.println("아임셰프");
		}
		System.out.println("이 밀키트의 제조사는 "+maker);
	}
	
	void mealkitInfoPrint( ) {
		System.out.println("=== 밀키트 정보 ===");
		System.out.println("밀키트 이름 => "+name);
		System.out.println("밀키트 종류 => "+type);
		System.out.println("밀키트 사이즈 => "+type);
		System.out.println("밀키트 가격 => "+price);
		System.out.println("밀키트 유통기한 => "+exData);
		
	}
	
	
	
	
	
	
	
}
