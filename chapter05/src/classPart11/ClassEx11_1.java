package classPart11;

public class ClassEx11_1 {
	String name = "";
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore = {92, 38, 87, 100, 11};
	// int maxIndex;
	
	public ClassEx11_1() {}
	
	// 전교 성적 출력함수 choice1()
	public void choice1() {
		for(int i = 0; i < arHakbun.length; i++) {
			System.out.println((i + 1)+ ". " + arHakbun[i] + "학번" + "(" + arScore[i] + "점)");
		}
	}
	
	// 전교 1등 성적 출력 함수 choice2()
	public void choice2() {
		int max = arScore[0];
		int firstStudent = 0;
		for(int i = 0; i < arHakbun.length; i++) {
			if(max < arScore[i]) {
				max = arScore[i];
				firstStudent = i;
			}
			// System.out.println("max => " + max);
		}
		System.out.println("1등 학생 : " + arHakbun[firstStudent] + "학번" + "(" + arScore[firstStudent] + "점)");
	}
	
	// 전교 꼴등 성적 출력함수 choice3()
	public void choice3() {
;		int min = arScore[0];
		int lastStudent = 0;
		for(int i = 0; i < arHakbun.length; i++) {
			if(min > arScore[i]) {
				min = arScore[i];
				lastStudent = i;
			}
		}
		System.out.println("꼴등 학생 : " + arHakbun[lastStudent] + "학번" + "(" + arScore[lastStudent] + "점)");
	}
	
	// 학번 입력받아 성적 출력함수 choice4()
	public void choice4(int hakNum) {
		int hakNumSel = -1;
		for(int i = 0; i < arHakbun.length; i++) {
			if(hakNum == arHakbun[i]) {
				hakNumSel = i;
				break;
			}
		}
		// hakNumSel 는 for문 밖에서 비교해줘야한다.
		if(hakNumSel == -1) {
			System.out.println("해당 학번은 존재하지 않습니다.");
		}else {
			System.out.println(hakNum + "의 점수 : " + arScore[hakNumSel] + "입니다.");
		}

		//return false;
	}
	
}
