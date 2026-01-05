package multiArrExample;

public class MultiArrayEx06 {

	public static void main(String[] args) {
		
		int max = 0;
		
		int aptNum1 = 0;
		int aptNum2 = 0;
		
		int aptNum3 = 0;
		int aptNum4 = 0;
		
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
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				if(max < pay[i][j]) {
					max = pay[i][j];
					aptNum1 = i;
					aptNum2 = j;					
				}
			}
		}
		
		int min = max;
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				if(min > pay[i][j]) {
					min = pay[i][j];
					aptNum3 = i;
					aptNum4 = j;
				}
			}
		}
		System.out.println("가장 많이 나온 집" + "(" + apt[aptNum1][aptNum2] + ")");
		System.out.println("가장 적게 나온 집" + "(" + apt[aptNum3][aptNum4] + ")");
	}

}
