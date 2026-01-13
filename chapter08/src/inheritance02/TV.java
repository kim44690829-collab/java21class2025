package inheritance02;

public class TV {
	protected int size = 10;
	
	public TV() {};

	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	};
}
