package bookShop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BookDTO {
	// DTO => DB의 데이터를 임시로 저장하는 공간으로 만들어놓은 클래스
	// => 멤버변수(필드명)이 꼭 들어가야함
	// 멤버변수
	String BookTitle; // 도서명
	String Author; // 저자
	String Publisher; // 출판사
	Date Date; // 출판일
	int Price; // 가격
	
	// 디폴트 생성자
	public BookDTO() {};
	
	// 매개변수 생성자
	public BookDTO(String BookTitle, String Author, String Publisher, Date Date, int Price) {
		// this => BookDTO 클래스를 의미
		this.BookTitle = BookTitle;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Date = Date;
		this.Price = Price;
	}
	
	// 출력하는 메서드
	public void printList() {
		// DecimalFormat 사용 => 숫자의 형식을 변경해서 출력하면 문자가 됨.
		DecimalFormat de = new DecimalFormat("#,##0원"); 
		// SimpleDateFormat 사용 => 날짜의 형식을 변경하여 출력 => 문자로 출력됨
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E)");
		System.out.println(BookTitle + "\t" + Author + "\t" + Publisher + "\t" + sdf.format(Date) + "\t" + de.format(Price));
	}
	
}
