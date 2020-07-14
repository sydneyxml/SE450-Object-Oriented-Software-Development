package SE450FinalQ1;

public abstract class AbstractFactory {

	public abstract AbstractHeader CreateHeader();
	public abstract AbstractFooter CreateFooter();
	public abstract AbstractReceipt CreateReceipt();

}