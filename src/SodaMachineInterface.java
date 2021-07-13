
public interface SodaMachineInterface {
	void displayEnterNotesMessage();

	void enterNotes(int enteredNote);

	void displayProducts();

	NoteBundle selectProduct(int product);
	
	void displaySelectedProduct();
	
	void displayChangeMessage();
	
	void displayCancelRequest();
	
	void notEnoughMoney();
	
	void displayNotNull();
}
