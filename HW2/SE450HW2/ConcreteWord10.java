package SE450HW2;


public class ConcreteWord10 extends AbstractFactoryMicroOfficeCompany {
	
	public AbstractPanel CreatePanel() {
		
		return new PanelWord10();
	}
	
	public AbstractButton CreateButton() {
		
		return new ButtonWord10();
	}
	
	public AbstractTextBox CreateTextBox() {
		
		return new TextBoxWord10();
	}
	
	
	// Singleton
	
	private ConcreteWord10() {}
	
	private static ConcreteWord10 INSTANCE1 = null;
	private static ConcreteWord10 INSTANCE2 = null;
	
	public static ConcreteWord10 getInstance() {		
		if (INSTANCE1 == null)
		{ INSTANCE1 = new ConcreteWord10();
			return INSTANCE1;
		}
		else if (INSTANCE2 == null)
		{
			INSTANCE2 = new ConcreteWord10();
			return INSTANCE2;
		}
		System.out.println("Warning! You have already tested two instances of this generation.");
		return null;
	}

}

