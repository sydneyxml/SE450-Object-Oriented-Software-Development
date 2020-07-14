package SE450HW2;


public class ConcreteWord90 extends AbstractFactoryMicroOfficeCompany {
	
	public AbstractPanel CreatePanel() {
		
		return new PanelWord90();
	}
	
	public AbstractButton CreateButton() {
		
		return new ButtonWord90();
	}
	
	public AbstractTextBox CreateTextBox() {
		
		return new TextBoxWord90();
	}
	
	
	// Singleton
	
	private ConcreteWord90() {}
	
	private static ConcreteWord90 INSTANCE1 = null;
	private static ConcreteWord90 INSTANCE2 = null;
	
	public static ConcreteWord90 getInstance() {		
		if (INSTANCE1 == null)
		{ INSTANCE1 = new ConcreteWord90();
			return INSTANCE1;
		}
		else if (INSTANCE2 == null)
		{
			INSTANCE2 = new ConcreteWord90();
			return INSTANCE2;
		}
		System.out.println("Warning! You have already tested two instances of this generation.");
		return null;
	}

}

