package classPart10;

import java.util.Random;

public class ClassEx10 {
	
	int[] score = new int[5];
	
	public ClassEx10() {}
	
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("학생 총점 : ");
		System.out.print("[ ");
		for(int i = 0; i < x.length; i++) {
			x[i] = ran.nextInt(100) + 1;
			System.out.print(x[i] + " ");
		}
		System.out.println("]");
	}
	
	// 학생 총점
	public int sum() { //int[] x
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}
	
	// 학생 전체 평균
	public double avg() { //int[] x
		double avg = 0.0;
		// int sum = total(x); // 매개변수를 집어넣고 호출
		// avg = (double) sum / x.length => 명시적 형변환
		double sum = 0.0;
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		avg = sum / score.length;
		return avg;
	}
	
	// 1등 점수
	public int firstScore() { //int[] x
		int max = score[0];
		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
		}
		return max;	
	}
	
	// 꼴등 점수
	public int lastScore() { //int[] x
		int min = score[0];
		for(int i = 0; i < score.length; i++) {
			if(min > score[i]) {
				min = score[i];
			}
		}
		return min;
	}
}
