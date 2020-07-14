package SE450FinalQ4;

public class Main {
	
	public static void main (String[] args) {
		
		ProductEngineer factory = new ProductEngineer();
		
		ProductBuilder ConcreteBuilder1 = new ConcreteBuilder1();
		ProductBuilder ConcreteBuilder2 = new ConcreteBuilder2();
		ProductBuilder ConcreteBuilder3 = new ConcreteBuilder3();
		
		factory.makeProduct(ConcreteBuilder1);
		factory.makeProduct(ConcreteBuilder2);
		factory.makeProduct(ConcreteBuilder3);	
		
		Product doneConcreteBuilder1 = ConcreteBuilder1.Number();
		Product doneConcreteBuilder2 = ConcreteBuilder2.Number();
		Product doneConcreteBuilder3 = ConcreteBuilder3.Number();
		
		doneConcreteBuilder1.run();
		doneConcreteBuilder2.run();
		doneConcreteBuilder3.run();
	}
}

