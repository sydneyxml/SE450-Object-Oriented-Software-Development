package SE450FinalQ4;

public class ConcreteBuilder3 extends ProductBuilder {
	
	private Product product = new Product();

	public void Part1() {
		product.Part1 = 31;
	}

	public void Part2() {
		product.Part2 = 32;
	}

	public void Part3() {
		product.Part3 = 33;
	}

	public void Part4() {
		product.Part4 = 34;
	}

	public Product Number() {
		return product;
	}
}
