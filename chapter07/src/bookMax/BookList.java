package bookMax;

import java.util.ArrayList;

public class BookList {
	ArrayList<BookDTO> bookInfo;
	
	public BookList() {
		bookInfo = new ArrayList<>();
	};
	
	// 추가
	public void addBook(BookDTO b) {
		bookInfo.add(b);
	}
	
	// 가장 비싼 책
	// 일반 for문
//	public void expensiveBook() {
//		int max = 0;
//		int index = 0;
//		for(int i = 0; i < bookInfo.size(); i++) {
//			int maxPrice = bookInfo.get(i).getPrice();
//			if(maxPrice > max) {
//				max = maxPrice;
//				index = i;
//			}
//		}
//		BookDTO b = bookInfo.get(index);
//		System.out.println("제목 : " + b.getBookName() + ", 저자 : " + b.getAuthor() + ", 가격 : " + b.getPrice() + "원");
//	}
	// 확장 for문
	public void expensiveBook() {
		int max = 0;
		String mTitle = null;
		for(BookDTO b : bookInfo) {
			if(max < b.getPrice()) {
				max = b.getPrice();
				mTitle = b.getBookName();
			}
		}
		System.out.println("제목 : " + mTitle +  ", 가격 : " + max + "원");
	}
	
	// 출력
	public void printMenu() {
		System.out.println("=== 전체 책 목록 ===");
		for(BookDTO b : bookInfo) {
			b.printList();
		}
		System.out.println("=== 가장 비싼 책 ===");
		
	}

}
