package ifExample;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("키를 입력하세요 : ");
		int stature = scan.nextInt();
		
		if(stature < 120) {
			System.out.print("부모님과 함께 오셨나요?(yes : 1, no : 0) : ");
			int answer = scan.nextInt();
			if(answer == 1) {
				System.out.println("놀이기구 이용 가능합니다");
			}else {
				System.out.println("놀이기구를 이용할 수 없습니다");
			}
		}else {
			System.out.println("놀이기구 이용 가능합니다.");
		}
		
		
		
	}

}
