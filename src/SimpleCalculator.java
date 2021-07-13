
public class SimpleCalculator implements Calculator {

	@Override
	public NoteBundle calculateChange(int moneyToReturn) {
		
		NoteBundle change = new NoteBundle(new int[5]);
		change.setMoneyToReturn(moneyToReturn);
		
		int remainingAmount = moneyToReturn;
		
		change.setNumberTwentyThousandVND(remainingAmount / Note.TWO_HUNDERED_THOUSAND_VND.getValue());
		remainingAmount = remainingAmount % Note.TWO_HUNDERED_THOUSAND_VND.getValue();

		change.setNumberOneHunderedThousandVND(remainingAmount / Note.ONE_HUNDERED_THOUSAND_VND.getValue());
		remainingAmount = remainingAmount % Note.ONE_HUNDERED_THOUSAND_VND.getValue();

		change.setNumberFiftyThousandVND(remainingAmount / Note.FIFTY_THOUSAND_VND.getValue());
		remainingAmount = remainingAmount % Note.FIFTY_THOUSAND_VND.getValue();

		change.setNumberTwentyThousandVND(remainingAmount / Note.TWENTY_THOUSAND_VND.getValue());
		remainingAmount = remainingAmount % Note.TWENTY_THOUSAND_VND.getValue();

		change.setNumberTenThousandVND(remainingAmount / Note.TEN_THOUSAND_VND.getValue());
		
		
		return change;
	}

}
