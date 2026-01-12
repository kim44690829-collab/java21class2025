package bookMax;

public class MainClass {

	public static void main(String[] args) {
		
		BookList booklist = new BookList();
		
		booklist.addBook(new BookDTO("자바의 정석1", "가나다", 80000));
		booklist.addBook(new BookDTO("자바의 정석2", "라마바", 40000));
		booklist.addBook(new BookDTO("자바의 정석3", "사아자", 100000));
		
		booklist.printMenu();
		booklist.expensiveBook();
	}

}
