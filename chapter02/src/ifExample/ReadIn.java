package ifExample;

import java.io.IOException;

public class ReadIn {

	public static void main(String[] args) throws IOException {
		// System.in.read() => 키보드로부터 값을 입력받을 수 있다.
		// 키 코드를 하나씩 읽기 때문에 2개 이상의 키가 조합된 한글을 읽을 수 없다.
		// 숫자를 입력하던 한 음절 문자를 입력하던 아스키코드 값이 출력된다.
		
		int keycode;
		
		System.out.print("값을 입력하세요 : ");
		
		keycode = System.in.read();
		System.err.println("keycode : " + keycode);

	}

}
