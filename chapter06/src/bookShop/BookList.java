package bookShop;

import java.util.ArrayList;

public class BookList {
	// BookDTO를 ArrayList<> 에 넣는다. => 가변길이이기 때문에
	ArrayList<BookDTO> booklist; // => 멤버변수
	// booklist[0] => {BookTitle:~, Author:~, Publisher:~, Date:~, Price:~}
	// booklist[1] => {BookTitle:~, Author:~, Publisher:~, Date:~, Price:~}
	// booklist[2] => {BookTitle:~, Author:~, Publisher:~, Date:~, Price:~}
	
	
	// 디폴트 생성자
	public BookList() {
		booklist = new ArrayList<>();
	}
	
	// 추가
	public void addBook(BookDTO bdto) {
		// bdto.BookTitle => 이런 방식으로 접근 가능
		booklist.add(bdto);
	}

	// 합계
	public int getTotal() {
		int total = 0;
		for(BookDTO b : booklist) {
			total += b.Price;
		}
		return total;
	}
	
	// 출력 => 메인메서드에 빼도 무방
	public void bookInfo() {
		System.out.println("========================================================");
		System.out.println("도서명\t저자\t출판사\t\t출판일\t\t가격");
		System.out.println("========================================================");
		for(BookDTO b : booklist) {
			b.printList();
		}
		System.out.println("========================================================");
	}
	
}
