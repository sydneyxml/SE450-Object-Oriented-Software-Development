package SE450FinalQ3;

public class mashroom extends Decorator
{
	pizza pizza;

	public mashroom(pizza pizza) {
		this.pizza = pizza;
	}

	public String run() {
		return pizza.run() + "With Mashroom";
	}
}
