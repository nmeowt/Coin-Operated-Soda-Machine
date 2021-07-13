
public class TextSodaMachineInterface implements SodaMachineInterface {

	private SodaMachineController controller = new SimpleSodaMachineController();
	private int notes;
	private Product selectedProduct;
	private NoteBundle change;

	@Override
	public void displayEnterNotesMessage() {
		System.out.println("*********************************************");
		System.out.println("             MAY BAN HANG TU DONG            ");
		System.out.println("*********************************************");
		System.out.println("                                             ");
		System.out.println("Chi chap nhan tien voi menh gia nhu sau:     ");
		System.out.println("10.000, 20.000, 50.000, 100.000, 200.000 VND ");
		System.out.println("                                             ");
		System.out.print("So tien: ");
	}

	@Override
	public void enterNotes(int enteredNote) {
		this.notes = enteredNote;
	}

	@Override
	public void displayProducts() {
		System.out.println("*********************************************");
		System.out.println("                CAC SAN PHAM:                ");
		System.out.println("               (Nhap q de huy)               ");
		System.out.println("                                             ");
		for (Product product : Product.values()) {
			if (!Product.EMPTY.equals(product)) {
				System.out.println("    " + product.getSelectionNumber() + "  " + product.name() + " - Gia: "
						+ product.getPrice() + "   ");
			}
		}
		System.out.println("                                             ");
		System.out.println("Chon san pham muon mua: ");
	}

	@Override
	public NoteBundle selectProduct(int product) {
		SodaMachineRequest request = new SodaMachineRequest(product, this.notes);
		this.selectedProduct = request.product;
		change = controller.calculateChange(request);
		return change;
	}
	

	@Override
	public void displaySelectedProduct() {
		System.out.println("*********************************************");
		System.out.println("              SAN PHAM DA CHON:              ");
		selectedProduct.displaySelectedProduct();
		System.out.println("                                             ");
	}


	@Override
	public void displayChangeMessage() {
		System.out.println("*********************************************");
		System.out.println("So tien tra lai: " + change.getMoneyToReturn() + " chia ra lam cac menh gia tien: ");
		System.out.println("	200.000 VND: " + change.getNumberTwoHunderedThousandVND());
		System.out.println("	100.000 VND: " + change.getNumberOneHunderedThousandVND());
		System.out.println("	 50.000 VND: " + change.getNumberFiftyThousandVND());
		System.out.println("	 20.000 VND: " + change.getNumberTwentyThousandVND());
		System.out.println("	 10.000 VND: " + change.getNumberTenThousandVND());
	}

	@Override
	public void displayCancelRequest() {
		System.out.println("*********************************************");
		System.out.println("               TAM BIET!!!                   ");
		if(this.notes > 0) {
			System.out.println("DUNG QUEN LAY LAI TIEN: "+ this.notes);
		}
		System.out.println("*********************************************");
	}
	
	@Override
	public void notEnoughMoney() {
		System.out.println("MON BAN CHON KHONG DU TIEN");
		System.out.println("MOI NHAN LAI TIEN VA THUC HIEN LAI: "+ this.notes);
	}

	@Override
	public void displayNotNull() {
		System.out.println("                                             ");
		System.out.println("PHAI NHAP TIEN DE TIEP TUC");
		System.out.println("                                             ");
	}
}
