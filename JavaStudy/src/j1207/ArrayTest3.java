package j1207;

import java.util.Scanner;

//사용자로부터 값을 입력받아 그 값을 출력하기 -> 1. 배열 2. Scanner 클래스

public class ArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu[] = new int[5]; //0~4
		int sum=0; 			 //합계
		double avg=0.0;  //평균
//		ctrl + shift + o (import 자동 생성)
		Scanner sc = new Scanner(System.in);  //키보드
		System.out.println("5과목의 점수를 입력하세요?");
		/*
		jumsu[0] = sc.nextInt();
		sum = 0+jumsu[0]; //78
		
		jumsu[1]=sc.nextInt();
		sum=sum+jumsu[1]; //78+90
		*/
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i]=sc.nextInt();
			sum+=jumsu[i];
		}
//		최종 합계, 평균
		avg=(double)sum/jumsu.length; //평균
		System.out.println("합계 => "+ sum+", 평균 => "+avg);
		
		
		
		

	}// main

}
