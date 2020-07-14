package SE450HW2;


public class ConcreteWord18 extends AbstractFactoryMicroOfficeCompany {
	
	public AbstractPanel CreatePanel() {
		
		return new PanelWord18();
	}
	
	public AbstractButton CreateButton() {
		
		return new ButtonWord18();
	}
	
	public AbstractTextBox CreateTextBox() {
		
		return new TextBoxWord18();
	}
	
	
	// Singleton
	
	private ConcreteWord18() {}
	
	private static ConcreteWord18 INSTANCE1 = null;
	private static ConcreteWord18 INSTANCE2 = null;
	
	public static ConcreteWord18 getInstance() {		
		if (INSTANCE1 == null)
		{ INSTANCE1 = new ConcreteWord18();
			return INSTANCE1;
		}
		else if (INSTANCE2 == null)
		{
			INSTANCE2 = new ConcreteWord18();
			return INSTANCE2;
		}
		System.out.println("Warning! You have already tested two instances of this generation.");
		return null;
	}

}

