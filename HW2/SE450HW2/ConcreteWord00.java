package SE450HW2;


public class ConcreteWord00 extends AbstractFactoryMicroOfficeCompany {
	
	public AbstractPanel CreatePanel() {
		
		return new PanelWord00();
	}
	
	public AbstractButton CreateButton() {
		
		return new ButtonWord00();
	}
	
	public AbstractTextBox CreateTextBox() {
		
		return new TextBoxWord00();
	}
	
	
	// Singleton
	
	private ConcreteWord00() {}
	
	private static ConcreteWord00 INSTANCE1 = null;
	private static ConcreteWord00 INSTANCE2 = null;
	
	public static ConcreteWord00 getInstance() {		
		if (INSTANCE1 == null)
		{ INSTANCE1 = new ConcreteWord00();
			return INSTANCE1;
		}
		else if (INSTANCE2 == null)
		{
			INSTANCE2 = new ConcreteWord00();
			return INSTANCE2;
		}
		System.out.println("Warning! You have already tested two instances of this generation.");
		return null;
	}

}

