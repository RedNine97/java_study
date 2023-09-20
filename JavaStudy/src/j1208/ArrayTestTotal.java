package j1208;

// 1차원 배열의 문제
public class ArrayTestTotal {
//	int b[] = { 58, 38, 12, 36, 41, 27, 16, 32, 59, 16, 28, 21, 17, 25};
//	int count = 0;
//	int coutn[1], count[2], count[3], count[4]
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayTestTotal xy = new ArrayTestTotal();
//		xy.bArray(10);
//		xy.bArray(20);
//		xy.bArray(30);
//		xy.bArray(40);
//		xy.bArray(50);	
		
		int b[] = { 58, 38, 12, 36, 41, 27, 16, 32, 59, 16, 28, 21, 17, 25};
		int count = 0;
		
		int cnt[] = new int[5];
//		추가
		int age[] = {10, 20, 30, 40, 50};
		
		for (int i=0;i<b.length; i++) {
			if(b[i]>=10 && b[i]<=19) cnt[0]++;
			if(b[i]>=20 && b[i]<=29) cnt[1]++;
			if(b[i]>=30 && b[i]<=39) cnt[2]++;
			if(b[i]>=40 && b[i]<=49) cnt[3]++;
			if(b[i]>=50 && b[i]<=59) cnt[4]++;
		}
		for (int i=0;i<age.length;i++) {
			System.out.println(age[i]+"대 인원수 => "+cnt[i]+"명");
		}
		
	}//main
	
//	void bArray(int x) {
//		for (int i = 0; i < b.length; i++) {
//			if (b[i] >= x && b[i] <= x+9) {
//				count++; 
//			}
//		}
//		System.out.println(x+"대 인원수 = "+ count+"명");
//		count=0;
//	}
}
