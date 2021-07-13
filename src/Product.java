
public enum Product {
	COKE(1, 10000), 
	PEPSI(2, 10000), 
	SODA(3, 20000),
	EMPTY(0,0);

	private int selectionNumber;
	private int price;

	Product(int selectionNumber, int price) {
		this.selectionNumber = selectionNumber;
		this.price = price;
	}

	public int getSelectionNumber() {
		return selectionNumber;
	}

	public void setSelectionNumber(int selectionNumber) {
		this.selectionNumber = selectionNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static Product valueOf(int numberSelection) {
		for (Product product : Product.values()) {
			if (numberSelection == product.getSelectionNumber()) {
				return product;
			}
		}
		return EMPTY;
	}
	
	public void displaySelectedProduct() {
		for (Product product : Product.values()) {
			if (this.selectionNumber == product.getSelectionNumber()) {
				System.out.println("    " + product.getSelectionNumber() + "  " + product.name() + " - Gia: "
						+ product.getPrice() + "   ");
			}
		}
	}
}
