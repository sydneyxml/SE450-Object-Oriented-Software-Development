package SE450HW3;

// Ximan Liu

public class ConcreteValutaDecorator extends Decorator {
	Converter converter;

	public ConcreteValutaDecorator(Converter converter) {
		this.converter = converter;
	}

	public String convert() {
		return converter.decorate() + " ConcreteValutaDecorator";
	}
}

