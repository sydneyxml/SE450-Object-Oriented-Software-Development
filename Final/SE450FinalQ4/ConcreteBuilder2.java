package SE450FinalQ4;

public class ConcreteBuilder2 extends ProductBuilder {
	
	private Product product = new Product();
	
	public void Part1() {
		product.Part1 = 21;
	}
	
	public void Part2() {
		product.Part2 = 22;
	}

	public void Part3() {
		product.Part3 = 23;
	}
	
	public void Part4() {
		product.Part4 = 24;
	}
	
	public Product Number() {
		return product;
	}
}

