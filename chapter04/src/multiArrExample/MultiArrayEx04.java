package multiArrExample;

public class MultiArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		int result = 0;
		
		for(int i = 0; i < pay.length; i++) {
			for(int j = 0; j < pay[i].length; j++) {
				result += pay[i][j];
			}
			System.out.print(result + ", ");
			result = 0;
		}
	}
}
