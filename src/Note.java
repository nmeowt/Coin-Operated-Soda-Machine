import java.util.Iterator;

public enum Note {
	TEN_THOUSAND_VND(10000), 
	TWENTY_THOUSAND_VND(20000), 
	FIFTY_THOUSAND_VND(50000), 
	ONE_HUNDERED_THOUSAND_VND(100000),
	TWO_HUNDERED_THOUSAND_VND(200000);

	private int value;

	Note(int value) {
		this.setValue(value);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static int parseNotes(String notes) {
		int result = 0;
		try {
			result = Integer.parseInt(notes);
		} catch (NumberFormatException e) {
			notes = notes.replace(".", "");
			result = Integer.parseInt(notes);
		}

		return result;
	}
}
