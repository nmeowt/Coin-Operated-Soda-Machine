
public class SodaMachineRequest {
	public Product product;
	public int enteredNotes;
	
	public SodaMachineRequest(int selectedProduct, int enterdCoints) {
		this.product = Product.valueOf(selectedProduct);
		this.enteredNotes = enterdCoints;
	}
}
