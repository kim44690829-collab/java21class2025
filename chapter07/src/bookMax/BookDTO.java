package bookMax;

public class BookDTO {
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
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	// 출력
	public void printList() {
		System.out.println("제목 : " + this.getBookName() + ", 저자 : " + this.getAuthor() + ", 가격 : " + this.getPrice() + "원");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
