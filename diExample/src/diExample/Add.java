package diExample;

public class Add implements Ical{
	
	// 자바는 느슨한 결합이 기본 원칙
	// 느슨한 결합이어야 유지보수, 협업이 편해진다.
	@Override
	public int doOper(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
