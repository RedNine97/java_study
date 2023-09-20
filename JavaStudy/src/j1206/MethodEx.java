package j1206;

// 성적처리 프로그램 => 국, 영, 수 -> 합계 -> 평균 -> 등급 -> 모든 정보 출력
public class MethodEx {

	
	
	
	
	
	
	
	
	
	
//	< 요구 분석에 따라서 필요로 하는 메서드를 생각 >
	/*
	 * 메서드를 작성하는데 매개변수를 주는 경우, 안주는 경우(구분하는 방법)
	 * 1. 멤버변수를 선언 -> 매개변수가 없는 메소드를 작성 (O)
	 * 2. 멤버변수가 존재 (X) -> main() 선언  지역변수로 선언
	 * 									매개변수가 있는 메서드를 작성 (O)
	 */
	/* < 매개변수 없이 작성할 시 main에 선언 X >
	int kor, eng, mat;
	double avg;
	char grade;
	*/
	
//	1. 총점(=합계) -> 계산목적 -> 반환값(O)
	int calcSum(int kor, int eng, int mat) {
		int sum=kor+eng+mat;
		return sum;
	}
	
//	2. 평균 -> 총점 / 과목수 -> 반환값(O)
	double calcAvg(int tot) {
		return (double)(tot/3);
	}
	
//	3. 등급(=학점) -> 평균 -> 반환값(O)
	char calcGrade(double avg) {
//		90~100 A
		if (avg<=100 && avg>=90) return 'A';
			else if(avg<90 && avg>=80) return 'B';
			else if(avg<80 && avg>=70) return 'C';
			else if(avg<70 && avg>=60) return 'D';
			else return 'F';
	}
	
//	4. 총점, 평균, 등급을 모두 출력 => (단순, 반복) 매개변수 X, 반환값 X
	void display(int tot, double avg, char grade) {
		System.out.println("총점, 평균, 등급을 모두 출력");
		System.out.println("합계 (tot) => "+ tot);
		System.out.println("평균 (avg) => "+avg);
		System.out.println("등급 (grade) => "+ grade);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 객체생성
		MethodEx me = new MethodEx();
		
		int kor=90;    //<---- 매개변수 있게 작성할 시 main에 선언
		int eng=97;
		int mat=98;
//		1) 총점
		int tot=me.calcSum(kor, eng, mat);
//		System.out.println("합계 (tot) => "+tot);
//		2) 평균
		double avg=me.calcAvg(tot); //215/3

//		3) 등급
		char grade=me.calcGrade(avg); //C

//		4)display
		me.display(tot, avg, grade);
		
		
		
		
		
		
		
	}//main

}//MethodEx
