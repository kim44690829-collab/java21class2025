package classPart10;

public class MainClass {

	public static void main(String[] args) {
		
		ClassEx10 ex10 = new ClassEx10();
		// int[] score = new int[5];
		
		ex10.test(ex10.score);
		
		System.out.println("학생 총점 = " + ex10.sum());
		System.out.println("학생 전체 평균 = " + ex10.avg());
		System.out.println("1등 점수 = " + ex10.firstScore());
		System.out.println("꼴등 점수 = " + ex10.lastScore());
	}

}
