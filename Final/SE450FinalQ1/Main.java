package SE450FinalQ1;

public class Main {

	private AbstractHeader AbstractHeader;
	private AbstractFooter AbstractFooter;
	private AbstractReceipt AbstractReceipt;
	
	public Main(AbstractFactory factory) {
		AbstractHeader = factory.CreateHeader();
		AbstractFooter = factory.CreateFooter();
		AbstractReceipt = factory.CreateReceipt();
	}
	
	public void run() {
		AbstractHeader.DisplayName(AbstractHeader);
		AbstractReceipt.DisplayName(AbstractReceipt);
		AbstractFooter.DisplayName(AbstractFooter);
	}
	
	public static void main(String[] args) {
		AbstractFactory R1 = new ConcreteReceipt1();
		Main m = new Main(R1);
		m.run();
	}
}