package multiArrExample;

import java.util.Scanner;

public class MultiArrayEx05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
		};
		
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
		};
		
		int apt1 = 0;
		int apt2 = 0;
		
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				System.out.print(apt[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.print("호를 입력해주세요 : ");
		int aptNum = scan.nextInt();
		
		for(int i = 0; i < apt.length; i++) {
			for(int j = 0; j < apt[i].length; j++) {
				if(aptNum == apt[i][j]) {
					apt1 = i;
					apt2 = j;
				}
			}
		}
		
		System.out.println("관리비 : " + pay[apt1][apt2]);
	}

}
