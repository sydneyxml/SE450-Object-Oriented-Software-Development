package SE450FinalQ4;

public class ConcreteBuilder1 extends ProductBuilder {
	
	private Product product = new Product();
		
	public void Part1() {
		product.Part1 = 11;
	}
		
	public void Part2() {
		product.Part2 = 12;
	}

	public void Part3() {
		product.Part3 = 13;
	}
		
	public void Part4() {
		product.Part4 = 14;
	}
		
	public Product Number() {
		return product;
	}
}