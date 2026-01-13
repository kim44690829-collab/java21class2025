package bookMax;

public class BookDTO {
	// private 접근 제어자는 자기자신 클래스에서는 접근할 수 있음.
	private String bookName;
	private String author;
	private int price;
	
    public BookDTO() {};
	
	public BookDTO(String bookName, String author, int price) {
		this.bookName = bookName;
		this.author = author;
		this.price = price;
	};
	
	public String getBookName() {
		return bookName;
	}

	public String getAuthor() {
		return author;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	// 출력
	public void printList() {
		System.out.println("제목 : " + this.getBookName() + ", 저자 : " + this.getAuthor() + ", 가격 : " + this.getPrice() + "원");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
