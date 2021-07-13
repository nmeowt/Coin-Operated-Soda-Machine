
public class NoteBundle {
	private int numberTenThousandVND;
	private int numberTwentyThousandVND;
	private int numberFiftyThousandVND;
	private int numberOneHunderedThousandVND;
	private int numberTwoHunderedThousandVND;
	private int moneyToReturn;

	public NoteBundle(int... notes) {
		this.numberTenThousandVND = notes[0];
		this.numberTwentyThousandVND = notes[1];
		this.numberFiftyThousandVND = notes[2];
		this.numberOneHunderedThousandVND = notes[3];
		this.numberTwoHunderedThousandVND = notes[4];
	}

	public int getNumberTenThousandVND() {
		return numberTenThousandVND;
	}

	public void setNumberTenThousandVND(int numberTenThousandVND) {
		this.numberTenThousandVND = numberTenThousandVND;
	}

	public int getNumberTwentyThousandVND() {
		return numberTwentyThousandVND;
	}

	public void setNumberTwentyThousandVND(int numberTwentyThousandVND) {
		this.numberTwentyThousandVND = numberTwentyThousandVND;
	}

	public int getNumberFiftyThousandVND() {
		return numberFiftyThousandVND;
	}

	public void setNumberFiftyThousandVND(int numberFiftyThousandVND) {
		this.numberFiftyThousandVND = numberFiftyThousandVND;
	}

	public int getNumberOneHunderedThousandVND() {
		return numberOneHunderedThousandVND;
	}

	public void setNumberOneHunderedThousandVND(int numberOneHunderedThousandVND) {
		this.numberOneHunderedThousandVND = numberOneHunderedThousandVND;
	}

	public int getNumberTwoHunderedThousandVND() {
		return numberTwoHunderedThousandVND;
	}

	public void setNumberTwoHunderedThousandVND(int numberTwoHunderedThousandVND) {
		this.numberTwoHunderedThousandVND = numberTwoHunderedThousandVND;
	}

	public int getMoneyToReturn() {
		return moneyToReturn;
	}

	public void setMoneyToReturn(int moneyToReturn) {
		this.moneyToReturn = moneyToReturn;
	}
}
