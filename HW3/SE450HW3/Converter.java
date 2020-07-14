package SE450HW3;

// Ximan Liu

public class Converter {
  
	public static void main(String[] args) {
		
    	ConverterGUI ui = new ConverterGUI();
    	
    	Converter converter = new Component();
		converter = new ConcreteRoundDecorator(converter);
		converter = new ConcreteExpDecorator(converter);
		converter = new ConcreteValutaDecorator(converter);
		System.out.println(converter.decorate());
		System.out.println();
    	
    	Handler h1 = new ConcreteMILE_Handler();
		Handler h2 = new ConcreteYARD_Handler();
		Handler h3 = new ConcreteFOOT_Handler();
		h1.SetSuccessor(h2);
		h2.SetSuccessor(h3);
		
		//Here you can add method (s) if necessary
		String[] requests = {"Mile","Yard","Foot"};
		
		for(int i = 0; i < requests.length; i++)
		{
			h1.HandleRequest(requests[i]);
		}
	}

	public String decorate() {
		return "";
	}
}

