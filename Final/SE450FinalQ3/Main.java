package SE450FinalQ3;

public class Main {
	 
	public static void main(String args[]) {

		pizza pizza = new base();

		pizza = new pepper(pizza);
		pizza = new olive(pizza);
		pizza = new mashroom(pizza);
		
		System.out.println(pizza.run());
	}
}
