package shopMol;

public class CartList {
	String id;
	String itemName;
	int itemPrice;
	int quantity = 1;;
	
	public CartList() {};
	
	public CartList(String id, String itemName, int itemPrice, int quantity) {
		this.id = id;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;		
	};
}
