package j1207;

// 1차원 배열의 문제
public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		14명의 나이를 계산
		int b[] = { 58, 38, 12, 36, 41, 27, 36, 32, 59, 16, 28, 21, 17 };
//		10~50대 나이 -> 20대 몇명? (20~29)
		int count = 0; // 20대를 저장할 변수

		for (int i = 0; i < b.length; i++) {
			if (b[i] >= 20 && b[i] <= 29) {
				count++; 
				System.out.println("b[" + i + "] = " + b[i]);
			}
		}
		System.out.println("20대 인원수(count) => "+ count);
	}//main
}
