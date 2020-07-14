package SE450FinalQ1;

public class ConcreteReceipt2 extends AbstractFactory {
	public AbstractHeader CreateHeader() {
		return new HeaderReceipt2();
	}
	public AbstractFooter CreateFooter() {	
		return new FooterReceipt2();
	}
	public AbstractReceipt CreateReceipt() {	
		return new ReceiptReceipt2();
	}
}

