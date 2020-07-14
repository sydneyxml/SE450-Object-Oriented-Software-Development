package SE450FinalQ3;

public class pepper extends Decorator
{
	pizza pizza;

	public pepper(pizza pizza) {
		this.pizza = pizza;
	}

	public String run() {
		return pizza.run() + "With Pepper ";
	}
}
