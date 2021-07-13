
public class SimpleSodaMachineController implements SodaMachineController {
	private Calculator calculator = new SimpleCalculator();

	@Override
	public NoteBundle calculateChange(SodaMachineRequest request) {
		int totalChange = request.enteredNotes - request.product.getPrice();
		if (totalChange < 0) {
			return null;
		}
		return calculator.calculateChange(totalChange);
	}

}
