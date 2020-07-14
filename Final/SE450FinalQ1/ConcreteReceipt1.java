package SE450FinalQ1;

public class ConcreteReceipt1 extends AbstractFactory {
	public AbstractHeader CreateHeader() {
		return new HeaderReceipt1();
	}
	public AbstractFooter CreateFooter() {	
		return new FooterReceipt1();
	}
	public AbstractReceipt CreateReceipt() {	
		return new ReceiptReceipt1();
	}
}
