import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SodaMachineInterface sodaMachineInterface = new TextSodaMachineInterface();

		boolean running = true;
		while (running) {
			// Accepts notes of 10.000, 20.000, 50.000, 100.000, 200.000 VND
			sodaMachineInterface.displayEnterNotesMessage();
			String userEnteredNotes = scanner.nextLine();
			if (!userEnteredNotes.isEmpty()) {
				int enteredNotes = Note.parseNotes(userEnteredNotes);
				int count = 0;
				for (Note note : Note.values()) {
					if(enteredNotes == note.getValue()) {
						count++;
					}
				}
				if (count == 0) {
					continue;
				} else {
					sodaMachineInterface.enterNotes(enteredNotes);
					// Allow user to select products Coke (10.000), Pepsi (10.000), Soda (20.000)
					sodaMachineInterface.displayProducts();
					// Allow the user to receive a refund by canceling the request.
					if (scanner.hasNextInt()) {
						int selectedProduct = scanner.nextInt();
						NoteBundle change = sodaMachineInterface.selectProduct(selectedProduct);
						// Release the selected product and remaining change if any
						sodaMachineInterface.displaySelectedProduct();
						if (change != null) {
							sodaMachineInterface.displayChangeMessage();
							break;
						} else {
							sodaMachineInterface.notEnoughMoney();
						}
					} else {
						running = false;
						sodaMachineInterface.displayCancelRequest();
						break;
					}
				}
			} else {
				sodaMachineInterface.displayNotNull();
			}
		}
	}

}
