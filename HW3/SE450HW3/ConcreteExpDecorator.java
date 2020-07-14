package SE450HW3;

// Ximan Liu

public class ConcreteExpDecorator extends Decorator {
	Converter converter;

	public ConcreteExpDecorator(Converter converter) {
		this.converter = converter;
	}

	public String convert() {
		return converter.decorate() + " ConcreteExpDecorator";
	}
}

