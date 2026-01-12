package bookShop;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) throws ParseException {
		// 객체화 대상 => BookList
		BookList list = new BookList();
		// 입력용 날짜 데이터
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 합계 출력용 DecimalFormat 객체 생성
		DecimalFormat de = new DecimalFormat("#,##0원");
		
		// BookDTO에 데이터를 객체화해서 삽입
		list.addBook(new BookDTO("Java", "홍길동", "코리아출판사", sdf.parse("2026-01-12"), 35000));
		list.addBook(new BookDTO("React", "김길동", "코리아출판사", sdf.parse("2025-02-12") , 45000));
		list.addBook(new BookDTO("Spring", "최길동", "코리아출판사", sdf.parse("2020-03-12") , 15000));
		list.addBook(new BookDTO("HTML", "박길동", "코리아출판사", sdf.parse("2023-01-12") , 75000));
		list.addBook(new BookDTO("MySQL", "오길동", "코리아출판사", sdf.parse("2021-04-12") , 25000));
		list.bookInfo();
		System.out.println("합계 : " + de.format(list.getTotal()));
		
	}

}
