package exceTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		// Exception 및 하위 클래스를 이용해서 예외 처리를 다양하게 할 수 있다.
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int[] iArr = new int[5]; // 자료구조 => 선형 자료구조 => 자료를 가로로 저장(일자로)
		// ArrayList는 List의 하위 클래스이다. => List로 업캐스팅 할 수 있다.
		List<Integer> list = new ArrayList<Integer>(); // => 자료구조 => 선형 자료구조 
		
		// try{}catch(){}catch(){}...finally(){}
		try {
			// 실행 구문
			System.out.print("input i : ");
			i = scan.nextInt();
			System.out.print("input j : ");
			j = scan.nextInt();
			System.out.println("( i / j ) : " + (i / j));
			
			for(int k = 0; k < 6; k++) {
				System.out.println("iArr[" + k + "]" + iArr[k]);
			}
			System.out.println("List size : " + list.size());
		}catch(InputMismatchException e) {
			// 실행 구문에 오류가 있을 때 catch()로 넘겨라
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println("숫자를 입력하세요.");
		}catch(ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.err.println(e);
			System.err.println("배열 길이 오류");
		}catch(Exception e) { 
			// Exception 최상위 클래스로 catch()가 하나일때 사용
			// catch()가 여러개 일때 Exception을 맨 앞에 사용할 경우 하위 catch에 있는 하위 Exception은 사용하지 못하는 문제가 생긴다.  
			// e.printStackTrace();
			System.out.println("숫자를 입력하세요.");
		}finally {
			// 오류의 존재 유무와 상관없이 무조건 출력
			System.out.println("end");
		}

	}

}
