package SE450FinalQ3;

public class olive extends Decorator
{
	pizza pizza;

	public olive(pizza pizza) {
		this.pizza = pizza;
	}

	public String run() {
		return pizza.run() + "With Olive ";
	}
}
