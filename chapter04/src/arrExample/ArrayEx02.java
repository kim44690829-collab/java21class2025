package arrExample;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] str = {"홍길동", "개나리", "진달래", "김백합", "최동훈"};
		int[] score = new int[str.length];
		
		int studentScore = 0;
		double avg = 0;
		double sum = 0;

		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + "의 점수를 입력하세요 : ");
			studentScore = scan.nextInt();
			score[i] = studentScore;
			sum += score[i];
			avg = sum / str.length;
		}
		
		for(int j = 0; j < str.length; j++) {
			System.out.println(str[j] + "의 점수 : " + score[j] );
		}
		System.out.println("----------------------");
		System.out.println("평균 : " + avg);
	}

}
