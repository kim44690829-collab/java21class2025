package classPart07;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassEx07 ex07 = new ClassEx07();
		
		boolean run = true;
		
		while(run) {
			ex07.menuList();
			int selectNum = scan.nextInt();
			ex07.menuOrder(selectNum);
			
		}

	}

}
